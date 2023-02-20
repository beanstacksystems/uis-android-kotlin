package com.bss.uis.presentation.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002#$B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/bss/uis/presentation/activity/AddPatientActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/bss/uis/presentation/OnStepChangeListner;", "()V", "btnBack", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnBack", "()Landroidx/appcompat/widget/AppCompatButton;", "setBtnBack", "(Landroidx/appcompat/widget/AppCompatButton;)V", "btnNext", "getBtnNext", "setBtnNext", "listener", "Lcom/bss/uis/presentation/activity/AddPatientActivity$OnButtonClickListener;", "stepView", "Lcom/bss/uis/StepViewRegistration;", "getStepView", "()Lcom/bss/uis/StepViewRegistration;", "setStepView", "(Lcom/bss/uis/StepViewRegistration;)V", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "setToolbar", "(Lcom/google/android/material/appbar/MaterialToolbar;)V", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onstepChange", "step", "", "Companion", "OnButtonClickListener", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddPatientActivity extends androidx.appcompat.app.AppCompatActivity implements com.bss.uis.presentation.OnStepChangeListner {
    public com.google.android.material.appbar.MaterialToolbar toolbar;
    public androidx.appcompat.widget.AppCompatButton btnNext;
    public androidx.appcompat.widget.AppCompatButton btnBack;
    public com.bss.uis.StepViewRegistration stepView;
    private final com.bss.uis.presentation.activity.AddPatientActivity.OnButtonClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bss.uis.presentation.activity.AddPatientActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String fragmentName = "";
    private static boolean isValidate = false;
    
    public AddPatientActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.appbar.MaterialToolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.MaterialToolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnNext() {
        return null;
    }
    
    public final void setBtnNext(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatButton getBtnBack() {
        return null;
    }
    
    public final void setBtnBack(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.StepViewRegistration getStepView() {
        return null;
    }
    
    public final void setStepView(@org.jetbrains.annotations.NotNull()
    com.bss.uis.StepViewRegistration p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onstepChange(int step) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/bss/uis/presentation/activity/AddPatientActivity$OnButtonClickListener;", "", "onButtonClick", "", "app_debug"})
    public static abstract interface OnButtonClickListener {
        
        public abstract void onButtonClick();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/bss/uis/presentation/activity/AddPatientActivity$Companion;", "", "()V", "fragmentName", "", "getFragmentName", "()Ljava/lang/String;", "setFragmentName", "(Ljava/lang/String;)V", "isValidate", "", "()Z", "setValidate", "(Z)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFragmentName() {
            return null;
        }
        
        public final void setFragmentName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final boolean isValidate() {
            return false;
        }
        
        public final void setValidate(boolean p0) {
        }
    }
}