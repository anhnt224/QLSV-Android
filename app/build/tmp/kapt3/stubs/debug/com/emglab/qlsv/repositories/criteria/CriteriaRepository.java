package com.emglab.qlsv.repositories.criteria;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r0\u001e2\u0006\u0010\"\u001a\u00020 J*\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0$0\u001e2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020(J*\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0$0\u001e2\u0006\u0010*\u001a\u00020 2\b\b\u0002\u0010\'\u001a\u00020(J*\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0$0\u001e2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020(J\"\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0$0\u001e2\b\b\u0002\u0010\'\u001a\u00020(J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0\u001e2\b\b\u0002\u0010\'\u001a\u00020(J\u000e\u0010.\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0\u001e2\u0006\u0010%\u001a\u00020&2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0002\u0010\'\u001a\u00020(J\u000e\u0010/\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;", "", "criteriaDAO", "Lcom/emglab/qlsv/dao/CriteriaDAO;", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "(Lcom/emglab/qlsv/dao/CriteriaDAO;Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "activities", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "criteriaReports", "Lcom/emglab/qlsv/models/entity/CriteriaReport;", "criteriaTypes", "Lcom/emglab/qlsv/models/entity/CriteriaType;", "listSemesters", "Lcom/emglab/qlsv/models/entity/Semester;", "markCriteriaUser", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "userDetail", "Lcom/emglab/qlsv/models/entity/UserDetail;", "deleteFromRoom", "", "criteria", "Lcom/emglab/qlsv/models/entity/Criteria;", "getCriteriaByAId", "Landroidx/lifecycle/LiveData;", "AId", "", "getCriteriaByCGId", "CGId", "getCriteriaReports", "Lcom/emglab/qlsv/common/Resource;", "semester", "", "shouldFetch", "", "getListActivitiesByCId", "cID", "getListCriteriaTypes", "getListSemesters", "getUserDetail", "insertToRoom", "updateToRoom", "app_debug"})
@javax.inject.Singleton()
public final class CriteriaRepository {
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.entity.UserDetail> userDetail;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Semester>> listSemesters;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.CriteriaReport>> criteriaReports;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>> criteriaTypes;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity>> activities;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> markCriteriaUser;
    private final com.emglab.qlsv.dao.CriteriaDAO criteriaDAO = null;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.UserDetail>> getUserDetail(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> getListSemesters(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaReport>>> getCriteriaReports(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> getListCriteriaTypes(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity>>> getListActivitiesByCId(int cID, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> markCriteriaUser(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaType> criteriaTypes, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Criteria>> getCriteriaByCGId(int CGId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Criteria>> getCriteriaByAId(int AId) {
        return null;
    }
    
    public final void insertToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Criteria criteria) {
    }
    
    public final void updateToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Criteria criteria) {
    }
    
    public final void deleteFromRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Criteria criteria) {
    }
    
    @javax.inject.Inject()
    public CriteriaRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.CriteriaDAO criteriaDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
        super();
    }
}