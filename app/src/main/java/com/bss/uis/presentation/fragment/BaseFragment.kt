package com.bss.uis.presentation.fragment

import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {

    abstract fun isValidDetails(): Boolean
    abstract fun fragmentName(): String

}