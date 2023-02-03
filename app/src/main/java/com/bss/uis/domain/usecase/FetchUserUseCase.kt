package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchUserUseCase@Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String): Flow<Resource<List<FetchUserListResponse>?>> {
        return repository.fetchUser(token)
    }
}