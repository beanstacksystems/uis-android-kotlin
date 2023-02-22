package com.bss.uis.presentation.activity;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u0015J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0006\u0010\'\u001a\u00020\u001aJ\b\u0010(\u001a\u00020\u001aH\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0019\u0010+\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/bss/uis/presentation/activity/EditProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ID_PICK_IMAGE_REQUEST", "", "ID_REQUEST_IMAGE_CAPTURE", "PICK_IMAGE_REQUEST", "REQUEST_IMAGE_CAPTURE", "binding", "Lcom/bss/uis/databinding/ActivityEditProfileBinding;", "imageUri", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "isEditing", "", "viewModelUIS", "Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "getmasterId", "dataS", "", "context", "Landroid/content/Context;", "imagePick", "", "initDOB", "view", "initGenderView", "initSalutationView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "selectImage", "takePicture", "updateUserProfileDataRequest", "Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;", "updateUserorofile", "(Lcom/bss/uis/data/remote/dto/request/UpdateUserProfileDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EditProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    private final int PICK_IMAGE_REQUEST = 1111;
    private final int REQUEST_IMAGE_CAPTURE = 2222;
    private final int ID_PICK_IMAGE_REQUEST = 3333;
    private final int ID_REQUEST_IMAGE_CAPTURE = 4444;
    private com.bss.uis.presentation.viewmodel.ViewModelUIS viewModelUIS;
    private com.bss.uis.databinding.ActivityEditProfileBinding binding;
    private boolean isEditing = false;
    public android.net.Uri imageUri;
    
    public EditProfileActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getImageUri() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void selectImage() {
    }
    
    private final void takePicture() {
    }
    
    private final void imagePick(android.content.Context context) {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void initDOB(com.bss.uis.databinding.ActivityEditProfileBinding view, android.content.Context context) {
    }
    
    private final void initGenderView(com.bss.uis.databinding.ActivityEditProfileBinding view, android.content.Context context) {
    }
    
    private final void initSalutationView(com.bss.uis.databinding.ActivityEditProfileBinding view, android.content.Context context) {
    }
    
    private final com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest updateUserProfileDataRequest(com.bss.uis.databinding.ActivityEditProfileBinding view, android.content.Context context) {
        return null;
    }
    
    private final int getmasterId(java.lang.String dataS, android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    public final java.lang.Object updateUserorofile(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.UpdateUserProfileDataRequest updateUserProfileDataRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}