package com.bss.uis.roomdb.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006H\u00c6\u0003J\u0013\u0010G\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00e1\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Q\u001a\u00020RH\u00d6\u0001J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001a\u00a8\u0006T"}, d2 = {"Lcom/bss/uis/roomdb/dto/PatientDTO;", "", "patientid", "", "bloodgroup", "attendanttypeids", "", "personlist", "Lcom/bss/uis/roomdb/dto/PersonDto;", "registrarid", "referrerid", "sponsorid", "approverid", "isactive", "isapproved", "illnesstypes", "followupcounsellerid", "medicaldetails", "Lcom/bss/uis/roomdb/dto/MedicalDetailsDTO;", "remarks", "createddate", "updatedate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/bss/uis/roomdb/dto/MedicalDetailsDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApproverid", "()Ljava/lang/String;", "setApproverid", "(Ljava/lang/String;)V", "getAttendanttypeids", "()Ljava/util/List;", "setAttendanttypeids", "(Ljava/util/List;)V", "getBloodgroup", "setBloodgroup", "getCreateddate", "setCreateddate", "getFollowupcounsellerid", "setFollowupcounsellerid", "getIllnesstypes", "setIllnesstypes", "getIsactive", "setIsactive", "getIsapproved", "setIsapproved", "getMedicaldetails", "()Lcom/bss/uis/roomdb/dto/MedicalDetailsDTO;", "setMedicaldetails", "(Lcom/bss/uis/roomdb/dto/MedicalDetailsDTO;)V", "getPatientid", "setPatientid", "getPersonlist", "setPersonlist", "getReferrerid", "setReferrerid", "getRegistrarid", "setRegistrarid", "getRemarks", "setRemarks", "getSponsorid", "setSponsorid", "getUpdatedate", "setUpdatedate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class PatientDTO {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bloodgroup;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> attendanttypeids;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.bss.uis.roomdb.dto.PersonDto> personlist;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String registrarid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String referrerid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sponsorid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String approverid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isactive;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isapproved;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> illnesstypes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String followupcounsellerid;
    @org.jetbrains.annotations.Nullable()
    private com.bss.uis.roomdb.dto.MedicalDetailsDTO medicaldetails;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remarks;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String createddate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String updatedate;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.roomdb.dto.PatientDTO copy(@org.jetbrains.annotations.Nullable()
    java.lang.String patientid, @org.jetbrains.annotations.Nullable()
    java.lang.String bloodgroup, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> attendanttypeids, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.dto.PersonDto> personlist, @org.jetbrains.annotations.Nullable()
    java.lang.String registrarid, @org.jetbrains.annotations.Nullable()
    java.lang.String referrerid, @org.jetbrains.annotations.Nullable()
    java.lang.String sponsorid, @org.jetbrains.annotations.Nullable()
    java.lang.String approverid, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String isapproved, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> illnesstypes, @org.jetbrains.annotations.Nullable()
    java.lang.String followupcounsellerid, @org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.dto.MedicalDetailsDTO medicaldetails, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.lang.String createddate, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedate) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PatientDTO() {
        super();
    }
    
    public PatientDTO(@org.jetbrains.annotations.Nullable()
    java.lang.String patientid, @org.jetbrains.annotations.Nullable()
    java.lang.String bloodgroup, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> attendanttypeids, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.dto.PersonDto> personlist, @org.jetbrains.annotations.Nullable()
    java.lang.String registrarid, @org.jetbrains.annotations.Nullable()
    java.lang.String referrerid, @org.jetbrains.annotations.Nullable()
    java.lang.String sponsorid, @org.jetbrains.annotations.Nullable()
    java.lang.String approverid, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String isapproved, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> illnesstypes, @org.jetbrains.annotations.Nullable()
    java.lang.String followupcounsellerid, @org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.dto.MedicalDetailsDTO medicaldetails, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.lang.String createddate, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientid() {
        return null;
    }
    
    public final void setPatientid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBloodgroup() {
        return null;
    }
    
    public final void setBloodgroup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAttendanttypeids() {
        return null;
    }
    
    public final void setAttendanttypeids(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.roomdb.dto.PersonDto> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.roomdb.dto.PersonDto> getPersonlist() {
        return null;
    }
    
    public final void setPersonlist(@org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.roomdb.dto.PersonDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegistrarid() {
        return null;
    }
    
    public final void setRegistrarid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReferrerid() {
        return null;
    }
    
    public final void setReferrerid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSponsorid() {
        return null;
    }
    
    public final void setSponsorid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApproverid() {
        return null;
    }
    
    public final void setApproverid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIsactive() {
        return null;
    }
    
    public final void setIsactive(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIsapproved() {
        return null;
    }
    
    public final void setIsapproved(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getIllnesstypes() {
        return null;
    }
    
    public final void setIllnesstypes(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFollowupcounsellerid() {
        return null;
    }
    
    public final void setFollowupcounsellerid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.roomdb.dto.MedicalDetailsDTO component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.roomdb.dto.MedicalDetailsDTO getMedicaldetails() {
        return null;
    }
    
    public final void setMedicaldetails(@org.jetbrains.annotations.Nullable()
    com.bss.uis.roomdb.dto.MedicalDetailsDTO p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final void setRemarks(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreateddate() {
        return null;
    }
    
    public final void setCreateddate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedate() {
        return null;
    }
    
    public final void setUpdatedate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}