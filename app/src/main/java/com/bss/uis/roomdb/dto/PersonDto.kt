package com.bss.uis.roomdb.dto

data class PersonDto(
    var personid: String? = null,
    var entitytype: String? = null,
    var prefix: String? = null,
    var name: String? = null,
    var suffix: String? = null,
    var dateofbirth: String? = null,
    var gender: String? = null,
    var imagelist: List<ImageDTO?>? = null,
    var relationwithpatient: String? = null,
    var incomeperyear: String? = null,
    var occupation: String? = null,
    var isactive: String? = null
)
