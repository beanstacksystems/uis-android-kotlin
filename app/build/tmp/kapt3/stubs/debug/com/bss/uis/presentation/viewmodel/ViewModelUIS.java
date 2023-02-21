package com.bss.uis.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J!\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u0002032\u0006\u0010W\u001a\u00020XH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ!\u0010Z\u001a\u00020U2\u0006\u0010V\u001a\u0002032\u0006\u0010[\u001a\u00020\\H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J\u0019\u0010-\u001a\u00020U2\u0006\u0010V\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J\u0011\u0010_\u001a\u00020UH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J\u001b\u0010a\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u000103H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J%\u0010b\u001a\u00020U2\b\u0010c\u001a\u0004\u0018\u0001032\b\u0010d\u001a\u0004\u0018\u000103H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010eJ\u001b\u0010f\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u000103H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J!\u0010g\u001a\u00020U2\u0006\u0010V\u001a\u0002032\u0006\u0010h\u001a\u00020iH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJ\u0019\u0010k\u001a\u00020U2\u0006\u0010l\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^JW\u0010m\u001a\u00020U2\b\u0010n\u001a\u0004\u0018\u0001032\b\u0010c\u001a\u0004\u0018\u0001032\b\u0010d\u001a\u0004\u0018\u0001032\b\u0010o\u001a\u0004\u0018\u0001032\b\u0010p\u001a\u0004\u0018\u0001032\b\u0010q\u001a\u0004\u0018\u0001032\b\u0010r\u001a\u0004\u0018\u000103H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010sJ1\u0010t\u001a\u00020U2\u0006\u0010V\u001a\u0002032\u0006\u0010o\u001a\u0002032\u0006\u0010p\u001a\u0002032\u0006\u0010r\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010uJ\u001b\u0010v\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u000103H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J!\u0010w\u001a\u00020U2\u0006\u0010V\u001a\u0002032\u0006\u0010x\u001a\u00020yH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ\u001b\u0010{\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u000103H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J)\u0010|\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u0001032\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\\0.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010~R&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010.0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010&\"\u0004\b4\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R,\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090.0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010&\"\u0004\b;\u0010(R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010&\"\u0004\b?\u0010(R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010@\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020A\u0018\u00010.0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010&\"\u0004\bC\u0010(R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010D\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0.0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0.0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010(R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010&\"\u0004\bO\u0010(R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0.0#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010&\"\u0004\bS\u0010(\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u007f"}, d2 = {"Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "Landroidx/lifecycle/ViewModel;", "isServerReachableUseCase", "Lcom/bss/uis/domain/usecase/IsServerReachableUseCase;", "registerUserUsecase", "Lcom/bss/uis/domain/usecase/RegisterUseCase;", "masterDataUseCase", "Lcom/bss/uis/domain/usecase/MasterDataUseCase;", "tabDataUseCase", "Lcom/bss/uis/domain/usecase/TabDataUseCase;", "userApiUseCase", "Lcom/bss/uis/domain/usecase/UserApiUseCase;", "userRightUseCase", "Lcom/bss/uis/domain/usecase/UserRightUseCase;", "loginUserUseCase", "Lcom/bss/uis/domain/usecase/LoginUserUseCase;", "logOutUseCase", "Lcom/bss/uis/domain/usecase/LogOutUseCase;", "registerWithGoogleUsecase", "Lcom/bss/uis/domain/usecase/RegisterWithGoogleUsecase;", "pincodeUsecase", "Lcom/bss/uis/domain/usecase/PincodeUsecase;", "patientRegistrationUsecase", "Lcom/bss/uis/domain/usecase/PatientRegistrationUsecase;", "fetchUserUseCase", "Lcom/bss/uis/domain/usecase/FetchUserUseCase;", "approveUserUseCase", "Lcom/bss/uis/domain/usecase/ApproveUserUseCase;", "fetchPatientListUsecase", "Lcom/bss/uis/domain/usecase/FetchPatientListUsecase;", "updateUserProfileUseCase", "Lcom/bss/uis/domain/usecase/UpdateUserProfileUseCase;", "(Lcom/bss/uis/domain/usecase/IsServerReachableUseCase;Lcom/bss/uis/domain/usecase/RegisterUseCase;Lcom/bss/uis/domain/usecase/MasterDataUseCase;Lcom/bss/uis/domain/usecase/TabDataUseCase;Lcom/bss/uis/domain/usecase/UserApiUseCase;Lcom/bss/uis/domain/usecase/UserRightUseCase;Lcom/bss/uis/domain/usecase/LoginUserUseCase;Lcom/bss/uis/domain/usecase/LogOutUseCase;Lcom/bss/uis/domain/usecase/RegisterWithGoogleUsecase;Lcom/bss/uis/domain/usecase/PincodeUsecase;Lcom/bss/uis/domain/usecase/PatientRegistrationUsecase;Lcom/bss/uis/domain/usecase/FetchUserUseCase;Lcom/bss/uis/domain/usecase/ApproveUserUseCase;Lcom/bss/uis/domain/usecase/FetchPatientListUsecase;Lcom/bss/uis/domain/usecase/UpdateUserProfileUseCase;)V", "approveUseResp", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bss/uis/util/Resource;", "Lcom/bss/uis/data/remote/dto/response/ApproveUserResponse;", "getApproveUseResp", "()Landroidx/lifecycle/MutableLiveData;", "setApproveUseResp", "(Landroidx/lifecycle/MutableLiveData;)V", "authResponseDomain", "Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "getAuthResponseDomain", "setAuthResponseDomain", "fetchUserList", "", "Lcom/bss/uis/data/remote/dto/response/FetchUserListResponse;", "getFetchUserList", "setFetchUserList", "isServerReachableString", "", "setServerReachableString", "logoutResponse", "getLogoutResponse", "setLogoutResponse", "masterDataResponseList", "Lcom/bss/uis/domain/model/responsedomain/MasterDataResponseDomain;", "getMasterDataResponseList", "setMasterDataResponseList", "patientRegistrationResReqList", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "getPatientRegistrationResReqList", "setPatientRegistrationResReqList", "patientlist", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "getPatientlist", "setPatientlist", "pincodedetailsList", "Lcom/bss/uis/data/remote/dto/response/PinCodeResponse;", "getPincodedetailsList", "setPincodedetailsList", "tabDataResponseList", "Lcom/bss/uis/domain/model/responsedomain/TabDataResponseDomain;", "getTabDataResponseList", "setTabDataResponseList", "userApiResponse", "Lcom/bss/uis/domain/model/responsedomain/UserApiResponseDomain;", "getUserApiResponse", "setUserApiResponse", "userrightList", "Lcom/bss/uis/domain/model/responsedomain/UserRightResponseDomain;", "getUserrightList", "setUserrightList", "approveUser", "", "token", "approveUserRequestBody", "Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPatientList", "count", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServerReachable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "userEmail", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mastaerDataApiCAll", "patientRegistartion", "patientRegistrationResReq", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pincodeDetailsApi", "pin", "registerApiCall", "userName", "serial", "model", "loginType", "entitytype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithGoogle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tabDataApi", "updateUserProfile", "body", "Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userDataApi", "userRightApiCall", "roleidlist", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    com.bss.uis.domain.usecase.UpdateUserProfileUseCase updateUserProfileUseCase) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}