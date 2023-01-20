package com.bss.uis.domain.usecase

import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LogOutUseCase @Inject
constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(
        token:String
    ): Flow<Resource<String>> {
        return repository.logOut(token)
    }
}