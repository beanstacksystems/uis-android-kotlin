package com.bss.patientregistration.dto;




public class ContactTypeDTO {
    public String contactid;
    public String entityid;
    public String entitytypeid;
    public String contacttypeid;
    public String contactdetails;
    public String isactive;
    public String createddate;
    public String updatedate;

    public String getContactid() {
        return contactid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    public String getEntitytypeid() {
        return entitytypeid;
    }

    public void setEntitytypeid(String entitytypeid) {
        this.entitytypeid = entitytypeid;
    }

    public String getContacttypeid() {
        return contacttypeid;
    }

    public void setContacttypeid(String contacttypeid) {
        this.contacttypeid = contacttypeid;
    }

    public String getContactdetails() {
        return contactdetails;
    }

    public void setContactdetails(String contactdetails) {
        this.contactdetails = contactdetails;
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
