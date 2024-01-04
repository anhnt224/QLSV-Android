package com.emglab.qlsv.webservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'J<\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\'J@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/webservices/GiftWebService;", "", "delImageMotel", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/webservices/ApiResponse;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "userName", "", "tokenCode", "id", "", "type", "uploadFile", "Lcom/emglab/qlsv/models/res/activity/CTSVAssignUserActivityRes;", "UserCode", "TokenCode", "AId", "image", "Lokhttp3/MultipartBody$Part;", "uploadImageGift", "Lretrofit2/Call;", "token", "giftId", "typeImage", "app_debug"})
public abstract interface GiftWebService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "ATMGift/UploadImageGift")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<com.emglab.qlsv.models.res.MyCTSVCap> uploadImageGift(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserName")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "TokenCode")
    java.lang.String token, @retrofit2.http.Query(value = "GiftID")
    int giftId, @retrofit2.http.Query(value = "TypeImage")
    int typeImage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "CTSV/DelImageMotel")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.MyCTSVCap>> delImageMotel(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "UserName")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "Token")
    java.lang.String tokenCode, @retrofit2.http.Field(value = "MotelID")
    int id, @retrofit2.http.Field(value = "TypeImg")
    int type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "CTSV/UploadProofImage")
    @retrofit2.http.Multipart()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.activity.CTSVAssignUserActivityRes>> uploadFile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserCode")
    java.lang.String UserCode, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "TokenCode")
    java.lang.String TokenCode, @retrofit2.http.Query(value = "AId")
    int AId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image);
}