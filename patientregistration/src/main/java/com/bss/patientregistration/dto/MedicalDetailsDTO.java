package com.bss.patientregistration.dto;

import java.util.List;


public class MedicalDetailsDTO {

    public String medicalrecordid;
    public String patientid;
    public String illnesstypeid;
    public String illnessstageid;
    public String diagnosisdetails;
    public List<ImageDTO> imagelist;
    public String diagnosisdate;
    public String otherremarks;
    public String isactive;
    public String createddate;
    public String updatedate;

    public String getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(String medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getIllnesstypeid() {
        return illnesstypeid;
    }

    public void setIllnesstypeid(String illnesstypeid) {
        this.illnesstypeid = illnesstypeid;
    }

    public String getIllnessstageid() {
        return illnessstageid;
    }

    public void setIllnessstageid(String illnessstageid) {
        this.illnessstageid = illnessstageid;
    }

    public String getDiagnosisdetails() {
        return diagnosisdetails;
    }

    public void setDiagnosisdetails(String diagnosisdetails) {
        this.diagnosisdetails = diagnosisdetails;
    }

    public List<ImageDTO> getImagelist() {
        return imagelist;
    }

    public void setImagelist(List<ImageDTO> imagelist) {
        this.imagelist = imagelist;
    }

    public String getDiagnosisdate() {
        return diagnosisdate;
    }

    public void setDiagnosisdate(String diagnosisdate) {
        this.diagnosisdate = diagnosisdate;
    }

    public String getOtherremarks() {
        return otherremarks;
    }

    public void setOtherremarks(String otherremarks) {
        this.otherremarks = otherremarks;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }
}
