package com.bss.uis.presentation.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import com.bss.uis.R
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain
import com.bss.uis.domain.model.responsedomain.TabDataResponseDomain
import com.bss.uis.domain.model.responsedomain.UserRightResponseDomain
import com.bss.uis.presentation.adapter.UserAdapter
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.MasterDao
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import com.bss.uis.roomdb.dao.repository.UserDaoRepository
import com.bss.uis.roomdb.entity.HomeTabData
import com.bss.uis.roomdb.entity.MasterData
import com.bss.uis.roomdb.entity.UserRightData
import com.bss.uis.util.AppConstant
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import com.google.android.material.card.MaterialCardView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*

@AndroidEntryPoint
class DrawerMainActivity : AppCompatActivity() {

    lateinit var fab: FloatingActionButton
    var toolbar: Toolbar? = null
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var navigationView: NavigationView

    lateinit var navHeaderPersonName: TextView
    lateinit var navHeaderPersonEmail: TextView
    lateinit var navHeaderProfileImage: ImageView


    private lateinit var viewModelUIS: ViewModelUIS
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)
    lateinit var recyclerviewView: RecyclerView

    private lateinit var uisDatabase: UISDatabase
    private lateinit var masterDao: MasterDao
    private var userlist: ArrayList<String> = ArrayList()
    lateinit var navController: NavController

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer_main)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        viewModelUIS = ViewModelProvider(this)[ViewModelUIS::class.java]
        uisDatabase = UISDatabase.getInstance(this)
        masterDao = uisDatabase.masterDAO
        initView()
        ioScOPe.launch {
            fabbtn()
        }

        dataObserver()
    }


    private fun fabbtn() {
        val userdao = UISDatabase.getInstance(this).userDAO
        val userDaoRepository = UserDaoRepository(userdao)
        userDaoRepository.userRightList.forEach { data ->
            if (data.userRoleId == ContextPreferenceManager().getToken("rollid",this@DrawerMainActivity)?.toInt() && data.userRightType.equals(AppConstant.registerPatient)) {
                runOnUiThread {
                    fab.visibility = View.VISIBLE
                }
                Log.d("dataDrawear", data.userRightType.toString())
                return@forEach
            }


        }
    }


    private fun initView() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(
                this@DrawerMainActivity,
                drawerLayout,
                R.string.nav_open,
                R.string.nav_close
            )
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        fab = findViewById(R.id.fab)
//        userCard = findViewById(R.id.user_card)
//        admincard = findViewById(R.id.adminWrkcard)
//        tvAdmin = findViewById(R.id.adminWrkspace)

        navigationView = findViewById(R.id.nav_view)
        val navHeaderView = navigationView.getHeaderView(0)
        val navMenu = navigationView.menu
//        val switchRole = navMenu.findItem(R.id.switchrolemenu)
        val logout = navMenu.findItem(R.id.logout)
//        naveHeaderdate = navHeaderView.findViewById<View>(R.id.naveHeaderdate) as TextView
        navHeaderPersonName = navHeaderView.findViewById<View>(R.id.navHeaderPersonName) as TextView
        navHeaderPersonEmail =
            navHeaderView.findViewById<View>(R.id.navHeaderPersonEmail) as TextView
        navHeaderProfileImage =
            navHeaderView.findViewById<View>(R.id.navHeaderProfileImage) as ImageView
        navHeaderPersonName.text = ContextPreferenceManager().getToken("username",this@DrawerMainActivity)
        navHeaderPersonEmail.text = ContextPreferenceManager().getToken("email",this@DrawerMainActivity)

//        switchRole.setOnMenuItemClickListener {
//
//        }
        logout.setOnMenuItemClickListener {
            MaterialAlertDialogBuilder(this@DrawerMainActivity)
                .setTitle("Log out")
                .setMessage(resources.getString(R.string.logout))
                .setNegativeButton("YES") { _, _ ->
                    mainScope.launch {
                        logout()
                    }
                }
                .setPositiveButton("NO") { _, _ ->

                }
                .show()
            return@setOnMenuItemClickListener true
        }
        fab.setOnClickListener {
            startActivity(Intent(this@DrawerMainActivity, AddPatientActivity::class.java))
        }
//
//        ioScOPe.launch {
//            saveToMasterEntity()
//            saveUserRights()
//        }
//        val masterDAORepository = MasterDaoRepository(masterDao)
//        mainScope.launch {
//            masterDAORepository.findAll()
//            masterDAORepository.masterDataList.observe(this@DrawerMainActivity) {
//                it.forEach { data ->
//                    if (data.masterdataType.equals("occupationtype")) {
//                        userlist.add(data.masterdatadesc.toString())
//                    }
//
//                }
//            }
//        }
//       ioScOPe.launch {
//           fabbtn()
//       }




    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private suspend fun logout() {
        viewModelUIS.logOut(ContextPreferenceManager().getToken("token", this@DrawerMainActivity))
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun dataObserver() {
        viewModelUIS.logoutResponse.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    AppUtil().loadingDialog(this@DrawerMainActivity)
                    viewModelUIS.logoutResponse.value = null
                }
                is Resource.Success -> {
                    Log.d("logout", it.data.toString())
                    AppUtil().dialogDismiss(this@DrawerMainActivity)
                    ContextPreferenceManager().clearLoginInfo(this@DrawerMainActivity)
                    this.finishAffinity()
                    viewModelUIS.logoutResponse.value = null

                }
                is Resource.Error -> {
                    Toast.makeText(this@DrawerMainActivity, it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.logoutResponse.value = null
                }
            }
        }
    }




}