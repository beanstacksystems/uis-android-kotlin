package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PinCodeResponse(
    @SerializedName("Name") @Expose
    var name: String? = null,
    @SerializedName("Description")
    @Expose
    var description: String? = null,

    @SerializedName("BranchType")
    @Expose
    var branchType: String? = null,

    @SerializedName("DeliveryStatus")
    @Expose
    var deliveryStatus: String? = null,

    @SerializedName("District")
    @Expose
    var district: String? = null,

    @SerializedName("Division")
    @Expose
    var division: String? = null,

    @SerializedName("Region")
    @Expose
    var region: String? = null,

    @SerializedName("block")
    @Expose
    var Block: String? = null,

    @SerializedName("State")
    @Expose
    var state: String? = null,

    @SerializedName("Country")
    @Expose
    var country: String? = null,

    @SerializedName("Pincode")
    @Expose
    var pincode: String? = null
)
