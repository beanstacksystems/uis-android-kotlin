package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class FetchPatientList(
    @SerializedName("patientId"         ) var patientId         : Int?            = null,
    @SerializedName("personId"          ) var personId          : Int?            = null,
    @SerializedName("patientName"       ) var patientName       : String?         = null,
    @SerializedName("patientAge"        ) var patientAge        : String?         = null,
    @SerializedName("patientContact"    ) var patientContact    : String?         = null,
    @SerializedName("patientCancerType" ) var patientCancerType : String?         = null,
    @SerializedName("patientImage"      ) var patientImage      : String?         = null,
    @SerializedName("attendantIds"      ) var attendantIds      : String?         = null,
    @SerializedName("patientAddress"    ) var patientAddress    : PatientAddress? = PatientAddress()

)
data class PatientAddress (

    @SerializedName("address_id"             ) var addressId           : Int?    = null,
    @SerializedName("entity_id"              ) var entityId            : Int?    = null,
    @SerializedName("entity_type_id"         ) var entityTypeId        : Int?    = null,
    @SerializedName("address_type_id"        ) var addressTypeId       : Int?    = null,
    @SerializedName("address_line_1"         ) var addressLine1        : String? = null,
    @SerializedName("address_line_2"         ) var addressLine2        : String? = null,
    @SerializedName("address_line_3"         ) var addressLine3        : String? = null,
    @SerializedName("city"                   ) var city                : String? = null,
    @SerializedName("district"               ) var district            : String? = null,
    @SerializedName("state"                  ) var state               : String? = null,
    @SerializedName("country"                ) var country             : String? = null,
    @SerializedName("pin_code"               ) var pinCode             : Int?    = null,
    @SerializedName("is_active"              ) var isActive            : String? = null,
    @SerializedName("created_date_time"      ) var createdDateTime     : String? = null,
    @SerializedName("last_updated_date_time" ) var lastUpdatedDateTime : String? = null

)
