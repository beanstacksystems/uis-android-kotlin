package com.bss.uis.roomdb.dao.repository

import androidx.lifecycle.LiveData
import com.bss.uis.roomdb.dao.MasterDao
import com.bss.uis.roomdb.entity.HomeTabData
import com.bss.uis.roomdb.entity.MasterData

class MasterDaoRepository(private val masterDao: MasterDao) {

    lateinit var masterDataList: LiveData<List<MasterData>>
    val tabDataList: LiveData<List<HomeTabData>> = masterDao.findAllTabData()
    lateinit var masterdataBytype: List<MasterData>

    suspend fun findAll() {
        masterDataList = masterDao.findAll()
    }
    suspend fun insertTabData(homeTabDataList: List<HomeTabData>) {
        masterDao.insertTabData(homeTabDataList)
    }

    suspend fun findByMasterdataTypeAndVal(masterDataType: String, masterDataVal: String) {
        masterDao.findByMasterdataTypeAndVal(masterDataType, masterDataVal)
    }

    suspend fun findmasterDataByType(masterDataType: String):List<MasterData> {
        masterdataBytype = masterDao.findByMasterdataType(masterDataType)
        return masterdataBytype
    }

    suspend fun insert(masterData: List<MasterData>) {
        masterDao.insertMasterData(masterData)
    }

    suspend fun delete() {
        masterDao.delete()
    }
    suspend fun deleteTabData(){
        masterDao.deleteTabData()
    }

}