package com.bss.uis.roomdb.dto

data class MedicalDetailsDTO(
    var medicalrecordid: String? = null,
    var patientid: String? = null,
    var illnesstypeid: String? = null,
    var illnessstageid: String? = null,
    var diagnosisdetails: String? = null,
    var imagelist: List<ImageDTO?>? = null,
    var diagnosisdate: String? = null,
    var otherremarks: String? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null
)
