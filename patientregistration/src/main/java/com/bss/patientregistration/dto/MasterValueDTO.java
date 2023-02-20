package com.bss.patientregistration.dto;




public class MasterValueDTO {
    private String masterdataType;
    private int masterdataId;
    private String masterdataval;
    private String isactive;
    private String masterdatadesc;

    public String getMasterdataType() {
        return masterdataType;
    }

    public void setMasterdataType(String masterdataType) {
        this.masterdataType = masterdataType;
    }

    public int getMasterdataId() {
        return masterdataId;
    }

    public void setMasterdataId(int masterdataId) {
        this.masterdataId = masterdataId;
    }

    public String getMasterdataval() {
        return masterdataval;
    }

    public void setMasterdataval(String masterdataval) {
        this.masterdataval = masterdataval;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getMasterdatadesc() {
        return masterdatadesc;
    }

    public void setMasterdatadesc(String masterdatadesc) {
        this.masterdatadesc = masterdatadesc;
    }
}
