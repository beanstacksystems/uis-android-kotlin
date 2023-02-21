package com.bss.uis.roomdb.dao.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/bss/uis/roomdb/dao/repository/PatientDaoRepository;", "", "patientDao", "Lcom/bss/uis/roomdb/dao/PatientDao;", "(Lcom/bss/uis/roomdb/dao/PatientDao;)V", "listPatient", "Landroidx/lifecycle/LiveData;", "", "Lcom/bss/uis/roomdb/entity/Patient;", "getListPatient", "()Landroidx/lifecycle/LiveData;", "deletePatientData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertImageList", "patientImageList", "Lcom/bss/uis/roomdb/entity/PatientImages;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMedicalHistory", "medicalHistory", "Lcom/bss/uis/roomdb/entity/MedicalHistory;", "(Lcom/bss/uis/roomdb/entity/MedicalHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPatientAddress", "addressDTO", "Lcom/bss/uis/roomdb/entity/Address;", "(Lcom/bss/uis/roomdb/entity/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPatientAttendant", "patientAttendants", "Lcom/bss/uis/roomdb/entity/PatientAttendant;", "insertPatientData", "patient", "(Lcom/bss/uis/roomdb/entity/Patient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PatientDaoRepository {
    private final com.bss.uis.roomdb.dao.PatientDao patientDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.bss.uis.roomdb.entity.Patient>> listPatient = null;
    
    public PatientDaoRepository(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.dao.PatientDao patientDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bss.uis.roomdb.entity.Patient>> getListPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPatientData(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.entity.Patient patient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deletePatientData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertImageList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.PatientImages> patientImageList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPatientAttendant(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> patientAttendants, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPatientAddress(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.entity.Address addressDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMedicalHistory(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.entity.MedicalHistory medicalHistory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}