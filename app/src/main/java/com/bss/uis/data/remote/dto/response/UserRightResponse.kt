package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class UserRightResponse(@SerializedName("roleid"    ) var roleid    : Int?    = null,
                             @SerializedName("righttype" ) var righttype : String? = null,
                             @SerializedName("rightid"   ) var rightid   : Int?    = null,
                             @SerializedName("rightdesc" ) var rightdesc : String? = null)
