package com.bss.uis.roomdb.dao.repository

import com.bss.uis.roomdb.dao.ProfileDetailDao
import com.bss.uis.roomdb.entity.ProfileDetails

class ProfileDetailsRepository(private val profileDetailDao: ProfileDetailDao) {
    var profileDetails: ProfileDetails = profileDetailDao.getProfileDetails()

    suspend fun get() {
        profileDetails = profileDetailDao.getProfileDetails()
    }

    suspend fun insertProfileDetails(profileDetails: ProfileDetails) {
        profileDetailDao.insertProfileDetails(profileDetails)
    }

    suspend fun delete() {
        profileDetailDao.delete()
    }
}