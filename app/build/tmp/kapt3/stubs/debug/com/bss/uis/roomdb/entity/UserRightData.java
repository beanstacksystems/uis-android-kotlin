package com.bss.uis.roomdb.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "userrightdata")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/bss/uis/roomdb/entity/UserRightData;", "", "userRightDataId", "", "userRightId", "userRightType", "", "desc", "userRoleId", "(IILjava/lang/String;Ljava/lang/String;I)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getUserRightDataId", "()I", "getUserRightId", "setUserRightId", "(I)V", "getUserRightType", "setUserRightType", "getUserRoleId", "setUserRoleId", "app_debug"})
public final class UserRightData {
    @androidx.room.ColumnInfo(name = "userRightDataId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int userRightDataId = 0;
    @androidx.room.ColumnInfo(name = "userRightId")
    private int userRightId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "userRightType")
    private java.lang.String userRightType;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "desc")
    private java.lang.String desc;
    @androidx.room.ColumnInfo(name = "userRoleId")
    private int userRoleId;
    
    public UserRightData() {
        super();
    }
    
    public UserRightData(int userRightDataId, int userRightId, @org.jetbrains.annotations.Nullable()
    java.lang.String userRightType, @org.jetbrains.annotations.Nullable()
    java.lang.String desc, int userRoleId) {
        super();
    }
    
    public final int getUserRightDataId() {
        return 0;
    }
    
    public final int getUserRightId() {
        return 0;
    }
    
    public final void setUserRightId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserRightType() {
        return null;
    }
    
    public final void setUserRightType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final void setDesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getUserRoleId() {
        return 0;
    }
    
    public final void setUserRoleId(int p0) {
    }
}