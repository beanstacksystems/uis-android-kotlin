package com.bss.patientregistration.dto;



public class UserRightDTO {
    public int roleid;
    public String righttype;
    public  int rightid;
    public  String rightdesc;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRighttype() {
        return righttype;
    }

    public void setRighttype(String righttype) {
        this.righttype = righttype;
    }

    public int getRightid() {
        return rightid;
    }

    public void setRightid(int rightid) {
        this.rightid = rightid;
    }

    public String getRightdesc() {
        return rightdesc;
    }

    public void setRightdesc(String rightdesc) {
        this.rightdesc = rightdesc;
    }
}
