package com.bss.uis.util

import android.R
import android.app.Dialog
import android.content.Context
import android.text.TextUtils
import android.util.Patterns
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
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
}






