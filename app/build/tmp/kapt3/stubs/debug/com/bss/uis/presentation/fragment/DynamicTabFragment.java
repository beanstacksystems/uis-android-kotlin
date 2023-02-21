package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019\u00a8\u0006+"}, d2 = {"Lcom/bss/uis/presentation/fragment/DynamicTabFragment;", "Landroidx/fragment/app/Fragment;", "()V", "customLayoutId", "", "getCustomLayoutId", "()I", "setCustomLayoutId", "(I)V", "isCustomLayoutNeeded", "", "()Z", "setCustomLayoutNeeded", "(Z)V", "tabBody", "Landroid/widget/LinearLayout;", "getTabBody", "()Landroid/widget/LinearLayout;", "setTabBody", "(Landroid/widget/LinearLayout;)V", "tabData", "", "getTabData", "()Ljava/lang/String;", "setTabData", "(Ljava/lang/String;)V", "tabDescription", "getTabDescription", "setTabDescription", "tabTitle", "getTabTitle", "setTabTitle", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
public final class DynamicTabFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tabTitle;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tabData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tabDescription;
    @org.jetbrains.annotations.Nullable()
    private android.widget.LinearLayout tabBody;
    private boolean isCustomLayoutNeeded = false;
    private int customLayoutId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.bss.uis.presentation.fragment.DynamicTabFragment.Companion Companion = null;
    
    public DynamicTabFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabTitle() {
        return null;
    }
    
    public final void setTabTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabData() {
        return null;
    }
    
    public final void setTabData(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabDescription() {
        return null;
    }
    
    public final void setTabDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.LinearLayout getTabBody() {
        return null;
    }
    
    public final void setTabBody(@org.jetbrains.annotations.Nullable()
    android.widget.LinearLayout p0) {
    }
    
    public final boolean isCustomLayoutNeeded() {
        return false;
    }
    
    public final void setCustomLayoutNeeded(boolean p0) {
    }
    
    public final int getCustomLayoutId() {
        return 0;
    }
    
    public final void setCustomLayoutId(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/bss/uis/presentation/fragment/DynamicTabFragment$Companion;", "", "()V", "newInstance", "Lcom/bss/uis/presentation/fragment/DynamicTabFragment;", "tabTitle", "", "tabData", "tabDescription", "isCustomLayoutNeeded", "", "customLayoutId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bss.uis.presentation.fragment.DynamicTabFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String tabTitle, @org.jetbrains.annotations.Nullable()
        java.lang.String tabData, @org.jetbrains.annotations.Nullable()
        java.lang.String tabDescription, boolean isCustomLayoutNeeded, int customLayoutId) {
            return null;
        }
    }
}