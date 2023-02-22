package com.bss.uis.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J/\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001b0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ1\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00130\u00122\b\u0010)\u001a\u0004\u0018\u00010\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J-\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001b0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ1\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J/\u00102\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001b0\u00130\u00122\b\u00104\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJc\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00130\u00122\b\u00106\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00162\b\u0010*\u001a\u0004\u0018\u00010\u00162\b\u00107\u001a\u0004\u0018\u00010\u00162\b\u00108\u001a\u0004\u0018\u00010\u00162\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010:\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;JE\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u00107\u001a\u0004\u0018\u00010\u00162\b\u00108\u001a\u0004\u0018\u00010\u00162\b\u0010:\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J1\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00130\u00122\b\u00106\u001a\u0004\u0018\u00010\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J-\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001b0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ/\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010B\u001a\u00020CH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ1\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010G\u001a\u0004\u0018\u00010\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J?\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u001b0\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010K\u0018\u00010\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006M"}, d2 = {"Lcom/bss/uis/data/repository/RepositoryImpl;", "Lcom/bss/uis/domain/repository/Repository;", "apiInterFace", "Lcom/bss/uis/data/remote/ApiInterFace;", "pincodeInterface", "Lcom/bss/uis/data/remote/PincodeInterface;", "authResponseDomainMapper", "Lcom/bss/uis/mapper/AuthResponseDomainMapper;", "masterDataResponseDomainMaper", "Lcom/bss/uis/mapper/MasterDomainResponseMapper;", "tabResponseDomainMapper", "Lcom/bss/uis/mapper/TabResponseDomainMapper;", "userApiResponseDomainMapper", "Lcom/bss/uis/mapper/UserApiResponseDomainMapper;", "userRightsDomainMapper", "Lcom/bss/uis/mapper/UserRightsDomainMapper;", "(Lcom/bss/uis/data/remote/ApiInterFace;Lcom/bss/uis/data/remote/PincodeInterface;Lcom/bss/uis/mapper/AuthResponseDomainMapper;Lcom/bss/uis/mapper/MasterDomainResponseMapper;Lcom/bss/uis/mapper/TabResponseDomainMapper;Lcom/bss/uis/mapper/UserApiResponseDomainMapper;Lcom/bss/uis/mapper/UserRightsDomainMapper;)V", "approveUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bss/uis/util/Resource;", "Lcom/bss/uis/data/remote/dto/response/ApproveUserResponse;", "token", "", "approveUserRequestBody", "Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPatientList", "", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUser", "Lcom/bss/uis/data/remote/dto/response/FetchUserListResponse;", "getPatientDetails", "Lcom/bss/uis/data/remote/dto/response/PatientDetailsResponse;", "patientId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServerConnected", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "userEmail", "password", "masterData", "Lcom/bss/uis/domain/model/responsedomain/MasterDataResponseDomain;", "patientRegister", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "patientRegistrationResReq", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pincodeDetails", "Lcom/bss/uis/data/remote/dto/response/PinCodeResponse;", "pin", "register", "userName", "serial", "model", "loginType", "entitytype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithGogle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "tabData", "Lcom/bss/uis/domain/model/responsedomain/TabDataResponseDomain;", "updateUserProfile", "body", "Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userData", "Lcom/bss/uis/domain/model/responsedomain/UserApiResponseDomain;", "value", "userRightData", "Lcom/bss/uis/domain/model/responsedomain/UserRightResponseDomain;", "roleidlist", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class RepositoryImpl implements com.bss.uis.domain.repository.Repository {
    private final com.bss.uis.data.remote.ApiInterFace apiInterFace = null;
    private final com.bss.uis.data.remote.PincodeInterface pincodeInterface = null;
    private final com.bss.uis.mapper.AuthResponseDomainMapper authResponseDomainMapper = null;
    private final com.bss.uis.mapper.MasterDomainResponseMapper masterDataResponseDomainMaper = null;
    private final com.bss.uis.mapper.TabResponseDomainMapper tabResponseDomainMapper = null;
    private final com.bss.uis.mapper.UserApiResponseDomainMapper userApiResponseDomainMapper = null;
    private final com.bss.uis.mapper.UserRightsDomainMapper userRightsDomainMapper = null;
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.ApiInterFace apiInterFace, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.PincodeInterface pincodeInterface, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.AuthResponseDomainMapper authResponseDomainMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.MasterDomainResponseMapper masterDataResponseDomainMaper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.TabResponseDomainMapper tabResponseDomainMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.UserApiResponseDomainMapper userApiResponseDomainMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.UserRightsDomainMapper userRightsDomainMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isServerConnected(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.lang.String>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object register(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    java.lang.String loginType, @org.jetbrains.annotations.Nullable()
    java.lang.String entitytype, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object masterData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object tabData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.TabDataResponseDomain>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object userData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.UserApiResponseDomain>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object userRightData(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> roleidlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.Nullable()
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object resetPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object logOut(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.lang.String>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object pincodeDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String pin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.PinCodeResponse>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object patientRegister(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest patientRegistrationResReq, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientRegistrationResReq>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchUser(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object approveUser(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.ApproveUserRequestBody approveUserRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPatientList(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateUserProfile(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPatientDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.PatientDetailsResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerWithGogle(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    java.lang.String entitytype, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.domain.model.responsedomain.AuthResponseDomain>>> continuation) {
        return null;
    }
}