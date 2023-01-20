package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.response.UserApiResponse
import com.bss.uis.domain.model.responsedomain.TabDataResponseDomain
import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserApiUseCase @Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String,value:String): Flow<Resource<UserApiResponseDomain>> {
        return repository.userData(token,value)
    }
}