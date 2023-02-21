package com.bss.uis.presentation.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.bss.uis.R
import com.bss.uis.data.remote.dto.response.FetchPatientList
import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import com.bss.uis.presentation.activity.PatientDetailsActivity
import com.bss.uis.presentation.adapter.ScrollImageAdapter
import com.bss.uis.presentation.adapter.TabAdaptaer
import com.bss.uis.presentation.adapter.UserAdapter
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import com.bss.uis.roomdb.dao.repository.PatientDaoRepository
import com.bss.uis.roomdb.dao.repository.UserDaoRepository
import com.bss.uis.roomdb.entity.Patient
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import com.google.android.material.card.MaterialCardView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.*
import java.util.*


class HomeFragment : Fragment(),ScrollImageAdapter.OnItemClickListener{

    //    private val homeViewModel: HomeViewModel? = null
    lateinit var imageViews: Array<ImageView?>

    lateinit var imagePanel: LinearLayout
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    private lateinit var demoCollectionAdapter: DemoCollectionAdapter
    private lateinit var adminviewPager: ViewPager2


    lateinit var recyclerviewView: RecyclerView
    lateinit var userCard: MaterialCardView
    lateinit var admincard: MaterialCardView
    lateinit var tvAdmin: TextView
    lateinit var tvnoRegistration: TextView

    lateinit var my_tablayout: TabLayout
    private lateinit var viewModelUIS: ViewModelUIS
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    var userlist: MutableList<FetchUserListResponse> = mutableListOf()
    var patientlist: MutableList<FetchPatientList> = mutableListOf()


    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        viewModelUIS = ViewModelProvider(requireActivity())[ViewModelUIS::class.java]
//        recyclerviewView = view.findViewById(R.id.rv_iduserRequet)
//        recyclerviewView.layoutManager = LinearLayoutManager(requireActivity())
        tvnoRegistration = view.findViewById(R.id.tv_no_registartion)
        viewPager = view.findViewById(R.id.imgviewPagerMain)
        my_tablayout = view.findViewById(R.id.my_tablayout)
        my_tablayout.isVisible = true


        userCard = view.findViewById(R.id.user_card)
        admincard = view.findViewById(R.id.adminWrkcard)
        tvAdmin = view.findViewById(R.id.adminWrkspace)

        tabLayout = view.findViewById(R.id.home_tabLayout)
        ioScOPe.launch {
            getTabFragmentList(view)

        }

        mainScope.launch {
//            fetchuserList()
            fetchPatientList()
        }
        ioScOPe.launch {
            getuserRightData()
        }


        dataObserver()


        return view
    }


