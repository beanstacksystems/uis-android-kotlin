package com.bss.uis.presentation.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.bss.uis.R
import com.bss.uis.constant.AppConstant
import com.bss.uis.internet.ConnectivityObserver
import com.bss.uis.internet.NetworkConnectivityObserver
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.util.Resource
import com.thecode.aestheticdialogs.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Suppress("DEPRECATION")
@OptIn(ExperimentalCoroutinesApi::class)
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    lateinit var logoviewPurple: ImageView
    lateinit var logoviewBlue: ImageView
    lateinit var logoviewRed: ImageView
    lateinit var logoviewYellow: ImageView
    lateinit var logoviewOrange: ImageView
    lateinit var logoviewGreen: ImageView
    lateinit var logoText1: TextView
    lateinit var logoText2: TextView
    lateinit var logoText3: TextView
    lateinit var logoText4: TextView
    lateinit var logoFromRightbottom: Animation
    lateinit var logoFromLeftbottom: Animation
    lateinit var logoFromRightTop: Animation
    lateinit var logoFromleftTop: Animation
    lateinit var logoFromTop: Animation
    lateinit var logoFrombottom: Animation
    private lateinit var connectivityObserver: ConnectivityObserver
    var connectionSate: TextView? = null
    private var loadingDialog: Dialog? = null
    private var loadingText: TextView? = null
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private lateinit var viewModelUIS: ViewModelUIS
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        viewModelUIS = ViewModelProvider(this)[ViewModelUIS::class.java]
        initView()
        connectionObserverListener()
        setAnimation()
        Handler().postDelayed({ endAnimation() }, AppConstant.SPLASH_SCREEN_TIME_OUT.toLong())
        mainScope.launch {
            dataObserver()
        }

    }

    private fun initView() {
        logoText1 = findViewById(R.id.SplashLogoTitle1)
        logoText2 = findViewById(R.id.SplashLogoTitle2)
        logoText3 = findViewById(R.id.SplashLogoTitle3)
        logoText4 = findViewById(R.id.caption)

        logoviewPurple = findViewById(R.id.imageViewpurple)
        logoviewRed = findViewById(R.id.imageViewred)
        logoviewBlue = findViewById(R.id.imageViewblue)
        logoviewYellow = findViewById(R.id.imageViewYellow)
        logoviewOrange = findViewById(R.id.imageVieworrange)
        logoviewGreen = findViewById(R.id.imageViewGreen)
        connectionSate = findViewById(R.id.connection_text)
        loadingDialog = Dialog(this)
        loadingDialog = Dialog(
            this
        )
        loadingDialog?.setContentView(R.layout.dialog_loading)
        loadingText = loadingDialog?.findViewById(R.id.loading_text)
    }

    private fun setAnimation() {
        logoFromTop = AnimationUtils.loadAnimation(this, R.anim.fromtop)
        logoFrombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom)
        logoFromRightTop = AnimationUtils.loadAnimation(this, R.anim.fromtoprightcorner)
        logoFromleftTop = AnimationUtils.loadAnimation(this, R.anim.fromtopleftcorner)
        logoFromRightbottom = AnimationUtils.loadAnimation(this, R.anim.fromrightbottomcorner)
        logoFromLeftbottom = AnimationUtils.loadAnimation(this, R.anim.fromleftbottomcorner)
        logoviewRed.animation = logoFromleftTop
        logoviewPurple.animation = logoFromLeftbottom
        logoviewOrange.animation = logoFrombottom
        logoviewBlue.animation = logoFromTop
        logoviewGreen.animation = logoFromRightTop
        logoviewYellow.animation = logoFromRightbottom
        logoText1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.text_animation))
        logoText2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.text_animation))
        logoText3.startAnimation(AnimationUtils.loadAnimation(this, R.anim.text_animation))
        logoText4.startAnimation(AnimationUtils.loadAnimation(this, R.anim.text_animation))

    }

    private fun endAnimation() {
        val textAnimationright = AnimationUtils.loadAnimation(this, R.anim.text_animation_right)
        val textAnimationback = AnimationUtils.loadAnimation(this, R.anim.text_animation_back)
        textAnimationback.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationEnd(arg0: Animation) {
                mainScope.launch {
                    dataObserver()
                    serverConnection()
                }
            }

            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationStart(arg0: Animation) {}
        })
        logoText1.startAnimation(textAnimationback)
        logoText2.startAnimation(textAnimationright)
        logoText3.startAnimation(textAnimationback)
        logoText4.startAnimation(textAnimationright)
        logoviewGreen.startAnimation(textAnimationback)
        logoviewYellow.startAnimation(textAnimationback)
        logoviewBlue.startAnimation(textAnimationright)
        logoviewOrange.startAnimation(textAnimationback)
        logoviewPurple.startAnimation(textAnimationright)
        logoviewRed.startAnimation(textAnimationright)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private fun connectionObserverListener() {
        connectivityObserver = NetworkConnectivityObserver(applicationContext)
        connectivityObserver.observe().onEach {
            connectionSate?.text = it.name
            when (it) {
                ConnectivityObserver.Status.Available -> {
                    connectionSate?.setBackgroundColor(resources.getColor(R.color.green))
                    connectionSate?.setTextColor(resources.getColor(R.color.white))
                    delay(2000L)
                    connectionSate?.visibility = View.GONE
                }
                ConnectivityObserver.Status.Unavailable -> {
                    connectionSate?.setBackgroundColor(resources.getColor(R.color.uisRed))
                    connectionSate?.setTextColor(resources.getColor(R.color.white))
                    connectionSate?.visibility = View.VISIBLE
                }
                ConnectivityObserver.Status.Losing -> {
                    connectionSate?.setBackgroundColor(resources.getColor(R.color.white))
                    connectionSate?.setTextColor(resources.getColor(R.color.white))
                    connectionSate?.visibility = View.VISIBLE

                }
                ConnectivityObserver.Status.Lost -> {
                    connectionSate?.setBackgroundColor(resources.getColor(R.color.uisRed))
                    connectionSate?.setTextColor(resources.getColor(R.color.white))
                    val animationZoomIn = AnimationUtils.loadAnimation(
                        this,
                        R.anim.animation_internet
                    )
                    connectionSate?.startAnimation(animationZoomIn)
                    connectionSate?.visibility = View.VISIBLE
                }
            }
        }.launchIn(lifecycleScope)
    }

    private fun dataObserver() {
        viewModelUIS.isServerReachableString.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.isServerReachableString.value = null
                }
                is Resource.Success -> {
                    Log.d("isServerReachable", it.data.toString())
                    val intent = Intent(this@SplashActivity, LogInSignUpActivity::class.java)
                    startActivity(intent)
                    viewModelUIS.isServerReachableString.value = null
                }
                is Resource.Error -> {
                    AestheticDialog.Builder(this, DialogStyle.FLAT, DialogType.ERROR)
                        .setTitle("Server Connection")
                        .setMessage("You are not connected to Server")
                        .setCancelable(false)
                        .setDarkMode(true)
                        .setGravity(Gravity.CENTER)
                        .setAnimation(DialogAnimation.SHRINK)
                        .setOnClickListener(object : OnDialogClickListener {
                            override fun onClick(dialog: AestheticDialog.Builder) {
                                dialog.dismiss()
                                //actions...
                            }
                        })
                        .show()

                    viewModelUIS.isServerReachableString.value = null
                }
            }
        }
    }

    private suspend fun serverConnection() {
        viewModelUIS.isServerReachable()
    }

    private fun loading(b: Boolean, message: String) {
        if (b) {
            showLoading(message)
        } else {
            hideLoading()
        }
    }

    private fun showLoading(msg: String) {
        loadingDialog?.show()
        loadingText?.text = msg
    }

    private fun hideLoading() {
        loadingDialog?.dismiss()
    }
}