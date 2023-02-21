package com.bss.uis.roomdb.relation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/bss/uis/roomdb/relation/PatientDetailsData;", "", "patient", "Lcom/bss/uis/roomdb/entity/Patient;", "imagesList", "", "Lcom/bss/uis/roomdb/entity/PatientImages;", "address", "Lcom/bss/uis/roomdb/entity/Address;", "medicalHistory", "Lcom/bss/uis/roomdb/entity/MedicalHistory;", "patientAttendants", "Lcom/bss/uis/roomdb/entity/PatientAttendant;", "(Lcom/bss/uis/roomdb/entity/Patient;Ljava/util/List;Lcom/bss/uis/roomdb/entity/Address;Lcom/bss/uis/roomdb/entity/MedicalHistory;Ljava/util/List;)V", "getAddress", "()Lcom/bss/uis/roomdb/entity/Address;", "setAddress", "(Lcom/bss/uis/roomdb/entity/Address;)V", "getImagesList", "()Ljava/util/List;", "setImagesList", "(Ljava/util/List;)V", "getMedicalHistory", "()Lcom/bss/uis/roomdb/entity/MedicalHistory;", "setMedicalHistory", "(Lcom/bss/uis/roomdb/entity/MedicalHistory;)V", "getPatient", "()Lcom/bss/uis/roomdb/entity/Patient;", "setPatient", "(Lcom/bss/uis/roomdb/entity/Patient;)V", "getPatientAttendants", "setPatientAttendants", "app_debug"})
public final class PatientDetailsData {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.bss.uis.roomdb.entity.Patient patient;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Relation(parentColumn = "patientId", entityColumn = "imageId")
    private java.util.List<com.bss.uis.roomdb.entity.PatientImages> imagesList;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Relation(parentColumn = "patientId", entityColumn = "addressId")
    private com.bss.uis.roomdb.entity.Address address;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Relation(parentColumn = "patientId", entityColumn = "medicalHistoryId")
    private com.bss.uis.roomdb.entity.MedicalHistory medicalHistory;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Relation(parentColumn = "patientId", entityColumn = "attendantId")
    private java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> patientAttendants;
    
    public PatientDetailsData() {
        super();
    }
    
    public PatientDetailsData(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Patient patient, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientImages> imagesList, @org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Address address, @org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.MedicalHistory medicalHistory, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> patientAttendants) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.roomdb.entity.Patient getPatient() {
        return null;
    }
    
    public final void setPatient(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Patient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.roomdb.entity.PatientImages> getImagesList() {
        return null;
    }
    
    public final void setImagesList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientImages> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.roomdb.entity.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.Address p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.roomdb.entity.MedicalHistory getMedicalHistory() {
        return null;
    }
    
    public final void setMedicalHistory(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.MedicalHistory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> getPatientAttendants() {
        return null;
    }
    
    public final void setPatientAttendants(@org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.entity.PatientAttendant> p0) {
    }
}