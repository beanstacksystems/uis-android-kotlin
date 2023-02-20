package com.bss.patientregistration.dto;


public class TabValueDTO {
    private String tabname;
    private String tabdesc;
    private String tabdata;

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public String getTabdesc() {
        return tabdesc;
    }

    public void setTabdesc(String tabdesc) {
        this.tabdesc = tabdesc;
    }

    public String getTabdata() {
        return tabdata;
    }

    public void setTabdata(String tabdata) {
        this.tabdata = tabdata;
    }

    public int getTabseq() {
        return tabseq;
    }

    public void setTabseq(int tabseq) {
        this.tabseq = tabseq;
    }

    private int tabseq;
}
