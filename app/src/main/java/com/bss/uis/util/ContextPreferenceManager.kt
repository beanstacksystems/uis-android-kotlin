package com.bss.uis.util

import android.content.Context
import android.content.SharedPreferences
import com.facebook.AccessToken
import com.facebook.login.LoginManager
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class ContextPreferenceManager {

    fun getToken(key: String?, context: Context): String? {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("logindetails", Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, "")
    }

    fun saveLoginDetails(
        accesstoken: String?,
        refreshtoken: String?,
        logintype: String?,
        expiry: String?,
        context: Context
    ) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("logindetails", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("token", accesstoken)
        editor.putString("refreshtoken", refreshtoken)
        editor.putString("tokenexpiry", expiry)
        editor.putString("logintype", logintype)
        editor.commit()
    }

    fun getLoginToken(context: Context) : String{
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("logindetails", Context.MODE_PRIVATE)
        val token = sharedPreferences.getString("token", "")
        return token.toString()
    }

    fun clearLoginInfo(context: Context) {
        val sharedPreferences: SharedPreferences = context
            .getSharedPreferences("logindetails", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val logintype = sharedPreferences.getString("logintype", "")
        clearSocialLogin(logintype,context)
        editor.clear()
        editor.commit()
    }

    fun isUserLogedOut(context:Context): Boolean {
        val sharedPreferences: SharedPreferences = context
            .getSharedPreferences("logindetails", Context.MODE_PRIVATE)
        val isTokenEmpty = sharedPreferences.getString("token", "")!!.isEmpty()
        val logintype = sharedPreferences.getString("logintype", "")
        if (logintype == "facebook") return AccessToken.getCurrentAccessToken() == null
        return if (logintype == "google") null == GoogleSignIn.getLastSignedInAccount(
            context
        ) else isTokenEmpty
    }

    fun clearSocialLogin(logintype: String?,context: Context) {
        if (logintype == "facebook") LoginManager.getInstance().logOut()
        if (logintype == "google") GoogleSignIn.getClient(
            context, GoogleSignInOptions.DEFAULT_SIGN_IN
        ).signOut()
    }
}