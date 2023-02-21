package com.bss.uis.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/bss/uis/util/UISApplicationContext;", "Landroid/app/Application;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "appConfigMap", "", "authResponse", "Lcom/bss/uis/domain/model/responsedomain/AuthResponseDomain;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "instance", "getInstance", "()Lcom/bss/uis/util/UISApplicationContext;", "setInstance", "(Lcom/bss/uis/util/UISApplicationContext;)V", "user", "Lcom/bss/uis/domain/model/responsedomain/UserApiResponseDomain;", "userCurrentRole", "", "userRightDataList", "", "Lcom/bss/uis/domain/model/responsedomain/UserRightResponseDomain;", "getInstance1", "onCreate", "", "app_debug"})
public final class UISApplicationContext extends android.app.Application {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable()
    private com.bss.uis.util.UISApplicationContext instance;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private final com.bss.uis.domain.model.responsedomain.AuthResponseDomain authResponse = null;
    private final com.bss.uis.domain.model.responsedomain.UserApiResponseDomain user = null;
    private final int userCurrentRole = 0;
    private final java.util.List<com.bss.uis.domain.model.responsedomain.UserRightResponseDomain> userRightDataList = null;
    private final java.util.Map<java.lang.String, java.lang.String> appConfigMap = null;
    
    public UISApplicationContext() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.util.UISApplicationContext getInstance() {
        return null;
    }
    
    public final void setInstance(@org.jetbrains.annotations.Nullable()
    com.bss.uis.util.UISApplicationContext p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmName(name = "getInstance1")
    public final com.bss.uis.util.UISApplicationContext getInstance1() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
}