package com.bss.uis.data.remote.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00ed\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\fj\b\u0012\u0004\u0012\u00020\u0018`\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0019\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u00180\fj\b\u0012\u0004\u0012\u00020\u0018`\u000eH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0019\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u00f6\u0001\u0010Z\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\fj\b\u0012\u0004\u0012\u00020\u0018`\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_H\u00d6\u0003J\t\u0010`\u001a\u00020\u0003H\u00d6\u0001J\t\u0010a\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00180\fj\b\u0012\u0004\u0012\u00020\u0018`\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010%\"\u0004\b0\u0010\'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010%\"\u0004\b8\u0010\'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010%\"\u0004\b:\u0010\'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010%\"\u0004\b<\u0010\'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010%\"\u0004\b>\u0010\'R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010%\"\u0004\bB\u0010\'R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\bC\u0010+\"\u0004\bD\u0010-R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\bE\u0010+\"\u0004\bF\u0010-R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010%\"\u0004\bH\u0010\'\u00a8\u0006b"}, d2 = {"Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "Ljava/io/Serializable;", "personid", "", "entitytype", "prefix", "", "name", "suffix", "dateofbirth", "gender", "imagelist", "Ljava/util/ArrayList;", "Lcom/bss/uis/data/remote/dto/request/ImagelistRequest;", "Lkotlin/collections/ArrayList;", "relationwithpatient", "incomeperyear", "occupation", "isactive", "addressdto", "Lcom/bss/uis/data/remote/dto/request/AddressdtoRequest;", "idproofdto", "Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;", "contactlist", "Lcom/bss/uis/data/remote/dto/request/ContactlistRequest;", "createddate", "updatedate", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/AddressdtoRequest;Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getAddressdto", "()Lcom/bss/uis/data/remote/dto/request/AddressdtoRequest;", "setAddressdto", "(Lcom/bss/uis/data/remote/dto/request/AddressdtoRequest;)V", "getContactlist", "()Ljava/util/ArrayList;", "setContactlist", "(Ljava/util/ArrayList;)V", "getCreateddate", "()Ljava/lang/String;", "setCreateddate", "(Ljava/lang/String;)V", "getDateofbirth", "setDateofbirth", "getEntitytype", "()Ljava/lang/Integer;", "setEntitytype", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGender", "setGender", "getIdproofdto", "()Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;", "setIdproofdto", "(Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;)V", "getImagelist", "setImagelist", "getIncomeperyear", "setIncomeperyear", "getIsactive", "setIsactive", "getName", "setName", "getOccupation", "setOccupation", "getPersonid", "setPersonid", "getPrefix", "setPrefix", "getRelationwithpatient", "setRelationwithpatient", "getSuffix", "setSuffix", "getUpdatedate", "setUpdatedate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/AddressdtoRequest;Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Lcom/bss/uis/data/remote/dto/request/PersonlistRequest;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class PersonlistRequest implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer personid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer entitytype;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String prefix;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer suffix;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dateofbirth;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gender;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.bss.uis.data.remote.dto.request.ImagelistRequest> imagelist;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer relationwithpatient;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String incomeperyear;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String occupation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isactive;
    @org.jetbrains.annotations.Nullable()
    private com.bss.uis.data.remote.dto.request.AddressdtoRequest addressdto;
    @org.jetbrains.annotations.Nullable()
    private com.bss.uis.data.remote.dto.request.IdproofdtoRequest idproofdto;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.bss.uis.data.remote.dto.request.ContactlistRequest> contactlist;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String createddate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String updatedate;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.PersonlistRequest copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer personid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entitytype, @org.jetbrains.annotations.Nullable()
    java.lang.String prefix, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suffix, @org.jetbrains.annotations.Nullable()
    java.lang.String dateofbirth, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.ImagelistRequest> imagelist, @org.jetbrains.annotations.Nullable()
    java.lang.Integer relationwithpatient, @org.jetbrains.annotations.Nullable()
    java.lang.String incomeperyear, @org.jetbrains.annotations.Nullable()
    java.lang.String occupation, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.AddressdtoRequest addressdto, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.IdproofdtoRequest idproofdto, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.ContactlistRequest> contactlist, @org.jetbrains.annotations.Nullable()
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
    
    public PersonlistRequest() {
        super();
    }
    
    public PersonlistRequest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer personid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entitytype, @org.jetbrains.annotations.Nullable()
    java.lang.String prefix, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suffix, @org.jetbrains.annotations.Nullable()
    java.lang.String dateofbirth, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.ImagelistRequest> imagelist, @org.jetbrains.annotations.Nullable()
    java.lang.Integer relationwithpatient, @org.jetbrains.annotations.Nullable()
    java.lang.String incomeperyear, @org.jetbrains.annotations.Nullable()
    java.lang.String occupation, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.AddressdtoRequest addressdto, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.IdproofdtoRequest idproofdto, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.ContactlistRequest> contactlist, @org.jetbrains.annotations.Nullable()
    java.lang.String createddate, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPersonid() {
        return null;
    }
    
    public final void setPersonid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEntitytype() {
        return null;
    }
    
    public final void setEntitytype(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrefix() {
        return null;
    }
    
    public final void setPrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSuffix() {
        return null;
    }
    
    public final void setSuffix(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateofbirth() {
        return null;
    }
    
    public final void setDateofbirth(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.bss.uis.data.remote.dto.request.ImagelistRequest> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.bss.uis.data.remote.dto.request.ImagelistRequest> getImagelist() {
        return null;
    }
    
    public final void setImagelist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.ImagelistRequest> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRelationwithpatient() {
        return null;
    }
    
    public final void setRelationwithpatient(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIncomeperyear() {
        return null;
    }
    
    public final void setIncomeperyear(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOccupation() {
        return null;
    }
    
    public final void setOccupation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
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
    public final com.bss.uis.data.remote.dto.request.AddressdtoRequest component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.AddressdtoRequest getAddressdto() {
        return null;
    }
    
    public final void setAddressdto(@org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.AddressdtoRequest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.IdproofdtoRequest component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.IdproofdtoRequest getIdproofdto() {
        return null;
    }
    
    public final void setIdproofdto(@org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.IdproofdtoRequest p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.bss.uis.data.remote.dto.request.ContactlistRequest> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.bss.uis.data.remote.dto.request.ContactlistRequest> getContactlist() {
        return null;
    }
    
    public final void setContactlist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.bss.uis.data.remote.dto.request.ContactlistRequest> p0) {
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