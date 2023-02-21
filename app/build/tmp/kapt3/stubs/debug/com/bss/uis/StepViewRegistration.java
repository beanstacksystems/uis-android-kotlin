package com.bss.uis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00101\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-\u00a8\u00068"}, d2 = {"Lcom/bss/uis/StepViewRegistration;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributes", "Landroid/content/res/TypedArray;", "getAttributes", "()Landroid/content/res/TypedArray;", "setAttributes", "(Landroid/content/res/TypedArray;)V", "step1_tv", "Landroid/widget/TextView;", "getStep1_tv", "()Landroid/widget/TextView;", "setStep1_tv", "(Landroid/widget/TextView;)V", "step1_tv_details", "getStep1_tv_details", "setStep1_tv_details", "step2_tv", "getStep2_tv", "setStep2_tv", "step2_tv_details", "getStep2_tv_details", "setStep2_tv_details", "step3_tv", "getStep3_tv", "setStep3_tv", "step3_tv_details", "getStep3_tv_details", "setStep3_tv_details", "step4_tv", "getStep4_tv", "setStep4_tv", "step4_tv_details", "getStep4_tv_details", "setStep4_tv_details", "step_1_2_connector", "Landroid/view/View;", "getStep_1_2_connector", "()Landroid/view/View;", "setStep_1_2_connector", "(Landroid/view/View;)V", "step_2_3_connector", "getStep_2_3_connector", "setStep_2_3_connector", "step_3_4_connector", "getStep_3_4_connector", "setStep_3_4_connector", "goToStep", "", "stepNo", "", "app_debug"})
public final class StepViewRegistration extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private android.content.res.TypedArray attributes;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step1_tv;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step2_tv;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step3_tv;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step4_tv;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step1_tv_details;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step2_tv_details;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step3_tv_details;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView step4_tv_details;
    @org.jetbrains.annotations.NotNull()
    private android.view.View step_1_2_connector;
    @org.jetbrains.annotations.NotNull()
    private android.view.View step_2_3_connector;
    @org.jetbrains.annotations.NotNull()
    private android.view.View step_3_4_connector;
    
    public StepViewRegistration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.TypedArray getAttributes() {
        return null;
    }
    
    public final void setAttributes(@org.jetbrains.annotations.NotNull()
    android.content.res.TypedArray p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep1_tv() {
        return null;
    }
    
    public final void setStep1_tv(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep2_tv() {
        return null;
    }
    
    public final void setStep2_tv(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep3_tv() {
        return null;
    }
    
    public final void setStep3_tv(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep4_tv() {
        return null;
    }
    
    public final void setStep4_tv(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep1_tv_details() {
        return null;
    }
    
    public final void setStep1_tv_details(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep2_tv_details() {
        return null;
    }
    
    public final void setStep2_tv_details(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep3_tv_details() {
        return null;
    }
    
    public final void setStep3_tv_details(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStep4_tv_details() {
        return null;
    }
    
    public final void setStep4_tv_details(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getStep_1_2_connector() {
        return null;
    }
    
    public final void setStep_1_2_connector(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getStep_2_3_connector() {
        return null;
    }
    
    public final void setStep_2_3_connector(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getStep_3_4_connector() {
        return null;
    }
    
    public final void setStep_3_4_connector(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    public final void goToStep(int stepNo) {
    }
}