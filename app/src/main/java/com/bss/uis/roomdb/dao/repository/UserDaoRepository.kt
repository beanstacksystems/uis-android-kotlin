package com.bss.uis.roomdb.dao.repository

import androidx.lifecycle.LiveData
import com.bss.uis.roomdb.dao.UserDao
import com.bss.uis.roomdb.entity.MasterData
import com.bss.uis.roomdb.entity.UserRightData

class UserDaoRepository(private val userDao: UserDao) {
     var userRightList: LiveData<List<UserRightData>> = userDao.findAll()
    suspend fun findAll(){
        userRightList= userDao.findAll()
    }

    suspend fun insertUserData(userRightDataList :List<UserRightData> ){
        userDao.insertUserData(userRightDataList)
    }

    suspend fun delete(){
       userDao.delete()
    }
}