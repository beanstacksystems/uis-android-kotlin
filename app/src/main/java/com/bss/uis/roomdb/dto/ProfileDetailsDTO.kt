package com.bss.uis.roomdb.dto

data class ProfileDetailsDTO(
    var userid: Int? = null,
    var salutation: String? = null,
    var usename: String? = null,
    var email: String? = null,
    var dob: String? = null,
    var gender: String? = null,
    var occupation: String? = null
)