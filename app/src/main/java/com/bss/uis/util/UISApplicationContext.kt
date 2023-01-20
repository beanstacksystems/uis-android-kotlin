package com.bss.uis.util

import android.app.Application
import android.content.Context
import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
import com.bss.uis.domain.model.responsedomain.UserRightResponseDomain

class UISApplicationContext :Application() {
    private val TAG = UISApplicationContext::class.java.simpleName
    var instance: UISApplicationContext? = null
    var context: Context? = null
    private val authResponse: AuthResponseDomain? = null
    private val user: UserApiResponseDomain? = null
    private val userCurrentRole = 0
    private val userRightDataList: List<UserRightResponseDomain>? = null
    private val appConfigMap: Map<String, String>? = null
    @JvmName("getInstance1")
    fun getInstance(): UISApplicationContext? {
        if (null == instance) {
            instance = UISApplicationContext()
        }
        return instance
    }

    override fun onCreate() {
        super.onCreate()
    }
}