package com.bss.uis.domain.model.responsedomain

data class AuthResponseDomain(
    var token: String? = null,
    var tokenType: String? = null,
    var expiresIn: Int? = null,
    var refreshtoken: String? = null
)
