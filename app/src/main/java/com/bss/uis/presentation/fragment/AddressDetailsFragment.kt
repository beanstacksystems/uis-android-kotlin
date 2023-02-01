package com.bss.uis.presentation.fragment

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.InputType
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bss.uis.R
import com.bss.uis.data.remote.dto.request.AddressdtoRequest
import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.request.PersonlistRequest
import com.bss.uis.data.remote.dto.response.Personlist
import com.bss.uis.presentation.OnStepChangeListner
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
    lateinit var onStepChangeListener: OnStepChangeListner
    lateinit var btnNxt: AppCompatButton
    lateinit var btnback: AppCompatButton
    lateinit var personlistRequest: PersonlistRequest


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_address_details, container, false)
        viewModelUIS = ViewModelProvider(requireActivity())[ViewModelUIS::class.java]
        AddPatientActivity.fragmentName = "AddressDetails"
        initView(view)
        personlistRequest = arguments?.getSerializable("data") as PersonlistRequest
//        Log.d("arguments", personlistRequest.toString())
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
        btnback = fragmentView.findViewById(R.id.btnBackAddres)
        btnNxt = fragmentView.findViewById(R.id.btnNextAddress)
        btnNxt.setOnClickListener {
            if (isValidDetails()) {
                val addressdtoRequest = AddressdtoRequest(
                    addressid = 1,
                    entityid = 1,
                    entitytypeid = 1,
                    addresstypeid = 1,
                    addressline1 = streetAdd.text.toString(),
                    addressline2 = "address2",
                    addressline3 = "address3",
                    city = city.text.toString(),
                    district = dist.text.toString(),
                    state = state.text.toString(),
                    country = "country",
                    pincode = pin.text.toString().toInt(),
                    isactive = "Y",
                    createddate = "26/12/2022",
                    updatedate = "26/12/2022"
                )
                personlistRequest.addressdto = addressdtoRequest
                val bundle = Bundle().apply {
                    putSerializable("dataA", personlistRequest)
                }
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_addressFragment_to_medicalHistoryFragment,bundle)
            }
        }
        btnback.setOnClickListener {
            Navigation.findNavController(requireView()).popBackStack()
        }
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
        input.filters = arrayOf(InputFilter.LengthFilter(11))
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
                    Log.d("district", it.data?.get(0)?.PostOffice?.get(0)?.District.toString())

                    state.text = Editable.Factory.getInstance()
                        .newEditable(it.data?.get(0)?.PostOffice?.get(0)?.State.toString())
                    dist.text = Editable.Factory.getInstance()
                        .newEditable(it.data?.get(0)?.PostOffice?.get(0)?.District.toString())
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
        if (streetAdd.text.toString() == "") {
            streetAdd.error = "Please input this field"
            return false
        } else if (city.text.toString() == "") {
            city.error = "Please input this field"
            return false
        } else if (pin.text.toString() == "") {
            pin.error = "Please input this field"
            return false
        } else if (dist.text.toString() == "") {
            dist.error = "Please input this field"
            return false
        } else if (state.text.toString() == "") {
            state.error = "Please input this field"
            return false
        } else {
            return true
        }
    }

    override fun fragmentName(): String {
        return "AddressDetails"
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
        onStepChangeListener.onstepChange(2)
    }

}