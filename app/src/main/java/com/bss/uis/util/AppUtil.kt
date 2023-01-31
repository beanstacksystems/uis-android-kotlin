package com.bss.uis.util

import android.R
import android.app.Dialog
import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.util.Base64
import android.util.Patterns
import android.view.*
import android.widget.*
import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
import com.google.android.material.textfield.TextInputLayout
import java.io.ByteArrayOutputStream
import java.util.regex.Matcher
import java.util.regex.Pattern


open class AppUtil {
    companion object {
        private val TAG = UISApplicationContext::class.java.simpleName
        var instance: UISApplicationContext? = null
        var context: Context? = null
        lateinit var authResponse: AuthResponseDomain
        lateinit var user: UserApiResponseDomain
        var userCurrentRole = 0
        var appConfigMap: Map<String, String>? = null
    }

    private lateinit var dialog: Dialog

    val PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})"
    private val pattern = Pattern.compile(PASSWORD_PATTERN)
    private var matcher: Matcher? = null
    fun isCorrectPasswordPolicy(password: String?): Boolean? {
        matcher = password?.let { pattern.matcher(it) }
        return matcher?.matches()
    }

    open fun emailValidation(email: String): Boolean? {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    open fun getSpinnerView(
        context: Context?,
        id: Int,
        option: Array<String>,
//        selectionService: ISelectionService
    ): Spinner? {
        val spinner = Spinner(context)
        spinner.id = id
        val spinnerArrayAdapter = ArrayAdapter(
            context!!, R.layout.simple_spinner_dropdown_item, option
        )
        spinner.adapter = spinnerArrayAdapter
        spinner.gravity = Gravity.CENTER
        //        spinner.setBackgroundResource(R.drawable.bubble_shape_edittext);
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>,
                selectedItemView: View,
                position: Int,
                id: Long
            ) {
//                selectionService.onSelected(
//                    parentView.selectedItem.toString(),
//                    parentView.selectedItemPosition
//                )
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        return spinner
    }

    fun loadingDialog(context: Context) {
        dialog = Dialog(context)
        dialog.setContentView(com.bss.uis.R.layout.dialog_loading)
        dialog.show()
    }

    fun dialogDismiss(context: Context) {
        dialog = Dialog(context)
        dialog.dismiss()
    }


    fun updateButtonStatus(button: Button, isEnabled: Boolean, bgColor: Int, btnText: String?) {
        button.isEnabled = isEnabled
        button.setBackgroundResource(bgColor)
        if (null != btnText) button.text = btnText
    }

    open fun getSelectPopupDialog(
        context: Context?, title: String?, options: Array<String>,
        view: TextView, genderLayout: TextInputLayout
    ): Dialog? {
        val dialog = Dialog(context!!)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(com.bss.uis.R.layout.popup_select)
        val radioLinearLayout =
            dialog.findViewById<RelativeLayout>(com.bss.uis.R.id.selectpopup_radioLayout)
        radioLinearLayout.addView(
            getRadioGroup(
                context,
                options,
                LinearLayout.VERTICAL,
                view,
                dialog,
                genderLayout
            )
        )
        val headerText =
            dialog.findViewById<TextView>(com.bss.uis.R.id.SelectPopUpHeader)
        dialog.setTitle(title)
        headerText.text = title
        dialog.window!!.decorView.setBackgroundResource(R.color.transparent)
        dialog.setOnDismissListener { view.clearFocus() }
        return dialog
    }

    open fun getRadioGroup(
        context: Context?, options: Array<String>,
        orientation: Int, v: TextView, dialog: Dialog,
        genderLayout: TextInputLayout
    ): RadioGroup? {
        val radioGroup = RadioGroup(context)
        radioGroup.orientation = orientation
        radioGroup.gravity = Gravity.LEFT
        for (option in options) {
            val radioButton = RadioButton(context)
            radioButton.text = option
            radioGroup.addView(radioButton)
        }
        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { rg, checkedId ->
            for (i in 0 until rg.childCount) {
                val btn = rg.getChildAt(i) as RadioButton
                if (btn.id == checkedId) {
                    v.text = btn.text.toString()
                    dialog.dismiss()
                    genderLayout.error = null
                    return@OnCheckedChangeListener
                }
            }
        })
        return radioGroup
    }

    fun imageEncode(imageView: ImageView): String? {
        return try {

            val drawable: Drawable = imageView.drawable
            val bitmap: Bitmap = (drawable as BitmapDrawable).bitmap
            val byteArrayOutputStream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
            val byteArray: ByteArray = byteArrayOutputStream.toByteArray()
            val encoded: String = Base64.encodeToString(byteArray, Base64.DEFAULT)
            encoded
        }catch (e:java.lang.Exception){
            null
        }

    }


}






