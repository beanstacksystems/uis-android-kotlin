package com.bss.uis.roomdb.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/bss/uis/roomdb/dao/MasterDao;", "", "delete", "", "deleteTabData", "findAll", "", "Lcom/bss/uis/roomdb/entity/MasterData;", "findAllTabData", "Lcom/bss/uis/roomdb/entity/HomeTabData;", "findByMasterdataType", "masterdataType", "", "findByMasterdataTypeAndVal", "Landroidx/lifecycle/LiveData;", "masterdataval", "insertMasterData", "masterDataList", "insertTabData", "homeTabDataList", "app_debug"})
public abstract interface MasterDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MasterData")
    public abstract java.util.List<com.bss.uis.roomdb.entity.MasterData> findAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HomeTabData")
    public abstract java.util.List<com.bss.uis.roomdb.entity.HomeTabData> findAllTabData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MasterData WHERE masterdataType  = :masterdataType")
    public abstract java.util.List<com.bss.uis.roomdb.entity.MasterData> findByMasterdataType(@org.jetbrains.annotations.NotNull()
    java.lang.String masterdataType);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MasterData WHERE masterdataType is:masterdataType AND masterdataval is:masterdataval")
    public abstract androidx.lifecycle.LiveData<com.bss.uis.roomdb.entity.MasterData> findByMasterdataTypeAndVal(@org.jetbrains.annotations.Nullable()
    java.lang.String masterdataType, @org.jetbrains.annotations.Nullable()
    java.lang.String masterdataval);
    
    @androidx.room.Insert()
    @androidx.room.Transaction()
    public abstract void insertMasterData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.MasterData> masterDataList);
    
    @androidx.room.Insert()
    @androidx.room.Transaction()
    public abstract void insertTabData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.HomeTabData> homeTabDataList);
    
    @androidx.room.Query(value = "DELETE FROM MasterData")
    public abstract void delete();
    
    @androidx.room.Query(value = "DELETE FROM HomeTabData")
    public abstract void deleteTabData();
}