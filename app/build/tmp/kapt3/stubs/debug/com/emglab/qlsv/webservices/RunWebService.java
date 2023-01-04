package com.emglab.qlsv.webservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/webservices/RunWebService;", "", "getRunResultList", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/webservices/ApiResponse;", "Lcom/emglab/qlsv/models/res/run/GetRunResultsListResp;", "userName", "", "token", "timeStart", "timeEnd", "saveRunData", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "saveRunDataReq", "Lcom/emglab/qlsv/models/req/SaveRunDataReq;", "app_debug"})
public abstract interface RunWebService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Run/SentResultRunLst")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.MyCTSVCap>> saveRunData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.emglab.qlsv.models.req.SaveRunDataReq saveRunDataReq);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Run/GetResultRunLst")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.run.GetRunResultsListResp>> getRunResultList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "UserName")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TimeStart")
    java.lang.String timeStart, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TimeEnd")
    java.lang.String timeEnd);
}