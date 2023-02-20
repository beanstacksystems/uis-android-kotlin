package com.bss.uis.presentation.activity

import android.app.Activity
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.lifecycle.ViewModelProvider
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.data.remote.dto.request.*
import com.bss.uis.databinding.ActivityEditProfileBinding
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import timber.log.Timber
import java.util.*



@OptIn(ExperimentalCoroutinesApi::class)
class EditProfileActivity : AppCompatActivity() {


    private val PICK_IMAGE_REQUEST = 1111
    private val REQUEST_IMAGE_CAPTURE = 2222
    private val ID_PICK_IMAGE_REQUEST = 3333
    private val ID_REQUEST_IMAGE_CAPTURE = 4444

//    private lateinit var viewModelUIS: ViewModelUIS
    private lateinit var binding: ActivityEditProfileBinding
    private var isEditing = false
    lateinit var imageUri: Uri


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
//        viewModelUIS = ViewModelProvider(this)[ViewModelUIS::class.java]

        val view = binding.root
        setContentView(view)

        binding.epImage.setOnClickListener {
            selectImage()
        }

        binding.epFullname.editText?.setText(
            ContextPreferenceManager().getToken(
                "username", this@EditProfileActivity
            )
        )

        binding.epEmail.editText?.setText(
            ContextPreferenceManager().getToken(
                "email", this@EditProfileActivity
            )
        )

        binding.epDob.editText?.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                this@EditProfileActivity,
                { _, year, monthOfYear, dayOfMonth ->
                    binding.epDob.editText?.text =
                        Editable.Factory.getInstance().newEditable("$dayOfMonth/$monthOfYear/$year")
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }

        binding.epEdit.setOnClickListener {
            isEditing = true
            binding.epEdit.visibility = View.GONE
            binding.epSubmit.visibility = View.VISIBLE

            binding.epSalutation.editText?.isEnabled = true
            binding.epFullname.editText?.isEnabled = true
            binding.epGender.editText?.isEnabled = true
            binding.epEmail.editText?.isEnabled = true
            binding.epDob.editText?.isEnabled = true
        }


        initGenderView(binding, this)
        initDOB(binding, this)
        initSalutationView(binding, this)


