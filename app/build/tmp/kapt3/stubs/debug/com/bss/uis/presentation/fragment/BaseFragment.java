package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/bss/uis/presentation/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "fragmentName", "", "isValidDetails", "", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    
    public BaseFragment() {
        super();
    }
    
    public abstract boolean isValidDetails();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String fragmentName();
}