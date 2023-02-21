package com.bss.uis.roomdb.dao.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001f\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/bss/uis/roomdb/dao/repository/MasterDaoRepository;", "", "masterDao", "Lcom/bss/uis/roomdb/dao/MasterDao;", "(Lcom/bss/uis/roomdb/dao/MasterDao;)V", "masterDataList", "", "Lcom/bss/uis/roomdb/entity/MasterData;", "getMasterDataList", "()Ljava/util/List;", "setMasterDataList", "(Ljava/util/List;)V", "masterdataBytype", "getMasterdataBytype", "setMasterdataBytype", "tabDataList", "Lcom/bss/uis/roomdb/entity/HomeTabData;", "getTabDataList", "delete", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTabData", "findAll", "findByMasterdataTypeAndVal", "masterDataType", "", "masterDataVal", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findmasterDataByType", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "masterData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTabData", "homeTabDataList", "app_debug"})
public final class MasterDaoRepository {
    private final com.bss.uis.roomdb.dao.MasterDao masterDao = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.bss.uis.roomdb.entity.MasterData> masterDataList;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.bss.uis.roomdb.entity.HomeTabData> tabDataList = null;
    public java.util.List<com.bss.uis.roomdb.entity.MasterData> masterdataBytype;
    
    public MasterDaoRepository(@org.jetbrains.annotations.NotNull()
    com.bss.uis.roomdb.dao.MasterDao masterDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bss.uis.roomdb.entity.MasterData> getMasterDataList() {
        return null;
    }
    
    public final void setMasterDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.MasterData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bss.uis.roomdb.entity.HomeTabData> getTabDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bss.uis.roomdb.entity.MasterData> getMasterdataBytype() {
        return null;
    }
    
    public final void setMasterdataBytype(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.MasterData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTabData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.HomeTabData> homeTabDataList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findByMasterdataTypeAndVal(@org.jetbrains.annotations.NotNull()
    java.lang.String masterDataType, @org.jetbrains.annotations.NotNull()
    java.lang.String masterDataVal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findmasterDataByType(@org.jetbrains.annotations.NotNull()
    java.lang.String masterDataType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.bss.uis.roomdb.entity.MasterData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bss.uis.roomdb.entity.MasterData> masterData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTabData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}