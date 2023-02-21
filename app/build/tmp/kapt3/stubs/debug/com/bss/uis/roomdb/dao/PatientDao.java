package com.bss.uis.roomdb.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\'J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\'J\u001a\u0010\r\u001a\u00020\u00032\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\'J\u001a\u0010\u0011\u001a\u00020\u00032\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u000fH\'J\u001a\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u0018H\'J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\'J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\'J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\'J\u001a\u0010\u001e\u001a\u00020\u00032\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u000fH\'J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\'J\u0012\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0013H\'\u00a8\u0006\""}, d2 = {"Lcom/bss/uis/roomdb/dao/PatientDao;", "", "delete", "", "deleteMedicalHistory", "medicalHistory", "Lcom/bss/uis/roomdb/entity/MedicalHistory;", "deletePatient", "patient", "Lcom/bss/uis/roomdb/entity/Patient;", "deletePatientAddress", "address", "Lcom/bss/uis/roomdb/entity/Address;", "deletePatientAttendant", "patientAttendants", "", "Lcom/bss/uis/roomdb/entity/PatientAttendant;", "deletePatientImages", "patientImageList", "Lcom/bss/uis/roomdb/entity/PatientImages;", "findByPatientId", "patientId", "", "getAll", "Landroidx/lifecycle/LiveData;", "insertMedicalHistory", "insertPatient", "", "insertPatientAddress", "insertPatientAttendant", "insertPatientImages", "updatePatient", "updatePatientImages", "patientImages", "app_debug"})
public abstract interface PatientDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Patient")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.bss.uis.roomdb.entity.Patient>> getAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Patient WHERE patientId Is:patientId")
    public abstract java.util.List<com.bss.uis.roomdb.entity.Patient> findByPatientId(int patientId);
    
    @androidx.room.Insert()
    @androidx.room.Transaction()
    public abstract long insertPatient(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.entity.Patient patient);
    
    @androidx.room.Insert()
    public abstract void insertPatientImages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientImages> patientImageList);
    
    @androidx.room.Insert()
    public abstract void insertPatientAddress(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Address address);
    
    @androidx.room.Insert()
    public abstract void insertMedicalHistory(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.MedicalHistory medicalHistory);
    
    @androidx.room.Insert()
    public abstract void insertPatientAttendant(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> patientAttendants);
    
    @androidx.room.Delete()
    @androidx.room.Transaction()
    public abstract void deletePatient(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Patient patient);
    
    @androidx.room.Query(value = "DELETE FROM Patient")
    public abstract void delete();
    
    @androidx.room.Delete()
    public abstract void deletePatientImages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientImages> patientImageList);
    
    @androidx.room.Delete()
    public abstract void deletePatientAddress(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Address address);
    
    @androidx.room.Delete()
    public abstract void deleteMedicalHistory(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.MedicalHistory medicalHistory);
    
    @androidx.room.Delete()
    public abstract void deletePatientAttendant(@org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> patientAttendants);
    
    @androidx.room.Update()
    @androidx.room.Transaction()
    public abstract void updatePatient(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Patient patient);
    
    @androidx.room.Update()
    public abstract void updatePatientImages(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.PatientImages patientImages);
}