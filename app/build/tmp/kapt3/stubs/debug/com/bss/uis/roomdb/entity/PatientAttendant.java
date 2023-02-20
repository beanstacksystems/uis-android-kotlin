package com.bss.uis.roomdb.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "attendant", foreignKeys = {@androidx.room.ForeignKey(entity = com.bss.uis.roomdb.entity.Patient.class, childColumns = {"attendantId"}, onDelete = 1, parentColumns = {"patientId"})})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/bss/uis/roomdb/entity/PatientAttendant;", "", "attendantId", "", "name", "", "idproof", "emailId", "contact", "relation", "occupation", "yearlyIncome", "imageStr", "attendantId_patientId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAttendantId", "()I", "setAttendantId", "(I)V", "getAttendantId_patientId", "setAttendantId_patientId", "getContact", "()Ljava/lang/String;", "setContact", "(Ljava/lang/String;)V", "getEmailId", "setEmailId", "getIdproof", "setIdproof", "getImageStr", "setImageStr", "getName", "setName", "getOccupation", "setOccupation", "getRelation", "setRelation", "getYearlyIncome", "setYearlyIncome", "app_debug"})
public final class PatientAttendant {
    @androidx.room.ColumnInfo(name = "attendantId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int attendantId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "idproof")
    private java.lang.String idproof;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "emailId")
    private java.lang.String emailId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "contact")
    private java.lang.String contact;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "relation")
    private java.lang.String relation;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "occupation")
    private java.lang.String occupation;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "yearlyIncome")
    private java.lang.String yearlyIncome;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "imageStr")
    private java.lang.String imageStr;
    @androidx.room.ColumnInfo(name = "patientId")
    private int attendantId_patientId;
    
    public PatientAttendant() {
        super();
    }
    
    public PatientAttendant(int attendantId, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String idproof, @org.jetbrains.annotations.Nullable()
    java.lang.String emailId, @org.jetbrains.annotations.Nullable()
    java.lang.String contact, @org.jetbrains.annotations.Nullable()
    java.lang.String relation, @org.jetbrains.annotations.Nullable()
    java.lang.String occupation, @org.jetbrains.annotations.Nullable()
    java.lang.String yearlyIncome, @org.jetbrains.annotations.Nullable()
    java.lang.String imageStr, int attendantId_patientId) {
        super();
    }
    
    public final int getAttendantId() {
        return 0;
    }
    
    public final void setAttendantId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdproof() {
        return null;
    }
    
    public final void setIdproof(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailId() {
        return null;
    }
    
    public final void setEmailId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRelation() {
        return null;
    }
    
    public final void setRelation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOccupation() {
        return null;
    }
    
    public final void setOccupation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYearlyIncome() {
        return null;
    }
    
    public final void setYearlyIncome(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageStr() {
        return null;
    }
    
    public final void setImageStr(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getAttendantId_patientId() {
        return 0;
    }
    
    public final void setAttendantId_patientId(int p0) {
    }
}