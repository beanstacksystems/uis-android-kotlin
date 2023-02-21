package com.bss.uis.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/bss/uis/di/RepositoryModule;", "", "()V", "provideRepository", "Lcom/bss/uis/domain/repository/Repository;", "apiInterFace", "Lcom/bss/uis/data/remote/ApiInterFace;", "pincodeInterface", "Lcom/bss/uis/data/remote/PincodeInterface;", "authResponseDomainMapper", "Lcom/bss/uis/mapper/AuthResponseDomainMapper;", "masterDomainResponseMapper", "Lcom/bss/uis/mapper/MasterDomainResponseMapper;", "tabResponseDomainMapper", "Lcom/bss/uis/mapper/TabResponseDomainMapper;", "userApiResponseDomainMapper", "Lcom/bss/uis/mapper/UserApiResponseDomainMapper;", "userRightsDomainMapper", "Lcom/bss/uis/mapper/UserRightsDomainMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.bss.uis.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bss.uis.domain.repository.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.ApiInterFace apiInterFace, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.PincodeInterface pincodeInterface, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.AuthResponseDomainMapper authResponseDomainMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.MasterDomainResponseMapper masterDomainResponseMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.TabResponseDomainMapper tabResponseDomainMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.UserApiResponseDomainMapper userApiResponseDomainMapper, @org.jetbrains.annotations.NotNull()
    com.bss.uis.mapper.UserRightsDomainMapper userRightsDomainMapper) {
        return null;
    }
}