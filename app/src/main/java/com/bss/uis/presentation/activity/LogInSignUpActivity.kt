package com.bss.uis.presentation.activity


import android.Manifest
import android.animation.ValueAnimator
import android.app.Dialog
import android.content.ContentValues.TAG
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.bss.uis.R
import com.bss.uis.SharedPrefForRoomDb
import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain
import com.bss.uis.domain.model.responsedomain.TabDataResponseDomain
import com.bss.uis.domain.model.responsedomain.UserRightResponseDomain
import com.bss.uis.listner.TextInputLayoutFocusChangeListener
import com.bss.uis.presentation.viewmodel.ViewModelUIS
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.MasterDao
import com.bss.uis.roomdb.dao.repository.ApplicationRepository
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import com.bss.uis.roomdb.dao.repository.PatientDaoRepository
import com.bss.uis.roomdb.dao.repository.UserDaoRepository
import com.bss.uis.roomdb.entity.AppConfig
import com.bss.uis.roomdb.entity.HomeTabData
import com.bss.uis.roomdb.entity.MasterData
import com.bss.uis.roomdb.entity.UserRightData
import com.bss.uis.util.AppConstant.Companion.token
import com.bss.uis.util.AppUtil
import com.bss.uis.util.ContextPreferenceManager
import com.bss.uis.util.Resource
import com.bss.uis.validator.CustomTextValidator
import com.facebook.*
import com.facebook.login.LoginResult
import com.facebook.login.widget.LoginButton
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*


@OptIn(ExperimentalCoroutinesApi::class)
@AndroidEntryPoint

class LogInSignUpActivity : AppCompatActivity() {
    lateinit var dialog: Dialog
    lateinit var nameTxt: TextInputEditText
    lateinit var emailTxt: TextInputEditText
    lateinit var pwdTxt: TextInputEditText
    lateinit var cnfpwdTxt: TextInputEditText
    lateinit var logInSignUpBtn: Button
    lateinit var newAccount: TextView
    lateinit var resetPwd: TextView
    lateinit var nameLayout: TextInputLayout
    lateinit var pwdLayout: TextInputLayout
    lateinit var cnfPwdLayout: TextInputLayout
    lateinit var emailLayout: TextInputLayout
    lateinit var authResponseDomain: AuthResponseDomain
    lateinit var loginlayout: LinearLayout
    lateinit var fbImage: ImageView
    lateinit var gImage: ImageView
    lateinit var googleSignInClient: GoogleSignInClient
    lateinit var fbLoginButton: LoginButton

    //    lateinit var callbackManager: CallbackManager
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val ioScOPe = CoroutineScope(Dispatchers.IO)


    private lateinit var viewModelUIS: ViewModelUIS
    private lateinit var uisDatabase: UISDatabase
    private lateinit var masterDao: MasterDao

    //    val masterDao = uisDatabase.masterDAO
    val salutationList: MutableList<String> = mutableListOf()
    val identitylist: MutableList<String> = mutableListOf()
    val genederlist: MutableList<String> = mutableListOf()
    val occupationList: MutableList<String> = mutableListOf()
    val cancerlist: MutableList<String> = mutableListOf()
    val bllodgrouplist: MutableList<String> = mutableListOf()


    val fbPermission: MutableList<String> = arrayListOf("email", "public_profile")

    val RC_SIGN_IN = 9001
    val REQUEST_ID_MULTIPLE_PERMISSIONS = 101


    private lateinit var auth: FirebaseAuth
    private var callbackManager: CallbackManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FacebookSdk.sdkInitialize(applicationContext)
        setContentView(R.layout.activity_log_in_sign_up)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        uisDatabase = UISDatabase.getInstance(this)
        masterDao = uisDatabase.masterDAO

        auth = FirebaseAuth.getInstance()
        callbackManager = CallbackManager.Factory.create()
        viewModelUIS = ViewModelProvider(this)[ViewModelUIS::class.java]
        initView()
        checkPermissions()
        isValidate()
        dataObserver()
        ioScOPe.launch {
            updateLocalDB()
            deletePatientDAta()
        }
        if (!ContextPreferenceManager().isUserLogedOut(this@LogInSignUpActivity)) {
            mainScope.launch {
                pullUserData(
                    ContextPreferenceManager().getToken("token", this@LogInSignUpActivity)
                        .toString()
                )
                startActivity(
                    Intent(
                        this@LogInSignUpActivity,
                        EnableBiometricLoginActivity::class.java
                    )
                )
                finish()

            }
        }

