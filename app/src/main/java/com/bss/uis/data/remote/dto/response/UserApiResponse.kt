package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class UserApiResponse(
    @SerializedName("salutation") var salutation: String? = null,
    @SerializedName("username") var username: String? = null,
    @SerializedName("useremail") var useremail: String? = null,
    @SerializedName("userid") var userid: Int? = null,
    @SerializedName("userrole") var userrole: ArrayList<Userrole> = arrayListOf(),
    @SerializedName("logintype") var logintype: String? = null,
    @SerializedName("gender") var gender: String? = null,
    @SerializedName("dob") var dob: String? = null,
    @SerializedName("occupation") var occupation: Int? = null,
    @SerializedName("imageurl") var imageurl: String? = null,
    @SerializedName("personid") var personid: Int? = null
){
    data class Userrole (

        @SerializedName("userroleid"    ) var userroleid    : Int?    = null,
        @SerializedName("userroletype"  ) var userroletype  : String? = null,
        @SerializedName("isdefaultrole" ) var isdefaultrole : String? = null

    )
}
