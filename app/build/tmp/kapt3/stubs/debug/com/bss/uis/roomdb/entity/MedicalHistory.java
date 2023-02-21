package com.bss.uis.roomdb.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "medicalhistory", foreignKeys = {@androidx.room.ForeignKey(entity = com.bss.uis.roomdb.entity.Patient.class, childColumns = {"medicalHistoryId"}, onDelete = 1, parentColumns = {"patientId"})})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/bss/uis/roomdb/entity/MedicalHistory;", "", "medicalHistoryId", "", "bloodGroup", "", "cancerType", "identifiedOn", "otherDisease", "medicalHistoryId_patientId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBloodGroup", "()Ljava/lang/String;", "setBloodGroup", "(Ljava/lang/String;)V", "getCancerType", "setCancerType", "getIdentifiedOn", "setIdentifiedOn", "getMedicalHistoryId", "()I", "setMedicalHistoryId", "(I)V", "getMedicalHistoryId_patientId", "setMedicalHistoryId_patientId", "getOtherDisease", "setOtherDisease", "app_debug"})
public final class MedicalHistory {
    @androidx.room.ColumnInfo(name = "medicalHistoryId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int medicalHistoryId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "bloodGroup")
    private java.lang.String bloodGroup;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cancerType")
    private java.lang.String cancerType;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "identifiedOn")
    private java.lang.String identifiedOn;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "otherDisease")
    private java.lang.String otherDisease;
    @androidx.room.ColumnInfo(name = "patientId")
    private int medicalHistoryId_patientId;
    
    public MedicalHistory() {
        super();
    }
    
    public MedicalHistory(int medicalHistoryId, @org.jetbrains.annotations.Nullable()
    java.lang.String bloodGroup, @org.jetbrains.annotations.Nullable()
    java.lang.String cancerType, @org.jetbrains.annotations.Nullable()
    java.lang.String identifiedOn, @org.jetbrains.annotations.Nullable()
    java.lang.String otherDisease, int medicalHistoryId_patientId) {
        super();
    }
    
    public final int getMedicalHistoryId() {
        return 0;
    }
    
    public final void setMedicalHistoryId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBloodGroup() {
        return null;
    }
    
    public final void setBloodGroup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCancerType() {
        return null;
    }
    
    public final void setCancerType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdentifiedOn() {
        return null;
    }
    
    public final void setIdentifiedOn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOtherDisease() {
        return null;
    }
    
    public final void setOtherDisease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getMedicalHistoryId_patientId() {
        return 0;
    }
    
    public final void setMedicalHistoryId_patientId(int p0) {
    }
}