        FacebookSdk.setApplicationId(getString(R.string.facebook_app_id))
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_SECURE,
//            WindowManager.LayoutParams.FLAG_SECURE
//        )
//        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

//        LoginManager.getInstance().registerCallback(
//            callbackManager,
//            CustomFacebookCallBack()
//        )
        initGoogleSignin()

    }

    private fun initView() {

        nameLayout = findViewById(R.id.name_signup)
        pwdLayout = findViewById(R.id.pwdlayout)
        cnfPwdLayout = findViewById(R.id.cnfpwdlayout)
        emailLayout = findViewById(R.id.etemail)
        nameTxt = findViewById(R.id.nameTxt)
        cnfpwdTxt = findViewById(R.id.cnfpwdTxt)
        emailTxt = findViewById(R.id.etemailTxt)
        pwdTxt = findViewById(R.id.pwdTxt)
        resetPwd = findViewById(R.id.forgotpwd)
        logInSignUpBtn = findViewById(R.id.login_signup_btn)
        newAccount = findViewById(R.id.createnewac)
        fbLoginButton = findViewById(R.id.fb_login_button)
        fbLoginButton.setPermissions("email", "public_profile")
        fbLoginButton = findViewById(R.id.fb_login_button)
        fbImage = findViewById(R.id.fbCustomButton)
        loginlayout = findViewById(R.id.login_layout)
//        loginlayout.addView(fbImage)
        fbImage.setOnClickListener {
            fbLoginButton.performClick()
        }
        gImage = findViewById(R.id.googleCustom)
        gImage.setOnClickListener {
            val signInIntent = googleSignInClient.signInIntent
            startActivityForResult(
                signInIntent,
                RC_SIGN_IN
            )
        }

        resetPwd.setOnClickListener {
            nameLayout.visibility = View.INVISIBLE
            cnfPwdLayout.visibility = View.VISIBLE
            emailLayout.hint = "Email/UserName"
            logInSignUpBtn.setText(R.string.resetpwd)
            newAccount.setText(R.string.login)
        }
        newAccount.setOnClickListener {
            if (newAccount.text.toString() == resources.getString(R.string.login)) {
                nameLayout.visibility = View.INVISIBLE
                cnfPwdLayout.visibility = View.INVISIBLE
                emailLayout.hint = "Email/UserName"
                logInSignUpBtn.setText(R.string.login)
                newAccount.setText(R.string.signup)
            } else {
                nameLayout.visibility = View.VISIBLE
                cnfPwdLayout.visibility = View.VISIBLE
                emailLayout.hint = "Email"
                logInSignUpBtn.setText(R.string.signup)
                newAccount.setText(R.string.login)
            }
        }
        val animator: ValueAnimator = ValueAnimator.ofFloat(0f, 1f)

        logInSignUpBtn.setOnClickListener {
            if (isValidData()) {
                AppUtil().loadingDialog(this@LogInSignUpActivity)
                if (!isValidData()) return@setOnClickListener
                if (logInSignUpBtn.text
                        .toString() == resources.getString(R.string.signup)
                ) {
                    mainScope.launch {
                        registerUser(
                            nameTxt.text.toString(),
                            emailTxt.text.toString(),
                            pwdTxt.text.toString()
                        )
                    }
                } else if (logInSignUpBtn.text
                        .toString() == resources.getString(R.string.resetpwd)
                ) resetPwd(
                    emailTxt.text.toString(),
                    pwdTxt.text.toString()
                ) else {
                    mainScope.launch {
                        loginUser(emailTxt.text.toString(), pwdTxt.text.toString())
                    }
                }
            }
        }

        fbLoginButton.registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
            override fun onSuccess(loginResult: LoginResult) {
                // Handle successful login
                Log.d("kk", loginResult.accessToken.token)

                handleFacebookAccessToken(loginResult.accessToken)
            }

            override fun onCancel() {
                // Handle cancel
            }

            override fun onError(exception: FacebookException) {
                // Handle error
            }
        })
    }


    private suspend fun loginUser(email: String, password: String) {
        viewModelUIS.login(email, password)

    }

    private fun resetPwd(toString: String, toString1: String) {

    }

    private suspend fun registerUser(userName: String, email: String, passoword: String) {
        viewModelUIS.registerApiCall(
            userName, email, passoword, Build.ID,
            Build.MANUFACTURER + "-" + Build.MODEL, "UIS", "User"
        )
    }

    private suspend fun updateLocalDB() {
        val applicationDao = uisDatabase.applicationDao
        val appConfig = AppConfig()
        appConfig.configKey = "noOfPatients"
        appConfig.configValue = "2"

        val applicationRepository = ApplicationRepository(applicationDao)
        applicationRepository.insert(appConfig)

    }

    private fun initAppConfig(appConfigList: LiveData<List<AppConfig>>) {

    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun dataObserver() {
        viewModelUIS.authResponseDomain.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.authResponseDomain.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.authResponseDomain.value = it
                    handleSuccessfulLogin(it.data!!, "UIS", true)
                    Log.d("register_user", it.data.toString())
                    viewModelUIS.authResponseDomain.value = null

                }
                is Resource.Error -> {
                    AppUtil().dialogDismiss(this@LogInSignUpActivity)
                    Toast.makeText(this@LogInSignUpActivity, it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.authResponseDomain.value = null
                }
            }
        }
        viewModelUIS.masterDataResponseList.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.masterDataResponseList.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.masterDataResponseList.value = it
                    ioScOPe.launch { it.data?.let { it1 -> saveToMasterEntity(it1) } }
                    it.data?.forEach { domainData ->
                        Log.d("master data", domainData.masterdataType.toString())
                    }
                    viewModelUIS.masterDataResponseList.value = null

                }
                is Resource.Error -> {
                    Toast.makeText(this@LogInSignUpActivity, it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.masterDataResponseList.value = null
                }
            }
        }
        viewModelUIS.tabDataResponseList.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.tabDataResponseList.value = null
                }
                is Resource.Success -> {

                    viewModelUIS.tabDataResponseList.value = it
                    ioScOPe.launch {
                        it.data?.let { it1 -> saveTabData(it1) }
                    }

//                    it.data?.forEach { domainData ->
//                        Log.d("master data", domainData.tabdesc.toString())
//                    }
                    viewModelUIS.tabDataResponseList.value = null

                }
                is Resource.Error -> {
                    Toast.makeText(this@LogInSignUpActivity, it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.tabDataResponseList.value = null
                }
            }
        }
        viewModelUIS.userApiResponse.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.userApiResponse.value = null
                }
                is Resource.Success -> {
                    viewModelUIS.userApiResponse.value = it
                    ContextPreferenceManager().saveUsername(
                        it.data?.username,
                        it.data?.useremail,
                        this@LogInSignUpActivity
                    )
                    val roleidlist: MutableList<Int> = mutableListOf()
                    it.data?.userrole?.forEach { rollId ->
                        roleidlist.add(rollId.userroleid!!)
                        if (rollId.isdefaultrole.equals("Y")) {
                            AppUtil.userCurrentRole = rollId.userroleid!!
                            Log.d("userCurrentRole", AppUtil.userCurrentRole.toString())
                        }

                    }
                    mainScope.launch {
                        pullUserRightData(
                            ContextPreferenceManager().getToken("token", this@LogInSignUpActivity)
                                .toString(), roleidlist
                        )
                    }

                    Log.d("userApiResponse", it.data.toString())
                    viewModelUIS.userApiResponse.value = null
                }
                is Resource.Error -> {
                    Toast.makeText(this@LogInSignUpActivity, it.message, Toast.LENGTH_LONG).show()

                    viewModelUIS.userApiResponse.value = null
                }
            }
        }

        viewModelUIS.userrightList.observe(this) {
            when (it) {
                is Resource.Loading -> {
                    viewModelUIS.userrightList.value = null
                }
                is Resource.Success -> {
                    viewModelUIS.userrightList.value = it
                    Log.d("userRightData", it.data.toString())
                    ioScOPe.launch {
                        saveUserRights(it.data!!)
                    }

                    viewModelUIS.userrightList.value = null
                }
                is Resource.Error -> {
                    Toast.makeText(this@LogInSignUpActivity, it.message, Toast.LENGTH_LONG).show()
                    viewModelUIS.userrightList.value = null
                }
            }
        }
    }

    private fun handleSuccessfulLogin(
        authResponse: AuthResponseDomain,
        source: String,
        isRegister: Boolean
    ) {
        ContextPreferenceManager().saveLoginDetails(
            "Bearer " + authResponse.token,
            authResponse.refreshtoken,
            source,
            authResponse.expiresIn.toString(),
            this@LogInSignUpActivity
        )

        if (isRegister) {
            token = "Bearer " + authResponse.token.toString()
            mainScope.launch {
                pullMasterData("Bearer " + authResponse.token.toString())
                pullTabData("Bearer " + authResponse.token.toString())
                pullUserData("Bearer " + authResponse.token.toString())
//                startBiometric()
            }
        }

    }

    private suspend fun pullUserRightData(token: String, roleidlist: List<Int>) {
        viewModelUIS.userRightApiCall(token, roleidlist)
    }

    private suspend fun pullUserData(token: String) {
        viewModelUIS.userDataApi(token)
    }

    private suspend fun pullTabData(token: String) {
        viewModelUIS.tabDataApi(token)
    }

    private suspend fun pullMasterData(token: String) {
        viewModelUIS.mastaerDataApiCAll(token)
    }


    private fun isValidData(): Boolean {
        if (nameLayout.visibility == View.VISIBLE && null != nameLayout.error
            || null != emailLayout.error || null != pwdLayout.error || cnfPwdLayout.visibility == View.VISIBLE && null != cnfPwdLayout.error
        ) return false
        val name = nameTxt.text.toString()
        val email = emailTxt.text.toString()
        val pwd = pwdTxt.text.toString()
        if (nameLayout.visibility == View.VISIBLE && (name.isEmpty()) || email.isEmpty() || pwd.isEmpty()
        ) {
            Toast.makeText(
                this@LogInSignUpActivity,
                resources.getString(R.string.fillvalue), Toast.LENGTH_LONG
            ).show()
            return false
        }
        return true
    }

    private fun isValidate() {
        nameTxt.onFocusChangeListener =
            TextInputLayoutFocusChangeListener(nameLayout, "Name cannot be empty")

        nameTxt.addTextChangedListener(object : CustomTextValidator(nameTxt) {
            override fun validate(textView: TextView?, text: String?) {
                if (nameLayout.visibility == View.VISIBLE) {
                    nameLayout.error = null
                    if (null == text || text.isEmpty()) nameLayout.error = "Name cannot be empty"
                }
            }
        })

        emailTxt.addTextChangedListener(object : CustomTextValidator(emailTxt) {
            override fun validate(textView: TextView?, text: String?) {
                val isRegister = nameLayout.visibility == View.VISIBLE
                emailLayout.error = null
            }
        })
        emailTxt.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun afterTextChanged(editable: Editable) {
                if (!AppUtil().emailValidation(editable.toString())!!) {
                    emailLayout.error = "Please input a valid email"
                } else {
                    emailLayout.error = null
                }
            }
        })
        pwdTxt.onFocusChangeListener =
            TextInputLayoutFocusChangeListener(pwdLayout, "Field cannot be empty")
        pwdTxt.addTextChangedListener(object : CustomTextValidator(pwdTxt) {
            override fun validate(textView: TextView?, text: String?) {
                pwdLayout.error = null
                if (null == text || text.isEmpty()) pwdLayout.error =
                    "Field cannot be empty" else if (AppUtil().isCorrectPasswordPolicy(text)!!) pwdLayout.error =
                    "Only alphanumeric characters allowed"
            }
        })
        cnfpwdTxt.onFocusChangeListener =
            TextInputLayoutFocusChangeListener(cnfPwdLayout, "Field cannot be empty")
        cnfpwdTxt.addTextChangedListener(object : CustomTextValidator(cnfpwdTxt) {
            override fun validate(textView: TextView?, text: String?) {
                cnfPwdLayout.error = null
                if (null == text || text.isEmpty()) cnfPwdLayout.error =
                    "Field cannot be empty" else if (pwdTxt.text.toString() != text) cnfPwdLayout.error =
                    "Password is not same as ConfirmPassword"
            }
        })
    }

    private fun initGoogleSignin() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.googleClientId))
            .requestServerAuthCode(getString(R.string.googleClientId))
            .requestEmail() //                .requestScopes(new Scope("https://www.googleapis.com/auth/user.birthday.read"))
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)
    }

    private suspend fun saveUserRights(
        userRightDTOList: List<UserRightResponseDomain>
    ) {
        val userDao = uisDatabase.userDAO
        val userRightDataList: MutableList<UserRightData> = ArrayList()
        userRightDTOList.forEach {
            val userRightData = UserRightData()
            userRightData.userRightId = it.rightid!!
            userRightData.userRoleId = it.roleid!!
            userRightData.desc = it.rightdesc
            userRightData.userRightType = it.righttype
            userRightDataList.add(userRightData)
        }

        val userDAORepository = UserDaoRepository(userDao)
        userDAORepository.delete()
        userDAORepository.insertUserData(userRightDataList)
        userDAORepository.findAll()
        deletePatientDAta()
        startActivity(Intent(this@LogInSignUpActivity, DrawerMainActivity::class.java))
        finish()

    }

    private suspend fun saveToMasterEntity(masterValueDTOList: List<MasterDataResponseDomain>) {

        val masterDataList: MutableList<MasterData> = ArrayList()
        masterValueDTOList.forEach {
            val masterData = MasterData()
            masterData.masterdatadesc = it.masterdatadesc
            masterData.masterdataId = it.masterdataId!!
            masterData.masterdataType = it.masterdataType
            masterData.masterdataval = it.masterdataval
            masterData.isactive = it.isactive
            masterDataList.add(masterData)
        }

        val masterDAORepository = MasterDaoRepository(masterDao)
        masterDAORepository.delete()
        masterDAORepository.insert(masterDataList)
        masterDAORepository.findAll()

        mainScope.launch {
            masterDAORepository.masterDataList.forEach { data ->
                if (data.masterdataType.equals("salutation")) {
                    salutationList.add(data.masterdatadesc.toString())
                    SharedPrefForRoomDb().storeSalutation(
                        this@LogInSignUpActivity,
                        salutationList
                    )
                } else if (data.masterdataType.equals("occupationtype")) {
                    occupationList.add(data.masterdatadesc.toString())
                    SharedPrefForRoomDb().storeOccupation(
                        this@LogInSignUpActivity,
                        occupationList
                    )

                } else if (data.masterdataType.equals("gender")) {
                    genederlist.add(data.masterdatadesc.toString())
                    SharedPrefForRoomDb().storeGender(
                        this@LogInSignUpActivity,
                        genederlist
                    )
                } else if (data.masterdataType.equals("identity")) {
                    identitylist.add(data.masterdatadesc.toString())
                    SharedPrefForRoomDb().storeIdentity(
                        this@LogInSignUpActivity,
                        identitylist
                    )

                } else if (data.masterdataType.equals("illnesstype")) {
                    cancerlist.add(data.masterdatadesc.toString())
                    SharedPrefForRoomDb().storeCancerType(this@LogInSignUpActivity, cancerlist)
                } else if (data.masterdataType.equals("bloodgroup")) {
                    bllodgrouplist.add(data.masterdatadesc.toString())
                    SharedPrefForRoomDb().storeBloodgroup(
                        this@LogInSignUpActivity,
                        bllodgrouplist
                    )
                }

            }


        }


    }

    private suspend fun saveTabData(tabValueDTOList: List<TabDataResponseDomain>) {

        val homeTabDataList: MutableList<HomeTabData> = ArrayList()
        tabValueDTOList.forEach {
            val homeTabData = HomeTabData()
            homeTabData.tabname = it.tabname
            homeTabData.tabdata = it.tabdata
            homeTabData.tabdesc = it.tabdesc
            homeTabData.tabseq = it.tabseq!!
            homeTabDataList.add(homeTabData)
        }
        val masterDAORepository = MasterDaoRepository(masterDao)
        masterDAORepository.deleteTabData()
        masterDAORepository.insertTabData(homeTabDataList)

    }
    private suspend fun deletePatientDAta(){
        val patientdao = UISDatabase.getInstance(this@LogInSignUpActivity).patientDao
        val patientDaoRepository = PatientDaoRepository(patientdao)
        patientDaoRepository.deletePatientData()
    }

    private fun handleFacebookAccessToken(token: AccessToken) {
        Log.d(TAG, "handleFacebookAccessToken:$token")

        val credential = FacebookAuthProvider.getCredential(token.token)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithCredential:success")
                    val user = auth.currentUser
//                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithCredential:failure", task.exception)
                    Toast.makeText(
                        baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
//                    updateUI(null)
                }
            }
    }

