package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "PatientImages",
    foreignKeys = [ForeignKey(
        entity = Patient::class,
        parentColumns = arrayOf("patientId"),
        childColumns = arrayOf("patientId"),
        onDelete = ForeignKey.NO_ACTION
    )]
)
class PatientImages(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "imageId")
    var imageId: Int = 0,

    @ColumnInfo(name = "imageType")
    var imageType: String? = null,

    @ColumnInfo(name = "imageStr")
    var imageStr: String? = null,

    @ColumnInfo(name = "patientId")
    var imageId_patientId: Int = 0
)