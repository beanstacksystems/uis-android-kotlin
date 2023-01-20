package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AppConfig")
data class AppConfig (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "configId")
    var configId: Int = 0,

    @ColumnInfo(name = "configKey")
    var configKey: String? = null,

    @ColumnInfo(name = "configValue")
    var configValue: String? = null
)