package com.bss.uis.presentation

import androidx.fragment.app.Fragment

open interface ValidateData {
    fun isValidDetails(): Boolean
   open fun fragmentName():String
}