//    inner class CustomFacebookCallBack : FacebookCallback<LoginResult> {
//        override fun onSuccess(loginResult: LoginResult) {
//            val request = GraphRequest.newMeRequest(
//                loginResult.accessToken
//            ) { `object`, _ ->
//                try {
//                    val email = `object`.getString("email")
//                    val userId = `object`.getString("id")
//                    val name = `object`.getString("name")
////                    handleAccessToken(
////                        loginResult.accessToken.token,
////                        null,
////                        email,
////                        userId,
////                        name,
////                        "facebook"
////                    )
//                } catch (e: JSONException) {
//                    Log.w(
//                        "jsonException",
//                        e.message!!
//                    )
//                }
//            }
//            val parameters = Bundle()
//            parameters.putString("fields", "id,name,email,gender,birthday")
//            request.parameters = parameters
//            request.executeAsync()
//        }
//
//        override fun onCancel() {
//            Log.w("cancel", "cancel facebook login")
//        }
//
//        override fun onError(error: FacebookException) {
//            Log.w("error", "error in facebook login")
//        }
//    }

    private suspend fun handleAccessToken(
        url: String,
        token: String,
        serial: String,
        model: String,
        entitytype: String
    ) {
        viewModelUIS.registerWithGoogle(token, serial, model, entitytype)

    }


    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        callbackManager?.onActivityResult(
            requestCode,
            resultCode,
            data
        )
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                Log.d(
                    "Gsign",
                    "Google auth Id:" + account.id
                )
                mainScope.launch {
                    handleAccessToken(
                        "http://192.168.2.5:8000/api/google",
                        account.idToken.toString(), Build.ID,
                        Build.MANUFACTURER + "-" + Build.MODEL, ""
                    )
                }
            } catch (e: ApiException) {
                Log.w(
                    "gsignin",
                    "Google sign in failed",

                    )
            }
        }
    }

    private fun checkPermissions() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
            || ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE),
                REQUEST_ID_MULTIPLE_PERMISSIONS
            )
        } else {
            Toast.makeText(this@LogInSignUpActivity, "allpermission granted", Toast.LENGTH_LONG)
                .show()
        }
    }


