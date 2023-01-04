package com.emglab.qlsv.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00170\u00162\u0006\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00170\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00170\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ*\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\u00170\u00162\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ4\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\"2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ>\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/emglab/qlsv/repositories/FormRepository;", "", "formWebService", "Lcom/emglab/qlsv/webservices/FormWebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "(Lcom/emglab/qlsv/webservices/FormWebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "delForm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "form", "Lcom/emglab/qlsv/models/entity/Form;", "forms", "", "questions", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "rateForm", "registerForm", "updateForm", "deleteForm", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "rowID", "", "shouldFetch", "", "getFormDetail", "rowId", "getListForms", "getListFormsRegistered", "getListQuestions", "formType", "", "rating", "comment", "deliveryType", "studentContactID", "app_debug"})
public final class FormRepository {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.Form>> forms;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.Form> form;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.FormQuestion>> questions;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> registerForm;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> delForm;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> updateForm;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> rateForm;
    private com.emglab.qlsv.webservices.FormWebService formWebService;
    private com.emglab.qlsv.common.AppExecutors appExecutors;
    private com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Form>>> getListForms(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Form>>> getListFormsRegistered(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteForm(int rowID, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Form>> getFormDetail(int rowId, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.FormQuestion>>> getListQuestions(@org.jetbrains.annotations.NotNull()
    java.lang.String formType, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> registerForm(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions, int deliveryType, int studentContactID, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> updateForm(int rowID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> rateForm(int rowID, int rating, @org.jetbrains.annotations.NotNull()
    java.lang.String comment, boolean shouldFetch) {
        return null;
    }
    
    @javax.inject.Inject()
    public FormRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.FormWebService formWebService, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
        super();
    }
}