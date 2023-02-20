package com.bss.uis.biometric;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J*\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003H&J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H&\u00a8\u0006\u0019"}, d2 = {"Lcom/bss/uis/biometric/CryptographyManager;", "", "decryptData", "", "ciphertext", "", "cipher", "Ljavax/crypto/Cipher;", "encryptData", "Lcom/bss/uis/biometric/CiphertextWrapper;", "plaintext", "getCiphertextWrapperFromSharedPrefs", "context", "Landroid/content/Context;", "filename", "mode", "", "prefKey", "getInitializedCipherForDecryption", "keyName", "initializationVector", "getInitializedCipherForEncryption", "persistCiphertextWrapperToSharedPrefs", "", "ciphertextWrapper", "app_debug"})
public abstract interface CryptographyManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract javax.crypto.Cipher getInitializedCipherForEncryption(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract javax.crypto.Cipher getInitializedCipherForDecryption(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName, @org.jetbrains.annotations.NotNull()
    byte[] initializationVector);
    
    /**
     * The Cipher created with [getInitializedCipherForEncryption] is used here
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.bss.uis.biometric.CiphertextWrapper encryptData(@org.jetbrains.annotations.NotNull()
    java.lang.String plaintext, @org.jetbrains.annotations.NotNull()
    javax.crypto.Cipher cipher);
    
    /**
     * The Cipher created with [getInitializedCipherForDecryption] is used here
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String decryptData(@org.jetbrains.annotations.NotNull()
    byte[] ciphertext, @org.jetbrains.annotations.NotNull()
    javax.crypto.Cipher cipher);
    
    public abstract void persistCiphertextWrapperToSharedPrefs(@org.jetbrains.annotations.NotNull()
    com.bss.uis.biometric.CiphertextWrapper ciphertextWrapper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, int mode, @org.jetbrains.annotations.NotNull()
    java.lang.String prefKey);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.bss.uis.biometric.CiphertextWrapper getCiphertextWrapperFromSharedPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, int mode, @org.jetbrains.annotations.NotNull()
    java.lang.String prefKey);
}