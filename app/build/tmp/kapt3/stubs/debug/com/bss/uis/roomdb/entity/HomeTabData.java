package com.bss.uis.roomdb.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "hometabdata")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/bss/uis/roomdb/entity/HomeTabData;", "", "tabid", "", "tabname", "", "tabdesc", "tabdata", "tabseq", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getTabdata", "()Ljava/lang/String;", "setTabdata", "(Ljava/lang/String;)V", "getTabdesc", "setTabdesc", "getTabid", "()I", "getTabname", "setTabname", "getTabseq", "setTabseq", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class HomeTabData {
    @androidx.room.ColumnInfo(name = "tabid")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int tabid = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "tabname")
    private java.lang.String tabname;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "tabdesc")
    private java.lang.String tabdesc;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "tabdata")
    private java.lang.String tabdata;
    @androidx.room.ColumnInfo(name = "tabseq")
    private int tabseq;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.roomdb.entity.HomeTabData copy(int tabid, @org.jetbrains.annotations.Nullable()
    java.lang.String tabname, @org.jetbrains.annotations.Nullable()
    java.lang.String tabdesc, @org.jetbrains.annotations.Nullable()
    java.lang.String tabdata, int tabseq) {
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
    
    public HomeTabData() {
        super();
    }
    
    public HomeTabData(int tabid, @org.jetbrains.annotations.Nullable()
    java.lang.String tabname, @org.jetbrains.annotations.Nullable()
    java.lang.String tabdesc, @org.jetbrains.annotations.Nullable()
    java.lang.String tabdata, int tabseq) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTabid() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabname() {
        return null;
    }
    
    public final void setTabname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabdesc() {
        return null;
    }
    
    public final void setTabdesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabdata() {
        return null;
    }
    
    public final void setTabdata(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTabseq() {
        return 0;
    }
    
    public final void setTabseq(int p0) {
    }
}