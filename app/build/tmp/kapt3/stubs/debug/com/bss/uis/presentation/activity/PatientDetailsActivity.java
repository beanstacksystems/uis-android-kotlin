package com.bss.uis.presentation.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0015J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/bss/uis/presentation/activity/PatientDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnDownload", "Landroid/widget/Button;", "ivPatient", "Lde/hdodenhof/circleimageview/CircleImageView;", "ivShare", "Landroid/widget/ImageView;", "ivback", "tvAdress", "Landroid/widget/TextView;", "tvAge", "tvBloodGroup", "tvCancerType", "tvContact", "tvDob", "tvGender", "tvName", "downloadpdf", "Ljava/io/File;", "pdfDocument", "Landroid/graphics/pdf/PdfDocument;", "generatePDF", "context", "Landroid/content/Context;", "patientdetails", "Lcom/bss/uis/data/remote/dto/response/FetchPatientList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "sharetoGmail", "slectShareOption", "app_debug"})
public final class PatientDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private de.hdodenhof.circleimageview.CircleImageView ivPatient;
    private android.widget.TextView tvName;
    private android.widget.TextView tvCancerType;
    private android.widget.TextView tvAge;
    private android.widget.TextView tvDob;
    private android.widget.TextView tvContact;
    private android.widget.TextView tvBloodGroup;
    private android.widget.TextView tvAdress;
    private android.widget.TextView tvGender;
    private android.widget.Button btnDownload;
    private android.widget.ImageView ivback;
    private android.widget.ImageView ivShare;
    
    public PatientDetailsActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.io.File downloadpdf(android.graphics.pdf.PdfDocument pdfDocument) {
        return null;
    }
    
    public final void slectShareOption(@org.jetbrains.annotations.NotNull()
    com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
    }
    
    private final void sharetoGmail(com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
    }
    
    private final android.graphics.pdf.PdfDocument generatePDF(android.content.Context context, com.bss.uis.data.remote.dto.response.FetchPatientList patientdetails) {
        return null;
    }
}