package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class AuthResponse(
    @SerializedName("token") var token: String? = null,
    @SerializedName("token_type") var tokenType: String? = null,
    @SerializedName("expires_in") var expiresIn: Int? = null,
    @SerializedName("refreshtoken") var refreshtoken: String? = null

)
