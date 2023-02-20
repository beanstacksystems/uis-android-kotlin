package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u008c\u0001\u001a\u00020AH\u0016J\u0012\u0010\u008d\u0001\u001a\u00020\u00042\u0007\u0010\u008e\u0001\u001a\u00020AH\u0002J\n\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0002J\n\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002J\u0014\u0010\u0092\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0002J\u0014\u0010\u0095\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0003J\u0014\u0010\u0096\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0003J\u0014\u0010\u0097\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0003J\u0014\u0010\u0098\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0003J\u0014\u0010\u0099\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0002J\n\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0016J\u0011\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009d\u0001\u001a\u00020AJ(\u0010\u009e\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00042\u0007\u0010\u00a0\u0001\u001a\u00020\u00042\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u00a1\u0001H\u0017J\u0014\u0010\u00a2\u0001\u001a\u00030\u0090\u00012\b\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u0016J.\u0010\u00a5\u0001\u001a\u0005\u0018\u00010\u0094\u00012\b\u0010\u00a6\u0001\u001a\u00030\u00a7\u00012\n\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00a9\u00012\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00ab\u0001H\u0016J\n\u0010\u00ac\u0001\u001a\u00030\u0090\u0001H\u0016J\t\u0010\u00ad\u0001\u001a\u00020]H\u0002J\b\u0010\u00ae\u0001\u001a\u00030\u0090\u0001J\b\u0010\u00af\u0001\u001a\u00030\u0090\u0001J\n\u0010\u00b0\u0001\u001a\u00030\u0090\u0001H\u0002J\n\u0010\u00b1\u0001\u001a\u00030\u0090\u0001H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001a\u0010(\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u00104\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001a\u00107\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001a\u0010:\u001a\u00020;X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0019\"\u0004\bN\u0010\u001bR\u001a\u0010O\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010!R\u000e\u0010R\u001a\u00020SX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\u000e\u0010W\u001a\u00020SX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010X\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020]X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0019\"\u0004\bd\u0010\u001bR\u001a\u0010e\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u001f\"\u0004\bg\u0010!R\u001a\u0010h\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0019\"\u0004\bj\u0010\u001bR\u001a\u0010k\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u001f\"\u0004\bm\u0010!R\u001a\u0010n\u001a\u00020oX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0019\"\u0004\bv\u0010\u001bR\u001a\u0010w\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u001f\"\u0004\by\u0010!R\u001a\u0010z\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u0019\"\u0004\b|\u0010\u001bR\u001a\u0010}\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u001f\"\u0004\b\u007f\u0010!R \u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001d\u0010\u0086\u0001\u001a\u00020\u0017X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u0019\"\u0005\b\u0088\u0001\u0010\u001bR\u001d\u0010\u0089\u0001\u001a\u00020\u001dX\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u001f\"\u0005\b\u008b\u0001\u0010!\u00a8\u0006\u00b2\u0001"}, d2 = {"Lcom/bss/uis/presentation/fragment/PersonalDetailsFragment;", "Lcom/bss/uis/presentation/fragment/BaseFragment;", "()V", "ID_PICK_IMAGE_REQUEST", "", "getID_PICK_IMAGE_REQUEST", "()I", "ID_REQUEST_IMAGE_CAPTURE", "getID_REQUEST_IMAGE_CAPTURE", "PICK_IMAGE_REQUEST", "getPICK_IMAGE_REQUEST", "REQUEST_IMAGE_CAPTURE", "getREQUEST_IMAGE_CAPTURE", "btnBackApp", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnBackApp", "()Landroidx/appcompat/widget/AppCompatButton;", "setBtnBackApp", "(Landroidx/appcompat/widget/AppCompatButton;)V", "btnNext", "getBtnNext", "setBtnNext", "contact", "Lcom/google/android/material/textfield/TextInputEditText;", "getContact", "()Lcom/google/android/material/textfield/TextInputEditText;", "setContact", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "contactInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getContactInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setContactInputLayout", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "dob", "getDob", "setDob", "dobInputLayout", "getDobInputLayout", "setDobInputLayout", "eMailInputLayout", "getEMailInputLayout", "setEMailInputLayout", "editImage", "Landroid/widget/ImageView;", "getEditImage", "()Landroid/widget/ImageView;", "setEditImage", "(Landroid/widget/ImageView;)V", "email", "getEmail", "setEmail", "gender", "getGender", "setGender", "genderLayout", "getGenderLayout", "setGenderLayout", "id_proof_layout", "Landroid/widget/LinearLayout;", "getId_proof_layout", "()Landroid/widget/LinearLayout;", "setId_proof_layout", "(Landroid/widget/LinearLayout;)V", "imagePath", "", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "imageUri", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "income", "getIncome", "setIncome", "incomeInputLayout", "getIncomeInputLayout", "setIncomeInputLayout", "ioScOPe", "Lkotlinx/coroutines/CoroutineScope;", "iv_idProof", "getIv_idProof", "setIv_idProof", "mainScope", "masterid", "getMasterid", "setMasterid", "(I)V", "myData", "Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "getMyData", "()Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "setMyData", "(Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;)V", "name", "getName", "setName", "nameInputLayout", "getNameInputLayout", "setNameInputLayout", "occupation", "getOccupation", "setOccupation", "occupationLayout", "getOccupationLayout", "setOccupationLayout", "onStepChangeListener", "Lcom/bss/uis/presentation/OnStepChangeListner;", "getOnStepChangeListener", "()Lcom/bss/uis/presentation/OnStepChangeListner;", "setOnStepChangeListener", "(Lcom/bss/uis/presentation/OnStepChangeListner;)V", "panadhar", "getPanadhar", "setPanadhar", "panadhartxtLayout", "getPanadhartxtLayout", "setPanadhartxtLayout", "panadharval", "getPanadharval", "setPanadharval", "panadharvaltextlayout", "getPanadharvaltextlayout", "setPanadharvaltextlayout", "profileImage", "Lde/hdodenhof/circleimageview/CircleImageView;", "getProfileImage", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setProfileImage", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "salutation", "getSalutation", "setSalutation", "salutationLayout", "getSalutationLayout", "setSalutationLayout", "fragmentName", "getmasterId", "dataS", "imagePick", "", "imagePickID", "initDOB", "fragmentView", "Landroid/view/View;", "initGenderView", "initOccupationView", "initPanAdharView", "initSalutationView", "initView", "isValidDetails", "", "mailPartern", "data", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "patientRegistartionDto", "selectImage", "selectImageID", "takePicture", "takePictureID", "app_debug"})
public final class PersonalDetailsFragment extends com.bss.uis.presentation.fragment.BaseFragment {
    public com.google.android.material.textfield.TextInputEditText name;
    public androidx.appcompat.widget.AppCompatButton btnNext;
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
    private final int PICK_IMAGE_REQUEST = 1111;
    private final int REQUEST_IMAGE_CAPTURE = 2222;
    private final int ID_PICK_IMAGE_REQUEST = 3333;
    private final int ID_REQUEST_IMAGE_CAPTURE = 4444;
    public android.widget.LinearLayout id_proof_layout;
    public android.widget.ImageView iv_idProof;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imagePath;
    public com.bss.uis.presentation.OnStepChangeListner onStepChangeListener;
    private final kotlinx.coroutines.CoroutineScope ioScOPe = null;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private int masterid = 1;
    public android.net.Uri imageUri;
    @org.jetbrains.annotations.NotNull()
    private com.bss.uis.data.remote.dto.request.PersonlistRequest myData;
    
