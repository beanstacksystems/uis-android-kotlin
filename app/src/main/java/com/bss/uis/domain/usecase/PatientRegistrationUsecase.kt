package com.bss.uis.domain.usecase

import com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest
import com.bss.uis.data.remote.dto.response.PatientRegistrationResReq
import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PatientRegistrationUsecase  @Inject
constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(

        token: String?,
        patientRegistrationResReq: PatientRegistatrtionRequest


        ): Flow<Resource<PatientRegistrationResReq?>> {
        return repository.patientRegister(
            token,
            patientRegistrationResReq)
    }
}