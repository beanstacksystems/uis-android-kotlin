package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010y\u001a\u00020zH\u0002J\u0011\u0010{\u001a\u00020zH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010|J\u0006\u0010}\u001a\u00020zJ\b\u0010~\u001a\u00020\u007fH\u0016J\t\u0010\u0080\u0001\u001a\u00020zH\u0002J\u0013\u0010\u0081\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u0013\u0010\u0084\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0003J\u0013\u0010\u0085\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0003J\u0013\u0010\u0086\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0003J\u0013\u0010\u0087\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0003J\u0013\u0010\u0088\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\n\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\u0011\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u007fJ\'\u0010\u008d\u0001\u001a\u00020z2\u0007\u0010\u008e\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00042\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016J\u0013\u0010\u0091\u0001\u001a\u00020z2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0016J.\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0083\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0016J\t\u0010\u009b\u0001\u001a\u00020zH\u0016J\u0013\u0010\u009c\u0001\u001a\u00020z2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u001d\u0010\u009d\u0001\u001a\u00020z2\b\u0010\u008c\u0001\u001a\u00030\u009e\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u009f\u0001J\u0007\u0010\u00a0\u0001\u001a\u00020zJ\t\u0010\u00a1\u0001\u001a\u00020zH\u0002J\t\u0010\u00a2\u0001\u001a\u00020zH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001a\u0010#\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001b\"\u0004\b(\u0010\u001dR\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u00102\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R\u001a\u00105\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\u001a\u00108\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u0010\u0017R\u001a\u0010;\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010\u001dR\u000e\u0010>\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u0010\u0017R\u001a\u0010D\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001b\"\u0004\bF\u0010\u001dR\u001a\u0010G\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u0010\u0017R\u001a\u0010J\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001b\"\u0004\bL\u0010\u001dR\u001a\u0010M\u001a\u00020NX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0015\"\u0004\bU\u0010\u0017R\u001a\u0010V\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001b\"\u0004\bX\u0010\u001dR\u001a\u0010Y\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0015\"\u0004\b[\u0010\u0017R\u001a\u0010\\\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u001b\"\u0004\b^\u0010\u001dR\u001a\u0010_\u001a\u00020`X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u001b\"\u0004\bg\u0010\u001dR\u001a\u0010h\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0015\"\u0004\bj\u0010\u0017R\u001a\u0010k\u001a\u00020lX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u0015\"\u0004\bs\u0010\u0017R\u001a\u0010t\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u001b\"\u0004\bv\u0010\u001dR\u000e\u0010w\u001a\u00020xX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00a3\u0001"}, d2 = {"Lcom/bss/uis/presentation/fragment/AttendantDetailsFragment;", "Lcom/bss/uis/presentation/fragment/BaseFragment;", "()V", "PICK_IMAGE_REQUEST", "", "getPICK_IMAGE_REQUEST", "()I", "REQUEST_IMAGE_CAPTURE", "getREQUEST_IMAGE_CAPTURE", "btnBackApp", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnBackApp", "()Landroidx/appcompat/widget/AppCompatButton;", "setBtnBackApp", "(Landroidx/appcompat/widget/AppCompatButton;)V", "btnSubmit", "getBtnSubmit", "setBtnSubmit", "contact", "Lcom/google/android/material/textfield/TextInputEditText;", "getContact", "()Lcom/google/android/material/textfield/TextInputEditText;", "setContact", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "contactInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getContactInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setContactInputLayout", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "dialog", "Landroid/app/Dialog;", "dob", "getDob", "setDob", "dobInputLayout", "getDobInputLayout", "setDobInputLayout", "eMailInputLayout", "getEMailInputLayout", "setEMailInputLayout", "editImage", "Landroid/widget/ImageView;", "getEditImage", "()Landroid/widget/ImageView;", "setEditImage", "(Landroid/widget/ImageView;)V", "email", "getEmail", "setEmail", "gender", "getGender", "setGender", "genderLayout", "getGenderLayout", "setGenderLayout", "income", "getIncome", "setIncome", "incomeInputLayout", "getIncomeInputLayout", "setIncomeInputLayout", "ioScOPe", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "name", "getName", "setName", "nameInputLayout", "getNameInputLayout", "setNameInputLayout", "occupation", "getOccupation", "setOccupation", "occupationLayout", "getOccupationLayout", "setOccupationLayout", "onStepChangeListener", "Lcom/bss/uis/presentation/OnStepChangeListner;", "getOnStepChangeListener", "()Lcom/bss/uis/presentation/OnStepChangeListner;", "setOnStepChangeListener", "(Lcom/bss/uis/presentation/OnStepChangeListner;)V", "panadhar", "getPanadhar", "setPanadhar", "panadhartxtLayout", "getPanadhartxtLayout", "setPanadhartxtLayout", "panadharval", "getPanadharval", "setPanadharval", "panadharvaltextlayout", "getPanadharvaltextlayout", "setPanadharvaltextlayout", "profileImage", "Lde/hdodenhof/circleimageview/CircleImageView;", "getProfileImage", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setProfileImage", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "relationshipLayout", "getRelationshipLayout", "setRelationshipLayout", "relationshipet", "getRelationshipet", "setRelationshipet", "requestBody", "Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "getRequestBody", "()Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "setRequestBody", "(Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;)V", "salutation", "getSalutation", "setSalutation", "salutationLayout", "getSalutationLayout", "setSalutationLayout", "viewModelUIS", "Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "dataObserver", "", "deletePatientDAta", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dialogDismiss", "fragmentName", "", "imagePick", "initDOB", "fragmentView", "Landroid/view/View;", "initGenderView", "initOccupationView", "initPanAdharView", "initSalutationView", "initView", "isValidDetails", "", "mailPartern", "data", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "relationShipView", "savePatientData", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "(Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectImage", "showLoader", "takePicture", "app_debug"})
public final class AttendantDetailsFragment extends com.bss.uis.presentation.fragment.BaseFragment {
    public com.bss.uis.presentation.OnStepChangeListner onStepChangeListener;
    public com.google.android.material.textfield.TextInputEditText name;
    public androidx.appcompat.widget.AppCompatButton btnSubmit;
    public androidx.appcompat.widget.AppCompatButton btnBackApp;
    public com.google.android.material.textfield.TextInputEditText email;
    public com.google.android.material.textfield.TextInputEditText contact;
    public com.google.android.material.textfield.TextInputEditText dob;
    public com.google.android.material.textfield.TextInputEditText panadhar;
    public com.google.android.material.textfield.TextInputEditText panadharval;
    public com.google.android.material.textfield.TextInputEditText income;
    public com.google.android.material.textfield.TextInputEditText gender;
    public com.google.android.material.textfield.TextInputEditText salutation;
    public com.google.android.material.textfield.TextInputEditText occupation;
    public com.google.android.material.textfield.TextInputLayout nameInputLayout;
    public com.google.android.material.textfield.TextInputLayout eMailInputLayout;
    public com.google.android.material.textfield.TextInputLayout contactInputLayout;
    public com.google.android.material.textfield.TextInputLayout incomeInputLayout;
    public com.google.android.material.textfield.TextInputLayout dobInputLayout;
    public com.google.android.material.textfield.TextInputLayout genderLayout;
    public com.google.android.material.textfield.TextInputLayout salutationLayout;
    public com.google.android.material.textfield.TextInputLayout occupationLayout;
    public com.google.android.material.textfield.TextInputLayout panadhartxtLayout;
    public com.google.android.material.textfield.TextInputLayout panadharvaltextlayout;
    public de.hdodenhof.circleimageview.CircleImageView profileImage;
    public android.widget.ImageView editImage;
    public com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest requestBody;
    private com.bss.uis.presentation.viewmodel.ViewModelUIS viewModelUIS;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlinx.coroutines.CoroutineScope ioScOPe = null;
    private android.app.Dialog dialog;
    private final int PICK_IMAGE_REQUEST = 1112;
    private final int REQUEST_IMAGE_CAPTURE = 2223;
    public com.google.android.material.textfield.TextInputEditText relationshipet;
    public com.google.android.material.textfield.TextInputLayout relationshipLayout;
    
