package com.bss.uis.roomdb.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\'\u00a8\u0006\b"}, d2 = {"Lcom/bss/uis/roomdb/dao/ProfileDetailDao;", "", "delete", "", "getProfileDetails", "Lcom/bss/uis/roomdb/entity/ProfileDetails;", "insertProfileDetails", "userRightDataList", "app_debug"})
public abstract interface ProfileDetailDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM profileDetails")
    public abstract com.bss.uis.roomdb.entity.ProfileDetails getProfileDetails();
    
    @androidx.room.Insert()
    @androidx.room.Transaction()
    public abstract void insertProfileDetails(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.entity.ProfileDetails userRightDataList);
    
    @androidx.room.Query(value = "DELETE FROM profileDetails")
    public abstract void delete();
}