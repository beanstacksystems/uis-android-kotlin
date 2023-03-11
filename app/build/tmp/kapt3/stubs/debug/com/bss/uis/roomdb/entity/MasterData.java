package com.bss.uis.roomdb.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "masterData")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/bss/uis/roomdb/entity/MasterData;", "", "masterdatapkId", "", "masterdataType", "", "masterdataId", "masterdataval", "isactive", "masterdatadesc", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIsactive", "()Ljava/lang/String;", "setIsactive", "(Ljava/lang/String;)V", "getMasterdataId", "setMasterdataId", "getMasterdataType", "setMasterdataType", "getMasterdatadesc", "setMasterdatadesc", "getMasterdatapkId", "()I", "setMasterdatapkId", "(I)V", "getMasterdataval", "setMasterdataval", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MasterData {
    @androidx.room.ColumnInfo(name = "masterdatapkId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int masterdatapkId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "masterdataType")
    private java.lang.String masterdataType;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "masterdataId")
    private java.lang.String masterdataId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "masterdataval")
    private java.lang.String masterdataval;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "isactive")
    private java.lang.String isactive;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "masterdatadesc")
    private java.lang.String masterdatadesc;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.roomdb.entity.MasterData copy(int masterdatapkId, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataType, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataId, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataval, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdatadesc) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MasterData() {
        super();
    }
    
    public MasterData(int masterdatapkId, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataType, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataId, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataval, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdatadesc) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getMasterdatapkId() {
        return 0;
    }
    
    public final void setMasterdatapkId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMasterdataType() {
        return null;
    }
    
    public final void setMasterdataType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMasterdataId() {
        return null;
    }
    
    public final void setMasterdataId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMasterdataval() {
        return null;
    }
    
    public final void setMasterdataval(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIsactive() {
        return null;
    }
    
    public final void setIsactive(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMasterdatadesc() {
        return null;
    }
    
    public final void setMasterdatadesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}