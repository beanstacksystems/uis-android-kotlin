package com.bss.uis.data.remote.dto.request


data class PatientRegistatrtionRequest(

    var patientid: Int? = null,
    var bloodgroup: Int? = null,
    var attendanttypeids: ArrayList<String> = arrayListOf(),
    var personlist: ArrayList<PersonlistRequest> = arrayListOf(),
    var registrarid: Int? = null,
    var referrerid: Int? = null,
    var sponsorid: Int? = null,
    var approverid: Int? = null,
    var applicationurl: String? = null,
    var isactive: String? = null,
    var isapproved: String? = null,
    var illnesstypes: ArrayList<String> = arrayListOf(),
    var followupcounsellerid: Int? = null,
    var medicaldetails: MedicaldetailsRequest? = MedicaldetailsRequest(),
    var remarks: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable

data class ImagelistRequest(

    var imageid: Int? = null,
    var medicalrecordid: Int? = null,
    var entityid: Int? = null,
    var entitytypeid: Int? = null,
    var imagefilename: String? = null,
    var imagedata: String? = null,
    var imageurl: String? = null,
    var imagetype: Int? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable

data class AddressdtoRequest(

    var addressid: Int? = null,
    var entityid: Int? = null,
    var entitytypeid: Int? = null,
    var addresstypeid: Int? = null,
    var addressline1: String? = null,
    var addressline2: String? = null,
    var addressline3: String? = null,
    var city: String? = null,
    var district: String? = null,
    var state: String? = null,
    var country: String? = null,
    var pincode: Int? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable

data class ImagedtoRequest(

    var imageid: Int? = null,
    var medicalrecordid: Int? = null,
    var entityid: Int? = null,
    var entitytypeid: Int? = null,
    var imagefilename: String? = null,
    var imagedata: String? = null,
    var imageurl: String? = null,
    var imagetype: Int? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable

data class IdproofdtoRequest(

    var idproofid: Int? = null,
    var entityid: Int? = null,
    var entitytypeid: Int? = null,
    var idtypeid: Int? = null,
    var iddetails: String? = null,
    var imagedto: ImagedtoRequest? = ImagedtoRequest(),
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable

data class ContactlistRequest(

    var contactid: Int? = null,
    var entityid: Int? = null,
    var entitytypeid: Int? = null,
    var contacttypeid: Int? = null,
    var contactdetails: String? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null
) : java.io.Serializable

data class PersonlistRequest(

    var personid: Int? = null,
    var entitytype: Int? = null,
    var prefix: Int? = null,
    var name: String? = null,
    var suffix: Int? = null,
    var dateofbirth: String? = null,
    var gender: Int? = null,
    var imagelist: ArrayList<ImagelistRequest> = arrayListOf(),
    var relationwithpatient: Int? = null,
    var incomeperyear: String? = null,
    var occupation: Int? = null,
    var isactive: String? = null,
    var addressdto: AddressdtoRequest? = AddressdtoRequest(),
    var idproofdto: IdproofdtoRequest? = IdproofdtoRequest(),
    var contactlist: ArrayList<ContactlistRequest> = arrayListOf(),
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable

data class MedicaldetailsRequest(

    var medicalrecordid: Int? = null,
    var patientid: Int? = null,
    var illnesstypeid: Int? = null,
    var illnessstageid: Int? = null,
    var diagnosisdetails: Int? = null,
    var imagelist: ArrayList<ImagelistRequest> = arrayListOf(),
    var diagnosisdate: String? = null,
    var otherremarks: String? = null,
    var isactive: String? = null,
    var createddate: String? = null,
    var updatedate: String? = null

) : java.io.Serializable
