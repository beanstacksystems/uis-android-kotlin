package com.bss.uis.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/bss/uis/domain/usecase/FetchPatientListUsecase;", "", "repository", "Lcom/bss/uis/domain/repository/Repository;", "(Lcom/bss/uis/domain/repository/Repository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bss/uis/util/Resource;", "", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FetchPatientListUsecase {
    private final com.bss.uis.domain.repository.Repository repository = null;
    
    @javax.inject.Inject()
    public FetchPatientListUsecase(@org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList>>>> continuation) {
        return null;
    }
}