package com.bss.uis.presentation.fragment

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation
import com.bss.uis.R
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.presentation.OnStepChangeListner
import com.bss.uis.presentation.activity.AddPatientActivity
import com.bss.uis.util.AppUtil
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.*


class MedicalDetailsFragment : BaseFragment(){

    lateinit var onStepChangeListener: OnStepChangeListner

    lateinit var cancerType: TextInputEditText
    lateinit var dateOfIdentification:TextInputEditText
    lateinit var otherdiseasetxt:TextInputEditText
    lateinit var bloodGrp:TextInputEditText
    lateinit var cancerTypeInputLayout: TextInputLayout
    lateinit var dateOfIdentificationInputLayout:TextInputLayout
    lateinit var otherdiseasetxtInputLayout:TextInputLayout
    lateinit var bloodGrpInputLayout:TextInputLayout
    lateinit var btnNxt: AppCompatButton
    lateinit var btnback: AppCompatButton
    var fragmentTitle: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_medical_details, container, false)
        AddPatientActivity.fragmentName ="MedicalDetails"
        initView(view)
        return  view
    }
    private fun initView(fragmentView: View) {
        otherdiseasetxt = fragmentView.findViewById(R.id.otherdiseasetxt)
        dateOfIdentification = fragmentView.findViewById(R.id.dateOfidentification)
        dateOfIdentificationInputLayout = fragmentView.findViewById(R.id.dateOfidentificationLayout)
        btnback = fragmentView.findViewById(R.id.btnBackMedical)
        btnNxt = fragmentView.findViewById(R.id.btnNextMedical)
        btnNxt.setOnClickListener {
            if (isValidDetails()){
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_medicalHistoryFragment_to_attendantFragment)
            }
        }
        btnback.setOnClickListener {
            Navigation.findNavController(requireView()).popBackStack()
        }

        dateOfIdentification.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                requireActivity(),
                { _, year, monthOfYear, dayOfMonth ->
                    dateOfIdentification.text =
                        Editable.Factory.getInstance().newEditable("$dayOfMonth/$monthOfYear/$year")
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            )

            datePickerDialog.show()
        }
        initDateOfIdentification(fragmentView)
        initBloodGroupView(fragmentView)
        initCancerTypeView(fragmentView)
    }

    private fun initDateOfIdentification(fragmentView: View) {
        dateOfIdentification = fragmentView.findViewById(R.id.dateOfidentification)
        dateOfIdentificationInputLayout = fragmentView.findViewById(R.id.dateOfidentificationLayout)

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun initCancerTypeView(fragmentView: View) {
        cancerType = fragmentView.findViewById(R.id.cancerTypetxt)
        cancerTypeInputLayout = fragmentView.findViewById(R.id.cancerTypetxtLayout)
        cancerType.showSoftInputOnFocus = false
        val illnessTypes = SharedPrefForRoomDb().illnesslist(requireActivity())
        cancerType.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            cancerTypeInputLayout.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (text == "other_cancer") {
                otherCancerBox()
            }
            if (null == text || text.isEmpty()) cancerTypeInputLayout.error =
                "CancerType can not be empty."
            if (hasFocus) {
                val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                    activity,
                    "CancerType", illnessTypes.toTypedArray(), cancerType, cancerTypeInputLayout
                )
                dialog?.show()
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun initBloodGroupView(fragmentView: View) {
        bloodGrp = fragmentView.findViewById(R.id.blood_group)
        bloodGrpInputLayout = fragmentView.findViewById(R.id.spinner_blood_group)
        bloodGrp.showSoftInputOnFocus = false
        val bloodGroups = SharedPrefForRoomDb().bllodgroupList(requireActivity())
        bloodGrp.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            bloodGrpInputLayout.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (text.isEmpty()) bloodGrpInputLayout.error = "BloodGroup can not be empty."
            if (hasFocus) {
                val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                    activity,
                    "BloodGroup", bloodGroups.toTypedArray(), bloodGrp, bloodGrpInputLayout
                )
                dialog?.show()
            }
        }
    }


    override fun isValidDetails(): Boolean {
        if (bloodGrp.text.toString() == "") {
            bloodGrp.error = "Please input this field"
            return false
        } else if (cancerType.text.toString() == "") {
            cancerType.error = "Please input this field"
            return false
        } else if (dateOfIdentification.text.toString() == "") {
            dateOfIdentification.error = "Please input this field"
            return false
        }else{
            return true
        }
    }

    override fun fragmentName(): String {
       return "MedicalDetails"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            onStepChangeListener = context as OnStepChangeListner
        } catch (ex: ClassCastException) {
            throw ClassCastException("$context must implement onSomeEventListener")
        }
    }

    override fun onResume() {
        super.onResume()
        onStepChangeListener.onstepChange(3)
    }
    private fun otherCancerBox() {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Enter Other Cancer Type")
        val input = EditText(requireActivity())
        input.inputType = InputType.TYPE_CLASS_NUMBER
        builder.setView(input)

        builder.setPositiveButton("OK") { dialog, which ->

            dialog.cancel()
            // Do something with the name, such as displaying it in a TextView
        }
        builder.setNegativeButton("Cancel") { dialog, which ->
            dialog.cancel()
        }

        val alert = builder.create()
        alert.show()
    }


}