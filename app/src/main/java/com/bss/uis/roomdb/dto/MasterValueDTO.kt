package com.bss.uis.roomdb.dto

data class MasterValueDTO(
    private var masterdataType: String? = null,
    var masterdataId: Int = 0,
    var masterdataval: String? = null,
    var isactive: String? = null,
    var masterdatadesc: String? = null
)
