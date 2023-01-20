package com.bss.uis.validator

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

abstract class CustomTextValidator(private val textView: TextInputEditText) : TextWatcher {
    abstract fun validate(textView: TextView?, text: String?)
    override fun afterTextChanged(s: Editable) {
        val text = textView.text.toString()
        validate(textView, text)
    }

    override fun beforeTextChanged(
        s: CharSequence,
        start: Int,
        count: Int,
        after: Int
    ) { /* Don't care */
    }

    override fun onTextChanged(
        s: CharSequence,
        start: Int,
        before: Int,
        count: Int
    ) { /* Don't care */
    }
}