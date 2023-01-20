package com.bss.uis.di


import com.bss.uis.data.remote.ApiInterFace
import com.bss.uis.data.repository.RepositoryImpl
import com.bss.uis.domain.model.responsedomain.MasterDataResponseDomain
import com.bss.uis.domain.repository.Repository
import com.bss.uis.mapper.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideRepository(
        apiInterFace: ApiInterFace,
        authResponseDomainMapper: AuthResponseDomainMapper,
        masterDomainResponseMapper: MasterDomainResponseMapper,
        tabResponseDomainMapper: TabResponseDomainMapper,
        userApiResponseDomainMapper: UserApiResponseDomainMapper,
        userRightsDomainMapper: UserRightsDomainMapper
    ): Repository {
        return RepositoryImpl(
            apiInterFace = apiInterFace,
            authResponseDomainMapper = authResponseDomainMapper,
            masterDataResponseDomainMaper = masterDomainResponseMapper,
            tabResponseDomainMapper = tabResponseDomainMapper,
            userRightsDomainMapper = userRightsDomainMapper,
            userApiResponseDomainMapper = userApiResponseDomainMapper

        )
    }
}

