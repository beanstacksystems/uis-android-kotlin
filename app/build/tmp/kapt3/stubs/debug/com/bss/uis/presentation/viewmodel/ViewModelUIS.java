package com.bss.uis.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J!\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u0002052\u0006\u0010]\u001a\u00020^H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010_J!\u0010`\u001a\u00020[2\u0006\u0010\\\u001a\u0002052\u0006\u0010a\u001a\u00020bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010cJ\u0019\u0010/\u001a\u00020[2\u0006\u0010\\\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ!\u0010@\u001a\u00020[2\u0006\u0010\\\u001a\u0002052\u0006\u0010e\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010fJ\u0011\u0010g\u001a\u00020[H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010hJ\u001b\u0010i\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u000105H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ%\u0010j\u001a\u00020[2\b\u0010k\u001a\u0004\u0018\u0001052\b\u0010l\u001a\u0004\u0018\u000105H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010fJ\u001b\u0010m\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u000105H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ!\u0010n\u001a\u00020[2\u0006\u0010\\\u001a\u0002052\u0006\u0010o\u001a\u00020pH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010qJ\u0019\u0010r\u001a\u00020[2\u0006\u0010s\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJW\u0010t\u001a\u00020[2\b\u0010u\u001a\u0004\u0018\u0001052\b\u0010k\u001a\u0004\u0018\u0001052\b\u0010l\u001a\u0004\u0018\u0001052\b\u0010v\u001a\u0004\u0018\u0001052\b\u0010w\u001a\u0004\u0018\u0001052\b\u0010x\u001a\u0004\u0018\u0001052\b\u0010y\u001a\u0004\u0018\u000105H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ1\u0010{\u001a\u00020[2\u0006\u0010\\\u001a\u0002052\u0006\u0010v\u001a\u0002052\u0006\u0010w\u001a\u0002052\u0006\u0010y\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010|J\u001b\u0010}\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u000105H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ#\u0010~\u001a\u00020[2\u0006\u0010\\\u001a\u0002052\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u000105H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ,\u0010\u0083\u0001\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u0001052\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020b00H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u0001000%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b6\u0010*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R,\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;000%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010(\"\u0004\b=\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010(\"\u0004\bA\u0010*R(\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010C0%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010F\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020G\u0018\u0001000%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010J\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010K000%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010(\"\u0004\bM\u0010*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O000%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W000%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010(\"\u0004\bY\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "Landroidx/lifecycle/ViewModel;", "isServerReachableUseCase", "Lcom/bss/uis/domain/usecase/IsServerReachableUseCase;", "registerUserUsecase", "Lcom/bss/uis/domain/usecase/RegisterUseCase;", "masterDataUseCase", "Lcom/bss/uis/domain/usecase/MasterDataUseCase;", "tabDataUseCase", "Lcom/bss/uis/domain/usecase/TabDataUseCase;", "userApiUseCase", "Lcom/bss/uis/domain/usecase/UserApiUseCase;", "userRightUseCase", "Lcom/bss/uis/domain/usecase/UserRightUseCase;", "loginUserUseCase", "Lcom/bss/uis/domain/usecase/LoginUserUseCase;", "logOutUseCase", "Lcom/bss/uis/domain/usecase/LogOutUseCase;", "registerWithGoogleUsecase", "Lcom/bss/uis/domain/usecase/RegisterWithGoogleUsecase;", "pincodeUsecase", "Lcom/bss/uis/domain/usecase/PincodeUsecase;", "patientRegistrationUsecase", "Lcom/bss/uis/domain/usecase/PatientRegistrationUsecase;", "fetchUserUseCase", "Lcom/bss/uis/domain/usecase/FetchUserUseCase;", "approveUserUseCase", "Lcom/bss/uis/domain/usecase/ApproveUserUseCase;", "fetchPatientListUsecase", "Lcom/bss/uis/domain/usecase/FetchPatientListUsecase;", "updateUserProfileUseCase", "Lcom/bss/uis/domain/usecase/UpdateUserProfileUseCase;", "patientDetailUseCase", "Lcom/bss/uis/domain/usecase/PatientDetailUseCase;", "(Lcom/bss/uis/domain/usecase/IsServerReachableUseCase;Lcom/bss/uis/domain/usecase/RegisterUseCase;Lcom/bss/uis/domain/usecase/MasterDataUseCase;Lcom/bss/uis/domain/usecase/TabDataUseCase;Lcom/bss/uis/domain/usecase/UserApiUseCase;Lcom/bss/uis/domain/usecase/UserRightUseCase;Lcom/bss/uis/domain/usecase/LoginUserUseCase;Lcom/bss/uis/domain/usecase/LogOutUseCase;Lcom/bss/uis/domain/usecase/RegisterWithGoogleUsecase;Lcom/bss/uis/domain/usecase/PincodeUsecase;Lcom/bss/uis/domain/usecase/PatientRegistrationUsecase;Lcom/bss/uis/domain/usecase/FetchUserUseCase;Lcom/bss/uis/domain/usecase/ApproveUserUseCase;Lcom/bss/uis/domain/usecase/FetchPatientListUsecase;Lcom/bss/uis/domain/usecase/UpdateUserProfileUseCase;Lcom/bss/uis/domain/usecase/PatientDetailUseCase;)V", "approveUseResp", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bss/uis/util/Resource;", "Lcom/bss/uis/data/remote/dto/response/ApproveUserResponse;", "getApproveUseResp", "()Landroidx/lifecycle/MutableLiveData;", "setApproveUseResp", "(Landroidx/lifecycle/MutableLiveData;)V", "authResponseDomain", "Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "getAuthResponseDomain", "setAuthResponseDomain", "fetchUserList", "", "Lcom/bss/uis/data/remote/dto/response/FetchUserListResponse;", "getFetchUserList", "setFetchUserList", "isServerReachableString", "", "setServerReachableString", "logoutResponse", "getLogoutResponse", "setLogoutResponse", "masterDataResponseList", "Lcom/bss/uis/domain/model/responsedomain/MasterDataResponseDomain;", "getMasterDataResponseList", "setMasterDataResponseList", "patientDetails", "Lcom/bss/uis/data/remote/dto/response/PatientDetailsResponse;", "getPatientDetails", "setPatientDetails", "patientRegistrationResReqList", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "getPatientRegistrationResReqList", "setPatientRegistrationResReqList", "patientlist", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "getPatientlist", "setPatientlist", "pincodedetailsList", "Lcom/bss/uis/data/remote/dto/response/PinCodeResponse;", "getPincodedetailsList", "setPincodedetailsList", "tabDataResponseList", "Lcom/bss/uis/domain/model/responsedomain/TabDataResponseDomain;", "getTabDataResponseList", "setTabDataResponseList", "userApiResponse", "Lcom/bss/uis/domain/model/responsedomain/UserApiResponseDomain;", "getUserApiResponse", "setUserApiResponse", "userrightList", "Lcom/bss/uis/domain/model/responsedomain/UserRightResponseDomain;", "getUserrightList", "setUserrightList", "approveUser", "", "token", "approveUserRequestBody", "Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPatientList", "count", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patientId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServerReachable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "userEmail", "password", "mastaerDataApiCAll", "patientRegistartion", "patientRegistrationResReq", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pincodeDetailsApi", "pin", "registerApiCall", "userName", "serial", "model", "loginType", "entitytype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithGoogle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tabDataApi", "updateUserProfile", "body", "Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userDataApi", "userRightApiCall", "roleidlist", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ViewModelUIS extends androidx.lifecycle.ViewModel {
    private final com.bss.uis.domain.usecase.IsServerReachableUseCase isServerReachableUseCase = null;
    private final com.bss.uis.domain.usecase.RegisterUseCase registerUserUsecase = null;
    private final com.bss.uis.domain.usecase.MasterDataUseCase masterDataUseCase = null;
    private final com.bss.uis.domain.usecase.TabDataUseCase tabDataUseCase = null;
    private final com.bss.uis.domain.usecase.UserApiUseCase userApiUseCase = null;
    private final com.bss.uis.domain.usecase.UserRightUseCase userRightUseCase = null;
    private final com.bss.uis.domain.usecase.LoginUserUseCase loginUserUseCase = null;
    private final com.bss.uis.domain.usecase.LogOutUseCase logOutUseCase = null;
    private final com.bss.uis.domain.usecase.RegisterWithGoogleUsecase registerWithGoogleUsecase = null;
    private final com.bss.uis.domain.usecase.PincodeUsecase pincodeUsecase = null;
    private final com.bss.uis.domain.usecase.PatientRegistrationUsecase patientRegistrationUsecase = null;
    private final com.bss.uis.domain.usecase.FetchUserUseCase fetchUserUseCase = null;
    private final com.bss.uis.domain.usecase.ApproveUserUseCase approveUserUseCase = null;
    private final com.bss.uis.domain.usecase.FetchPatientListUsecase fetchPatientListUsecase = null;
    private final com.bss.uis.domain.usecase.UpdateUserProfileUseCase updateUserProfileUseCase = null;
    private final com.bss.uis.domain.usecase.PatientDetailUseCase patientDetailUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.lang.String>> isServerReachableString;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.lang.String>> logoutResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>> authResponseDomain;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain>>> masterDataResponseList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.TabDataResponseDomain>>> tabDataResponseList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.UserApiResponseDomain>> userApiResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain>>> userrightList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.PinCodeResponse>>> pincodedetailsList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientRegistrationResReq>> patientRegistrationResReqList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse>>> fetchUserList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>> approveUseResp;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>>> patientlist;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientDetailsResponse>> patientDetails;
    
    @javax.inject.Inject()
    public ViewModelUIS(@org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.IsServerReachableUseCase isServerReachableUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.RegisterUseCase registerUserUsecase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.MasterDataUseCase masterDataUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.TabDataUseCase tabDataUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.UserApiUseCase userApiUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.UserRightUseCase userRightUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.LoginUserUseCase loginUserUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.LogOutUseCase logOutUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.RegisterWithGoogleUsecase registerWithGoogleUsecase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.PincodeUsecase pincodeUsecase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.PatientRegistrationUsecase patientRegistrationUsecase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.FetchUserUseCase fetchUserUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.ApproveUserUseCase approveUserUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.FetchPatientListUsecase fetchPatientListUsecase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.UpdateUserProfileUseCase updateUserProfileUseCase, @org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.usecase.PatientDetailUseCase patientDetailUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.lang.String>> isServerReachableString() {
        return null;
    }
    
    public final void setServerReachableString(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.lang.String>> getLogoutResponse() {
        return null;
    }
    
    public final void setLogoutResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>> getAuthResponseDomain() {
        return null;
    }
    
    public final void setAuthResponseDomain(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain>>> getMasterDataResponseList() {
        return null;
    }
    
    public final void setMasterDataResponseList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.TabDataResponseDomain>>> getTabDataResponseList() {
        return null;
    }
    
    public final void setTabDataResponseList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.TabDataResponseDomain>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.UserApiResponseDomain>> getUserApiResponse() {
        return null;
    }
    
    public final void setUserApiResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.UserApiResponseDomain>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain>>> getUserrightList() {
        return null;
    }
    
    public final void setUserrightList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.PinCodeResponse>>> getPincodedetailsList() {
        return null;
    }
    
    public final void setPincodedetailsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.PinCodeResponse>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientRegistrationResReq>> getPatientRegistrationResReqList() {
        return null;
    }
    
    public final void setPatientRegistrationResReqList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientRegistrationResReq>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse>>> getFetchUserList() {
        return null;
    }
    
    public final void setFetchUserList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>> getApproveUseResp() {
        return null;
    }
    
    public final void setApproveUseResp(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>>> getPatientlist() {
        return null;
    }
    
    public final void setPatientlist(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientDetailsResponse>> getPatientDetails() {
        return null;
    }
    
    public final void setPatientDetails(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientDetailsResponse>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isServerReachable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerApiCall(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    java.lang.String loginType, @org.jetbrains.annotations.Nullable()
    java.lang.String entitytype, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object mastaerDataApiCAll(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tabDataApi(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userDataApi(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userRightApiCall(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> roleidlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.Nullable()
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logOut(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerWithGoogle(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String serial, @org.jetbrains.annotations.NotNull()
    java.lang.String model, @org.jetbrains.annotations.NotNull()
    java.lang.String entitytype, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pincodeDetailsApi(@org.jetbrains.annotations.NotNull()
    java.lang.String pin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object patientRegistartion(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest patientRegistrationResReq, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object approveUser(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.ApproveUserRequestBody approveUserRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPatientList(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * this for EditProfileActivity to update the user profile details
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * this is for the PatientDetailsActivity for getting latest patient details
     * from the patient id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPatientDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}