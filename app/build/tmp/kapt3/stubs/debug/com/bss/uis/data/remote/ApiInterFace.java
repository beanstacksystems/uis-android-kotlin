package com.bss.uis.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\t\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\f\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J*\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00032\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\'J\u001e\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J&\u0010\u0017\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\n\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J&\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'Jf\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00032\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006H\'JB\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006H\'J*\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00032\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\'J&\u0010%\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\n\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\"\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020)H\'J*\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0006H\'J:\u0010-\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010\n\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\b\u0001\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\nH\'\u00a8\u00061"}, d2 = {"Lcom/bss/uis/data/remote/ApiInterFace;", "", "adminApproval", "Lretrofit2/Call;", "Lcom/bss/uis/data/remote/dto/response/ApproveUserResponse;", "token", "", "approveUserRequestBody", "Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;", "fetchUserRequest", "", "Lcom/bss/uis/data/remote/dto/response/FetchUserListResponse;", "fetchpatientList", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "getPatientDetails", "Lcom/bss/uis/data/remote/dto/response/PatientDetailsResponse;", "patientId", "isServerReachable", "login", "Lcom/bss/uis/data/remote/dto/response/AuthResponse;", "userName", "password", "logout", "masters", "Lcom/bss/uis/data/remote/dto/response/MasterDataResponse;", "patientRegistratiin", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "patientRegistrationResReq", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "register", "userEmail", "serial", "model", "loginType", "entitytype", "registerWithGoogle", "resetPassword", "tabData", "Lcom/bss/uis/data/remote/dto/response/TabDataResponse;", "updateUserProfileData", "updateUserProfileDataRequest", "Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;", "userData", "Lcom/bss/uis/data/remote/dto/response/UserApiResponse;", "value", "userrights", "Lcom/bss/uis/data/remote/dto/response/UserRightResponse;", "roleidlist", "", "app_debug"})
public abstract interface ApiInterFace {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "isserverreachable")
    public abstract retrofit2.Call<java.lang.String> isServerReachable();
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "register")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.AuthResponse> register(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "username")
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "useremail")
    java.lang.String userEmail, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "deviceid")
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "devicemodel")
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "regtype")
    java.lang.String loginType, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "entitytype")
    java.lang.String entitytype);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "masterAll")
    public abstract retrofit2.Call<java.util.List<com.bss.uis.data.remote.dto.response.MasterDataResponse>> masters(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "tabdata")
    public abstract retrofit2.Call<java.util.List<com.bss.uis.data.remote.dto.response.TabDataResponse>> tabData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user")
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.UserApiResponse> userData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Accept")
    java.lang.String value);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "userrights/")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<java.util.List<com.bss.uis.data.remote.dto.response.UserRightResponse>> userrights(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "roleidlist[]")
    java.util.List<java.lang.Integer> roleidlist);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.AuthResponse> login(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "useremail")
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "resetPassword")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.AuthResponse> resetPassword(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "username")
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "logout")
    public abstract retrofit2.Call<java.lang.String> logout(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "google")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.AuthResponse> registerWithGoogle(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "deviceid")
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "devicemodel")
    java.lang.String model, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "entitytype")
    java.lang.String entitytype);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "registerPatient")
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.PatientRegistrationResReq> patientRegistratiin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest patientRegistrationResReq);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "fetchUserRequests")
    public abstract retrofit2.Call<java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse>> fetchUserRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "updateAdminApproval")
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.ApproveUserResponse> adminApproval(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.bss.uis.data.remote.dto.request.ApproveUserRequestBody approveUserRequestBody);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getLatestPatientByCount/5")
    public abstract retrofit2.Call<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>> fetchpatientList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "updateUserProfileData")
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.ApproveUserResponse> updateUserProfileData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest updateUserProfileDataRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = " /getPatientById/{patientId}")
    public abstract retrofit2.Call<com.bss.uis.data.remote.dto.response.PatientDetailsResponse> getPatientDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "patientId")
    java.lang.String patientId);
}