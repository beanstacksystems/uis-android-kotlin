package com.bss.uis.roomdb.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/bss/uis/roomdb/dao/ApplicationDao;", "", "findAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/bss/uis/roomdb/entity/AppConfig;", "insertAppConfig", "", "appConfig", "app_debug"})
public abstract interface ApplicationDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AppConfig")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.bss.uis.roomdb.entity.AppConfig>> findAll();
    
    @androidx.room.Insert()
    @androidx.room.Transaction()
    public abstract long insertAppConfig(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.entity.AppConfig appConfig);
}