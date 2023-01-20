package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "medicalhistory",
    foreignKeys = [ForeignKey(
        entity = Patient::class,
        parentColumns = arrayOf("patientId"),
        childColumns = arrayOf("medicalHistoryId"),
        onDelete = ForeignKey.NO_ACTION
    )]
)
class MedicalHistory(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "medicalHistoryId")
    var medicalHistoryId: Int = 0,

    @ColumnInfo(name = "bloodGroup")
    var bloodGroup: String? = null,

    @ColumnInfo(name = "cancerType")
    var cancerType: String? = null,

    @ColumnInfo(name = "identifiedOn")
    var identifiedOn: String? = null,

    @ColumnInfo(name = "otherDisease")
    var otherDisease: String? = null,

    @ColumnInfo(name = "patientId")
    var medicalHistoryId_patientId: Int = 0
)