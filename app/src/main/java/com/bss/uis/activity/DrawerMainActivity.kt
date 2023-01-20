package com.bss.uis.activity

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
import com.bss.patientregistration.patientregistration.RegistrationActivity
import com.bss.uis.R
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import com.bss.uis.roomdb.entity.UserRightData
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*

@AndroidEntryPoint
class DrawerMainActivity : AppCompatActivity() {

    lateinit var fab: FloatingActionButton
    var toolbar: Toolbar? = null
    private var userRightDataList: List<UserRightData> = ArrayList()
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var navigationView: NavigationView
    lateinit var naveHeaderdate: TextView
    lateinit var navHeaderPersonName: TextView
    lateinit var navHeaderPersonEmail: TextView
    lateinit var navHeaderProfileImage: ImageView
    private lateinit var viewModelUIS: ViewModelUIS
    private val mainScope = CoroutineScope(Dispatchers.Main)

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer_main)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        viewModelUIS = ViewModelProvider(this)[ViewModelUIS::class.java]
        initView()
        dataObserver()
        GlobalScope.launch {
            getMasterData()
        }




    }
    private suspend fun getMasterData(){
        val masterDao = UISDatabase.getInstance(this@DrawerMainActivity).masterDAO
        val masterDAORepository = MasterDaoRepository(masterDao)
        val masterdataList = masterDAORepository.findmasterDataByType("salutation")
        masterdataList.forEach {
            Log.d("salutation", it.masterdataval.toString())
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
        navigationView = findViewById(R.id.nav_view)
        val navHeaderView = navigationView.getHeaderView(0)
        val navMenu = navigationView.menu
        val switchRole = navMenu.findItem(R.id.switchrolemenu)
        val logout = navMenu.findItem(R.id.logout)
//        naveHeaderdate = navHeaderView.findViewById<View>(R.id.naveHeaderdate) as TextView
        navHeaderPersonName = navHeaderView.findViewById<View>(R.id.navHeaderPersonName) as TextView
        navHeaderPersonEmail =
            navHeaderView.findViewById<View>(R.id.navHeaderPersonEmail) as TextView
        navHeaderProfileImage =
            navHeaderView.findViewById<View>(R.id.navHeaderProfileImage) as ImageView
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
            startActivity(Intent(this@DrawerMainActivity, RegistrationActivity::class.java))
        }


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
    private fun dataObserver(){
        viewModelUIS.logoutResponse.observe(this){
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