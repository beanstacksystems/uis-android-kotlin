package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020BH\u0002J\b\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020B2\u0006\u0010L\u001a\u00020MH\u0016J&\u0010N\u001a\u0004\u0018\u00010H2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u00020BH\u0016J\u0019\u0010V\u001a\u00020B2\u0006\u0010-\u001a\u00020EH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010WR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u001a\u00103\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011R\u001a\u00106\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u001a\u00109\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R\u000e\u0010?\u001a\u00020@X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006X"}, d2 = {"Lcom/bss/uis/presentation/fragment/AddressDetailsFragment;", "Lcom/bss/uis/presentation/fragment/BaseFragment;", "()V", "btnNxt", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnNxt", "()Landroidx/appcompat/widget/AppCompatButton;", "setBtnNxt", "(Landroidx/appcompat/widget/AppCompatButton;)V", "btnback", "getBtnback", "setBtnback", "city", "Lcom/google/android/material/textfield/TextInputEditText;", "getCity", "()Lcom/google/android/material/textfield/TextInputEditText;", "setCity", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "cityInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getCityInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setCityInputLayout", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "dist", "getDist", "setDist", "distInputLayout", "getDistInputLayout", "setDistInputLayout", "ioScOPe", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "onStepChangeListener", "Lcom/bss/uis/presentation/OnStepChangeListner;", "getOnStepChangeListener", "()Lcom/bss/uis/presentation/OnStepChangeListner;", "setOnStepChangeListener", "(Lcom/bss/uis/presentation/OnStepChangeListner;)V", "personlistRequest", "Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "getPersonlistRequest", "()Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "setPersonlistRequest", "(Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;)V", "pin", "getPin", "setPin", "pinLayout", "getPinLayout", "setPinLayout", "state", "getState", "setState", "stateInputLayout", "getStateInputLayout", "setStateInputLayout", "streetAdd", "getStreetAdd", "setStreetAdd", "streetInputLayout", "getStreetInputLayout", "setStreetInputLayout", "viewModelUIS", "Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "createPinPopup", "", "dataobserver", "fragmentName", "", "initView", "fragmentView", "Landroid/view/View;", "isValidDetails", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "pincodeApiCall", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AddressDetailsFragment extends com.bss.uis.presentation.fragment.BaseFragment {
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlinx.coroutines.CoroutineScope ioScOPe = null;
    private com.bss.uis.presentation.viewmodel.ViewModelUIS viewModelUIS;
    public com.google.android.material.textfield.TextInputEditText streetAdd;
    public com.google.android.material.textfield.TextInputEditText city;
    public com.google.android.material.textfield.TextInputEditText dist;
    public com.google.android.material.textfield.TextInputEditText state;
    public com.google.android.material.textfield.TextInputEditText pin;
    public com.google.android.material.textfield.TextInputLayout streetInputLayout;
    public com.google.android.material.textfield.TextInputLayout cityInputLayout;
    public com.google.android.material.textfield.TextInputLayout distInputLayout;
    public com.google.android.material.textfield.TextInputLayout stateInputLayout;
    public com.google.android.material.textfield.TextInputLayout pinLayout;
    public com.bss.uis.presentation.OnStepChangeListner onStepChangeListener;
    public androidx.appcompat.widget.AppCompatButton btnNxt;
    public androidx.appcompat.widget.AppCompatButton btnback;
    public com.bss.uis.data.remote.dto.request.PersonlistRequest personlistRequest;
    
    public AddressDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getStreetAdd() {
        return null;
    }
    
    public final void setStreetAdd(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getDist() {
        return null;
    }
    
    public final void setDist(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getPin() {
        return null;
    }
    
    public final void setPin(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getStreetInputLayout() {
        return null;
    }
    
    public final void setStreetInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getCityInputLayout() {
        return null;
    }
    
    public final void setCityInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getDistInputLayout() {
        return null;
    }
    
    public final void setDistInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getStateInputLayout() {
        return null;
    }
    
    public final void setStateInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPinLayout() {
        return null;
    }
    
    public final void setPinLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.presentation.OnStepChangeListner getOnStepChangeListener() {
        return null;
    }
    
    public final void setOnStepChangeListener(@org.jetbrains.annotations.NotNull()
    com.bss.uis.presentation.OnStepChangeListner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnNxt() {
        return null;
    }
    
    public final void setBtnNxt(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnback() {
        return null;
    }
    
    public final void setBtnback(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.PersonlistRequest getPersonlistRequest() {
        return null;
    }
    
    public final void setPersonlistRequest(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.PersonlistRequest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView(android.view.View fragmentView) {
    }
    
    private final void createPinPopup() {
    }
    
    private final java.lang.Object pincodeApiCall(java.lang.String pin, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void dataobserver() {
    }
    
    @java.lang.Override()
    public boolean isValidDetails() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String fragmentName() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}