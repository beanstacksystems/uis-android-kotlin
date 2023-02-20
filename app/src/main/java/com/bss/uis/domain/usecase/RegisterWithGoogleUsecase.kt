package com.bss.uis.domain.usecase

import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RegisterWithGoogleUsecase @Inject
constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(
        token: String,
        serial: String,
        model: String,
        entitytype: String

    ): Flow<Resource<AuthResponseDomain>> {
        return repository.registerWithGogle( token, serial, model, entitytype)
    }
}