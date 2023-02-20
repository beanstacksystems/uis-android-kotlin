package com.bss.uis.domain.usecase

import com.bss.uis.domain.model.responsedomain.AuthResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUserUseCase @Inject
constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(

        userEmail: String?,
        password: String?,


    ): Flow<Resource<AuthResponseDomain>> {
        return repository.login(
            userEmail,
            password)
    }
}