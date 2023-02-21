package com.bss.uis.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class PatientDetailsResponse(

	@field:SerializedName("registrarid")
	val registrarid: Int? = null,

	@field:SerializedName("isapproved")
	val isapproved: String? = null,

	@field:SerializedName("patientid")
	val patientid: Int? = null,

	@field:SerializedName("referrerid")
	val referrerid: Int? = null,

	@field:SerializedName("createddate")
	val createddate: Any? = null,

	@field:SerializedName("attendanttypeids")
	val attendanttypeids: String? = null,

	@field:SerializedName("sponsorid")
	val sponsorid: Int? = null,

	@field:SerializedName("approverid")
	val approverid: Int? = null,

	@field:SerializedName("isactive")
	val isactive: String? = null,

	@field:SerializedName("personlist")
	val personlist: List<PersonlistItem?>? = null,

	@field:SerializedName("illnesstypes")
	val illnesstypes: String? = null,

	@field:SerializedName("medicaldetails")
	val medicaldetails: Medicaldetails? = null,

	@field:SerializedName("bloodgroup")
	val bloodgroup: Int? = null,

	@field:SerializedName("updatedate")
	val updatedate: Any? = null,

	@field:SerializedName("followupcounsellerid")
	val followupcounsellerid: Any? = null,

	@field:SerializedName("applicationurl")
	val applicationurl: Any? = null,

	@field:SerializedName("remarks")
	val remarks: String? = null
)

data class IdproofdtoItem(

	@field:SerializedName("created_date_time")
	val createdDateTime: String? = null,

	@field:SerializedName("last_updated_date_time")
	val lastUpdatedDateTime: String? = null,

	@field:SerializedName("is_active")
	val isActive: String? = null,

	@field:SerializedName("idproof_id")
	val idproofId: Int? = null,

	@field:SerializedName("entity_type_id")
	val entityTypeId: Int? = null,

	@field:SerializedName("entity_id")
	val entityId: Int? = null,

	@field:SerializedName("image_id")
	val imageId: Int? = null,

	@field:SerializedName("id_type_id")
	val idTypeId: Int? = null,

	@field:SerializedName("id_details")
	val idDetails: String? = null
)

data class PersonlistItem(

	@field:SerializedName("dateofbirth")
	val dateofbirth: String? = null,

	@field:SerializedName("occupation")
	val occupation: Int? = null,

	@field:SerializedName("gender")
	val gender: Int? = null,

	@field:SerializedName("contactlist")
	val contactlist: List<ContactlistItem?>? = null,

	@field:SerializedName("addressdto")
	val addressdto: Addressdto? = null,

	@field:SerializedName("createddate")
	val createddate: Any? = null,

	@field:SerializedName("prefix")
	val prefix: Int? = null,

	@field:SerializedName("relationwithpatient")
	val relationwithpatient: Any? = null,

	@field:SerializedName("isactive")
	val isactive: String? = null,

	@field:SerializedName("imagelist")
	val imagelist: List<ImagelistItem?>? = null,

	@field:SerializedName("suffix")
	val suffix: String? = null,

	@field:SerializedName("idproofdto")
	val idproofdto: List<IdproofdtoItem?>? = null,

	@field:SerializedName("entitytype")
	val entitytype: Int? = null,

	@field:SerializedName("updatedate")
	val updatedate: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("incomeperyear")
	val incomeperyear: Any? = null,

	@field:SerializedName("personid")
	val personid: Any? = null
)

data class Medicaldetails(

	@field:SerializedName("illnessstageid")
	val illnessstageid: Any? = null,

	@field:SerializedName("otherremarks")
	val otherremarks: Any? = null,

	@field:SerializedName("updatedate")
	val updatedate: Any? = null,

	@field:SerializedName("medicalrecordid")
	val medicalrecordid: Any? = null,

	@field:SerializedName("patientid")
	val patientid: Any? = null,

	@field:SerializedName("createddate")
	val createddate: Any? = null,

	@field:SerializedName("isactive")
	val isactive: Any? = null,

	@field:SerializedName("illnesstypeid")
	val illnesstypeid: Any? = null,

	@field:SerializedName("diagnosisdetails")
	val diagnosisdetails: Any? = null,

	@field:SerializedName("diagnosisdate")
	val diagnosisdate: Any? = null,

	@field:SerializedName("imagelist")
	val imagelist: List<Any?>? = null
)

data class ImagelistItem(

	@field:SerializedName("imagetype")
	val imagetype: Int? = null,

	@field:SerializedName("imageid")
	val imageid: Any? = null,

	@field:SerializedName("updatedate")
	val updatedate: String? = null,

	@field:SerializedName("medicalrecordid")
	val medicalrecordid: Any? = null,

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
	val imagedata: Any? = null,

	@field:SerializedName("imagefilename")
	val imagefilename: String? = null
)

data class ContactlistItem(

	@field:SerializedName("contactdetails")
	val contactdetails: String? = null,

	@field:SerializedName("updatedate")
	val updatedate: String? = null,

	@field:SerializedName("contactid")
	val contactid: Int? = null,

	@field:SerializedName("entitytypeid")
	val entitytypeid: Int? = null,

	@field:SerializedName("createddate")
	val createddate: String? = null,

	@field:SerializedName("contacttypeid")
	val contacttypeid: Int? = null,

	@field:SerializedName("isactive")
	val isactive: String? = null,

	@field:SerializedName("entityid")
	val entityid: Int? = null
)

data class Addressdto(

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("pincode")
	val pincode: Int? = null,

	@field:SerializedName("entitytypeid")
	val entitytypeid: Int? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("createddate")
	val createddate: String? = null,

	@field:SerializedName("isactive")
	val isactive: String? = null,

	@field:SerializedName("entityid")
	val entityid: Int? = null,

	@field:SerializedName("addressid")
	val addressid: Int? = null,

	@field:SerializedName("updatedate")
	val updatedate: String? = null,

	@field:SerializedName("district")
	val district: String? = null,

	@field:SerializedName("addressline3")
	val addressline3: String? = null,

	@field:SerializedName("addressline2")
	val addressline2: String? = null,

	@field:SerializedName("addressline1")
	val addressline1: String? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("addresstypeid")
	val addresstypeid: Int? = null
)
