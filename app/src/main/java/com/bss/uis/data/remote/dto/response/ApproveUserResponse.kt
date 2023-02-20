package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class ApproveUserResponse(
    @SerializedName("messagecode"    ) var messagecode    : String? = null,
    @SerializedName("messagedetails" ) var messagedetails : String? = null
)
