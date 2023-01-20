package com.bss.uis.roomdb.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.bss.uis.roomdb.entity.*

class PatientDetailsData(
    @Embedded
    var patient: Patient? = null,

    @Relation(parentColumn = "patientId", entityColumn = "imageId")
    var imagesList: List<PatientImages>? = null,

    @Relation(parentColumn = "patientId", entityColumn = "addressId")
    var address: Address? = null,

    @Relation(parentColumn = "patientId", entityColumn = "medicalHistoryId")
    var medicalHistory: MedicalHistory? = null,

    @Relation(parentColumn = "patientId", entityColumn = "attendantId")
    var patientAttendants: List<PatientAttendant>? = null
){

}