//    private suspend fun getPatientdata() {
//        val patientdao = UISDatabase.getInstance(requireActivity()).patientDao
//        val patientDaoRepository = PatientDaoRepository(patientdao)
//        mainScope.launch {
//            patientDaoRepository.listPatient.observe(requireActivity()) {
//                if (it.isNotEmpty()) {
//                    tvnoRegistration.visibility = View.GONE
//                }
////                scrollPatient(it)
//
//
//            }
//        }
//
//
//    }

    private fun scrollPatient( patientlist: MutableList<FetchPatientList>) {
        val scrollImageAdapter =
            ScrollImageAdapter(requireActivity(), patientlist,this)
        viewPager.adapter = scrollImageAdapter
        TabLayoutMediator(
            my_tablayout,
            viewPager

        ) { _, _ -> }.attach()


    }



    @OptIn(ExperimentalCoroutinesApi::class)
    suspend fun fetchPatientList() {
        viewModelUIS.fetchPatientList(
            ContextPreferenceManager().getToken("token", requireActivity())
                .toString(), 2
        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun dataObserver() {
//        viewModelUIS.fetchUserList.observe(requireActivity()) {
//            when (it) {
//                is Resource.Loading -> {
//                    viewModelUIS.fetchUserList.value = null
//                }
//                is Resource.Success -> {
//
//                    viewModelUIS.fetchUserList.value = it
//                   if (it.data != null){
//                       it.data.forEach { data ->
//                           userlist.add(data)
//                       }
//                       val adapter = it.data?.let { it1 -> UserAdapter(it1, this) }
////                       recyclerviewView.adapter = adapter
//                   }
//                    viewModelUIS.fetchUserList.value = null
//
//                }
//                is Resource.Error -> {
//                    AppUtil().dialogDismiss(requireActivity())
//                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()
//
//                    viewModelUIS.fetchUserList.value = null
//                }
//            }
//        }


        viewModelUIS.patientlist.observe(requireActivity()) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.patientlist.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.patientlist.value = it


                        it.data?.forEach { data ->
                            patientlist.add(data)
                        }

                        scrollPatient(patientlist)
                    viewModelUIS.patientlist.value = null
                }
                is Resource.Error -> {
                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()
                    viewModelUIS.patientlist.value = null
                }
            }
        }
    }

    private fun getTabFragmentList(view: View) {
        val tabFragList: MutableList<DynamicTabFragment> = mutableListOf()
        val masterDao = UISDatabase.getInstance(requireActivity()).masterDAO
        val masterDaoRepository = MasterDaoRepository(masterDao)
        mainScope.launch {
            masterDaoRepository.tabDataList.forEach { data ->
                Log.d("tabdata", data.tabdesc.toString())
                val dynamicTabFragment = DynamicTabFragment.newInstance(
                    tabTitle = data.tabname,
                    tabData = data.tabdata,
                    tabDescription = data.tabdesc,
                    isCustomLayoutNeeded = false,
                    customLayoutId = data.tabseq
                )
                tabFragList.add(dynamicTabFragment)
            }
            for (frag in tabFragList) tabLayout.addTab(
                tabLayout.newTab().setText(frag.tabTitle)
            )
            val tabAdapter = TabAdaptaer(activity!!.supportFragmentManager, tabFragList)
            val tabViewPager = view.findViewById<View>(R.id.tabviewPager) as ViewPager
            tabViewPager.adapter = tabAdapter
            tabViewPager.offscreenPageLimit = 1
            tabViewPager.addOnPageChangeListener(
                TabLayout.TabLayoutOnPageChangeListener(
                    tabLayout
                )
            )
            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    tabViewPager.currentItem = tab.position
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {}
                override fun onTabReselected(tab: TabLayout.Tab?) {}
            })


        }


    }

    private suspend fun savePatientData(data: FetchPatientList) {
        val patientdao = UISDatabase.getInstance(requireActivity()).patientDao
        val patient = Patient(
            patientId = data.patientId!!,
            name = data.patientName,
            idproof = data.patientId.toString(),
            emailId = "",
            contact = data.patientContact,
            gender = "",
            dob = data.patientAge,
            diseasesName = data.patientCancerType,
            patientImage = data.patientImage
        )
        val patientDaoRepository = PatientDaoRepository(patientdao)
        patientDaoRepository.insertPatientData(patient)

//        startActivity(Intent(requireActivity(), DrawerMainActivity::class.java))
//        requireActivity().finish()


    }

    private suspend fun getuserRightData() {
        val userDao = UISDatabase.getInstance(requireActivity()).userDAO
        val userDaoRepository = UserDaoRepository(userDao)
        userDaoRepository.userRightList.forEach {
            if (it.userRoleId == 2) {
                mainScope.launch {
                    userCard.visibility = View.GONE
                    admincard.visibility = View.VISIBLE
                    tvAdmin.visibility = View.VISIBLE
                }
                return@forEach
            }

        }

    }




    private suspend fun deletePatientDAta(){
        val patientdao = UISDatabase.getInstance(requireActivity()).patientDao
        val patientDaoRepository = PatientDaoRepository(patientdao)
        patientDaoRepository.deletePatientData()
    }



    override fun onItemClickPatient(position: Int) {
        val bundle = Bundle().apply {
            putSerializable("datapatient", patientlist[position])
        }
        val intent = Intent(requireActivity(),PatientDetailsActivity::class.java)
        intent.putExtras(bundle)
        requireActivity().startActivity(intent)

    }
    class DemoCollectionAdapter(fragment: Fragment, private val list: List<String>) : FragmentStateAdapter(fragment) {

        override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment {
            // Return a NEW fragment instance in createFragment(int)
            val fragment = ListFragment()
            fragment.arguments = Bundle().apply {
                // Our object is just an integer :-P
                    putString("ARG_OBJECT", list[position])
            }
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = listOf("User Approval","Patient Approval")
        demoCollectionAdapter = DemoCollectionAdapter(this,list)
        adminviewPager = view.findViewById(R.id.view_pager_admin)
        adminviewPager.adapter = demoCollectionAdapter
        val tabLayoutadmin:TabLayout = view.findViewById(R.id.admin_tab_layout)
        list.forEach {
            tabLayoutadmin.newTab().text = it
        }
        TabLayoutMediator(tabLayoutadmin, adminviewPager) { tab, i ->
           tab.text =list[i]
        }.attach()
    }


}