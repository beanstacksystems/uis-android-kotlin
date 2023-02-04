package com.bss.uis.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bss.uis.data.remote.dto.request.ApproveUserRequestBody
import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.response.ApproveUserResponse
import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import com.bss.uis.data.remote.dto.response.PatientRegistrationResReq
import com.bss.uis.data.remote.dto.response.PinCodeResponse
import com.bss.uis.domain.model.responsedomain.*
import com.bss.uis.domain.usecase.*
import com.bss.uis.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltViewModel
class ViewModelUIS @Inject constructor(
    private val isServerReachableUseCase: IsServerReachableUseCase,
    private val registerUserUsecase: RegisterUseCase,
    private val masterDataUseCase: MasterDataUseCase,
    private val tabDataUseCase: TabDataUseCase,
    private val userApiUseCase: UserApiUseCase,
    private val userRightUseCase: UserRightUseCase,
    private val loginUserUseCase: LoginUserUseCase,
    private val logOutUseCase: LogOutUseCase,
    private val registerWithGoogleUsecase: RegisterWithGoogleUsecase,
    private val pincodeUsecase: PincodeUsecase,
    private val patientRegistrationUsecase: PatientRegistrationUsecase,
    private val fetchUserUseCase: FetchUserUseCase,
    private val approveUserUseCase: ApproveUserUseCase


) : ViewModel() {
    var isServerReachableString: MutableLiveData<Resource<String>> =
        MutableLiveData()
    var logoutResponse: MutableLiveData<Resource<String>> =
        MutableLiveData()
    var authResponseDomain: MutableLiveData<Resource<AuthResponseDomain>> =
        MutableLiveData()
    var masterDataResponseList: MutableLiveData<Resource<List<MasterDataResponseDomain>>> =
        MutableLiveData()
    var tabDataResponseList: MutableLiveData<Resource<List<TabDataResponseDomain>>> =
        MutableLiveData()
    var userApiResponse: MutableLiveData<Resource<UserApiResponseDomain>> =
        MutableLiveData()
    var userrightList: MutableLiveData<Resource<List<UserRightResponseDomain>>> =
        MutableLiveData()
    var pincodedetailsList :MutableLiveData<Resource<List<PinCodeResponse?>>> = MutableLiveData()
    var patientRegistrationResReqList: MutableLiveData<Resource<PatientRegistrationResReq?>> =
        MutableLiveData()
    var fetchUserList: MutableLiveData<Resource<List<FetchUserListResponse>?>> =
        MutableLiveData()
    var approveUseResp: MutableLiveData<Resource<ApproveUserResponse>> =
        MutableLiveData()

    init {
        /** this scope is alive as-long-as viewModel **/
        viewModelScope.launch {

        }
    }

    suspend fun isServerReachable() {
        CoroutineScope(Dispatchers.IO).launch {
            val res = isServerReachableUseCase.invoke()
            launch(Dispatchers.Main) {
                res.collectLatest {
                    isServerReachableString.value = it
                }
            }
        }
    }

    suspend fun registerApiCall(
        userName: String?,
        userEmail: String?,
        password: String?,
        serial: String?,
        model: String?,
        loginType: String?,
        entitytype: String?
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = registerUserUsecase.invoke(
                userName, userEmail,
                password, serial, model, loginType, entitytype
            )
            launch(Dispatchers.Main) {
                res.collectLatest {
                    authResponseDomain.value = it
                }
            }
        }
    }

    suspend fun mastaerDataApiCAll(
        token: String?
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = masterDataUseCase.invoke(token.toString())
            launch(Dispatchers.Main) {
                res.collectLatest {
                    masterDataResponseList.value = it
                }
            }
        }
    }

    suspend fun tabDataApi(
        token: String?
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = tabDataUseCase.invoke(token.toString())
            launch(Dispatchers.Main) {
                res.collectLatest {
                    tabDataResponseList.value = it
                }
            }
        }
    }

    suspend fun userDataApi(
        token: String?
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = userApiUseCase.invoke(token.toString(), "application/json")
            launch(Dispatchers.Main) {
                res.collectLatest {
                    userApiResponse.value = it
                }
            }
        }
    }

    suspend fun userRightApiCall(
        token: String?,
        roleidlist: List<Int>
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = userRightUseCase.invoke(token.toString(), roleidlist)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    userrightList.value = it
                }
            }
        }
    }

    suspend fun login(
        userEmail: String?,
        password: String?
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = loginUserUseCase.invoke(userEmail, password)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    authResponseDomain.value = it
                }
            }
        }
    }

    suspend fun logOut(
        token: String?
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = logOutUseCase.invoke(token!!)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    logoutResponse.value = it
                }
            }
        }
    }

    suspend fun registerWithGoogle(

        token: String,
        serial: String,
        model: String,
        entitytype: String
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = registerWithGoogleUsecase.invoke( token, serial, model, entitytype)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    authResponseDomain.value = it
                }
            }
        }

    }

    suspend fun pincodeDetailsApi(

        pin: String,
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = pincodeUsecase.invoke(pin)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    pincodedetailsList.value = it
                }
            }
        }

    }
    suspend fun patientRegistartion(

        token: String,
        patientRegistrationResReq: PatientRegistatrtionRequest
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = patientRegistrationUsecase.invoke(token, patientRegistrationResReq)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    patientRegistrationResReqList.value = it
                }
            }
        }

    }
    suspend fun fetchUserList(token:String){
        CoroutineScope(Dispatchers.IO).launch {
            val res = fetchUserUseCase.invoke(token)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    fetchUserList.value = it
                }
            }
        }
    }
    suspend fun approveUser(token:String,approveUserRequestBody: ApproveUserRequestBody){
        CoroutineScope(Dispatchers.IO).launch {
            val res = approveUserUseCase.invoke(token,approveUserRequestBody)
            launch(Dispatchers.Main) {
                res.collectLatest {
                    approveUseResp.value = it
                }
            }
        }
    }


}