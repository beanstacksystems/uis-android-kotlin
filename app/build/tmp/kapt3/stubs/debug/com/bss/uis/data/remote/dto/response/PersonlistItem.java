package com.bss.uis.data.remote.dto.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\bH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\bH\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00107\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0013\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00f2\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u0005H\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R \u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR \u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b,\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b.\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 \u00a8\u0006J"}, d2 = {"Lcom/bss/uis/data/remote/dto/response/PersonlistItem;", "", "dateofbirth", "", "occupation", "", "gender", "contactlist", "", "Lcom/bss/uis/data/remote/dto/response/ContactlistItem;", "addressdto", "Lcom/bss/uis/data/remote/dto/response/Addressdto;", "createddate", "prefix", "relationwithpatient", "isactive", "imagelist", "Lcom/bss/uis/data/remote/dto/response/ImagelistItem;", "suffix", "idproofdto", "Lcom/bss/uis/data/remote/dto/response/IdproofdtoItem;", "entitytype", "updatedate", "name", "incomeperyear", "personid", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/bss/uis/data/remote/dto/response/Addressdto;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getAddressdto", "()Lcom/bss/uis/data/remote/dto/response/Addressdto;", "getContactlist", "()Ljava/util/List;", "getCreateddate", "()Ljava/lang/Object;", "getDateofbirth", "()Ljava/lang/String;", "getEntitytype", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGender", "getIdproofdto", "getImagelist", "getIncomeperyear", "getIsactive", "getName", "getOccupation", "getPersonid", "getPrefix", "getRelationwithpatient", "getSuffix", "getUpdatedate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/bss/uis/data/remote/dto/response/Addressdto;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/bss/uis/data/remote/dto/response/PersonlistItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class PersonlistItem {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dateofbirth")
    private final java.lang.String dateofbirth = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "occupation")
    private final java.lang.Integer occupation = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gender")
    private final java.lang.Integer gender = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "contactlist")
    private final java.util.List<com.bss.uis.data.remote.dto.response.ContactlistItem> contactlist = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "addressdto")
    private final com.bss.uis.data.remote.dto.response.Addressdto addressdto = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "createddate")
    private final java.lang.Object createddate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "prefix")
    private final java.lang.Integer prefix = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "relationwithpatient")
    private final java.lang.Object relationwithpatient = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isactive")
    private final java.lang.String isactive = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imagelist")
    private final java.util.List<com.bss.uis.data.remote.dto.response.ImagelistItem> imagelist = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "suffix")
    private final java.lang.String suffix = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "idproofdto")
    private final java.util.List<com.bss.uis.data.remote.dto.response.IdproofdtoItem> idproofdto = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "entitytype")
    private final java.lang.Integer entitytype = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updatedate")
    private final java.lang.Object updatedate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "incomeperyear")
    private final java.lang.Object incomeperyear = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "personid")
    private final java.lang.Object personid = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.response.PersonlistItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.String dateofbirth, @org.jetbrains.annotations.Nullable()
    java.lang.Integer occupation, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gender, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.data.remote.dto.response.ContactlistItem> contactlist, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.response.Addressdto addressdto, @org.jetbrains.annotations.Nullable()
    java.lang.Object createddate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prefix, @org.jetbrains.annotations.Nullable()
    java.lang.Object relationwithpatient, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.data.remote.dto.response.ImagelistItem> imagelist, @org.jetbrains.annotations.Nullable()
    java.lang.String suffix, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.data.remote.dto.response.IdproofdtoItem> idproofdto, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entitytype, @org.jetbrains.annotations.Nullable()
    java.lang.Object updatedate, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Object incomeperyear, @org.jetbrains.annotations.Nullable()
    java.lang.Object personid) {
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
    
    public PersonlistItem() {
        super();
    }
    
    public PersonlistItem(@org.jetbrains.annotations.Nullable()
    java.lang.String dateofbirth, @org.jetbrains.annotations.Nullable()
    java.lang.Integer occupation, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gender, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.data.remote.dto.response.ContactlistItem> contactlist, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.response.Addressdto addressdto, @org.jetbrains.annotations.Nullable()
    java.lang.Object createddate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prefix, @org.jetbrains.annotations.Nullable()
    java.lang.Object relationwithpatient, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.data.remote.dto.response.ImagelistItem> imagelist, @org.jetbrains.annotations.Nullable()
    java.lang.String suffix, @org.jetbrains.annotations.Nullable()
    java.util.List<com.bss.uis.data.remote.dto.response.IdproofdtoItem> idproofdto, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entitytype, @org.jetbrains.annotations.Nullable()
    java.lang.Object updatedate, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Object incomeperyear, @org.jetbrains.annotations.Nullable()
    java.lang.Object personid) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateofbirth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOccupation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.data.remote.dto.response.ContactlistItem> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.data.remote.dto.response.ContactlistItem> getContactlist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.response.Addressdto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.response.Addressdto getAddressdto() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreateddate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRelationwithpatient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIsactive() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.data.remote.dto.response.ImagelistItem> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.data.remote.dto.response.ImagelistItem> getImagelist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuffix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.data.remote.dto.response.IdproofdtoItem> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.bss.uis.data.remote.dto.response.IdproofdtoItem> getIdproofdto() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEntitytype() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpdatedate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIncomeperyear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPersonid() {
        return null;
    }
}