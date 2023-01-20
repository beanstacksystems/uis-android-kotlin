package com.bss.uis.roomdb.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.bss.uis.roomdb.entity.AppConfig
@Dao
interface ApplicationDao {

    @Query("SELECT * FROM AppConfig")
    fun findAll(): LiveData<List<AppConfig>>

    @Transaction
    @Insert
    fun insertAppConfig(appConfig: AppConfig?): Long
}