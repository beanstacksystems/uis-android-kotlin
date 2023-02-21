package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0011\u0010\u001d\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/bss/uis/presentation/fragment/ListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bss/uis/presentation/adapter/UserAdapter$OnItemClickListener;", "()V", "ioScOPe", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "patientlist", "", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "getPatientlist", "()Ljava/util/List;", "setPatientlist", "(Ljava/util/List;)V", "recyclerviewView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerviewView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerviewView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "userlist", "Lcom/bss/uis/data/remote/dto/response/FetchUserListResponse;", "getUserlist", "setUserlist", "viewModelUIS", "Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "getViewModelUIS$annotations", "dataObserver", "", "fetchuserList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "position", "", "onViewCreated", "view", "app_debug"})
public final class ListFragment extends androidx.fragment.app.Fragment implements com.bss.uis.presentation.adapter.UserAdapter.OnItemClickListener {
    public androidx.recyclerview.widget.RecyclerView recyclerviewView;
    private com.bss.uis.presentation.viewmodel.ViewModelUIS viewModelUIS;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlinx.coroutines.CoroutineScope ioScOPe = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse> userlist;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList> patientlist;
    
    public ListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerviewView() {
        return null;
    }
    
    public final void setRecyclerviewView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getViewModelUIS$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse> getUserlist() {
        return null;
    }
    
    public final void setUserlist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.data.remote.dto.response.FetchUserListResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList> getPatientlist() {
        return null;
    }
    
    public final void setPatientlist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.data.remote.dto.response.FetchPatientList> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    public final java.lang.Object fetchuserList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final void dataObserver() {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
}