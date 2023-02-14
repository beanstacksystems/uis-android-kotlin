package com.bss.uis.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bss.uis.R
import com.bss.uis.data.remote.dto.response.FetchPatientList
import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import com.bss.uis.presentation.adapter.UserAdapter
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch


class ListFragment : Fragment() , UserAdapter.OnItemClickListener{
    lateinit var recyclerviewView: RecyclerView
    @OptIn(ExperimentalCoroutinesApi::class)
    private lateinit var viewModelUIS: ViewModelUIS
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    var userlist: MutableList<FetchUserListResponse> = mutableListOf()
    var patientlist: MutableList<FetchPatientList> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerviewView = view.findViewById(R.id.rv_iduserRequet)
        recyclerviewView.layoutManager = LinearLayoutManager(requireActivity())
       val data = arguments?.getString("ARG_OBJECT")
        viewModelUIS = ViewModelProvider(requireActivity())[ViewModelUIS::class.java]
        mainScope.launch {
            fetchuserList()
        }
        dataObserver()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    suspend fun fetchuserList() {
        viewModelUIS.fetchUserList(
            ContextPreferenceManager().getToken("token", requireActivity())
                .toString()
        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun dataObserver() {
        viewModelUIS.fetchUserList.observe(requireActivity()) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.fetchUserList.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.fetchUserList.value = it
                    if (it.data != null) {
                        it.data.forEach { data ->
                            userlist.add(data)
                        }
                        val adapter = UserAdapter(it.data, this)
                       recyclerviewView.adapter = adapter
                        adapter.notifyDataSetChanged()
                    }
                    viewModelUIS.fetchUserList.value = null

                }
                is Resource.Error -> {
                    AppUtil().dialogDismiss(requireActivity())
                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.fetchUserList.value = null
                }
            }
        }
    }

    override fun onItemClick(position: Int) {
        val bundle = Bundle().apply {
            putSerializable("datauser", userlist[position])
        }
        Navigation.findNavController(requireView())
            .navigate(R.id.action_nav_home_to_adminWorkSpaceFragment, bundle)
    }


}