    public PersonalDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnNext() {
        return null;
    }
    
    public final void setBtnNext(@org.jetbrains.annotations.NotNull()
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
    
    public final int getPICK_IMAGE_REQUEST() {
        return 0;
    }
    
    public final int getREQUEST_IMAGE_CAPTURE() {
        return 0;
    }
    
    public final int getID_PICK_IMAGE_REQUEST() {
        return 0;
    }
    
    public final int getID_REQUEST_IMAGE_CAPTURE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getId_proof_layout() {
        return null;
    }
    
    public final void setId_proof_layout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getIv_idProof() {
        return null;
    }
    
    public final void setIv_idProof(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final void setImagePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.presentation.OnStepChangeListner getOnStepChangeListener() {
        return null;
    }
    
    public final void setOnStepChangeListener(@org.jetbrains.annotations.NotNull()
    com.bss.uis.presentation.OnStepChangeListner p0) {
    }
    
    public final int getMasterid() {
        return 0;
    }
    
    public final void setMasterid(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getImageUri() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.PersonlistRequest getMyData() {
        return null;
    }
    
    public final void setMyData(@org.jetbrains.annotations.NotNull()
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
    
    private final int getmasterId(java.lang.String dataS) {
        return 0;
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
    
    @java.lang.Override()
    public boolean isValidDetails() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String fragmentName() {
        return null;
    }
    
    public final boolean mailPartern(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return false;
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void selectImage() {
    }
    
    public final void selectImageID() {
    }
    
    private final void takePicture() {
    }
    
    private final void takePictureID() {
    }
    
    private final void imagePickID() {
    }
    
    private final void imagePick() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final com.bss.uis.data.remote.dto.request.PersonlistRequest patientRegistartionDto() {
        return null;
    }
}