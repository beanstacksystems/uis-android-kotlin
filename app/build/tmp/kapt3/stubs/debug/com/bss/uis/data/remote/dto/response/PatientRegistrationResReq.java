package com.bss.uis.data.remote.dto.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u00018Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rH\u00c6\u0003Jz\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\t\u00107\u001a\u00020\u0006H\u00d6\u0001R \u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b&\u0010\u001e\"\u0004\b\'\u0010 \u00a8\u00069"}, d2 = {"Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "", "patientId", "", "personId", "patientName", "", "patientAge", "patientContact", "patientCancerType", "patientImage", "attendantIds", "patientAddress", "Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;)V", "getAttendantIds", "()Ljava/lang/String;", "setAttendantIds", "(Ljava/lang/String;)V", "getPatientAddress", "()Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;", "setPatientAddress", "(Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;)V", "getPatientAge", "setPatientAge", "getPatientCancerType", "setPatientCancerType", "getPatientContact", "setPatientContact", "getPatientId", "()Ljava/lang/Integer;", "setPatientId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPatientImage", "setPatientImage", "getPatientName", "setPatientName", "getPersonId", "setPersonId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;)Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq;", "equals", "", "other", "hashCode", "toString", "PatientAddress", "app_debug"})
public final class PatientRegistrationResReq {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientId")
    private java.lang.Integer patientId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "personId")
    private java.lang.Integer personId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientName")
    private java.lang.String patientName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientAge")
    private java.lang.String patientAge;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientContact")
    private java.lang.String patientContact;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientCancerType")
    private java.lang.String patientCancerType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientImage")
    private java.lang.String patientImage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "attendantIds")
    private java.lang.String attendantIds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patientAddress")
    private com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress patientAddress;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.response.PatientRegistrationResReq copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer personId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientName, @org.jetbrains.annotations.Nullable()
    java.lang.String patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientContact, @org.jetbrains.annotations.Nullable()
    java.lang.String patientCancerType, @org.jetbrains.annotations.Nullable()
    java.lang.String patientImage, @org.jetbrains.annotations.Nullable()
    java.lang.String attendantIds, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress patientAddress) {
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
    
    public PatientRegistrationResReq() {
        super();
    }
    
    public PatientRegistrationResReq(@org.jetbrains.annotations.Nullable()
    java.lang.Integer patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer personId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientName, @org.jetbrains.annotations.Nullable()
    java.lang.String patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientContact, @org.jetbrains.annotations.Nullable()
    java.lang.String patientCancerType, @org.jetbrains.annotations.Nullable()
    java.lang.String patientImage, @org.jetbrains.annotations.Nullable()
    java.lang.String attendantIds, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress patientAddress) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientId() {
        return null;
    }
    
    public final void setPatientId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPersonId() {
        return null;
    }
    
    public final void setPersonId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientName() {
        return null;
    }
    
    public final void setPatientName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientContact() {
        return null;
    }
    
    public final void setPatientContact(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientCancerType() {
        return null;
    }
    
    public final void setPatientCancerType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientImage() {
        return null;
    }
    
    public final void setPatientImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAttendantIds() {
        return null;
    }
    
    public final void setAttendantIds(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress getPatientAddress() {
        return null;
    }
    
    public final void setPatientAddress(@org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00b9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0013J\u0010\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u00107\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010:\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010@\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u00c2\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\u0003H\u00d6\u0001J\t\u0010K\u001a\u00020\bH\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR \u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R \u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR \u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR \u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR \u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R \u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b/\u0010\u001cR \u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R \u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001c\u00a8\u0006L"}, d2 = {"Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;", "", "addressId", "", "entityId", "entityTypeId", "addressTypeId", "addressLine1", "", "addressLine2", "addressLine3", "city", "district", "state", "country", "pinCode", "isActive", "createdDateTime", "lastUpdatedDateTime", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressId", "()Ljava/lang/Integer;", "setAddressId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAddressLine1", "()Ljava/lang/String;", "setAddressLine1", "(Ljava/lang/String;)V", "getAddressLine2", "setAddressLine2", "getAddressLine3", "setAddressLine3", "getAddressTypeId", "setAddressTypeId", "getCity", "setCity", "getCountry", "setCountry", "getCreatedDateTime", "setCreatedDateTime", "getDistrict", "setDistrict", "getEntityId", "setEntityId", "getEntityTypeId", "setEntityTypeId", "setActive", "getLastUpdatedDateTime", "setLastUpdatedDateTime", "getPinCode", "setPinCode", "getState", "setState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bss/uis/data/remote/dto/response/PatientRegistrationResReq$PatientAddress;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class PatientAddress {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "address_id")
        private java.lang.Integer addressId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "entity_id")
        private java.lang.Integer entityId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "entity_type_id")
        private java.lang.Integer entityTypeId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "address_type_id")
        private java.lang.Integer addressTypeId;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "address_line_1")
        private java.lang.String addressLine1;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "address_line_2")
        private java.lang.String addressLine2;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "address_line_3")
        private java.lang.String addressLine3;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "city")
        private java.lang.String city;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "district")
        private java.lang.String district;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "state")
        private java.lang.String state;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "country")
        private java.lang.String country;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "pin_code")
        private java.lang.Integer pinCode;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "is_active")
        private java.lang.String isActive;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "created_date_time")
        private java.lang.String createdDateTime;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "last_updated_date_time")
        private java.lang.String lastUpdatedDateTime;
        
        @org.jetbrains.annotations.NotNull()
        public final com.bss.uis.data.remote.dto.response.PatientRegistrationResReq.PatientAddress copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer addressId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer entityId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer entityTypeId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer addressTypeId, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine1, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine2, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine3, @org.jetbrains.annotations.Nullable()
        java.lang.String city, @org.jetbrains.annotations.Nullable()
        java.lang.String district, @org.jetbrains.annotations.Nullable()
        java.lang.String state, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.Integer pinCode, @org.jetbrains.annotations.Nullable()
        java.lang.String isActive, @org.jetbrains.annotations.Nullable()
        java.lang.String createdDateTime, @org.jetbrains.annotations.Nullable()
        java.lang.String lastUpdatedDateTime) {
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
        
        public PatientAddress() {
            super();
        }
        
        public PatientAddress(@org.jetbrains.annotations.Nullable()
        java.lang.Integer addressId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer entityId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer entityTypeId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer addressTypeId, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine1, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine2, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine3, @org.jetbrains.annotations.Nullable()
        java.lang.String city, @org.jetbrains.annotations.Nullable()
        java.lang.String district, @org.jetbrains.annotations.Nullable()
        java.lang.String state, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.Integer pinCode, @org.jetbrains.annotations.Nullable()
        java.lang.String isActive, @org.jetbrains.annotations.Nullable()
        java.lang.String createdDateTime, @org.jetbrains.annotations.Nullable()
        java.lang.String lastUpdatedDateTime) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAddressId() {
            return null;
        }
        
        public final void setAddressId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getEntityId() {
            return null;
        }
        
        public final void setEntityId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getEntityTypeId() {
            return null;
        }
        
        public final void setEntityTypeId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAddressTypeId() {
            return null;
        }
        
        public final void setAddressTypeId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressLine1() {
            return null;
        }
        
        public final void setAddressLine1(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressLine2() {
            return null;
        }
        
        public final void setAddressLine2(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressLine3() {
            return null;
        }
        
        public final void setAddressLine3(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDistrict() {
            return null;
        }
        
        public final void setDistrict(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        public final void setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPinCode() {
            return null;
        }
        
        public final void setPinCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String isActive() {
            return null;
        }
        
        public final void setActive(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreatedDateTime() {
            return null;
        }
        
        public final void setCreatedDateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastUpdatedDateTime() {
            return null;
        }
        
        public final void setLastUpdatedDateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}