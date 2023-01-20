package com.bss.uis.roomdb.dto

data class UserRightDTO(
    var roleid: Int = 0,
    var righttype: String? = null,
    var rightid: Int = 0,
    var rightdesc: String? = null
)
