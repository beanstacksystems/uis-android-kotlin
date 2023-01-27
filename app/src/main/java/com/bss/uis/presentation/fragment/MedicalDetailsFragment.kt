package com.bss.uis.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bss.uis.R
import com.bss.uis.presentation.activity.AddPatientActivity


class MedicalDetailsFragment : BaseFragment(){



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_medical_details, container, false)
        AddPatientActivity.fragmentName ="MedicalDetails"
        return  view
    }

    override fun isValidDetails(): Boolean {
        TODO("Not yet implemented")
    }

    override fun fragmentName(): String {
       return "MedicalDetails"
    }


}