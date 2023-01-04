package com.emglab.qlsv.webservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Lcom/emglab/qlsv/webservices/TimeTableWebService;", "", "getTimeTable", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/webservices/ApiResponse;", "Lcom/emglab/qlsv/models/res/timetable/GetTimeTableResp;", "userName", "", "tokenCode", "userCode", "app_debug"})
public abstract interface TimeTableWebService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetScheduleStudent")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.timetable.GetTimeTableResp>> getTimeTable(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "UserName")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String tokenCode, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "UserCode")
    java.lang.String userCode);
}