//    private fun initView(logintype: String?) {
//        if (null != logintype) {
//            loginlayout = findViewById(R.id.login_layout)
//            loginlayout.removeAllViews()
//            if (logintype == "facebook") {
//                fbLoginButton = findViewById(R.id.fb_login_button)
//                fbImage = findViewById(R.id.fbCustomButton)
//                fbImage.setOnClickListener(View.OnClickListener { fbLoginButton.performClick() })
//                loginlayout.addView(fbImage)
//            }
//            if (logintype == "google") {
//                gImage = findViewById(R.id.googleCustom)
//                gImage.setOnClickListener(View.OnClickListener {
//                    val signInIntent = googleSignInClient!!.signInIntent
//                    startActivityForResult(
//                        signInIntent,
//                        RC_SIGN_IN
//                    )
//                })
//                loginlayout.addView(gImage)
//            }
//            return
//        }
//        nameLayout = findViewById(R.id.name_signup)
//        pwdLayout = findViewById(R.id.pwdlayout)
//        cnfPwdLayout = findViewById(R.id.cnfpwdlayout)
//        emailLayout = findViewById(R.id.etemail)
//        nameTxt = findViewById(R.id.nameTxt)
//        cnfpwdTxt = findViewById(R.id.cnfpwdTxt)
//        emailTxt = findViewById(R.id.etemailTxt)
//        pwdTxt = findViewById(R.id.pwdTxt)
//        button = findViewById(R.id.login_signup_btn)
//        fbLoginButton = findViewById(R.id.fb_login_button)
//        fbLoginButton.setPermissions()
//        newAccount = findViewById(R.id.createnewac)
//        resetPwd = findViewById(R.id.forgotpwd)
//        fbImage = findViewById(R.id.fbCustomButton)
//        gImage = findViewById(R.id.googleCustom)
//        fbImage.setOnClickListener(View.OnClickListener { fbLoginButton.performClick() })
//        gImage.setOnClickListener(View.OnClickListener {
//            val signInIntent = googleSignInClient!!.signInIntent
//            startActivityForResult(
//                signInIntent,
//               RC_SIGN_IN
//            )
//        })
//        newAccount.setOnClickListener(View.OnClickListener {
//            if (newAccount.getText().toString() == resources.getString(R.string.login)) {
//                nameLayout.setVisibility(View.INVISIBLE)
//                cnfPwdLayout.setVisibility(View.INVISIBLE)
//                emailLayout.setHint("Email/UserName")
//                button.setText(R.string.login)
//                newAccount.setText(R.string.signup)
//                return@OnClickListener
//            } else {
//                nameLayout.setVisibility(View.VISIBLE)
//                cnfPwdLayout.setVisibility(View.VISIBLE)
//                emailLayout.setHint("Email")
//                button.setText(R.string.signup)
//                newAccount.setText(R.string.login)
//            }
//        })
//        resetPwd.setOnClickListener(View.OnClickListener {
//            nameLayout.setVisibility(View.INVISIBLE)
//            cnfPwdLayout.setVisibility(View.VISIBLE)
//            emailLayout.setHint("Email/UserName")
//            button.setText(R.string.resetpwd)
//            newAccount.setText(R.string.login)
//        })
//        button.setOnClickListener(View.OnClickListener {
//            if (!isValidData()) return@OnClickListener
//            if (button.getText().toString() == resources.getString(R.string.signup)) registerUser(
//                nameTxt.getText().toString(),
//                emailTxt.getText().toString(),
//                pwdTxt.getText().toString()
//            ) else if (button.getText()
//                    .toString() == resources.getString(R.string.resetpwd)
//            ) resetPwd(emailTxt.getText().toString(), pwdTxt.getText().toString()) else loginUser(
//                emailTxt.getText().toString(),
//                pwdTxt.getText().toString()
//            )
//        })
//        nameTxt.setOnFocusChangeListener(
//            TextInputLayoutFocusChangeListener(
//                nameLayout,
//                "Name cannot be empty"
//            )
//        )
//        nameTxt.addTextChangedListener(object : CustomTextValidator(nameTxt) {
//            fun validate(textView: TextView?, text: String?) {
//                if (nameLayout.getVisibility() == View.VISIBLE) {
//                    nameLayout.setError(null)
//                    if (null == text || text.isEmpty()) nameLayout.setError("Name cannot be empty")
//                }
//            }
//        })
//        //        emailTxt.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
////                (emailLayout,"Field cannot be empty"));
//        emailTxt.addTextChangedListener(object : CustomTextValidator(emailTxt) {
//            fun validate(textView: TextView?, text: String?) {
//                val isRegister = nameLayout.getVisibility() == View.VISIBLE
//                emailLayout.setError(null)
//            }
//        })
//        emailTxt.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
//            override fun afterTextChanged(editable: Editable) {
//                if (emailValidation(editable.toString())) {
//                    emailLayout.setError("Please input a valid email")
//                } else {
//                    emailLayout.setError(null)
//                }
//            }
//        })
//        pwdTxt.setOnFocusChangeListener(
//            TextInputLayoutFocusChangeListener(
//                pwdLayout,
//                "Field cannot be empty"
//            )
//        )
//        pwdTxt.addTextChangedListener(object : CustomTextValidator(pwdTxt) {
//            fun validate(textView: TextView?, text: String?) {
//                pwdLayout.setError(null)
//                if (null == text || text.isEmpty()) pwdLayout.setError("Field cannot be empty") else if (AppUtil.isCorrectPasswordPolicy(
//                        text
//                    )
//                ) pwdLayout.setError("Only alphanumeric characters allowed")
//            }
//        })
//        cnfpwdTxt.setOnFocusChangeListener(
//            TextInputLayoutFocusChangeListener(
//                cnfPwdLayout,
//                "Field cannot be empty"
//            )
//        )
//        cnfpwdTxt.addTextChangedListener(object : CustomTextValidator(cnfpwdTxt) {
//            fun validate(textView: TextView?, text: String?) {
//                cnfPwdLayout.setError(null)
//                if (null == text || text.isEmpty()) cnfPwdLayout.setError("Field cannot be empty") else if (pwdTxt.getText()
//                        .toString() != text
//                ) cnfPwdLayout.setError("Password is not same as ConfirmPassword")
//            }
//        })
//    }

//    private fun initGoogleSignIn() {
//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestIdToken(getString(R.string.googleClientId))
//            .requestServerAuthCode(getString(R.string.googleClientId))
//            .requestEmail()
//            .build()
//        googleSignInClient = GoogleSignIn.getClient(this, gso)
//    }

}