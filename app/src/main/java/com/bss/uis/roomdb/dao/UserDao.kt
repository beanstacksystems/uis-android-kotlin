package com.bss.uis.roomdb.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.bss.uis.roomdb.entity.UserRightData

@Dao
interface UserDao {
    @Query("SELECT * FROM UserRightData")
    fun findAll(): LiveData<List<UserRightData>>

    @Query("SELECT * FROM UserRightData WHERE userRoleId is:userRoleId")
    fun findByUserRightdataRoleType(userRoleId: Int): List<UserRightData?>?

    @Transaction
    @Insert
    fun insertUserData(userRightDataList: List<UserRightData?>?)
    @Query("DELETE FROM UserRightData")
    fun delete()

}