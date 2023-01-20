package com.bss.uis.roomdb.dto

data class PatientDTO(
    var patientid: String? = null,
    var bloodgroup: String? = null,
    var attendanttypeids: List<String?>? = null,
    var personlist: List<PersonDto?>? = null,
    var registrarid: String? = null,
    var referrerid: String? = null,
    var sponsorid: String? = null,
    var approverid: String? = null,
    var isactive: String? = null,
    var isapproved: String? = null,
    var illnesstypes: List<String?>? = null,
    var followupcounsellerid: String? = null,
    var medicaldetails: MedicalDetailsDTO? = null,
    var remarks: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null
)
