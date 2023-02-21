package com.bss.uis.roomdb;

import java.lang.System;

@androidx.room.Database(entities = {com.bss.uis.roomdb.entity.Patient.class, com.bss.uis.roomdb.entity.PatientImages.class, com.bss.uis.roomdb.entity.AppConfig.class, com.bss.uis.roomdb.entity.Address.class, com.bss.uis.roomdb.entity.MedicalHistory.class, com.bss.uis.roomdb.entity.PatientAttendant.class, com.bss.uis.roomdb.entity.HomeTabData.class, com.bss.uis.roomdb.entity.MasterData.class, com.bss.uis.roomdb.entity.UserRightData.class, com.bss.uis.roomdb.entity.ProfileDetails.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/bss/uis/roomdb/UISDatabase;", "Landroidx/room/RoomDatabase;", "()V", "applicationDao", "Lcom/bss/uis/roomdb/dao/ApplicationDao;", "getApplicationDao", "()Lcom/bss/uis/roomdb/dao/ApplicationDao;", "masterDAO", "Lcom/bss/uis/roomdb/dao/MasterDao;", "getMasterDAO", "()Lcom/bss/uis/roomdb/dao/MasterDao;", "patientDao", "Lcom/bss/uis/roomdb/dao/PatientDao;", "getPatientDao", "()Lcom/bss/uis/roomdb/dao/PatientDao;", "profileDetailsDao", "Lcom/bss/uis/roomdb/dao/ProfileDetailDao;", "getProfileDetailsDao", "()Lcom/bss/uis/roomdb/dao/ProfileDetailDao;", "userDAO", "Lcom/bss/uis/roomdb/dao/UserDao;", "getUserDAO", "()Lcom/bss/uis/roomdb/dao/UserDao;", "Companion", "app_debug"})
public abstract class UISDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.bss.uis.roomdb.UISDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.bss.uis.roomdb.UISDatabase INSTANCE;
    
    public UISDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bss.uis.roomdb.dao.MasterDao getMasterDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bss.uis.roomdb.dao.UserDao getUserDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bss.uis.roomdb.dao.PatientDao getPatientDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bss.uis.roomdb.dao.ApplicationDao getApplicationDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bss.uis.roomdb.dao.ProfileDetailDao getProfileDetailsDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/bss/uis/roomdb/UISDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/bss/uis/roomdb/UISDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bss.uis.roomdb.UISDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}