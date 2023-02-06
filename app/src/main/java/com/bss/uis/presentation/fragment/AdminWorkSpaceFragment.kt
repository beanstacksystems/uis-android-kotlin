package com.bss.uis.presentation.fragment

import android.app.Dialog
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bss.uis.R
import com.bss.uis.data.remote.dto.request.ApproveUserRequestBody
import com.bss.uis.data.remote.dto.request.PersonlistRequest
import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class AdminWorkSpaceFragment : Fragment() {
    lateinit var spinner: Spinner
    lateinit var ivProfile: ImageView
    lateinit var name: TextView
    lateinit var contact: TextView
    lateinit var applyBtn: AppCompatButton
    lateinit var rejectBtn: AppCompatButton
    var item = ""
    private lateinit var viewModelUIS: ViewModelUIS
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    private lateinit var dialog: Dialog


    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_admin_work_space, container, false)
        val items = arrayOf("superadmin", "admin", "member", "trustee", "counseller")
        viewModelUIS = ViewModelProvider(requireActivity())[ViewModelUIS::class.java]
        val map = hashMapOf<String, String>()
        map["superadmin"] = "1"
        map["admin"] = "2"
        map["member"] = "3"
        map["trustee"] = "4"
        map["counseller"] = "10"
        val personlistRequest = arguments?.getSerializable("datauser") as FetchUserListResponse
        spinner = view.findViewById(R.id.spinner2)
        name = view.findViewById(R.id.textView9)
        name.text = personlistRequest.userName.toString()
        contact = view.findViewById(R.id.textView12)
        contact.text = personlistRequest.userContact
        ivProfile = view.findViewById(R.id.imageView3)
//        val byteArray = Base64.decode(personlistRequest.userProfileImage, Base64.DEFAULT)
//        val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
//        ivProfile.setImageBitmap(bitmap)
        rejectBtn = view.findViewById(R.id.button2)
        applyBtn = view.findViewById(R.id.button3)
        applyBtn.setOnClickListener {
           showLoader()
            val requestBody = ApproveUserRequestBody(
                adminUserId = ContextPreferenceManager().getToken("userid",requireActivity())?.toInt(),
                userCurrentRole = personlistRequest.userCurrentRole,
                userNewRole = map.getValue(item).toInt(),
                userId = personlistRequest.userId
            )
            mainScope.launch {
                approveUser(requestBody)
            }
        }
        rejectBtn.setOnClickListener {
            requireActivity().onBackPressed()
        }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                item = parent.getItemAtPosition(position).toString()
                // Do something with the selected item
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Nothing was selected
            }
        }
        dataObserver()


        val adapter =
            ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_dropdown_item, items)
        spinner.adapter = adapter
        return view
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    suspend fun approveUser(requestBody: ApproveUserRequestBody) {
        viewModelUIS.approveUser(
            ContextPreferenceManager().getToken("token", requireActivity())
                .toString(), requestBody
        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun dataObserver() {
        viewModelUIS.approveUseResp.observe(requireActivity()) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.approveUseResp.value = null
                }
                is Resource.Success -> {
//                    Toast.makeText(activity, it.data?.messagedetails, Toast.LENGTH_LONG)
//                        .show()
                    dialogDismiss()
                    Navigation.findNavController(requireView()).popBackStack()
                    viewModelUIS.approveUseResp.value = null
                }
                is Resource.Error -> {
                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()
                    viewModelUIS.approveUseResp.value = null
                }
            }
        }
    }
    private fun showLoader(){
        dialog = Dialog(requireActivity())
        dialog.setContentView(com.bss.uis.R.layout.dialog_loading)
        dialog.show()

    }
    fun dialogDismiss() {

        dialog.dismiss()
    }


}