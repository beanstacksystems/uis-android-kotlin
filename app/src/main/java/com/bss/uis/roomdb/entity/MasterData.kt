package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "masterData")
data class MasterData(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "masterdatapkId")
    var masterdatapkId: Int = 0,

    @ColumnInfo(name = "masterdataType")
    var masterdataType: String? = null,

    @ColumnInfo(name = "masterdataId")
    var masterdataId: String? = null,

    @ColumnInfo(name = "masterdataval")
    var masterdataval: String? = null,

    @ColumnInfo(name = "isactive")
    var isactive: String? = null,

    @ColumnInfo(name = "masterdatadesc")
    var masterdatadesc: String? = null
)
