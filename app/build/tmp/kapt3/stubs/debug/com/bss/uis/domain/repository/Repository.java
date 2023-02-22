package com.bss.uis.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ-\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\'\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J-\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020!H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J/\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0\f0\u00040\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJc\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\u0010\'\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,JE\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J1\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\u0010\'\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J-\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u00103\u001a\u000204H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J1\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u00108\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J?\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/bss/uis/domain/repository/Repository;", "", "approveUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bss/uis/util/Resource;", "Lcom/bss/uis/data/remote/dto/response/ApproveUserResponse;", "token", "", "approveUserRequestBody", "Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPatientList", "", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUser", "Lcom/bss/uis/data/remote/dto/response/FetchUserListResponse;", "getPatientDetails", "Lcom/bss/uis/data/remote/dto/response/PatientDetailsResponse;", "patientId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServerConnected", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "userEmail", "password", "masterData", "Lcom/bss/uis/domain/model/responsedomain/MasterDataResponseDomain;", "patientRegister", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "patientRegistrationResReq", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pincodeDetails", "Lcom/bss/uis/data/remote/dto/response/PinCodeResponse;", "pin", "register", "userName", "serial", "model", "loginType", "entitytype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithGogle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "tabData", "Lcom/bss/uis/domain/model/responsedomain/TabDataResponseDomain;", "updateUserProfile", "body", "Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userData", "Lcom/bss/uis/domain/model/responsedomain/UserApiResponseDomain;", "value", "userRightData", "Lcom/bss/uis/domain/model/responsedomain/UserRightResponseDomain;", "roleidlist", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isServerConnected(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.lang.String>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object register(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    java.lang.String loginType, @org.jetbrains.annotations.Nullable()
    java.lang.String entitytype, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object masterData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object tabData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.TabDataResponseDomain>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object userData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.UserApiResponseDomain>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object userRightData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> roleidlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.Nullable()
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resetPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object logOut(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.lang.String>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerWithGogle(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    java.lang.String entitytype, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pincodeDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String pin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.PinCodeResponse>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object patientRegister(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest patientRegistrationResReq, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientRegistrationResReq>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchUser(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object approveUser(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.ApproveUserRequestBody approveUserRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPatientList(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserProfile(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientDetailsResponse>>> continuation);
}