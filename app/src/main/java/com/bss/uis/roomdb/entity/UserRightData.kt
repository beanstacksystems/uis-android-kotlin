package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userrightdata")
class UserRightData(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "userRightDataId")
     val userRightDataId: Int = 0,

    @ColumnInfo(name = "userRightId")
    var userRightId: Int = 0,

    @ColumnInfo(name = "userRightType")
    var userRightType: String? = null,

    @ColumnInfo(name = "desc")
    var desc: String? = null,

    @ColumnInfo(name = "userRoleId")
    var userRoleId: Int = 0
)