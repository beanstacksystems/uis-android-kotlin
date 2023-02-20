package com.bss.patientregistration.dto;

import java.util.List;



public class PatientDTO {
    public String patientid;
    public String bloodgroup;
    public List<String> attendanttypeids;
    public List<PersonDTO> personlist;
    public String registrarid;
    public String referrerid;
    public String sponsorid;
    public String approverid;
    public String isactive;
    public String isapproved;
    public List<String> illnesstypes;
    public String followupcounsellerid;
    public MedicalDetailsDTO medicaldetails;
    public String remarks;
    public String createddate;
    public String updatedate;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public List<String> getAttendanttypeids() {
        return attendanttypeids;
    }

    public void setAttendanttypeids(List<String> attendanttypeids) {
        this.attendanttypeids = attendanttypeids;
    }

    public List<PersonDTO> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(List<PersonDTO> personlist) {
        this.personlist = personlist;
    }

    public String getRegistrarid() {
        return registrarid;
    }

    public void setRegistrarid(String registrarid) {
        this.registrarid = registrarid;
    }

    public String getReferrerid() {
        return referrerid;
    }

    public void setReferrerid(String referrerid) {
        this.referrerid = referrerid;
    }

    public String getSponsorid() {
        return sponsorid;
    }

    public void setSponsorid(String sponsorid) {
        this.sponsorid = sponsorid;
    }

    public String getApproverid() {
        return approverid;
    }

    public void setApproverid(String approverid) {
        this.approverid = approverid;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(String isapproved) {
        this.isapproved = isapproved;
    }

    public List<String> getIllnesstypes() {
        return illnesstypes;
    }

    public void setIllnesstypes(List<String> illnesstypes) {
        this.illnesstypes = illnesstypes;
    }

    public String getFollowupcounsellerid() {
        return followupcounsellerid;
    }

    public void setFollowupcounsellerid(String followupcounsellerid) {
        this.followupcounsellerid = followupcounsellerid;
    }

    public MedicalDetailsDTO getMedicaldetails() {
        return medicaldetails;
    }

    public void setMedicaldetails(MedicalDetailsDTO medicaldetails) {
        this.medicaldetails = medicaldetails;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
