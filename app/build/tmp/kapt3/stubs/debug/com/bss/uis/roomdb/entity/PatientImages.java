package com.bss.uis.roomdb.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "PatientImages", foreignKeys = {@androidx.room.ForeignKey(entity = com.bss.uis.roomdb.entity.Patient.class, childColumns = {"patientId"}, onDelete = 1, parentColumns = {"patientId"})})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/bss/uis/roomdb/entity/PatientImages;", "", "imageId", "", "imageType", "", "imageStr", "imageId_patientId", "(ILjava/lang/String;Ljava/lang/String;I)V", "getImageId", "()I", "setImageId", "(I)V", "getImageId_patientId", "setImageId_patientId", "getImageStr", "()Ljava/lang/String;", "setImageStr", "(Ljava/lang/String;)V", "getImageType", "setImageType", "app_debug"})
public final class PatientImages {
    @androidx.room.ColumnInfo(name = "imageId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int imageId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "imageType")
    private java.lang.String imageType;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "imageStr")
    private java.lang.String imageStr;
    @androidx.room.ColumnInfo(name = "patientId")
    private int imageId_patientId;
    
    public PatientImages() {
        super();
    }
    
    public PatientImages(int imageId, @org.jetbrains.annotations.Nullable()
    java.lang.String imageType, @org.jetbrains.annotations.Nullable()
    java.lang.String imageStr, int imageId_patientId) {
        super();
    }
    
    public final int getImageId() {
        return 0;
    }
    
    public final void setImageId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageType() {
        return null;
    }
    
    public final void setImageType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageStr() {
        return null;
    }
    
    public final void setImageStr(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getImageId_patientId() {
        return 0;
    }
    
    public final void setImageId_patientId(int p0) {
    }
}