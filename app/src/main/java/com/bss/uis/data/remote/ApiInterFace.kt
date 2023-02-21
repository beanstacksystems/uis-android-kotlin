package com.bss.uis.data.remote

import com.bss.uis.data.remote.dto.request.ApproveUserRequestBody
import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest
import com.bss.uis.data.remote.dto.response.*
import retrofit2.Call
import retrofit2.http.*

interface ApiInterFace {

    @POST("isserverreachable")
    fun isServerReachable(): Call<String>


    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("username") userName: String?,
        @Field("useremail") userEmail: String?,
        @Field("password") password: String?,
        @Field("deviceid") serial: String?,
        @Field("devicemodel") model: String?,
        @Field("regtype") loginType: String?,
        @Field("entitytype") entitytype: String?
    ): Call<AuthResponse?>?


    @POST("masterAll")
    fun masters(@Header("Authorization") token: String?): Call<List<MasterDataResponse?>?>?


    @POST("tabdata")
    fun tabData(@Header("Authorization") token: String?): Call<List<TabDataResponse?>?>?


    @POST("user")
    fun userData(
        @Header("Authorization") token: String?,
        @Header("Accept") value: String?
    ): Call<UserApiResponse?>?


    @FormUrlEncoded
    @POST("userrights/")
    fun userrights(
        @Header("Authorization") token: String?,
        @Field("roleidlist[]") roleidlist: List<Int?>?
    ): Call<List<UserRightResponse?>?>?


    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("useremail") userName: String?,
        @Field("password") password: String?
    ): Call<AuthResponse?>?


    @FormUrlEncoded
    @POST("resetPassword")
    fun resetPassword(
        @Field("username") userName: String?,
        @Field("password") password: String?
    ): Call<AuthResponse?>?

    @GET("logout")
    fun logout(@Header("Authorization") token: String?): Call<String?>?


    @FormUrlEncoded
    @POST("google")
    fun registerWithGoogle(
        @Field("token") token: String?,
        @Field("deviceid") serial: String?,
        @Field("devicemodel") model: String?,
        @Field("entitytype") entitytype: String?
    ): Call<AuthResponse?>?


    @POST("registerPatient")
    fun patientRegistratiin(
        @Header("Authorization") token: String,
        @Body patientRegistrationResReq: PatientRegistatrtionRequest
    ): Call<PatientRegistrationResReq?>?

    @POST("fetchUserRequests")
    fun fetchUserRequest(
        @Header("Authorization") token: String,
    ): Call<List<FetchUserListResponse>?>?

    @POST("updateAdminApproval")
    fun adminApproval(
        @Header("Authorization") token: String,
        @Body approveUserRequestBody: ApproveUserRequestBody
    ): Call<ApproveUserResponse?>?

    @GET("getLatestPatientByCount/5")
    fun fetchpatientList(
        @Header("Authorization") token: String,
    ): Call<List<FetchPatientList>?>?

    @POST("updateUserProfileData")
    fun updateUserProfileData(
        @Header("Authorization") token: String,
        @Body updateUserProfileDataRequest: UpdateUserProfileDataRequest
    ): Call<ApproveUserResponse>
}