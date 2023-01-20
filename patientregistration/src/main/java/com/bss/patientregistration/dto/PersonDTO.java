package com.bss.patientregistration.dto;

import java.util.List;



public class PersonDTO {
    public String personid;
    public String entitytype;
    public String prefix;
    public String name;
    public String suffix;
    public String dateofbirth;
    public String gender;
    public List<ImageDTO> imagelist;
    public String relationwithpatient;
    public String incomeperyear;
    public String occupation;
    public String isactive;
    public AddressDTO addressdto;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getEntitytype() {
        return entitytype;
    }

    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<ImageDTO> getImagelist() {
        return imagelist;
    }

    public void setImagelist(List<ImageDTO> imagelist) {
        this.imagelist = imagelist;
    }

    public String getRelationwithpatient() {
        return relationwithpatient;
    }

    public void setRelationwithpatient(String relationwithpatient) {
        this.relationwithpatient = relationwithpatient;
    }

    public String getIncomeperyear() {
        return incomeperyear;
    }

    public void setIncomeperyear(String incomeperyear) {
        this.incomeperyear = incomeperyear;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public AddressDTO getAddressdto() {
        return addressdto;
    }

    public void setAddressdto(AddressDTO addressdto) {
        this.addressdto = addressdto;
    }

    public IdproofDTO getIdproofdto() {
        return idproofdto;
    }

    public void setIdproofdto(IdproofDTO idproofdto) {
        this.idproofdto = idproofdto;
    }

    public List<ContactTypeDTO> getContactlist() {
        return contactlist;
    }

    public void setContactlist(List<ContactTypeDTO> contactlist) {
        this.contactlist = contactlist;
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

    public IdproofDTO idproofdto;
    public List<ContactTypeDTO> contactlist;
    public String createddate;
    public String updatedate;
}