    public AttendantDetailsFragment() {
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
    public final com.google.android.material.textfield.TextInputEditText getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnSubmit() {
        return null;
    }
    
    public final void setBtnSubmit(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnBackApp() {
        return null;
    }
    
    public final void setBtnBackApp(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getDob() {
        return null;
    }
    
    public final void setDob(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getPanadhar() {
        return null;
    }
    
    public final void setPanadhar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getPanadharval() {
        return null;
    }
    
    public final void setPanadharval(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getIncome() {
        return null;
    }
    
    public final void setIncome(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getSalutation() {
        return null;
    }
    
    public final void setSalutation(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getOccupation() {
        return null;
    }
    
    public final void setOccupation(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getNameInputLayout() {
        return null;
    }
    
    public final void setNameInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getEMailInputLayout() {
        return null;
    }
    
    public final void setEMailInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getContactInputLayout() {
        return null;
    }
    
    public final void setContactInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getIncomeInputLayout() {
        return null;
    }
    
    public final void setIncomeInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getDobInputLayout() {
        return null;
    }
    
    public final void setDobInputLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getGenderLayout() {
        return null;
    }
    
    public final void setGenderLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getSalutationLayout() {
        return null;
    }
    
    public final void setSalutationLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getOccupationLayout() {
        return null;
    }
    
    public final void setOccupationLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPanadhartxtLayout() {
        return null;
    }
    
    public final void setPanadhartxtLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPanadharvaltextlayout() {
        return null;
    }
    
    public final void setPanadharvaltextlayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getProfileImage() {
        return null;
    }
    
    public final void setProfileImage(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getEditImage() {
        return null;
    }
    
    public final void setEditImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest getRequestBody() {
        return null;
    }
    
    public final void setRequestBody(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest p0) {
    }
    
    public final int getPICK_IMAGE_REQUEST() {
        return 0;
    }
    
    public final int getREQUEST_IMAGE_CAPTURE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getRelationshipet() {
        return null;
    }
    
    public final void setRelationshipet(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getRelationshipLayout() {
        return null;
    }
    
    public final void setRelationshipLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final void initView(android.view.View fragmentView) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final void dataObserver() {
    }
    
    private final java.lang.Object savePatientData(com.bss.uis.data.remote.dto.response.PatientRegistrationResReq data, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object deletePatientDAta(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
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
    
    private final void initDOB(android.view.View fragmentView) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void initPanAdharView(android.view.View fragmentView) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void initGenderView(android.view.View fragmentView) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void initSalutationView(android.view.View fragmentView) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void initOccupationView(android.view.View fragmentView) {
    }
    
    public final boolean mailPartern(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return false;
    }
    
    public final void selectImage() {
    }
    
    private final void imagePick() {
    }
    
    private final void takePicture() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void showLoader() {
    }
    
    public final void dialogDismiss() {
    }
    
    private final void relationShipView(android.view.View fragmentView) {
    }
}