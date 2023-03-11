package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class MasterDataResponse(
    @SerializedName("masterdataType") var masterdataType: String? = null,
    @SerializedName("masterdataId") var masterdataId: String? = null,
    @SerializedName("masterdataval") var masterdataval: String? = null,
    @SerializedName("masterdatadesc") var masterdatadesc: String? = null,
    @SerializedName("isactive") var isactive: String? = null
)
