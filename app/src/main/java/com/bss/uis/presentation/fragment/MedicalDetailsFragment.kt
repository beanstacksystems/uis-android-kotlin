package com.bss.uis.presentation.fragment

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation
import com.bss.uis.R
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.data.remote.dto.request.MedicaldetailsRequest
import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.request.PersonlistRequest
import com.bss.uis.presentation.OnStepChangeListner
import com.bss.uis.presentation.activity.AddPatientActivity
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import com.bss.uis.util.AppUtil
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList


class MedicalDetailsFragment : BaseFragment() {

    lateinit var onStepChangeListener: OnStepChangeListner

    lateinit var cancerType: TextInputEditText
    lateinit var dateOfIdentification: TextInputEditText
    lateinit var otherdiseasetxt: TextInputEditText
    lateinit var bloodGrp: TextInputEditText
    lateinit var cancerTypeInputLayout: TextInputLayout
    lateinit var dateOfIdentificationInputLayout: TextInputLayout
    lateinit var otherdiseasetxtInputLayout: TextInputLayout
    lateinit var bloodGrpInputLayout: TextInputLayout
    lateinit var btnNxt: AppCompatButton
    lateinit var btnback: AppCompatButton
    var fragmentTitle: String? = null
    lateinit var personlistRequest: PersonlistRequest
    var masterid = 1
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    private val mainScope = CoroutineScope(Dispatchers.Main)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_medical_details, container, false)
        AddPatientActivity.fragmentName = "MedicalDetails"
        initView(view)
        personlistRequest = arguments?.getSerializable("dataA") as PersonlistRequest
//        arguments?.clear()
//        Log.d("argumentsdataA", personlistRequest.idproofdto?.imagedto?.imagedata.toString())
        return view
    }

    private fun initView(fragmentView: View) {
        otherdiseasetxt = fragmentView.findViewById(R.id.otherdiseasetxt)
        dateOfIdentification = fragmentView.findViewById(R.id.dateOfidentification)
        dateOfIdentificationInputLayout = fragmentView.findViewById(R.id.dateOfidentificationLayout)
        btnback = fragmentView.findViewById(R.id.btnBackMedical)
        btnNxt = fragmentView.findViewById(R.id.btnNextMedical)
        btnNxt.setOnClickListener {
            if (isValidDetails()) {

                ioScOPe.launch {
                    val bundledata = async {
                        requestBodyForPatientRegistartion()
                    }
                    val bundle = Bundle().apply {
                        putSerializable("datam", bundledata.await())
                    }
                    requireActivity().runOnUiThread {
                        Navigation.findNavController(requireView())
                            .navigate(R.id.action_medicalHistoryFragment_to_attendantFragment,bundle)
                    }

                }


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
        } else {
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

    private fun requestBodyForPatientRegistartion(): PatientRegistatrtionRequest {
        val medicaldetailsRequest = MedicaldetailsRequest(
            medicalrecordid = 1,
            patientid = 1,
            illnesstypeid = getmasterId(cancerType.text.toString()),
            illnessstageid = 1,
            diagnosisdetails = 1,
            imagelist = personlistRequest.imagelist,
            diagnosisdate = "26/12/2022",
            otherremarks = otherdiseasetxt.text.toString(),
            isactive = "Y",
            createddate = "26/12/2022",
            updatedate = "26/12/2022"

        )
        val personlistRequestlist: ArrayList<PersonlistRequest> = ArrayList()
        personlistRequestlist.add(personlistRequest)
        val list:ArrayList<String> =java.util.ArrayList()
        list.add("string")

        return PatientRegistatrtionRequest(
            patientid = 1,
            bloodgroup = getmasterId(bloodGrp.text.toString()),
            attendanttypeids = list,
            personlist = personlistRequestlist,
            registrarid = 1,
            referrerid = 1,
            sponsorid = 1,
            approverid = 1,
            applicationurl = "/img/t.png",
            isactive = "y",
            isapproved = "y",
            illnesstypes = list,
            followupcounsellerid = 1,
            medicaldetails = medicaldetailsRequest,
            remarks = "tytkjjkty",
            createddate = "26/12/2022",
            updatedate = "26/12/2022"
        )
    }

    private fun getmasterId(dataS: String): Int {
        val masterdao = UISDatabase.getInstance(requireActivity()).masterDAO
        val masterDaoRepository = MasterDaoRepository(masterdao)
        masterDaoRepository.masterDataList.forEach { data ->
            if (data.masterdatadesc!! == dataS) {
                this.masterid = data.masterdataId
                Log.d("masteridloop", this.masterid.toString())

            }

        }
        return this.masterid


    }


}