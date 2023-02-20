package com.bss.uis.roomdb.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.bss.uis.roomdb.entity.HomeTabData
import com.bss.uis.roomdb.entity.MasterData

@Dao
interface MasterDao {

    @Query("SELECT * FROM MasterData")
    fun findAll(): List<MasterData>

    @Query("SELECT * FROM HomeTabData")
    fun findAllTabData(): List<HomeTabData>

    @Query("SELECT * FROM MasterData WHERE masterdataType  = :masterdataType")
    fun findByMasterdataType(masterdataType: String): List<MasterData>

    @Query("SELECT * FROM MasterData WHERE masterdataType is:masterdataType AND masterdataval is:masterdataval")
    fun findByMasterdataTypeAndVal(masterdataType: String?, masterdataval: String?): LiveData<MasterData>

    @Transaction
    @Insert
    fun insertMasterData(masterDataList: List<MasterData>)

    @Transaction
    @Insert
    fun insertTabData(homeTabDataList: List<HomeTabData>)

    @Query("DELETE FROM MasterData")
    fun delete()

    @Query("DELETE FROM HomeTabData")
    fun deleteTabData()
}