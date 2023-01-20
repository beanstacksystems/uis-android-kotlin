package com.bss.uis.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bss.uis.roomdb.dao.ApplicationDao
import com.bss.uis.roomdb.dao.MasterDao
import com.bss.uis.roomdb.dao.PatientDao
import com.bss.uis.roomdb.dao.UserDao
import com.bss.uis.roomdb.entity.*

@Database(
    entities = [Patient::class, PatientImages::class, AppConfig::class, Address::class, MedicalHistory::class, PatientAttendant::class, HomeTabData::class, MasterData::class, UserRightData::class],
    version = 1
)
abstract class UISDatabase : RoomDatabase() {
    abstract val masterDAO: MasterDao
    abstract val userDAO: UserDao
    abstract val patientDao: PatientDao
    abstract val applicationDao: ApplicationDao
    companion object {
        @Volatile
        private var INSTANCE: UISDatabase? = null

        fun getInstance(context: Context): UISDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    UISDatabase::class.java,
                    "UISDB"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}