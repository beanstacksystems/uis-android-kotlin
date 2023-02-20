package com.bss.uis.biometric;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/bss/uis/biometric/BiometricPromptUtils;", "", "()V", "TAG", "", "createBiometricPrompt", "Landroidx/biometric/BiometricPrompt;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "processSuccess", "Lkotlin/Function1;", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "", "createPromptInfo", "Landroidx/biometric/BiometricPrompt$PromptInfo;", "isFingerprintAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
public final class BiometricPromptUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.bss.uis.biometric.BiometricPromptUtils INSTANCE = null;
    private static final java.lang.String TAG = "BiometricPromptUtils";
    
    private BiometricPromptUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.biometric.BiometricPrompt createBiometricPrompt(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit> processSuccess) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.biometric.BiometricPrompt.PromptInfo createPromptInfo(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    public final boolean isFingerprintAvailable(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
}