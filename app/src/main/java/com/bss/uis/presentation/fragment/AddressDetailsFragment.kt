package com.bss.uis.presentation.fragment

import android.app.AlertDialog
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bss.uis.R
import com.bss.uis.presentation.activity.AddPatientActivity
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.util.Resource
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class AddressDetailsFragment : BaseFragment() {
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    private lateinit var viewModelUIS: ViewModelUIS
    lateinit var streetAdd: TextInputEditText
    lateinit var city: TextInputEditText
    lateinit var dist: TextInputEditText
    lateinit var state: TextInputEditText
    lateinit var pin: TextInputEditText
    lateinit var streetInputLayout: TextInputLayout
    lateinit var cityInputLayout: TextInputLayout
    lateinit var distInputLayout: TextInputLayout
    lateinit var stateInputLayout: TextInputLayout
    lateinit var pinLayout: TextInputLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_address_details, container, false)
        viewModelUIS = ViewModelProvider(requireActivity())[ViewModelUIS::class.java]
        AddPatientActivity.fragmentName = "AddressDetails"
        initView(view)
        createPinPopup()
        dataobserver()
        return view
    }

    private fun initView(fragmentView: View) {
        streetAdd = fragmentView.findViewById(R.id.streetAdd)
        city = fragmentView.findViewById(R.id.city)
        dist = fragmentView.findViewById(R.id.dist)
        state = fragmentView.findViewById(R.id.state)
        pin = fragmentView.findViewById(R.id.pincode)
        streetInputLayout = fragmentView.findViewById(R.id.streetAddLayout)
        cityInputLayout = fragmentView.findViewById(R.id.cityLayout)
        distInputLayout = fragmentView.findViewById(R.id.distLayout)
        stateInputLayout = fragmentView.findViewById(R.id.stateLayout)
        pinLayout = fragmentView.findViewById(R.id.pincodeLayout)
        pin.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                mainScope.launch {
                    pincodeApiCall(s.toString())
                }
            }

        })


    }

    private fun createPinPopup() {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Enter Pincode")
        val input = EditText(requireActivity())
        input.inputType = InputType.TYPE_CLASS_NUMBER
        builder.setView(input)

        builder.setPositiveButton("OK") { dialog, which ->
            pin.text = input.text
            dialog.cancel()
            // Do something with the name, such as displaying it in a TextView
        }
        builder.setNegativeButton("Cancel") { dialog, which ->
            dialog.cancel()
        }

        val alert = builder.create()
        alert.show()
    }

    private suspend fun pincodeApiCall(pin: String) {
        viewModelUIS.pincodeDetailsApi(pin)
    }

    private fun dataobserver() {
        viewModelUIS.pincodedetailsList.observe(requireActivity()) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.pincodedetailsList.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.pincodedetailsList.value = it
//                    it.data?.forEach {data->
//                        Log.d("pincodedetailsList",data?.state.toString())
//                    }

//                    state.text = Editable.Factory.getInstance().newEditable(it.data?.get(0)?.state)
//                    dist.text = Editable.Factory.getInstance().newEditable(it.data?.get(0)?.district)
                    viewModelUIS.pincodedetailsList.value = null

                }
                is Resource.Error -> {
                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.pincodedetailsList.value = null
                }
            }
        }
    }

    override fun isValidDetails(): Boolean {
        TODO("Not yet implemented")
    }

    override fun fragmentName(): String {
        return "AddressDetails"
    }

}