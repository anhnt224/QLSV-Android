package com.emglab.qlsv.models.res;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/models/res/CTSVMotelImageRes;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respText", "", "respCode", "", "imageList", "", "Lcom/emglab/qlsv/models/entity/ImageMotel2;", "(Ljava/lang/String;ILjava/util/List;)V", "getImageList", "()Ljava/util/List;", "getRespCode", "()Ljava/lang/Integer;", "getRespText", "()Ljava/lang/String;", "app_debug"})
public final class CTSVMotelImageRes extends com.emglab.qlsv.models.res.CTSVCap {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private final java.lang.String respText = null;
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private final int respCode = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ImageLst")
    private final java.util.List<com.emglab.qlsv.models.entity.ImageMotel2> imageList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRespText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer getRespCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.ImageMotel2> getImageList() {
        return null;
    }
    
    public CTSVMotelImageRes(@org.jetbrains.annotations.NotNull()
    java.lang.String respText, int respCode, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.ImageMotel2> imageList) {
        super();
    }
    
    public CTSVMotelImageRes() {
        super();
    }
}