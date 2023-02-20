package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Patient")
class Patient(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "patientId")
    var patientId: Int = 0,

    @ColumnInfo(name = "name")
    var name: String? = null,

    @ColumnInfo(name = "idproof")
    var idproof: String? = null,

    @ColumnInfo(name = "emailId")
    var emailId: String? = null,

    @ColumnInfo(name = "contact")
    var contact: String? = null,

    @ColumnInfo(name = "gender")
    var gender: String? = null,

    @ColumnInfo(name = "date_of_Birth")
    var dob: String? = null,

    @ColumnInfo(name = "address")
    var address: String? = null,

    @ColumnInfo(name = "bloodGroup")
    var bloodGroup: String? = null,

    @ColumnInfo(name = "suffering_from")
    var diseasesName: String? = null,

    @ColumnInfo(name = "socialId")
    var socialId: String? = null,

    @ColumnInfo(name = "patientImage")
    var patientImage: String? = null,
)