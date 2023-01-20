package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class TabDataResponse(
    @SerializedName("tabname" ) var tabname : String? = null,
    @SerializedName("tabdesc" ) var tabdesc : String? = null,
    @SerializedName("tabdata" ) var tabdata : String? = null,
    @SerializedName("tabseq"  ) var tabseq  : Int?    = null

)
