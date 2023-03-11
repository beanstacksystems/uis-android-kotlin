package com.bss.uis.data.remote.dto.request

import com.google.gson.annotations.SerializedName

data class UpdateUserProfileDataRequest(

	@field:SerializedName("occupation")
	val occupation: Int? = null,

	@field:SerializedName("gender")
	val gender: String? = null,

	@field:SerializedName("dob")
	val dob: String? = null,

	@field:SerializedName("logintype")
	val logintype: String? = null,

	@field:SerializedName("imagedto")
	val imagedto: Imagedto? = null,

	@field:SerializedName("userrole")
	val userrole: String? = null,

	@field:SerializedName("personid")
	val personid: Int? = null,

	@field:SerializedName("salutation")
	val salutation: String? = null,

	@field:SerializedName("userid")
	val userid: Int? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("useremail")
	val useremail: String? = null
){
	data class Imagedto(

		@field:SerializedName("imagetype")
		val imagetype: Int? = null,

		@field:SerializedName("imageid")
		val imageid: Int? = null,

		@field:SerializedName("updatedate")
		val updatedate: String? = null,

		@field:SerializedName("medicalrecordid")
		val medicalrecordid: Int? = null,

		@field:SerializedName("entitytypeid")
		val entitytypeid: Int? = null,

		@field:SerializedName("createddate")
		val createddate: String? = null,

		@field:SerializedName("imageurl")
		val imageurl: String? = null,

		@field:SerializedName("isactive")
		val isactive: String? = null,

		@field:SerializedName("entityid")
		val entityid: Int? = null,

		@field:SerializedName("imagedata")
		val imagedata: String? = null,

		@field:SerializedName("imagefilename")
		val imagefilename: String? = null
	)
}
