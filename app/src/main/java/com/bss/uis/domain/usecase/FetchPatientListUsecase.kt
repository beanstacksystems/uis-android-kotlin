package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.request.ApproveUserRequestBody
import com.bss.uis.data.remote.dto.response.ApproveUserResponse
import com.bss.uis.data.remote.dto.response.FetchPatientList
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchPatientListUsecase @Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String): Flow<Resource<List<FetchPatientList>?>> {
        return repository.fetchPatientList(token)
    }
}