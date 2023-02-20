package com.bss.uis.roomdb.dto

data class ImageDTO(
    var imageid: String? = null,
    var medicalrecordid: String? = null,
    var entityid: String? = null,
    var entitytypeid: String? = null,
    var imagefilename: String? = null,
    var imagedata: String? = null,
    var imageurl: String? = null,
    var imagetype: String? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null
)
