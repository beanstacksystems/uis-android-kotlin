package com.bss.uis.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/bss/uis/domain/usecase/ApproveUserUseCase;", "", "repository", "Lcom/bss/uis/domain/repository/Repository;", "(Lcom/bss/uis/domain/repository/Repository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bss/uis/util/Resource;", "Lcom/bss/uis/data/remote/dto/response/ApproveUserResponse;", "token", "", "approveUserRequestBody", "Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;", "(Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ApproveUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApproveUserUseCase {
    private final com.bss.uis.domain.repository.Repository repository = null;
    
    @javax.inject.Inject()
    public ApproveUserUseCase(@org.jetbrains.annotations.NotNull()
    com.bss.uis.domain.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.ApproveUserRequestBody approveUserRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bss.uis.util.Resource<com.bss.uis.data.remote.dto.response.ApproveUserResponse>>> continuation) {
        return null;
    }
}