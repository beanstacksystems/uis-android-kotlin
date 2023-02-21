package com.bss.uis.biometric;

import java.lang.System;

/**
 * To get an instance of this private CryptographyManagerImpl class, use the top-level function
 * fun CryptographyManager(): CryptographyManager = CryptographyManagerImpl()
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0002J*\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J0\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/bss/uis/biometric/CryptographyManagerImpl;", "Lcom/bss/uis/biometric/CryptographyManager;", "()V", "ANDROID_KEYSTORE", "", "ENCRYPTION_ALGORITHM", "ENCRYPTION_BLOCK_MODE", "ENCRYPTION_PADDING", "KEY_SIZE", "", "decryptData", "ciphertext", "", "cipher", "Ljavax/crypto/Cipher;", "encryptData", "Lcom/bss/uis/biometric/CiphertextWrapper;", "plaintext", "getCipher", "getCiphertextWrapperFromSharedPrefs", "context", "Landroid/content/Context;", "filename", "mode", "prefKey", "getInitializedCipherForDecryption", "keyName", "initializationVector", "getInitializedCipherForEncryption", "getOrCreateSecretKey", "Ljavax/crypto/SecretKey;", "persistCiphertextWrapperToSharedPrefs", "", "ciphertextWrapper", "app_debug"})
final class CryptographyManagerImpl implements com.bss.uis.biometric.CryptographyManager {
    private final int KEY_SIZE = 256;
    private final java.lang.String ANDROID_KEYSTORE = "AndroidKeyStore";
    private final java.lang.String ENCRYPTION_BLOCK_MODE = "GCM";
    private final java.lang.String ENCRYPTION_PADDING = "NoPadding";
    private final java.lang.String ENCRYPTION_ALGORITHM = "AES";
    
    public CryptographyManagerImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public javax.crypto.Cipher getInitializedCipherForEncryption(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public javax.crypto.Cipher getInitializedCipherForDecryption(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName, @org.jetbrains.annotations.NotNull()
    byte[] initializationVector) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bss.uis.biometric.CiphertextWrapper encryptData(@org.jetbrains.annotations.NotNull()
    java.lang.String plaintext, @org.jetbrains.annotations.NotNull()
    javax.crypto.Cipher cipher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String decryptData(@org.jetbrains.annotations.NotNull()
    byte[] ciphertext, @org.jetbrains.annotations.NotNull()
    javax.crypto.Cipher cipher) {
        return null;
    }
    
    private final javax.crypto.Cipher getCipher() {
        return null;
    }
    
    private final javax.crypto.SecretKey getOrCreateSecretKey(java.lang.String keyName) {
        return null;
    }
    
    @java.lang.Override()
    public void persistCiphertextWrapperToSharedPrefs(@org.jetbrains.annotations.NotNull()
    com.bss.uis.biometric.CiphertextWrapper ciphertextWrapper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, int mode, @org.jetbrains.annotations.NotNull()
    java.lang.String prefKey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.bss.uis.biometric.CiphertextWrapper getCiphertextWrapperFromSharedPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, int mode, @org.jetbrains.annotations.NotNull()
    java.lang.String prefKey) {
        return null;
    }
}