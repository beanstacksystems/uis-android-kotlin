package com.bss.uis.presentation.activity;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010|\u001a\u00020}H\u0002J\b\u0010~\u001a\u00020}H\u0002J\u0012\u0010\u007f\u001a\u00020}H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0080\u0001J@\u0010\u0081\u0001\u001a\u00020}2\u0007\u0010\u0082\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0085\u0001\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0087\u0001J\u0013\u0010\u0088\u0001\u001a\u00020}2\b\u0010\u0083\u0001\u001a\u00030\u0089\u0001H\u0002J%\u0010\u008a\u0001\u001a\u00020}2\u0007\u0010\u008b\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020\u00122\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J!\u0010\u008f\u0001\u001a\u00020}2\u0016\u0010\u0090\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00010\u0091\u0001H\u0002J\t\u0010\u0094\u0001\u001a\u00020}H\u0002J\t\u0010\u0095\u0001\u001a\u00020}H\u0002J\n\u0010\u0096\u0001\u001a\u00030\u008e\u0001H\u0002J\t\u0010\u0097\u0001\u001a\u00020}H\u0002J%\u0010\u0098\u0001\u001a\u00020}2\u0007\u0010\u0099\u0001\u001a\u00020\u00122\u0007\u0010\u009a\u0001\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u009b\u0001J\'\u0010\u009c\u0001\u001a\u00020}2\u0007\u0010\u009d\u0001\u001a\u00020\u00042\u0007\u0010\u009e\u0001\u001a\u00020\u00042\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u00a0\u0001H\u0015J\u0015\u0010\u00a1\u0001\u001a\u00020}2\n\u0010\u00a2\u0001\u001a\u0005\u0018\u00010\u00a3\u0001H\u0014J\u001c\u0010\u00a4\u0001\u001a\u00020}2\u0007\u0010\u0083\u0001\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a5\u0001J\u001c\u0010\u00a6\u0001\u001a\u00020}2\u0007\u0010\u0083\u0001\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a5\u0001J\u001c\u0010\u00a7\u0001\u001a\u00020}2\u0007\u0010\u0083\u0001\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a5\u0001J,\u0010\u00a8\u0001\u001a\u00020}2\u0007\u0010\u0083\u0001\u001a\u00020\u00122\u000e\u0010\u00a9\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0092\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00aa\u0001J.\u0010\u00ab\u0001\u001a\u00020}2\u0007\u0010\u00ac\u0001\u001a\u00020\u00122\u0007\u0010\u0099\u0001\u001a\u00020\u00122\u0007\u0010\u00ad\u0001\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00ae\u0001J\u001a\u0010s\u001a\u00020}2\u0007\u0010\u00af\u0001\u001a\u00020\u00122\u0007\u0010\u00b0\u0001\u001a\u00020\u0012H\u0002J$\u0010\u00b1\u0001\u001a\u00020}2\u000f\u0010\u00b2\u0001\u001a\n\u0012\u0005\u0012\u00030\u00b3\u00010\u0092\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b4\u0001J$\u0010\u00b5\u0001\u001a\u00020}2\u000f\u0010\u00b6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00b7\u00010\u0092\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b4\u0001J$\u0010\u00b8\u0001\u001a\u00020}2\u000f\u0010\u00b9\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ba\u00010\u0092\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b4\u0001J\u0013\u0010\u00bb\u0001\u001a\u00020}H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0080\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u001a\u0010.\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u00101\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0014R\u001a\u0010?\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00104\"\u0004\bA\u00106R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0014R\u001a\u0010D\u001a\u00020EX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0014R\u000e\u0010L\u001a\u00020MX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020OX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020UX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020MX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\\X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010]\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u001c\"\u0004\b_\u0010\u001eR\u001a\u0010`\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\"\"\u0004\bb\u0010$R\u001a\u0010c\u001a\u00020dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0014R\u001a\u0010k\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u001c\"\u0004\bm\u0010\u001eR\u001a\u0010n\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\"\"\u0004\bp\u0010$R\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010\u0014R\u001a\u0010s\u001a\u00020dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010f\"\u0004\bu\u0010hR\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010\u0014R\u000e\u0010x\u001a\u00020yX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020{X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00bc\u0001"}, d2 = {"Lcom/bss/uis/presentation/activity/LogInSignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "RC_SIGN_IN", "", "getRC_SIGN_IN", "()I", "REQUEST_ID_MULTIPLE_PERMISSIONS", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "authResponseDomain", "Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "getAuthResponseDomain", "()Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "setAuthResponseDomain", "(Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;)V", "bllodgrouplist", "", "", "getBllodgrouplist", "()Ljava/util/List;", "callbackManager", "Lcom/facebook/CallbackManager;", "cancerlist", "getCancerlist", "cnfPwdLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getCnfPwdLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setCnfPwdLayout", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "cnfpwdTxt", "Lcom/google/android/material/textfield/TextInputEditText;", "getCnfpwdTxt", "()Lcom/google/android/material/textfield/TextInputEditText;", "setCnfpwdTxt", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "emailLayout", "getEmailLayout", "setEmailLayout", "emailTxt", "getEmailTxt", "setEmailTxt", "fbImage", "Landroid/widget/ImageView;", "getFbImage", "()Landroid/widget/ImageView;", "setFbImage", "(Landroid/widget/ImageView;)V", "fbLoginButton", "Lcom/facebook/login/widget/LoginButton;", "getFbLoginButton", "()Lcom/facebook/login/widget/LoginButton;", "setFbLoginButton", "(Lcom/facebook/login/widget/LoginButton;)V", "fbPermission", "getFbPermission", "gImage", "getGImage", "setGImage", "genederlist", "getGenederlist", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "identitylist", "getIdentitylist", "ioScOPe", "Lkotlinx/coroutines/CoroutineScope;", "logInSignUpBtn", "Landroid/widget/Button;", "getLogInSignUpBtn", "()Landroid/widget/Button;", "setLogInSignUpBtn", "(Landroid/widget/Button;)V", "loginlayout", "Landroid/widget/LinearLayout;", "getLoginlayout", "()Landroid/widget/LinearLayout;", "setLoginlayout", "(Landroid/widget/LinearLayout;)V", "mainScope", "masterDao", "Lcom/bss/uis/roomdb/dao/MasterDao;", "nameLayout", "getNameLayout", "setNameLayout", "nameTxt", "getNameTxt", "setNameTxt", "newAccount", "Landroid/widget/TextView;", "getNewAccount", "()Landroid/widget/TextView;", "setNewAccount", "(Landroid/widget/TextView;)V", "occupationList", "getOccupationList", "pwdLayout", "getPwdLayout", "setPwdLayout", "pwdTxt", "getPwdTxt", "setPwdTxt", "relationlist", "getRelationlist", "resetPwd", "getResetPwd", "setResetPwd", "salutationList", "getSalutationList", "uisDatabase", "Lcom/bss/uis/roomdb/UISDatabase;", "viewModelUIS", "Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "checkPermissions", "", "dataObserver", "deletePatientDAta", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAccessToken", "url", "token", "serial", "model", "entitytype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFacebookAccessToken", "Lcom/facebook/AccessToken;", "handleSuccessfulLogin", "authResponse", "source", "isRegister", "", "initAppConfig", "appConfigList", "Landroidx/lifecycle/LiveData;", "", "Lcom/bss/uis/roomdb/entity/AppConfig;", "initGoogleSignin", "initView", "isValidData", "isValidate", "loginUser", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pullMasterData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullTabData", "pullUserData", "pullUserRightData", "roleidlist", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "userName", "passoword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "toString1", "saveTabData", "tabValueDTOList", "Lcom/bss/uis/domain/model/responsedomain/TabDataResponseDomain;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToMasterEntity", "masterValueDTOList", "Lcom/bss/uis/domain/model/responsedomain/MasterDataResponseDomain;", "saveUserRights", "userRightDTOList", "Lcom/bss/uis/domain/model/responsedomain/UserRightResponseDomain;", "updateLocalDB", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LogInSignUpActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.app.Dialog dialog;
    public com.google.android.material.textfield.TextInputEditText nameTxt;
    public com.google.android.material.textfield.TextInputEditText emailTxt;
    public com.google.android.material.textfield.TextInputEditText pwdTxt;
    public com.google.android.material.textfield.TextInputEditText cnfpwdTxt;
    public android.widget.Button logInSignUpBtn;
    public android.widget.TextView newAccount;
    public android.widget.TextView resetPwd;
    public com.google.android.material.textfield.TextInputLayout nameLayout;
    public com.google.android.material.textfield.TextInputLayout pwdLayout;
    public com.google.android.material.textfield.TextInputLayout cnfPwdLayout;
    public com.google.android.material.textfield.TextInputLayout emailLayout;
    public com.bss.uis.domain.model.responsedomain.AuthResponseDomain authResponseDomain;
    public android.widget.LinearLayout loginlayout;
    public android.widget.ImageView fbImage;
    public android.widget.ImageView gImage;
    public com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    public com.facebook.login.widget.LoginButton fbLoginButton;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlinx.coroutines.CoroutineScope ioScOPe = null;
    private com.bss.uis.presentation.viewmodel.ViewModelUIS viewModelUIS;
    private com.bss.uis.roomdb.UISDatabase uisDatabase;
    private com.bss.uis.roomdb.dao.MasterDao masterDao;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> salutationList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> identitylist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> genederlist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> occupationList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> cancerlist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> bllodgrouplist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> relationlist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> fbPermission = null;
    private final int RC_SIGN_IN = 9001;
    private final int REQUEST_ID_MULTIPLE_PERMISSIONS = 101;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.facebook.CallbackManager callbackManager;
    
    public LogInSignUpActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getNameTxt() {
        return null;
    }
    
    public final void setNameTxt(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getEmailTxt() {
        return null;
    }
    
    public final void setEmailTxt(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getPwdTxt() {
        return null;
    }
    
    public final void setPwdTxt(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getCnfpwdTxt() {
        return null;
    }
    
    public final void setCnfpwdTxt(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getLogInSignUpBtn() {
        return null;
    }
    
    public final void setLogInSignUpBtn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getNewAccount() {
        return null;
    }
    
    public final void setNewAccount(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getResetPwd() {
        return null;
    }
    
    public final void setResetPwd(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getNameLayout() {
        return null;
    }
    
    public final void setNameLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPwdLayout() {
        return null;
    }
    
    public final void setPwdLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getCnfPwdLayout() {
        return null;
    }
    
    public final void setCnfPwdLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getEmailLayout() {
        return null;
    }
    
    public final void setEmailLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.domain.model.responsedomain.AuthResponseDomain getAuthResponseDomain() {
        return null;
    }
    
    public final void setAuthResponseDomain(@org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.model.responsedomain.AuthResponseDomain p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getLoginlayout() {
        return null;
    }
    
    public final void setLoginlayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getFbImage() {
        return null;
    }
    
    public final void setFbImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getGImage() {
        return null;
    }
    
    public final void setGImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.auth.api.signin.GoogleSignInClient getGoogleSignInClient() {
        return null;
    }
    
    public final void setGoogleSignInClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.facebook.login.widget.LoginButton getFbLoginButton() {
        return null;
    }
    
    public final void setFbLoginButton(@org.jetbrains.annotations.NotNull()
    com.facebook.login.widget.LoginButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSalutationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getIdentitylist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGenederlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOccupationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCancerlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getBllodgrouplist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRelationlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFbPermission() {
        return null;
    }
    
    public final int getRC_SIGN_IN() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final java.lang.Object loginUser(java.lang.String email, java.lang.String password, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void resetPwd(java.lang.String toString, java.lang.String toString1) {
    }
    
    private final java.lang.Object registerUser(java.lang.String userName, java.lang.String email, java.lang.String passoword, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object updateLocalDB(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void initAppConfig(androidx.lifecycle.LiveData<java.util.List<com.bss.uis.roomdb.entity.AppConfig>> appConfigList) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    private final void dataObserver() {
    }
    
    private final void handleSuccessfulLogin(com.bss.uis.domain.model.responsedomain.AuthResponseDomain authResponse, java.lang.String source, boolean isRegister) {
    }
    
    private final java.lang.Object pullUserRightData(java.lang.String token, java.util.List<java.lang.Integer> roleidlist, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object pullUserData(java.lang.String token, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object pullTabData(java.lang.String token, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object pullMasterData(java.lang.String token, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final boolean isValidData() {
        return false;
    }
    
    private final void isValidate() {
    }
    
    private final void initGoogleSignin() {
    }
    
    private final java.lang.Object saveUserRights(java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain> userRightDTOList, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object saveToMasterEntity(java.util.List<com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain> masterValueDTOList, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object saveTabData(java.util.List<com.bss.uis.domain.model.responsedomain.TabDataResponseDomain> tabValueDTOList, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object deletePatientDAta(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void handleFacebookAccessToken(com.facebook.AccessToken token) {
    }
    
    private final java.lang.Object handleAccessToken(java.lang.String url, java.lang.String token, java.lang.String serial, java.lang.String model, java.lang.String entitytype, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void checkPermissions() {
    }
}