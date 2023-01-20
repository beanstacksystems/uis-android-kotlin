package com.bss.uis.domain.model.responsedomain

data class UserApiResponseDomain(
    var salutation: String? = null,
    var username: String? = null,
    var useremail: String? = null,
    var userid: Int? = null,
    var userrole: ArrayList<UserRoleDomain> = arrayListOf(),
    var logintype: String? = null,
    var gender: String? = null,
    var dob: String? = null,
    var occupation: Int? = null,
    var imageurl: String? = null,
    var personid: Int? = null
) {
    data class UserRoleDomain(
        var userroleid: Int? = null,
        var userroletype: String? = null,
        var isdefaultrole: String? = null


    )

}
