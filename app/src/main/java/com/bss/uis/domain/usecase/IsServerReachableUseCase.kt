package com.bss.uis.domain.usecase

import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class IsServerReachableUseCase @Inject
constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(

    ): Flow<Resource<String>> {
        return repository.isServerConnected()
    }
}