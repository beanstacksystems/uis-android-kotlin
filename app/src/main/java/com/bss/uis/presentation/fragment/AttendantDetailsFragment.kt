package com.bss.uis.presentation.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.bss.uis.R
import com.bss.uis.presentation.OnStepChangeListner
import com.bss.uis.presentation.activity.AddPatientActivity
import com.bss.uis.presentation.adapter.TabAdaptaer
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import de.hdodenhof.circleimageview.CircleImageView


class AttendantDetailsFragment : BaseFragment() {

    lateinit var onStepChangeListener: OnStepChangeListner

    lateinit var name: TextInputEditText
    lateinit var email:TextInputEditText
    lateinit var contact:TextInputEditText
    lateinit var dob:TextInputEditText
    lateinit var panadhar:TextInputEditText
    lateinit var occupationInputLayout: TextInputLayout
    lateinit var eMailInputLayout:TextInputLayout
    lateinit var contactInputLayout:TextInputLayout
    lateinit var dobInputLayout: TextInputLayout
    lateinit var genderLayout:TextInputLayout
    lateinit var panadhartxtLayout:TextInputLayout
    lateinit var nameLayout:TextInputLayout
    lateinit var occupation: AutoCompleteTextView
    lateinit var gender:AutoCompleteTextView
    private val fragmentTitle: String? = null
    private lateinit var tabLayout: TabLayout
    var tabFragList: MutableList<DynamicTabFragment> = mutableListOf()
    private val isTabContentInitialized = false
    lateinit var profile_image: CircleImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_attendant_details, container, false)
        AddPatientActivity.fragmentName = "submit"


        return view
    }
    override fun isValidDetails(): Boolean {
        TODO("Not yet implemented")
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

}