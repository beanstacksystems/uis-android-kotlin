package com.bss.uis.presentation.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.bss.uis.R
import com.bss.uis.presentation.ValidateData
import com.bss.uis.presentation.fragment.AddressDetailsFragment
import com.bss.uis.presentation.fragment.BaseFragment
import com.bss.uis.presentation.fragment.MedicalDetailsFragment
import com.bss.uis.presentation.fragment.PersonalDetailsFragment
import com.google.android.material.appbar.MaterialToolbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalCoroutinesApi::class)
@AndroidEntryPoint
class AddPatientActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var toolbar: MaterialToolbar
    lateinit var btnNext: AppCompatButton

    companion object {
        var fragmentName = ""
        var isValidate = false
    }

    //    val navGraphIds = listOf(R.navigation.nav_host_fragment, R.navigation.nav_discover, R.navigation.nav_search, R.navigation.nav_my)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_patient)
        initView()
    }

    private fun initView() {
        toolbar = findViewById(R.id.topAppBar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        btnNext = findViewById(R.id.btnNext)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        btnNext.setOnClickListener {

            when (fragmentName) {
                "PersonalDetails" -> {
                    navController.navigate(R.id.action_personalDetailFragment_to_addressFragment)
                }
                "AddressDetails" -> {
                    navController.navigate(R.id.action_addressFragment_to_medicalHistoryFragment)
                }
                "MedicalDetails" -> {
                    navController.navigate(R.id.action_medicalHistoryFragment_to_attendantFragment)
                    btnNext.text = "Submit"
                }
                "submit" ->{
                    Toast.makeText(this@AddPatientActivity,"submitted",Toast.LENGTH_LONG).show()
                }

            }


        }

    }

    override fun onClick(v: View?) {

    }
}