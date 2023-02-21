package com.bss.uis.data.remote.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00fb\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010F\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0019\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u00c6\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010J\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u00c6\u0003J\u0019\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bH\u00c6\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010U\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0084\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u00d6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00d6\u0001J\t\u0010]\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\'\u0010\u001f\"\u0004\b(\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001d\u00a8\u0006^"}, d2 = {"Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "Ljava/io/Serializable;", "patientid", "", "bloodgroup", "attendanttypeids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "personlist", "Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "registrarid", "referrerid", "sponsorid", "approverid", "applicationurl", "isactive", "isapproved", "illnesstypes", "followupcounsellerid", "medicaldetails", "Lcom/bss/uis/data/remote/dto/request/MedicaldetailsRequest;", "remarks", "createddate", "updatedate", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Lcom/bss/uis/data/remote/dto/request/MedicaldetailsRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationurl", "()Ljava/lang/String;", "setApplicationurl", "(Ljava/lang/String;)V", "getApproverid", "()Ljava/lang/Integer;", "setApproverid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAttendanttypeids", "()Ljava/util/ArrayList;", "setAttendanttypeids", "(Ljava/util/ArrayList;)V", "getBloodgroup", "setBloodgroup", "getCreateddate", "setCreateddate", "getFollowupcounsellerid", "setFollowupcounsellerid", "getIllnesstypes", "setIllnesstypes", "getIsactive", "setIsactive", "getIsapproved", "setIsapproved", "getMedicaldetails", "()Lcom/bss/uis/data/remote/dto/request/MedicaldetailsRequest;", "setMedicaldetails", "(Lcom/bss/uis/data/remote/dto/request/MedicaldetailsRequest;)V", "getPatientid", "setPatientid", "getPersonlist", "setPersonlist", "getReferrerid", "setReferrerid", "getRegistrarid", "setRegistrarid", "getRemarks", "setRemarks", "getSponsorid", "setSponsorid", "getUpdatedate", "setUpdatedate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Lcom/bss/uis/data/remote/dto/request/MedicaldetailsRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bss/uis/data/remote/dto/request/PatientRegistatrtionRequest;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class PatientRegistatrtionRequest implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer patientid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer bloodgroup;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> attendanttypeids;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.bss.uis.data.remote.dto.request.PersonlistRequest> personlist;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer registrarid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer referrerid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sponsorid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer approverid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String applicationurl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isactive;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isapproved;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> illnesstypes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer followupcounsellerid;
    @org.jetbrains.annotations.Nullable()
    private com.bss.uis.data.remote.dto.request.MedicaldetailsRequest medicaldetails;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remarks;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String createddate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String updatedate;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.PatientRegistatrtionRequest copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer patientid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bloodgroup, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> attendanttypeids, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.PersonlistRequest> personlist, @org.jetbrains.annotations.Nullable()
    java.lang.Integer registrarid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer referrerid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sponsorid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer approverid, @org.jetbrains.annotations.Nullable()
    java.lang.String applicationurl, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String isapproved, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> illnesstypes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer followupcounsellerid, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.MedicaldetailsRequest medicaldetails, @org.jetbrains.annotations.Nullable()
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
    
    public PatientRegistatrtionRequest() {
        super();
    }
    
    public PatientRegistatrtionRequest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer patientid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bloodgroup, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> attendanttypeids, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.PersonlistRequest> personlist, @org.jetbrains.annotations.Nullable()
    java.lang.Integer registrarid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer referrerid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sponsorid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer approverid, @org.jetbrains.annotations.Nullable()
    java.lang.String applicationurl, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String isapproved, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> illnesstypes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer followupcounsellerid, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.MedicaldetailsRequest medicaldetails, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.lang.String createddate, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientid() {
        return null;
    }
    
    public final void setPatientid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBloodgroup() {
        return null;
    }
    
    public final void setBloodgroup(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getAttendanttypeids() {
        return null;
    }
    
    public final void setAttendanttypeids(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.bss.uis.data.remote.dto.request.PersonlistRequest> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.bss.uis.data.remote.dto.request.PersonlistRequest> getPersonlist() {
        return null;
    }
    
    public final void setPersonlist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.PersonlistRequest> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRegistrarid() {
        return null;
    }
    
    public final void setRegistrarid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReferrerid() {
        return null;
    }
    
    public final void setReferrerid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSponsorid() {
        return null;
    }
    
    public final void setSponsorid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getApproverid() {
        return null;
    }
    
    public final void setApproverid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApplicationurl() {
        return null;
    }
    
    public final void setApplicationurl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIsapproved() {
        return null;
    }
    
    public final void setIsapproved(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getIllnesstypes() {
        return null;
    }
    
    public final void setIllnesstypes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFollowupcounsellerid() {
        return null;
    }
    
    public final void setFollowupcounsellerid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.MedicaldetailsRequest component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.MedicaldetailsRequest getMedicaldetails() {
        return null;
    }
    
    public final void setMedicaldetails(@org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.MedicaldetailsRequest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
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
    public final java.lang.String component16() {
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
    public final java.lang.String component17() {
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