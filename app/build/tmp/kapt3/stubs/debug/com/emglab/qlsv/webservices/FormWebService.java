package com.emglab.qlsv.webservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\tH\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J<\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u0016\u001a\u00020\u0007H\'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'\u00a8\u0006\u001d"}, d2 = {"Lcom/emglab/qlsv/webservices/FormWebService;", "", "deleteForm", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/webservices/ApiResponse;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "token", "", "rowID", "", "getFormDetail", "Lcom/emglab/qlsv/models/res/form/GetFormDetailResp;", "id", "getListForm", "Lcom/emglab/qlsv/models/res/form/GetListFormsResp;", "getListFormRegistered", "Lcom/emglab/qlsv/models/res/form/GetListFormsRegiteredResp;", "getListQuestions", "Lcom/emglab/qlsv/models/res/form/GetListQuestionsResp;", "formType", "rateForm", "rating", "comment", "registerForm", "registerFormReq", "Lcom/emglab/qlsv/models/req/RegisterFormReq;", "updateForm", "updateFormReq", "Lcom/emglab/qlsv/models/req/UpdateFormReq;", "app_debug"})
public abstract interface FormWebService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/GetPaper")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.form.GetListFormsResp>> getListForm(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/GetPaperAllByToken")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.form.GetListFormsRegiteredResp>> getListFormRegistered(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/DelPaperStudent")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.MyCTSVCap>> deleteForm(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token, @retrofit2.http.Field(value = "RowID")
    int rowID);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/GetPaperDetailByID")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.form.GetFormDetailResp>> getFormDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token, @retrofit2.http.Field(value = "ID")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/GetPaperByTypePaper")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.form.GetListQuestionsResp>> getListQuestions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TypePaper")
    java.lang.String formType);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/SetStudentPaper")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.MyCTSVCap>> registerForm(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.emglab.qlsv.models.req.RegisterFormReq registerFormReq);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/UpdateStudentPaper")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.MyCTSVCap>> updateForm(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.emglab.qlsv.models.req.UpdateFormReq updateFormReq);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Paper/RatePaperStudent")
    @retrofit2.http.FormUrlEncoded()
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.webservices.ApiResponse<com.emglab.qlsv.models.res.MyCTSVCap>> rateForm(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "TokenCode")
    java.lang.String token, @retrofit2.http.Field(value = "RowID")
    int rowID, @retrofit2.http.Field(value = "Rate")
    int rating, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "Comment")
    java.lang.String comment);
}