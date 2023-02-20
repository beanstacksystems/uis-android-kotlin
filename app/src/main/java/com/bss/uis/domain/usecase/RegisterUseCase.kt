package com.bss.uis.domain.usecase

import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RegisterUseCase @Inject
constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(
        userName: String?,
        userEmail: String?,
        password: String?,
        serial: String?,
        model: String?,
        loginType: String?,
        entitytype: String?

    ): Flow<Resource<AuthResponseDomain>> {
        return repository.register(userName,
        userEmail,
        password,serial,model,loginType,entitytype)
    }
}