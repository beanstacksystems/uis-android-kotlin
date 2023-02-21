package com.bss.uis.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J6\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u001a"}, d2 = {"Lcom/bss/uis/util/ContextPreferenceManager;", "", "()V", "clearLoginInfo", "", "context", "Landroid/content/Context;", "clearSocialLogin", "logintype", "", "getLoginToken", "getToken", "key", "isUserLogedOut", "", "saveLoginDetails", "accesstoken", "refreshtoken", "expiry", "saveUserRoll", "rollid", "", "saveUsername", "username", "email", "saveuserIf", "app_debug"})
public final class ContextPreferenceManager {
    
    public ContextPreferenceManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void saveLoginDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String accesstoken, @org.jetbrains.annotations.Nullable()
    java.lang.String refreshtoken, @org.jetbrains.annotations.Nullable()
    java.lang.String logintype, @org.jetbrains.annotations.Nullable()
    java.lang.String expiry, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLoginToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void clearLoginInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isUserLogedOut(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void clearSocialLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String logintype, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void saveUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void saveUserRoll(int rollid, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void saveuserIf(int rollid, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}