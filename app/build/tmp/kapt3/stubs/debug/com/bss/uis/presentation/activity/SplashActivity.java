package com.bss.uis.presentation.activity;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020IH\u0002J\b\u0010K\u001a\u00020IH\u0002J\b\u0010L\u001a\u00020IH\u0002J\b\u0010M\u001a\u00020IH\u0002J\u0018\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0002J\u0012\u0010S\u001a\u00020I2\b\u0010T\u001a\u0004\u0018\u00010UH\u0014J\u0011\u0010V\u001a\u00020IH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010WJ\b\u0010X\u001a\u00020IH\u0002J\u0010\u0010Y\u001a\u00020I2\u0006\u0010Z\u001a\u00020RH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010#\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001a\u0010&\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u001a\u00108\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\u001a\u0010;\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00102\"\u0004\b=\u00104R\u001a\u0010>\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00102\"\u0004\b@\u00104R\u001a\u0010A\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u00102\"\u0004\bC\u00104R\u000e\u0010D\u001a\u00020EX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006["}, d2 = {"Lcom/bss/uis/presentation/activity/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "connectionSate", "Landroid/widget/TextView;", "getConnectionSate", "()Landroid/widget/TextView;", "setConnectionSate", "(Landroid/widget/TextView;)V", "connectivityObserver", "Lcom/bss/uis/internet/ConnectivityObserver;", "loadingDialog", "Landroid/app/Dialog;", "loadingText", "logoFromLeftbottom", "Landroid/view/animation/Animation;", "getLogoFromLeftbottom", "()Landroid/view/animation/Animation;", "setLogoFromLeftbottom", "(Landroid/view/animation/Animation;)V", "logoFromRightTop", "getLogoFromRightTop", "setLogoFromRightTop", "logoFromRightbottom", "getLogoFromRightbottom", "setLogoFromRightbottom", "logoFromTop", "getLogoFromTop", "setLogoFromTop", "logoFrombottom", "getLogoFrombottom", "setLogoFrombottom", "logoFromleftTop", "getLogoFromleftTop", "setLogoFromleftTop", "logoText1", "getLogoText1", "setLogoText1", "logoText2", "getLogoText2", "setLogoText2", "logoText3", "getLogoText3", "setLogoText3", "logoText4", "getLogoText4", "setLogoText4", "logoviewBlue", "Landroid/widget/ImageView;", "getLogoviewBlue", "()Landroid/widget/ImageView;", "setLogoviewBlue", "(Landroid/widget/ImageView;)V", "logoviewGreen", "getLogoviewGreen", "setLogoviewGreen", "logoviewOrange", "getLogoviewOrange", "setLogoviewOrange", "logoviewPurple", "getLogoviewPurple", "setLogoviewPurple", "logoviewRed", "getLogoviewRed", "setLogoviewRed", "logoviewYellow", "getLogoviewYellow", "setLogoviewYellow", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelUIS", "Lcom/bss/uis/presentation/viewmodel/ViewModelUIS;", "connectionObserverListener", "", "dataObserver", "endAnimation", "hideLoading", "initView", "loading", "b", "", "message", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "serverConnection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAnimation", "showLoading", "msg", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.ImageView logoviewPurple;
    public android.widget.ImageView logoviewBlue;
    public android.widget.ImageView logoviewRed;
    public android.widget.ImageView logoviewYellow;
    public android.widget.ImageView logoviewOrange;
    public android.widget.ImageView logoviewGreen;
    public android.widget.TextView logoText1;
    public android.widget.TextView logoText2;
    public android.widget.TextView logoText3;
    public android.widget.TextView logoText4;
    public android.view.animation.Animation logoFromRightbottom;
    public android.view.animation.Animation logoFromLeftbottom;
    public android.view.animation.Animation logoFromRightTop;
    public android.view.animation.Animation logoFromleftTop;
    public android.view.animation.Animation logoFromTop;
    public android.view.animation.Animation logoFrombottom;
    private com.bss.uis.internet.ConnectivityObserver connectivityObserver;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView connectionSate;
    private android.app.Dialog loadingDialog;
    private android.widget.TextView loadingText;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private com.bss.uis.presentation.viewmodel.ViewModelUIS viewModelUIS;
    
    public SplashActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogoviewPurple() {
        return null;
    }
    
    public final void setLogoviewPurple(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogoviewBlue() {
        return null;
    }
    
    public final void setLogoviewBlue(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogoviewRed() {
        return null;
    }
    
    public final void setLogoviewRed(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogoviewYellow() {
        return null;
    }
    
    public final void setLogoviewYellow(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogoviewOrange() {
        return null;
    }
    
    public final void setLogoviewOrange(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogoviewGreen() {
        return null;
    }
    
    public final void setLogoviewGreen(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLogoText1() {
        return null;
    }
    
    public final void setLogoText1(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLogoText2() {
        return null;
    }
    
    public final void setLogoText2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLogoText3() {
        return null;
    }
    
    public final void setLogoText3(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLogoText4() {
        return null;
    }
    
    public final void setLogoText4(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getLogoFromRightbottom() {
        return null;
    }
    
    public final void setLogoFromRightbottom(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getLogoFromLeftbottom() {
        return null;
    }
    
    public final void setLogoFromLeftbottom(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getLogoFromRightTop() {
        return null;
    }
    
    public final void setLogoFromRightTop(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getLogoFromleftTop() {
        return null;
    }
    
    public final void setLogoFromleftTop(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getLogoFromTop() {
        return null;
    }
    
    public final void setLogoFromTop(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getLogoFrombottom() {
        return null;
    }
    
    public final void setLogoFrombottom(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getConnectionSate() {
        return null;
    }
    
    public final void setConnectionSate(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void setAnimation() {
    }
    
    private final void endAnimation() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final void connectionObserverListener() {
    }
    
    private final void dataObserver() {
    }
    
    private final java.lang.Object serverConnection(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void loading(boolean b, java.lang.String message) {
    }
    
    private final void showLoading(java.lang.String msg) {
    }
    
    private final void hideLoading() {
    }
}