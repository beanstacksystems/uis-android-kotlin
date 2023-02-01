package com.bss.uis.domain.repository

import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.response.AuthResponse
import com.bss.uis.data.remote.dto.response.MasterDataResponse
import com.bss.uis.data.remote.dto.response.PatientRegistrationResReq
import com.bss.uis.data.remote.dto.response.PinCodeResponse
import com.bss.uis.domain.model.responsedomain.*
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Url

interface Repository {
    suspend fun isServerConnected(

    ): Flow<Resource<String>>

    suspend fun register(
        userName: String?,
        userEmail: String?,
        password: String?,
        serial: String?,
        model: String?,
        loginType: String?,
        entitytype: String?

    ): Flow<Resource<AuthResponseDomain>>

    suspend fun masterData(
        token: String?,
    ): Flow<Resource<List<MasterDataResponseDomain>>>

    suspend fun tabData(
        token: String?
    ): Flow<Resource<List<TabDataResponseDomain>>>

    suspend fun userData(
        token: String?,
        value: String?
    ): Flow<Resource<UserApiResponseDomain>>

    suspend fun userRightData(
        token: String?,
        roleidlist: List<Int?>?
    ): Flow<Resource<List<UserRightResponseDomain>>>

    suspend fun login(
        userEmail: String?,
        password: String?
    ): Flow<Resource<AuthResponseDomain>>

    suspend fun resetPassword(
        userName: String?,
        password: String?
    ): Flow<Resource<AuthResponseDomain>>

    suspend fun logOut(
        token: String?
    ): Flow<Resource<String>>


    suspend fun registerWithGogle(
        token: String?,
        serial: String?,
        model: String?,
        entitytype: String?
    ): Flow<Resource<AuthResponseDomain>>
  suspend  fun pincodeDetails(
        pin: String?
    ): Flow<Resource<List<PinCodeResponse?>>>
    suspend fun patientRegister(
        token: String?,
        patientRegistrationResReq: PatientRegistatrtionRequest
    ): Flow<Resource<PatientRegistrationResReq?>>

}