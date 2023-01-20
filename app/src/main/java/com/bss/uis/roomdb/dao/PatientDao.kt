package com.bss.uis.roomdb.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.bss.uis.roomdb.entity.*

@Dao
interface PatientDao {
    @Query("SELECT * FROM Patient")
    fun getAll(): LiveData<List<Patient>>

    @Query("SELECT * FROM Patient WHERE patientId Is:patientId")
    fun findByPatientId(patientId: Int): List<Patient?>?

    @Transaction
    @Insert
    fun insertPatient(patient: Patient): Long

    @Insert
    fun insertPatientImages(patientImageList: List<PatientImages?>?)

    @Insert
    fun insertPatientAddress(address: Address?)

    @Insert
    fun insertMedicalHistory(medicalHistory: MedicalHistory?)

    @Insert
    fun insertPatientAttendant(patientAttendants: List<PatientAttendant>)

    @Transaction
    @Delete
    fun deletePatient(patient: Patient?)

    @Delete
    fun deletePatientImages(patientImageList: List<PatientImages?>?)

    @Delete
    fun deletePatientAddress(address: Address?)

    @Delete
    fun deleteMedicalHistory(medicalHistory: MedicalHistory?)

    @Delete
    fun deletePatientAttendant(patientAttendants: List<PatientAttendant?>?)

    @Transaction
    @Update
    fun updatePatient(patient: Patient?)

    @Update
    fun updatePatientImages(patientImages: PatientImages?)

}