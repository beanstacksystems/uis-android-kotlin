package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.response.PinCodeResponse
import com.bss.uis.domain.model.responsedomain.UserRightResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PincodeUsecase @Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(pin:String): Flow<Resource<List<PinCodeResponse?>>> {
        return repository.pincodeDetails(pin)
    }
}