package com.bss.uis.listner

import android.view.View
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class TextInputLayoutFocusChangeListener(textInputLayout: TextInputLayout?,
                                         emptyMessage: String?) : View.OnFocusChangeListener {
    var textInputLayout: TextInputLayout? = textInputLayout
    var emptyMessage: String? = emptyMessage


    override fun onFocusChange(p0: View?, p1: Boolean) {
        textInputLayout!!.error = null
        val textInputEditText = p0 as TextInputEditText
        val text = textInputEditText.text.toString()
        if (text.isEmpty()) textInputLayout!!.error = emptyMessage
    }
}