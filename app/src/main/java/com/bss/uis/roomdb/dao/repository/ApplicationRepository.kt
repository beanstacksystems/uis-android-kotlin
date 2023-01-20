package com.bss.uis.roomdb.dao.repository

import androidx.lifecycle.LiveData
import com.bss.uis.roomdb.dao.ApplicationDao
import com.bss.uis.roomdb.entity.AppConfig


class ApplicationRepository(private val applicationDao: ApplicationDao) {

    val allWords: LiveData<List<AppConfig>> = applicationDao.findAll()
    suspend fun insert(appConfig: AppConfig) {
        applicationDao.insertAppConfig(appConfig)
    }


}