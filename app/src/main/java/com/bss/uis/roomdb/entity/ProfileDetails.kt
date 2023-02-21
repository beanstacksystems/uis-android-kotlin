package com.bss.uis.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profileDetails")
data class ProfileDetails(
    @PrimaryKey
    @ColumnInfo(name = "userid")
    var userid: Int? = null,
    @ColumnInfo(name = "salutation")
    var salutation: String? = null,
    @ColumnInfo(name = "usename")
    var usename: String? = null,
    @ColumnInfo(name = "email")
    var email: String? = null,
    @ColumnInfo(name = "dob")
    var dob: String? = null,
    @ColumnInfo(name = "gender")
    var gender: String? = null,
    @ColumnInfo(name = "occupation")
    var occupation: String? = null,
    @ColumnInfo(name = "profileimage")
    var profileimage: String? = null
)