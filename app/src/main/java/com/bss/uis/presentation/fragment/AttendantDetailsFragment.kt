package com.bss.uis.presentation.fragment

import android.app.Activity
import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.bss.uis.R
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.response.PatientRegistrationResReq
import com.bss.uis.presentation.OnStepChangeListner
import com.bss.uis.presentation.activity.AddPatientActivity
import com.bss.uis.presentation.activity.DrawerMainActivity
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.repository.PatientDaoRepository
import com.bss.uis.roomdb.entity.Patient
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import java.util.*


class AttendantDetailsFragment : BaseFragment() {

    lateinit var onStepChangeListener: OnStepChangeListner

    lateinit var name: TextInputEditText
    lateinit var btnSubmit: AppCompatButton
    lateinit var btnBackApp: AppCompatButton
    lateinit var email: TextInputEditText
    lateinit var contact: TextInputEditText
    lateinit var dob: TextInputEditText
    lateinit var panadhar: TextInputEditText
    lateinit var panadharval: TextInputEditText
    lateinit var income: TextInputEditText
    lateinit var gender: TextInputEditText
    lateinit var salutation: TextInputEditText
    lateinit var occupation: TextInputEditText
    lateinit var nameInputLayout: TextInputLayout
    lateinit var eMailInputLayout: TextInputLayout
    lateinit var contactInputLayout: TextInputLayout
    lateinit var incomeInputLayout: TextInputLayout
    lateinit var dobInputLayout: TextInputLayout
    lateinit var genderLayout: TextInputLayout
    lateinit var salutationLayout: TextInputLayout
    lateinit var occupationLayout: TextInputLayout
    lateinit var panadhartxtLayout: TextInputLayout
    lateinit var panadharvaltextlayout: TextInputLayout
    lateinit var profileImage: CircleImageView
    lateinit var editImage: ImageView
    lateinit var requestBody: PatientRegistatrtionRequest
    private lateinit var viewModelUIS: ViewModelUIS
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    private lateinit var dialog: Dialog

    val PICK_IMAGE_REQUEST = 1112
    val REQUEST_IMAGE_CAPTURE = 2223
    lateinit var relationshipet: TextInputEditText
    lateinit var relationshipLayout: TextInputLayout

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentView = inflater.inflate(R.layout.fragment_attendant_details, container, false)
        AddPatientActivity.fragmentName = "submit"
        requestBody = arguments?.getSerializable("datam") as PatientRegistatrtionRequest
//        arguments?.clear()
//      /  Log.d("patientregistrationRequestBody",requestBody.toString())
//        Log.d("basicDetails",requestBody.personlist[0].idproofdto?.imagedto?.imagedata.toString())
        Log.d("addresDetails", requestBody.personlist[0].addressdto?.pincode.toString())
        Log.d("medicalDetails", requestBody.medicaldetails?.illnesstypeid.toString())
        viewModelUIS = ViewModelProvider(requireActivity())[ViewModelUIS::class.java]


        initView(fragmentView)
        dataObserver()

