package com.bss.uis.data.repository

import com.bss.uis.data.remote.ApiInterFace
import com.bss.uis.data.remote.PincodeInterface
import com.bss.uis.data.remote.dto.request.ApproveUserRequestBody
import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest
import com.bss.uis.data.remote.dto.response.*
import com.bss.uis.domain.model.responsedomain.*
import com.bss.uis.domain.repository.Repository
import com.bss.uis.mapper.*
import com.bss.uis.util.Resource
import com.bss.uis.util.awaitRespo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    private val apiInterFace: ApiInterFace,
    private val pincodeInterface: PincodeInterface,
    private val authResponseDomainMapper: AuthResponseDomainMapper,
    private val masterDataResponseDomainMaper: MasterDomainResponseMapper,
    private val tabResponseDomainMapper: TabResponseDomainMapper,
    private val userApiResponseDomainMapper: UserApiResponseDomainMapper,
    private val userRightsDomainMapper: UserRightsDomainMapper


) : Repository {
    override suspend fun isServerConnected(): Flow<Resource<String>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.isServerReachable().awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun register(
        userName: String?,
        userEmail: String?,
        password: String?,
        serial: String?,
        model: String?,
        loginType: String?,
        entitytype: String?
    ): Flow<Resource<AuthResponseDomain>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.register(
                        userName,
                        userEmail, password, serial, model, loginType, entitytype
                    )
                        ?.awaitRespo()
                emit(Resource.Success(response?.let { authResponseDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun masterData(token: String?): Flow<Resource<List<MasterDataResponseDomain>>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.masters(
                        token
                    )?.awaitRespo()
                emit(Resource.Success(response?.let { masterDataResponseDomainMaper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun tabData(token: String?): Flow<Resource<List<TabDataResponseDomain>>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.tabData(
                        token
                    )?.awaitRespo()
                emit(Resource.Success(response?.let { tabResponseDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun userData(
        token: String?,
        value: String?
    ): Flow<Resource<UserApiResponseDomain>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.userData(
                        token, value
                    )?.awaitRespo()
                emit(Resource.Success(response?.let { userApiResponseDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun userRightData(
        token: String?,
        roleidlist: List<Int?>?
    ): Flow<Resource<List<UserRightResponseDomain>>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.userrights(
                        token, roleidlist
                    )?.awaitRespo()
                emit(Resource.Success(response?.let { userRightsDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun login(
        userEmail: String?,
        password: String?,
    ): Flow<Resource<AuthResponseDomain>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.login(
                        userEmail, password
                    )
                        ?.awaitRespo()
                emit(Resource.Success(response?.let { authResponseDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun resetPassword(
        userName: String?,
        password: String?
    ): Flow<Resource<AuthResponseDomain>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.resetPassword(
                        userName, password
                    )
                        ?.awaitRespo()
                emit(Resource.Success(response?.let { authResponseDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun logOut(token: String?): Flow<Resource<String>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.logout(token)?.awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun pincodeDetails(pin: String?): Flow<Resource<List<PinCodeResponse?>>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    pincodeInterface.fetchPinData(pin).awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun patientRegister(token: String?,patientRegistrationResReq: PatientRegistatrtionRequest): Flow<Resource<PatientRegistrationResReq?>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.patientRegistratiin(token.toString(),patientRegistrationResReq)?.awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun fetchUser(token: String?): Flow<Resource<List<FetchUserListResponse>?>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.fetchUserRequest(token.toString())?.awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun approveUser(
        token: String?,
        approveUserRequestBody: ApproveUserRequestBody
    ): Flow<Resource<ApproveUserResponse>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.adminApproval(token.toString(),approveUserRequestBody)?.awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun fetchPatientList(
        token: String?
    ): Flow<Resource<List<FetchPatientList>?>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.fetchpatientList(token.toString())?.awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun updateUserProfile(
        token: String?,body : UpdateUserProfileDataRequest
    ): Flow<Resource<ApproveUserResponse>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.updateUserProfileData(token.toString(),body).awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun getPatientDetails(
        token: String,
        patientId: String
    ): Flow<Resource<PatientDetailsResponse>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val apiResponse =
                    apiInterFace.getPatientDetails(token.toString(), patientId).awaitRespo()
                emit(Resource.Success(apiResponse))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun registerWithGogle(
        token: String?,
        serial: String?,
        model: String?,
        entitytype: String?
    ): Flow<Resource<AuthResponseDomain>> {
        return flow {
            emit(Resource.Loading(true))
            try {
                val response =
                    apiInterFace.registerWithGoogle(
                        token, serial, model, entitytype
                    )
                        ?.awaitRespo()
                emit(Resource.Success(response?.let { authResponseDomainMapper.map(it) }))
            } catch (e: IOException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: HttpException) {
                e.message?.let { emit(Resource.Error(it)) }
            } catch (e: IllegalStateException) {
                e.message?.let { emit(Resource.Error(it)) }
            }
            emit(Resource.Loading(false))
        }
    }


}