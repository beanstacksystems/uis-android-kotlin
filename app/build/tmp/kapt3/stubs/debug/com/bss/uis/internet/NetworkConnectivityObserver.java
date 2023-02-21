package com.bss.uis.internet;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bss/uis/internet/NetworkConnectivityObserver;", "Lcom/bss/uis/internet/ConnectivityObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "observe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bss/uis/internet/ConnectivityObserver$Status;", "app_debug"})
public final class NetworkConnectivityObserver implements com.bss.uis.internet.ConnectivityObserver {
    private final android.content.Context context = null;
    private final android.net.ConnectivityManager connectivityManager = null;
    
    public NetworkConnectivityObserver(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.bss.uis.internet.ConnectivityObserver.Status> observe() {
        return null;
    }
}