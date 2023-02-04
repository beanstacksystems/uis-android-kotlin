package com.bss.uis.roomdb.dao.repository

import androidx.lifecycle.LiveData
import com.bss.uis.roomdb.dao.PatientDao
import com.bss.uis.roomdb.dto.AddressDTO
import com.bss.uis.roomdb.entity.*

class PatientDaoRepository(private val patientDao: PatientDao) {
    val listPatient: LiveData<List<Patient>> = patientDao.getAll()

    suspend fun insertPatientData(patient: Patient){
        patientDao.insertPatient(patient)
    }
    suspend fun deletePatientData(){
        patientDao.delete()
    }
    suspend fun insertImageList(patientImageList:List<PatientImages> ){
        patientDao.insertPatientImages(patientImageList)

    }
    suspend fun insertPatientAttendant(patientAttendants: List<PatientAttendant>){
        patientDao.insertPatientAttendant(patientAttendants)
    }
    suspend fun insertPatientAddress(addressDTO: Address){
        patientDao.insertPatientAddress(addressDTO)
    }
    suspend fun insertMedicalHistory(medicalHistory: MedicalHistory){
        patientDao.insertMedicalHistory(medicalHistory)
    }

}