package com.bss.uis.data.remote.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010,\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bH\u00c6\u0003Jz\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u00020\u0003H\u00d6\u0001J\t\u00108\u001a\u00020\bH\u00d6\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012\u00a8\u00069"}, d2 = {"Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;", "Ljava/io/Serializable;", "idproofid", "", "entityid", "entitytypeid", "idtypeid", "iddetails", "", "imagedto", "Lcom/bss/uis/data/remote/dto/request/ImagedtoRequest;", "isactive", "createddate", "updatedate", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ImagedtoRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateddate", "()Ljava/lang/String;", "setCreateddate", "(Ljava/lang/String;)V", "getEntityid", "()Ljava/lang/Integer;", "setEntityid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEntitytypeid", "setEntitytypeid", "getIddetails", "setIddetails", "getIdproofid", "setIdproofid", "getIdtypeid", "setIdtypeid", "getImagedto", "()Lcom/bss/uis/data/remote/dto/request/ImagedtoRequest;", "setImagedto", "(Lcom/bss/uis/data/remote/dto/request/ImagedtoRequest;)V", "getIsactive", "setIsactive", "getUpdatedate", "setUpdatedate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/bss/uis/data/remote/dto/request/ImagedtoRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bss/uis/data/remote/dto/request/IdproofdtoRequest;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class IdproofdtoRequest implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer idproofid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer entityid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer entitytypeid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer idtypeid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String iddetails;
    @org.jetbrains.annotations.Nullable()
    private com.bss.uis.data.remote.dto.request.ImagedtoRequest imagedto;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isactive;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String createddate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String updatedate;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bss.uis.data.remote.dto.request.IdproofdtoRequest copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idproofid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entityid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entitytypeid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer idtypeid, @org.jetbrains.annotations.Nullable()
    java.lang.String iddetails, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.ImagedtoRequest imagedto, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
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
    
    public IdproofdtoRequest() {
        super();
    }
    
    public IdproofdtoRequest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idproofid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entityid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer entitytypeid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer idtypeid, @org.jetbrains.annotations.Nullable()
    java.lang.String iddetails, @org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.ImagedtoRequest imagedto, @org.jetbrains.annotations.Nullable()
    java.lang.String isactive, @org.jetbrains.annotations.Nullable()
    java.lang.String createddate, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIdproofid() {
        return null;
    }
    
    public final void setIdproofid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEntityid() {
        return null;
    }
    
    public final void setEntityid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEntitytypeid() {
        return null;
    }
    
    public final void setEntitytypeid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIdtypeid() {
        return null;
    }
    
    public final void setIdtypeid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIddetails() {
        return null;
    }
    
    public final void setIddetails(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.ImagedtoRequest component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bss.uis.data.remote.dto.request.ImagedtoRequest getImagedto() {
        return null;
    }
    
    public final void setImagedto(@org.jetbrains.annotations.Nullable()
    com.bss.uis.data.remote.dto.request.ImagedtoRequest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
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
    public final java.lang.String component8() {
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
    public final java.lang.String component9() {
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