        binding.epSubmit.setOnClickListener {
            if (binding.epSalutation.editText?.text?.isNotEmpty()!!) {
                if (binding.epFullname.editText?.text?.isNotEmpty()!!) {
                    if (binding.epGender.editText?.text?.isNotEmpty()!!) {
                        if (binding.epEmail.editText?.text?.isNotEmpty()!!) {
                            if (binding.epDob.editText?.text?.isNotEmpty()!!) {
                                //make api call
                                CoroutineScope(Dispatchers.IO).launch {
                                    Log.e("EditProfileActivity", "onCreate: ${ updateUserProfileDataRequest(binding,this@EditProfileActivity)}", )
                                }

                            } else binding.epDob.error = "Date of Birth can not be left empty."
                        } else binding.epEmail.error = "Email can not be left empty."
                    } else binding.epGender.error = "Gender can not be left empty."
                } else binding.epFullname.error = "Name can not be left empty."
            } else binding.epSalutation.error = "Salutation can not be left empty."

        }
    }



    fun selectImage() {
        val options = arrayOf<CharSequence>("Take Photo", "Choose from Gallery", "Cancel")
        val builder = AlertDialog.Builder(
            this
        )
        builder.setTitle("Add Photo!")
        builder.setItems(options) { dialog, item ->
            if (options[item] == "Take Photo") {
                takePicture()
            } else if (options[item] == "Choose from Gallery") {
                imagePick(this)
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

    private fun imagePick(context: Context) {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        try {
            if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
                if (data != null && data.data != null) {
                    imageUri = data.data!!
                    Glide.with(this)
                        .load(imageUri)
                        .into(binding.epImage)
                }
            } else if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
                val photo = data?.extras?.get("data") as Bitmap
                binding.epImage.setImageBitmap(photo)

            } else if (requestCode == ID_PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
                if (data != null && data.data != null) {
                    val imageUri = data.data
                    Glide.with(this)
                        .load(imageUri)
                        .into(binding.epImage)
                }
            } else if (requestCode == ID_REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
                val photo = data?.extras?.get("data") as Bitmap
                binding.epImage.setImageBitmap(photo)

            }
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            Toast.makeText(this,"Please Choose photo less than 1 mb", Toast.LENGTH_LONG ).show()
        }
    }


    private fun initDOB(view: ActivityEditProfileBinding, context: Context) {
        view.epDob.editText?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (view.epDob.editText?.text.toString() == "") {
                    view.epDob.error = "This Field Can Not Be Empty"

                } else {
                    view.epDob.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // code to be executed when text is changed

            }
        })
        view.epDob.editText?.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                context,
                { _, year, monthOfYear, dayOfMonth ->
                    view.epDob.editText?.text =
                        Editable.Factory.getInstance().newEditable("$dayOfMonth/$monthOfYear/$year")
                },
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }
    }


    private fun initGenderView(view: ActivityEditProfileBinding, context: Context) {
        view.epGender.editText?.showSoftInputOnFocus = false

        val genderValue = SharedPrefForRoomDb().genderlist(context)
        view.epGender.editText?.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            view.epGender.error = null
            val textInputEditText = v as TextInputEditText
            val text = textInputEditText.text.toString()
            if (text.isEmpty()) view.epGender.error = "Gender can not be empty."
            if (hasFocus) {
                val dialog: Dialog? = view.epGender.editText?.let {
                    AppUtil().getSelectPopupDialog(
                        context, "Gender", genderValue.toTypedArray(), it, view.epGender
                    )
                }
                dialog?.show()
            }
        }
    }

    private fun initSalutationView(view: ActivityEditProfileBinding, context: Context) {

        val salutationValue = SharedPrefForRoomDb().salutTationList(context)
        view.epSalutation.editText?.onFocusChangeListener =
            View.OnFocusChangeListener { v: View, hasFocus: Boolean ->
                view.epSalutation.error = null
                val textInputEditText = v as TextInputEditText
                val text = Objects.requireNonNull(textInputEditText.text).toString()
                if (text.isEmpty()) view.epSalutation.error = "Salutation can not be empty."
                if (hasFocus) {
                    val dialog: Dialog? = view.epSalutation.editText?.let {
                        AppUtil().getSelectPopupDialog(
                            context, "Salutation", salutationValue.toTypedArray(), it, view.epSalutation
                        )
                    }
                    dialog?.show()
                }
            }
    }


    private fun updateUserProfileDataRequest(
        view: ActivityEditProfileBinding,
        context: Context
    ): UpdateUserProfileDataRequest {
        return UpdateUserProfileDataRequest(
            occupation = 1,
            gender = getmasterId(view.epGender.editText?.text.toString(),context),
            dob = view.epDob.editText?.text.toString(),
            logintype ="",
            imagedto = UpdateUserProfileDataRequest.Imagedto(
                imagetype = 24,
                imageid = 1,
                updatedate = "26/12/2022",
                medicalrecordid = 1,
                entitytypeid = 16,
                createddate = "26/12/2022",
                imageurl = "",
                isactive = "y",
                entityid = 1,
                imagedata = AppUtil().imageEncode(view.epImage),
                imagefilename = "profile.jpeg",
            ),
            userrole ="Y",
            personid =1,
            salutation = getmasterId(view.epSalutation.editText?.text.toString(),context),
            userid =1,
            username =view.epFullname.editText?.text.toString(),
            useremail =view.epEmail.editText?.text.toString(),
        )

    }

    private fun getmasterId(dataS: String, context: Context): Int {
        var masterId:Int = 0
        val masterdao = UISDatabase.getInstance(context).masterDAO
        val masterDaoRepository = MasterDaoRepository(masterdao)
        masterDaoRepository.masterDataList.forEach { data ->
            if (data.masterdatadesc!! == dataS) {
                masterId = data.masterdataId
                Timber.tag("masteridloop").d(masterId.toString())
            }

        }
        return masterId

    }


}


