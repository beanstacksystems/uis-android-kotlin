package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010E\u001a\u00020%H\u0016J\u0010\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020%H\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0003J\u0010\u0010L\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0003J\u0010\u0010M\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010N\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020I2\u0006\u0010R\u001a\u00020SH\u0016J&\u0010T\u001a\u0004\u0018\u00010K2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010[\u001a\u00020IH\u0016J\b\u0010\\\u001a\u00020IH\u0002J\b\u0010]\u001a\u00020^H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u00a8\u0006_"}, d2 = {"Lcom/bss/uis/presentation/fragment/MedicalDetailsFragment;", "Lcom/bss/uis/presentation/fragment/BaseFragment;", "()V", "bloodGrp", "Lcom/google/android/material/textfield/TextInputEditText;", "getBloodGrp", "()Lcom/google/android/material/textfield/TextInputEditText;", "setBloodGrp", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "bloodGrpInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getBloodGrpInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setBloodGrpInputLayout", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "btnNxt", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnNxt", "()Landroidx/appcompat/widget/AppCompatButton;", "setBtnNxt", "(Landroidx/appcompat/widget/AppCompatButton;)V", "btnback", "getBtnback", "setBtnback", "cancerType", "getCancerType", "setCancerType", "cancerTypeInputLayout", "getCancerTypeInputLayout", "setCancerTypeInputLayout", "dateOfIdentification", "getDateOfIdentification", "setDateOfIdentification", "dateOfIdentificationInputLayout", "getDateOfIdentificationInputLayout", "setDateOfIdentificationInputLayout", "fragmentTitle", "", "getFragmentTitle", "()Ljava/lang/String;", "setFragmentTitle", "(Ljava/lang/String;)V", "ioScOPe", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "masterid", "", "getMasterid", "()I", "setMasterid", "(I)V", "onStepChangeListener", "Lcom/bss/uis/presentation/OnStepChangeListner;", "getOnStepChangeListener", "()Lcom/bss/uis/presentation/OnStepChangeListner;", "setOnStepChangeListener", "(Lcom/bss/uis/presentation/OnStepChangeListner;)V", "otherdiseasetxt", "getOtherdiseasetxt", "setOtherdiseasetxt", "otherdiseasetxtInputLayout", "getOtherdiseasetxtInputLayout", "setOtherdiseasetxtInputLayout", "personlistRequest", "Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "getPersonlistRequest", "()Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "setPersonlistRequest", "(Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;)V", "fragmentName", "getmasterId", "dataS", "initBloodGroupView", "", "fragmentView", "Landroid/view/View;", "initCancerTypeView", "initDateOfIdentification", "initView", "isValidDetails", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "otherCancerBox", "requestBodyForPatientRegistartion", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "app_debug"})
public final class MedicalDetailsFragment extends com.bss.uis.presentation.fragment.BaseFragment {
    public com.bss.uis.presentation.OnStepChangeListner onStepChangeListener;
    public com.google.android.material.textfield.TextInputEditText cancerType;
    public com.google.android.material.textfield.TextInputEditText dateOfIdentification;
    public com.google.android.material.textfield.TextInputEditText otherdiseasetxt;
    public com.google.android.material.textfield.TextInputEditText bloodGrp;
    public com.google.android.material.textfield.TextInputLayout cancerTypeInputLayout;
    public com.google.android.material.textfield.TextInputLayout dateOfIdentificationInputLayout;
    public com.google.android.material.textfield.TextInputLayout otherdiseasetxtInputLayout;
    public com.google.android.material.textfield.TextInputLayout bloodGrpInputLayout;
    public androidx.appcompat.widget.AppCompatButton btnNxt;
    public androidx.appcompat.widget.AppCompatButton btnback;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fragmentTitle;
    public com.bss.uis.data.remote.dto.request.PersonlistRequest personlistRequest;
    private int masterid = 1;
    private final kotlinx.coroutines.CoroutineScope ioScOPe = null;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    
    public MedicalDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.presentation.OnStepChangeListner getOnStepChangeListener() {
        return null;
    }
    
    public final void setOnStepChangeListener(@org.jetbrains.annotations.NotNull()
    com.bss.uis.presentation.OnStepChangeListner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getCancerType() {
        return null;
    }
    
    public final void setCancerType(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getDateOfIdentification() {
        return null;
    }
    
    public final void setDateOfIdentification(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getOtherdiseasetxt() {
        return null;
    }
    
    public final void setOtherdiseasetxt(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getBloodGrp() {
        return null;
    }
    
    public final void setBloodGrp(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getCancerTypeInputLayout() {
        return null;
    }
    
    public final void setCancerTypeInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getDateOfIdentificationInputLayout() {
        return null;
    }
    
    public final void setDateOfIdentificationInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getOtherdiseasetxtInputLayout() {
        return null;
    }
    
    public final void setOtherdiseasetxtInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getBloodGrpInputLayout() {
        return null;
    }
    
    public final void setBloodGrpInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFragmentTitle() {
        return null;
    }
    
    public final void setFragmentTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.PersonlistRequest getPersonlistRequest() {
        return null;
    }
    
    public final void setPersonlistRequest(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.PersonlistRequest p0) {
    }
    
    public final int getMasterid() {
        return 0;
    }
    
    public final void setMasterid(int p0) {
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
    
    private final void initDateOfIdentification(android.view.View fragmentView) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void initCancerTypeView(android.view.View fragmentView) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void initBloodGroupView(android.view.View fragmentView) {
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
    
    private final void otherCancerBox() {
    }
    
    private final com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest requestBodyForPatientRegistartion() {
        return null;
    }
    
    private final int getmasterId(java.lang.String dataS) {
        return 0;
    }
}