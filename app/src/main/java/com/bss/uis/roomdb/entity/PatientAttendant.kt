package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "attendant",
    foreignKeys = [ForeignKey(
        entity = Patient::class,
        parentColumns = arrayOf("patientId"),
        childColumns = arrayOf("attendantId"),
        onDelete = ForeignKey.NO_ACTION
    )]
)
class PatientAttendant(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "attendantId")
   var attendantId: Int = 0,

    @ColumnInfo(name = "name")
    var name: String? = null,

    @ColumnInfo(name = "idproof")
    var idproof: String? = null,

    @ColumnInfo(name = "emailId")
    var emailId: String? = null,

    @ColumnInfo(name = "contact")
    var contact: String? = null,

    @ColumnInfo(name = "relation")
    var relation: String? = null,

    @ColumnInfo(name = "occupation")
    var occupation: String? = null,

    @ColumnInfo(name = "yearlyIncome")
    var yearlyIncome: String? = null,

    @ColumnInfo(name = "imageStr")
    var imageStr: String? = null,

    @ColumnInfo(name = "patientId")
    var attendantId_patientId: Int = 0
)
