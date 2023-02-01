package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class PatientRegistrationResReq(
    @SerializedName("patientid") var patientid: Int? = null,
    @SerializedName("bloodgroup") var bloodgroup: Int? = null,
    @SerializedName("attendanttypeids") var attendanttypeids: ArrayList<String> = arrayListOf(),
    @SerializedName("personlist") var personlist: ArrayList<Personlist> = arrayListOf(),
    @SerializedName("registrarid") var registrarid: Int? = null,
    @SerializedName("referrerid") var referrerid: Int? = null,
    @SerializedName("sponsorid") var sponsorid: Int? = null,
    @SerializedName("approverid") var approverid: Int? = null,
    @SerializedName("applicationurl") var applicationurl: String? = null,
    @SerializedName("isactive") var isactive: String? = null,
    @SerializedName("isapproved") var isapproved: String? = null,
    @SerializedName("illnesstypes") var illnesstypes: ArrayList<String> = arrayListOf(),
    @SerializedName("followupcounsellerid") var followupcounsellerid: Int? = null,
    @SerializedName("medicaldetails") var medicaldetails: Medicaldetails? = Medicaldetails(),
    @SerializedName("remarks") var remarks: String? = null,
    @SerializedName("createddate") var createddate: String? = null,
    @SerializedName("updatedate") var updatedate: String? = null
)
data class Imagelist (

    @SerializedName("imageid"         ) var imageid         : Int?    = null,
    @SerializedName("medicalrecordid" ) var medicalrecordid : Int?    = null,
    @SerializedName("entityid"        ) var entityid        : Int?    = null,
    @SerializedName("entitytypeid"    ) var entitytypeid    : Int?    = null,
    @SerializedName("imagefilename"   ) var imagefilename   : String? = null,
    @SerializedName("imagedata"       ) var imagedata       : String? = null,
    @SerializedName("imageurl"        ) var imageurl        : String? = null,
    @SerializedName("imagetype"       ) var imagetype       : Int?    = null,
    @SerializedName("isactive"        ) var isactive        : String? = null,
    @SerializedName("createddate"     ) var createddate     : String? = null,
    @SerializedName("updatedate"      ) var updatedate      : String? = null

)
data class Addressdto (

    @SerializedName("addressid"     ) var addressid     : Int?    = null,
    @SerializedName("entityid"      ) var entityid      : Int?    = null,
    @SerializedName("entitytypeid"  ) var entitytypeid  : Int?    = null,
    @SerializedName("addresstypeid" ) var addresstypeid : Int?    = null,
    @SerializedName("addressline1"  ) var addressline1  : String? = null,
    @SerializedName("addressline2"  ) var addressline2  : String? = null,
    @SerializedName("addressline3"  ) var addressline3  : String? = null,
    @SerializedName("city"          ) var city          : String? = null,
    @SerializedName("district"      ) var district      : String? = null,
    @SerializedName("state"         ) var state         : String? = null,
    @SerializedName("country"       ) var country       : String? = null,
    @SerializedName("pincode"       ) var pincode       : Int?    = null,
    @SerializedName("isactive"      ) var isactive      : String? = null,
    @SerializedName("createddate"   ) var createddate   : String? = null,
    @SerializedName("updatedate"    ) var updatedate    : String? = null

)
data class Imagedto (

    @SerializedName("imageid"         ) var imageid         : Int?    = null,
    @SerializedName("medicalrecordid" ) var medicalrecordid : Int?    = null,
    @SerializedName("entityid"        ) var entityid        : Int?    = null,
    @SerializedName("entitytypeid"    ) var entitytypeid    : Int?    = null,
    @SerializedName("imagefilename"   ) var imagefilename   : String? = null,
    @SerializedName("imagedata"       ) var imagedata       : String? = null,
    @SerializedName("imageurl"        ) var imageurl        : String? = null,
    @SerializedName("imagetype"       ) var imagetype       : Int?    = null,
    @SerializedName("isactive"        ) var isactive        : String? = null,
    @SerializedName("createddate"     ) var createddate     : String? = null,
    @SerializedName("updatedate"      ) var updatedate      : String? = null

)
data class Idproofdto (

    @SerializedName("idproofid"    ) var idproofid    : Int?      = null,
    @SerializedName("entityid"     ) var entityid     : Int?      = null,
    @SerializedName("entitytypeid" ) var entitytypeid : Int?      = null,
    @SerializedName("idtypeid"     ) var idtypeid     : Int?      = null,
    @SerializedName("iddetails"    ) var iddetails    : String?   = null,
    @SerializedName("imagedto"     ) var imagedto     : Imagedto? = Imagedto(),
    @SerializedName("isactive"     ) var isactive     : String?   = null,
    @SerializedName("createddate"  ) var createddate  : String?   = null,
    @SerializedName("updatedate"   ) var updatedate   : String?   = null

)
data class Contactlist (

    @SerializedName("contactid"      ) var contactid      : Int?    = null,
    @SerializedName("entityid"       ) var entityid       : Int?    = null,
    @SerializedName("entitytypeid"   ) var entitytypeid   : Int?    = null,
    @SerializedName("contacttypeid"  ) var contacttypeid  : Int?    = null,
    @SerializedName("contactdetails" ) var contactdetails : Int?    = null,
    @SerializedName("isactive"       ) var isactive       : String? = null,
    @SerializedName("createddate"    ) var createddate    : String? = null,
    @SerializedName("updatedate"     ) var updatedate     : String? = null

)
data class Personlist (

    @SerializedName("personid"            ) var personid            : Int?                   = null,
    @SerializedName("entitytype"          ) var entitytype          : Int?                   = null,
    @SerializedName("prefix"              ) var prefix              : Int?                   = null,
    @SerializedName("name"                ) var name                : String?                = null,
    @SerializedName("suffix"              ) var suffix              : Int?                   = null,
    @SerializedName("dateofbirth"         ) var dateofbirth         : String?                = null,
    @SerializedName("gender"              ) var gender              : Int?                   = null,
    @SerializedName("imagelist"           ) var imagelist           : ArrayList<Imagelist>   = arrayListOf(),
    @SerializedName("relationwithpatient" ) var relationwithpatient : Int?                   = null,
    @SerializedName("incomeperyear"       ) var incomeperyear       : Int?                   = null,
    @SerializedName("occupation"          ) var occupation          : Int?                   = null,
    @SerializedName("isactive"            ) var isactive            : String?                = null,
    @SerializedName("addressdto"          ) var addressdto          : Addressdto?            = Addressdto(),
    @SerializedName("idproofdto"          ) var idproofdto          : Idproofdto?            = Idproofdto(),
    @SerializedName("contactlist"         ) var contactlist         : ArrayList<Contactlist> = arrayListOf(),
    @SerializedName("createddate"         ) var createddate         : String?                = null,
    @SerializedName("updatedate"          ) var updatedate          : String?                = null

)


data class Medicaldetails (

    @SerializedName("medicalrecordid"  ) var medicalrecordid  : Int?                 = null,
    @SerializedName("patientid"        ) var patientid        : Int?                 = null,
    @SerializedName("illnesstypeid"    ) var illnesstypeid    : Int?                 = null,
    @SerializedName("illnessstageid"   ) var illnessstageid   : Int?                 = null,
    @SerializedName("diagnosisdetails" ) var diagnosisdetails : Int?                 = null,
    @SerializedName("imagelist"        ) var imagelist        : ArrayList<Imagelist> = arrayListOf(),
    @SerializedName("diagnosisdate"    ) var diagnosisdate    : String?              = null,
    @SerializedName("otherremarks"     ) var otherremarks     : String?              = null,
    @SerializedName("isactive"         ) var isactive         : String?              = null,
    @SerializedName("createddate"      ) var createddate      : String?              = null,
    @SerializedName("updatedate"       ) var updatedate       : String?              = null

)
