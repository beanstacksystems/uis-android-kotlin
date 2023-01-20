package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "address",
    foreignKeys = [ForeignKey(
        entity = Patient::class,
        parentColumns = arrayOf("patientId"),
        childColumns = arrayOf("addressId"),
        onDelete = ForeignKey.NO_ACTION
    )]
)
data class Address (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "addressId")
    var addressId: Int = 0,

    @ColumnInfo(name = "street")
    var street: String? = null,

    @ColumnInfo(name = "city")
    var city: String? = null,

    @ColumnInfo(name = "district")
    var district: String? = null,

    @ColumnInfo(name = "state")
    var state: String? = null,

    @ColumnInfo(name = "pin")
    var pin: String? = null,

    @ColumnInfo(name = "patientId")
   var addressId_patientId: Int = 0
)