package com.bss.uis.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/bss/uis/presentation/fragment/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "downloadpdf", "Ljava/io/File;", "pdfDocument", "Landroid/graphics/pdf/PdfDocument;", "generatePDF", "context", "Landroid/content/Context;", "patientdetails", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "sharetoGmail", "sharetoWhatssap", "slectShareOption", "app_debug"})
public final class DetailsFragment extends androidx.fragment.app.Fragment {
    
    public DetailsFragment() {
        super();
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
    
    private final android.graphics.pdf.PdfDocument generatePDF(android.content.Context context, com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
        return null;
    }
    
    private final java.io.File downloadpdf(android.graphics.pdf.PdfDocument pdfDocument) {
        return null;
    }
    
    public final void slectShareOption(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
    }
    
    private final void sharetoGmail(com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
    }
    
    private final void sharetoWhatssap(com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
    }
}