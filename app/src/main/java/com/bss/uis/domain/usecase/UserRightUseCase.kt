package com.bss.uis.domain.usecase

import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
import com.bss.uis.domain.model.responsedomain.UserRightResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRightUseCase @Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String,roleidlist: List<Int>): Flow<Resource<List<UserRightResponseDomain>>> {
        return repository.userRightData(token,roleidlist)
    }
}