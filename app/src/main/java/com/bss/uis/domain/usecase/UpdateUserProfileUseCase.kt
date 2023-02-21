package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest
import com.bss.uis.data.remote.dto.response.ApproveUserResponse
import com.bss.uis.domain.model.responsedomain.UserApiResponseDomain
import com.bss.uis.domain.model.responsedomain.UserRightResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UpdateUserProfileUseCase @Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String,body: UpdateUserProfileDataRequest): Flow<Resource<ApproveUserResponse>> {
        return repository.updateUserProfile(token,body)
    }
}