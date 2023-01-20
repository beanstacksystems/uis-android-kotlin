package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hometabdata")
data class HomeTabData(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "tabid")
     val tabid: Int = 0,

    @ColumnInfo(name = "tabname")
    var tabname: String? = null,

    @ColumnInfo(name = "tabdesc")
    var tabdesc: String? = null,

    @ColumnInfo(name = "tabdata")
    var tabdata: String? = null,

    @ColumnInfo(name = "tabseq")
    var tabseq: Int = 0
)