package com.bss.uis.roomdb.dto

data class AddressDTO(
    var addressid: String? = null,
    var entityid: String? = null,
    var entitytypeid: String? = null,
    var addresstypeid: String? = null,
    var addressline1: String? = null,
    var addressline2: String? = null,
    var addressline3: String? = null,
    var city: String? = null,
    var district: String? = null,
    var state: String? = null,
    var country: String? = null,
    var pincode: String? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null
)
