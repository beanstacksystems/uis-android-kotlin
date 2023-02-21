package com.bss.uis.roomdb.dao

import androidx.room.*
import com.bss.uis.roomdb.entity.*


@Dao
interface ProfileDetailDao {

    @Query("SELECT * FROM profileDetails")
    fun getProfileDetails(): ProfileDetails

    @Transaction
    @Insert
    fun insertProfileDetails(userRightDataList: ProfileDetails)

    @Query("DELETE FROM profileDetails")
    fun delete()

}