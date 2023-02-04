package com.bss.uis.data.remote.dto.request

data class ApproveUserRequestBody(
    var adminUserId: Int? = null,
    var userCurrentRole: Int? = null,
    var userNewRole: Int? = null,
    var userId: Int? = null
):java.io.Serializable
