package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.request.ApproveUserRequestBody
import com.bss.uis.data.remote.dto.response.ApproveUserResponse
import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ApproveUserUseCase @Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String,approveUserRequestBody: ApproveUserRequestBody): Flow<Resource<ApproveUserResponse>> {
        return repository.approveUser(token,approveUserRequestBody)
    }
}