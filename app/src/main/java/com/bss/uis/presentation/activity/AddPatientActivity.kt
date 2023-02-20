package com.bss.uis.presentation.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import com.bss.uis.R
import com.bss.uis.StepViewRegistration
import com.bss.uis.presentation.OnStepChangeListner
import com.bss.uis.presentation.fragment.BaseFragment
import com.bss.uis.presentation.fragment.PersonalDetailsFragment
import com.google.android.material.appbar.MaterialToolbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi


@AndroidEntryPoint
class AddPatientActivity : AppCompatActivity(), OnStepChangeListner{
    lateinit var toolbar: MaterialToolbar
     lateinit var btnNext: AppCompatButton
    lateinit var btnBack: AppCompatButton
    lateinit var stepView: StepViewRegistration
    private val listener: OnButtonClickListener? = null

    interface OnButtonClickListener {
        fun onButtonClick()
    }

    companion object {
        var fragmentName = ""
        var isValidate = false
    }

    //    val navGraphIds = listOf(R.navigation.nav_host_fragment, R.navigation.nav_discover, R.navigation.nav_search, R.navigation.nav_my)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_patient)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        initView()
    }

    private fun initView() {
        toolbar = findViewById(R.id.topAppBar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        stepView = findViewById(R.id.customStepView)
//        btnNext = findViewById(R.id.btnNext)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
//        btnNext.setOnClickListener {
//
//            when (fragmentName) {
//                "PersonalDetails" -> {
//
//                    val baseFragment:BaseFragment = PersonalDetailsFragment()
//                    if (baseFragment.isValidDetails()) {
//                        navController.navigate(R.id.action_personalDetailFragment_to_addressFragment)
//                    }else{
//                        Toast.makeText(this@AddPatientActivity, "Please Enter All Details",Toast.LENGTH_LONG).show()
//                    }
//                }
//                "AddressDetails" -> {
//                    navController.navigate(R.id.action_addressFragment_to_medicalHistoryFragment)
//                }
//                "MedicalDetails" -> {
//                    navController.navigate(R.id.action_medicalHistoryFragment_to_attendantFragment)
//                    btnNext.text = "Submit"
//                }
//                "submit" ->{
//                    Toast.makeText(this@AddPatientActivity,"submitted",Toast.LENGTH_LONG).show()
//                }
//
//            }
//
//
//        }
//        btnBack = findViewById(R.id.btnBackApp)
//        btnBack.setOnClickListener {
////            this.listener?.onButtonClick()
////            listener = this
//        }

    }

    override fun onstepChange(step: Int) {
       stepView.goToStep(step)
    }


}