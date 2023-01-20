package com.bss.uis.domain.usecase

import com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain
import com.bss.uis.domain.model.responsedomain.TabDataResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TabDataUseCase@Inject
constructor(
    private val repository: Repository
)  {
    suspend operator fun invoke(token:String): Flow<Resource<List<TabDataResponseDomain>>> {
        return repository.tabData(token)
    }
}