package com.bss.uis.mapper

import com.bss.uis.data.remote.dto.response.*
import com.bss.uis.domain.model.responsedomain.*
import com.bss.uis.util.Mapper


import javax.inject.Inject

class AuthResponseDomainMapper @Inject constructor() :
    Mapper<AuthResponse, AuthResponseDomain> {


    override fun map(input: AuthResponse): AuthResponseDomain {
        return AuthResponseDomain(
            token = input.token,
            tokenType = input.tokenType,
            expiresIn = input.expiresIn,
            refreshtoken = input.refreshtoken
        )
    }

}

class MasterDomainResponseMapper @Inject constructor() :
    Mapper<List<MasterDataResponse?>, List<MasterDataResponseDomain>> {
    override fun map(input: List<MasterDataResponse?>): List<MasterDataResponseDomain> {
        val masterdata: MutableList<MasterDataResponseDomain> = mutableListOf()
        input.forEach {
            masterdata.add(
                MasterDataResponseDomain(
                    masterdatadesc = it?.masterdatadesc,
                    masterdataType = it?.masterdataType,
                    masterdataId = it?.masterdataId,
                    masterdataval = it?.masterdataval,
                    isactive = it?.isactive


                )
            )
        }
        return masterdata
    }
}

class TabResponseDomainMapper @Inject constructor() :
    Mapper<List<TabDataResponse?>, List<TabDataResponseDomain>> {
    override fun map(input: List<TabDataResponse?>): List<TabDataResponseDomain> {
        val tabdata: MutableList<TabDataResponseDomain> = mutableListOf()
        input.forEach {
            tabdata.add(
                TabDataResponseDomain(
                    tabname = it?.tabname,
                    tabdesc = it?.tabdesc,
                    tabdata = it?.tabdata,
                    tabseq = it?.tabseq

                )
            )
        }
        return tabdata
    }
}

class UserApiResponseDomainMapper @Inject constructor() :
    Mapper<UserApiResponse, UserApiResponseDomain> {
    override fun map(input: UserApiResponse): UserApiResponseDomain {
        return UserApiResponseDomain(
            salutation = input.salutation,
            username = input.username,
            useremail = input.useremail,
            userid = input.userid,
            userrole = userRoleDoamainMapper(input.userrole),
            logintype = input.logintype,
            gender = input.gender,
            dob = input.dob,
            occupation = input.occupation,
            imageurl = input.imageurl,

            )
    }
}

private fun userRoleDoamainMapper(input: ArrayList<UserApiResponse.Userrole>): ArrayList<UserApiResponseDomain.UserRoleDomain> {
    val userRoleDataList: ArrayList<UserApiResponseDomain.UserRoleDomain> = ArrayList()
    input.forEach {
        userRoleDataList.add(
            UserApiResponseDomain.UserRoleDomain(
                userroleid = it.userroleid,
                userroletype = it.userroletype,
                isdefaultrole = it.isdefaultrole

            )

        )
    }
    return userRoleDataList
}

class UserRightsDomainMapper @Inject constructor() :
    Mapper<List<UserRightResponse?>, List<UserRightResponseDomain>> {
    override fun map(input: List<UserRightResponse?>): List<UserRightResponseDomain> {
        val rightData: MutableList<UserRightResponseDomain> = mutableListOf()
        input.forEach {
            rightData.add(
                UserRightResponseDomain(
                    roleid = it?.roleid,
                    righttype = it?.righttype,
                    rightid = it?.rightid,
                    rightdesc = it?.rightdesc
                )
            )
        }
        return rightData
    }

}


