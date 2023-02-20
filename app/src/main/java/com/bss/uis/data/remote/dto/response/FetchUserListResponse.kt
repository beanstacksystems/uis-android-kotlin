package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class FetchUserListResponse(
    @SerializedName("userId"            ) var userId            : Int?    = null,
    @SerializedName("userCurrentRole"   ) var userCurrentRole   : Int?    = null,
    @SerializedName("userName"          ) var userName          : String? = null,
    @SerializedName("userEmail"         ) var userEmail         : String? = null,
    @SerializedName("userContact"       ) var userContact       : String? = null,
    @SerializedName("userRequestedRole" ) var userRequestedRole : String? = null,
    @SerializedName("userCreatedDate"   ) var userCreatedDate   : String? = null,
    @SerializedName("userProfileImage"  ) var userProfileImage  : String? = null
):java.io.Serializable
