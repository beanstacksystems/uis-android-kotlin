package com.bss.uis.presentation.fragment

import android.app.Activity
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
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.bss.uis.R
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.presentation.OnStepChangeListner
import com.bss.uis.presentation.activity.AddPatientActivity.Companion.fragmentName
import com.bss.uis.util.AppUtil
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import de.hdodenhof.circleimageview.CircleImageView
import java.util.*


class PersonalDetailsFragment : BaseFragment() {
    lateinit var name: TextInputEditText
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
    val PICK_IMAGE_REQUEST = 1111
    val REQUEST_IMAGE_CAPTURE= 2222
    val ID_PICK_IMAGE_REQUEST = 3333
    val ID_REQUEST_IMAGE_CAPTURE= 4444
    lateinit var id_proof_layout:LinearLayout
    lateinit var iv_idProof:ImageView
    var imagePath: String? = null
    lateinit var onStepChangeListener: OnStepChangeListner


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_personal_details, container, false)
        fragmentName = "PersonalDetails"
        initView(view)
        return view
    }

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
        income = fragmentView.findViewById(R.id.income_et)
        panadharval = fragmentView.findViewById(R.id.panAdharval)
        panadharvaltextlayout =
            fragmentView.findViewById(R.id.idprooftxtLayout)
        id_proof_layout = fragmentView.findViewById(R.id.id_proof_imageview_Layout)
        id_proof_layout.setOnClickListener {
            selectImageID()
        }
        iv_idProof = fragmentView.findViewById(R.id.iv_idProof)

        initDOB(fragmentView)
        initPanAdharView(fragmentView)
        initGenderView(fragmentView)
        initSalutationView(fragmentView)
        initOccupationView(fragmentView)
//        imageCaptureFragmentIdProof =
//            getFragment(false, com.bss.patientregistration.R.id.id_proof_imageview_Layout)
//    }
    }

    private fun initDOB(fragmentView: View) {
        dob = fragmentView.findViewById(R.id.dateOfBirth)
        dobInputLayout =
            fragmentView.findViewById(R.id.dateOfBirthLayout)
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
        genderLayout =
            fragmentView.findViewById(R.id.text_gender_layout)
        gender = fragmentView.findViewById(R.id.text_gender)
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
            if (null == text || text.isEmpty()) genderLayout.error = "Gender can not be empty."
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

    override fun isValidDetails(): Boolean {
        return true
    }

    override fun fragmentName(): String {
        fragmentName = "PersonalDetails"
        return "PersonalDetails"
    }

    fun mailPartern(data: String): Boolean {
        return !TextUtils.isEmpty(data) && Patterns.EMAIL_ADDRESS.matcher(data).matches()
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data != null && data.data != null) {
                val imageUri = data.data
                Glide.with(this)
                    .load(imageUri)
                    .into(profileImage)
            }
        }else if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val photo= data?.extras?.get("data") as Bitmap
            profileImage.setImageBitmap(photo)

        }else  if (requestCode == ID_PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data != null && data.data != null) {
                val imageUri = data.data
                Glide.with(this)
                    .load(imageUri)
                    .into(iv_idProof)
            }
        }else if (requestCode == ID_REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val photo= data?.extras?.get("data") as Bitmap
            iv_idProof.setImageBitmap(photo)

        }
    }

    fun selectImage() {
        val options = arrayOf<CharSequence>("Take Photo", "Choose from Gallery", "Cancel")
        val builder = AlertDialog.Builder(
            activity!!
        )
        builder.setTitle("Add Photo!")
        builder.setItems(options) { dialog, item ->
            if (options[item] == "Take Photo") {
                takePicture()
            } else if (options[item] == "Choose from Gallery") {
                imagePick()
            } else if (options[item] == "Cancel") {
                dialog.dismiss()
            }
        }
        builder.show()
    }
    fun selectImageID() {
        val options = arrayOf<CharSequence>("Take Photo", "Choose from Gallery", "Cancel")
        val builder = AlertDialog.Builder(
            activity!!
        )
        builder.setTitle("Add Photo!")
        builder.setItems(options) { dialog, item ->
            if (options[item] == "Take Photo") {
                takePictureID()
            } else if (options[item] == "Choose from Gallery") {
                imagePickID()
            } else if (options[item] == "Cancel") {
                dialog.dismiss()
            }
        }
        builder.show()
    }
    private fun takePicture() {
        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(camera_intent, REQUEST_IMAGE_CAPTURE)
    }
    private fun takePictureID() {
        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(camera_intent, ID_REQUEST_IMAGE_CAPTURE)
    }
    private fun imagePickID() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, ID_PICK_IMAGE_REQUEST)
    }
    private fun imagePick() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
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
        onStepChangeListener.onstepChange(1)
    }


}