package com.bss.uis.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import com.bss.uis.R
import com.bss.uis.biometric.BiometricPromptUtils
import com.bss.uis.biometric.CIPHERTEXT_WRAPPER
import com.bss.uis.biometric.CryptographyManager
import com.bss.uis.biometric.SHARED_PREFS_FILENAME
import com.bss.uis.util.AppConstant.Companion.token
import com.bss.uis.util.ContextPreferenceManager

class EnableBiometricLoginActivity : AppCompatActivity() {
    private val TAG = "EnableBiometricLogin"
    private lateinit var cryptographyManager: CryptographyManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enable_biometric_login)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        showBiometricPromptForEncryption()

    }

    private fun showBiometricPromptForEncryption() {
        val canAuthenticate = BiometricManager.from(applicationContext).canAuthenticate()
        if (canAuthenticate == BiometricManager.BIOMETRIC_SUCCESS) {
            val secretKeyName = "biometric_sample_encryption_key"
            cryptographyManager = CryptographyManager()
            val cipher = cryptographyManager.getInitializedCipherForEncryption(secretKeyName)
            val biometricPrompt =
                BiometricPromptUtils.createBiometricPrompt(this, ::encryptAndStoreServerToken)
            val promptInfo = BiometricPromptUtils.createPromptInfo(this)
            biometricPrompt.authenticate(promptInfo, BiometricPrompt.CryptoObject(cipher))
        }
    }

    private fun encryptAndStoreServerToken(authResult: BiometricPrompt.AuthenticationResult) {
        authResult.cryptoObject?.cipher?.apply {

            Log.d(TAG, "The token from server is ${ContextPreferenceManager().getToken("token",this@EnableBiometricLoginActivity)}")
            val encryptedServerTokenWrapper = cryptographyManager.encryptData(ContextPreferenceManager().getToken("token",this@EnableBiometricLoginActivity).toString(), this)
            cryptographyManager.persistCiphertextWrapperToSharedPrefs(
                encryptedServerTokenWrapper,
                applicationContext,
                SHARED_PREFS_FILENAME,
                Context.MODE_PRIVATE,
                CIPHERTEXT_WRAPPER
            )

        }
        startActivity(Intent(this@EnableBiometricLoginActivity, DrawerMainActivity::class.java))
    }
}

//  private lateinit var biometricPrompt: BiometricPrompt
//    private val cryptographyManager = CryptographyManager()
//    private val ciphertextWrapper
//        get() = cryptographyManager.getCiphertextWrapperFromSharedPrefs(
//            applicationContext,
//            SHARED_PREFS_FILENAME,
//            Context.MODE_PRIVATE,
//            CIPHERTEXT_WRAPPER
//        )

//private fun startBiometric() {
//    val canAuthenticate = BiometricManager.from(applicationContext).canAuthenticate()
//    if (canAuthenticate == BiometricManager.BIOMETRIC_SUCCESS) {
//
//        if (ciphertextWrapper != null) {
//            showBiometricPromptForDecryption()
//        } else {
//            startActivity(Intent(this, EnableBiometricLoginActivity::class.java))
//        }
//
//    }
//
//
//}




//    override fun onResume() {
//        super.onResume()
//
//        if (ciphertextWrapper != null) {
//            if (token != "") {
//                showBiometricPromptForDecryption()
//            } else {
//
////                updateApp(getString(R.string.already_signedin))
//            }
//        }
//    }

//private fun showBiometricPromptForDecryption() {
//    ciphertextWrapper?.let { textWrapper ->
//        val secretKeyName = "biometric_sample_encryption_key"
//        val cipher = cryptographyManager.getInitializedCipherForDecryption(
//            secretKeyName, textWrapper.initializationVector
//        )
//        biometricPrompt =
//            BiometricPromptUtils.createBiometricPrompt(
//                this,
//                ::decryptServerTokenFromStorage
//            )
//        val promptInfo = BiometricPromptUtils.createPromptInfo(this)
//        biometricPrompt.authenticate(promptInfo, BiometricPrompt.CryptoObject(cipher))
//    }
//}
//
//private fun decryptServerTokenFromStorage(authResult: BiometricPrompt.AuthenticationResult) {
//    ciphertextWrapper?.let { textWrapper ->
//        authResult.cryptoObject?.cipher?.let {
//            val plaintext =
//                cryptographyManager.decryptData(textWrapper.ciphertext, it)
//            token = plaintext
//            // Now that you have the token, you can query server for everything else
//            // the only reason we call this fakeToken is because we didn't really get it from
//            // the server. In your case, you will have gotten it from the server the first time
//            // and therefore, it's a real token.
//
//            startActivity(Intent(this, DrawerMainActivity::class.java))
//        }
//    }
//}

//I/okhttp.OkHttpClient: {"salutation":"","username":"Aditya Narayan","useremail":"ad@gmail.com","userid":5,"userrole":[{"userroleid":2,"userroletype":"admin","isdefaultrole":"Y"}],"logintype":"uis","gender":"default","dob":null,"occupation":1,"imageurl":"","personid":5}