        return fragmentView
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun initView(fragmentView: View) {
        nameInputLayout =
            fragmentView.findViewById(R.id.personNameLayout)

        eMailInputLayout =
            fragmentView.findViewById(R.id.Email_etLayout)
        contactInputLayout =
            fragmentView.findViewById(R.id.contactInputLayout)
        incomeInputLayout =
            fragmentView.findViewById(R.id.incomeInputLayout)
        name = fragmentView.findViewById(R.id.personName)
        email = fragmentView.findViewById(R.id.Email_et)
        profileImage = fragmentView.findViewById(R.id.profile_image)
        editImage = fragmentView.findViewById(R.id.profile_image_edit_layout)
        editImage.setOnClickListener {
            selectImage()
        }
        name.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (name.text.toString() == "") {
                    nameInputLayout.error = "This Field Can Not Be Empty"

                } else {
                    nameInputLayout.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // code to be executed when text is changed

            }
        })
        email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (!mailPartern(s.toString())) {
                    eMailInputLayout.error = "Please input a valid Email!"
                } else {
                    eMailInputLayout.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // code to be executed when text is changed

            }
        })

        contact = fragmentView.findViewById(R.id.contact_et)
        contact.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (contact.text.toString() == "") {
                    contactInputLayout.error = "This Field Can Not Be Empty"

                } else {
                    contactInputLayout.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // code to be executed when text is changed

            }
        })
        income = fragmentView.findViewById(R.id.income_et)
        income.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (income.text.toString() == "") {
                    incomeInputLayout.error = "This Field Can Not Be Empty"

                } else {
                    incomeInputLayout.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // code to be executed when text is changed

            }
        })



        btnSubmit = fragmentView.findViewById(R.id.btnSubmit)
        btnBackApp = fragmentView.findViewById(R.id.btnBackAttendant)
        btnSubmit.setOnClickListener {
            if (isValidDetails()) {
                showLoader()

                mainScope.launch {
                    viewModelUIS.patientRegistartion(
                        ContextPreferenceManager().getToken("token", requireActivity())
                            .toString(), requestBody
                    )
                }


            }
        }
        btnBackApp.setOnClickListener {
            requireActivity().onBackPressed()
        }
        initDOB(fragmentView)
        initGenderView(fragmentView)
        initSalutationView(fragmentView)
        initOccupationView(fragmentView)
        relationShipView(fragmentView)

    }
    @OptIn(ExperimentalCoroutinesApi::class)
    private fun dataObserver(){
        viewModelUIS.patientRegistrationResReqList.observe(requireActivity()){
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.patientRegistrationResReqList.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.patientRegistrationResReqList.value = it
                    ioScOPe.launch {
                        deletePatientDAta()
                    }
                    dialogDismiss()
                    Toast.makeText(requireActivity(), "Submitted successfully", Toast.LENGTH_LONG)
                        .show()
                    startActivity(Intent(requireActivity(), DrawerMainActivity::class.java))
                    requireActivity().finish()


                    viewModelUIS.patientRegistrationResReqList.value = null

                }
                is Resource.Error -> {
                    AppUtil().dialogDismiss(requireContext())
                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.authResponseDomain.value = null
                }
            }
        }
    }
    private suspend fun savePatientData(data: PatientRegistrationResReq) {
        val patientdao = UISDatabase.getInstance(requireActivity()).patientDao
       val patient = Patient(
           patientId = data.patientId!!,
           name = data.patientName,
           idproof = data.patientId.toString(),
           emailId = "",
           contact = data.patientContact,
           gender = "",
           dob = data.patientAge,
           diseasesName = data.patientCancerType,
           patientImage = data.patientImage
       )
        val patientDaoRepository = PatientDaoRepository(patientdao)
        patientDaoRepository.insertPatientData(patient)
        dialogDismiss()
        startActivity(Intent(requireActivity(), DrawerMainActivity::class.java))
        requireActivity().finish()


    }
    private suspend fun deletePatientDAta(){
        val patientdao = UISDatabase.getInstance(requireActivity()).patientDao
        val patientDaoRepository = PatientDaoRepository(patientdao)
        patientDaoRepository.deletePatientData()
    }

    override fun isValidDetails(): Boolean {
        if (name.text.toString() == "") {
            nameInputLayout.error = "Please input this field"
            return false
        } else if (email.text.toString() == "") {
            eMailInputLayout.error = "Please input this field"
            return false
        } else if (contact.text.toString() == "") {
            contactInputLayout.error = "Please input this field"
            return false
        } else if (dob.text.toString() == "") {
            dobInputLayout.error = "Please input this field"
            return false
        } else if (income.text.toString() == "") {
            incomeInputLayout.error = "Please input this field"
            return false
        } else if (gender.text.toString() == "") {
            genderLayout.error = "Please input this field"
            return false
        } else if (salutation.text.toString() == "") {
            salutationLayout.error = "Please input this field"
            return false
        } else if (occupation.text.toString() == "") {
            occupationLayout.error = "Please input this field"
            return false
        } else if(contact.text?.length != 10){
            contact.error = "Please input 10 digit"
            return false
        }else if(!mailPartern(email.text.toString())) {
            eMailInputLayout.error = "Please input a valid Email!"
            return false
        }  else {
            return true
        }
    }

    override fun fragmentName(): String {
        return "AttendantDetails"
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
        onStepChangeListener.onstepChange(4)
    }


    private fun initDOB(fragmentView: View) {
        dob = fragmentView.findViewById(R.id.dateOfBirth)
        dobInputLayout =
            fragmentView.findViewById(R.id.dateOfBirthLayout)
        dob.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (dob.text.toString() == "") {
                    dobInputLayout.error = "This Field Can Not Be Empty"

                } else {
                    dobInputLayout.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // code to be executed when text is changed

            }
        })
        dob.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                requireActivity(),
                { _, year, monthOfYear, dayOfMonth ->
                    dob.text =
                        Editable.Factory.getInstance().newEditable("$dayOfMonth/$monthOfYear/$year")
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            )

            datePickerDialog.show()
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun initPanAdharView(fragmentView: View) {
        panadhartxtLayout =
            fragmentView.findViewById(R.id.text_panadhar_layout)
        panadhar = fragmentView.findViewById(R.id.text_panadhar_select)
        panadhar.showSoftInputOnFocus = false
        //        ArrayList<String> idproofVal = AppUtil.getMasterByType("identity");
        val idproofVal: ArrayList<String> = SharedPrefForRoomDb().identitylist(requireActivity())
        panadhar.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            panadhartxtLayout.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (text.isEmpty()) panadhartxtLayout.error = "Can not be empty."
            if (hasFocus) {
                val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                    activity,
                    "ID-Proof", idproofVal.toTypedArray(), panadhar, panadhartxtLayout
                )
                dialog?.show()
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun initGenderView(fragmentView: View) {
        genderLayout =
            fragmentView.findViewById(R.id.text_gender_layout)
        gender = fragmentView.findViewById(R.id.text_gender)
        gender.showSoftInputOnFocus = false

        val genderValue = SharedPrefForRoomDb().genderlist(requireActivity())
        gender.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            genderLayout.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (text.isEmpty()) genderLayout.error = "Gender can not be empty."
            if (hasFocus) {
                val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                    activity,
                    "Gender", genderValue.toTypedArray(), gender, genderLayout
                )
                dialog?.show()
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun initSalutationView(fragmentView: View) {
        salutationLayout =
            fragmentView.findViewById(R.id.text_salutation_layout)
        salutation = fragmentView.findViewById(R.id.text_salutation)
        salutation.showSoftInputOnFocus = false
        Log.d(
            "onPersonFragment",
            SharedPrefForRoomDb().salutTationList(requireActivity()).size.toString()
        )
        val salutationValue = SharedPrefForRoomDb().salutTationList(requireActivity())
        //        ArrayList<String> salutationValue = new ArrayList<>();
        salutation.onFocusChangeListener =
            View.OnFocusChangeListener { v: View, hasFocus: Boolean ->
                salutationLayout.error = null
                val textInputEditText =
                    v as TextInputEditText
                val text =
                    Objects.requireNonNull(textInputEditText.text)
                        .toString()
                if (text.isEmpty()) salutationLayout.error = "Salutation can not be empty."
                if (hasFocus) {
                    val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                        activity,
                        "Salutation",
                        salutationValue.toTypedArray(),
                        salutation,
                        salutationLayout
                    )
                    dialog?.show()
                }
            }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun initOccupationView(fragmentView: View) {
        occupationLayout =
            fragmentView.findViewById(R.id.text_occupation_layout)
        occupation = fragmentView.findViewById(R.id.text_occupation)
        occupation.showSoftInputOnFocus = false
        //        ArrayList<String> occupationValue = AppUtil.getMasterByType("occupationtype");
        val occupationValue = SharedPrefForRoomDb().occupationlist(requireActivity())
        occupation.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            occupationLayout.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (null == text || text.isEmpty()) occupationLayout.error =
                "Occupation can not be empty."
            if (hasFocus) {
                val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                    activity,
                    "Occupation", occupationValue.toTypedArray(), occupation, occupationLayout
                )
                dialog?.show()
            }
        }
    }

    fun mailPartern(data: String): Boolean {
        return !TextUtils.isEmpty(data) && Patterns.EMAIL_ADDRESS.matcher(data).matches()
    }

    fun selectImage() {
        val options = arrayOf<CharSequence>("Take Photo", "Choose from Gallery", "Cancel")
        val builder = AlertDialog.Builder(
            activity!!
        )
        builder.setTitle("Add Photo!")
        builder.setItems(options) { dialog, item ->
            try {
                if (options[item] == "Take Photo") {

                    takePicture()
                } else if (options[item] == "Choose from Gallery") {
                    imagePick()
                } else if (options[item] == "Cancel") {
                    dialog.dismiss()
                }
            }catch (e:Exception){
                Toast.makeText(requireActivity(),"Please Upload Photo Less than 1 mb",Toast.LENGTH_LONG).show()

            }
        }
        builder.show()
    }

    private fun imagePick() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    private fun takePicture() {
        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(camera_intent, REQUEST_IMAGE_CAPTURE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        try{
            if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
                if (data != null && data.data != null) {
                    val imageUri = data.data
                    Glide.with(this)
                        .load(imageUri)
                        .into(profileImage)
                }
            } else if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
                val photo = data?.extras?.get("data") as Bitmap
                profileImage.setImageBitmap(photo)

            }
        }catch (e:Exception){
            Toast.makeText(requireActivity(),"Please Upload Photo Less than 1 mb",Toast.LENGTH_LONG).show()
        }
    }
    private fun showLoader(){
            dialog = Dialog(requireActivity())
            dialog.setContentView(com.bss.uis.R.layout.dialog_loading)
            dialog.show()

    }
    fun dialogDismiss() {

        dialog.dismiss()
    }
    private fun relationShipView(fragmentView: View) {
        relationshipLayout =
            fragmentView.findViewById(R.id.relationship_layout)
        relationshipet = fragmentView.findViewById(R.id.et_relationship)
        gender.showSoftInputOnFocus = false

        val genderValue = SharedPrefForRoomDb().relationlist(requireActivity())
        relationshipet.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            relationshipLayout.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (text.isEmpty()) relationshipLayout.error = "Relationship can not be Empty."
            if (hasFocus) {
                val dialog: Dialog? = AppUtil().getSelectPopupDialog(
                    activity,
                    "Relationsip", genderValue.toTypedArray(), relationshipet, relationshipLayout
                )
                dialog?.show()
            }
        }
    }



}