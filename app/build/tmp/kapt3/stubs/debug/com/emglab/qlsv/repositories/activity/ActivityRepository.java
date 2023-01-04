package com.emglab.qlsv.repositories.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010JV\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201JV\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0%0$2\u0006\u00103\u001a\u00020\'2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\'2\u0006\u00107\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201Jn\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u00109\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u00103\u001a\u00020\'2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\'2\u0006\u00107\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J\u0014\u0010:\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0014\u0010=\u001a\u00020;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\"0\u0013J\u000e\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0014Jd\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010B\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\u0006\u0010C\u001a\u00020\'2\u0006\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201Jd\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010G\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\u0006\u0010C\u001a\u00020\'2\u0006\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J.\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140%0$2\u0006\u00104\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201JB\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130%0$2\u0006\u0010J\u001a\u00020\'2\u0006\u0010K\u001a\u00020\'2\u0006\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/J,\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130%0$2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201JD\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010G\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J\u001a\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130$2\u0006\u0010B\u001a\u00020+J\u0012\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00130$J\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020R0$2\u0006\u0010T\u001a\u00020\'J6\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130%0$2\b\b\u0002\u0010U\u001a\u00020+2\b\b\u0002\u0010V\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/Jd\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\u0006\u0010C\u001a\u00020\'2\u0006\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201Jd\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130%0$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\'2\u0006\u0010C\u001a\u00020\'2\u0006\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201JD\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00130%0$2\u0006\u0010Z\u001a\u00020\'2\u0006\u0010,\u001a\u00020+2\u0006\u0010J\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J\u0016\u0010[\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u000e\u0010\\\u001a\u00020;2\u0006\u0010]\u001a\u00020RJ\u0014\u0010^\u001a\u00020;2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u0013J\u000e\u0010a\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0014J\u0016\u0010b\u001a\u00020;2\u0006\u0010c\u001a\u00020+2\u0006\u0010T\u001a\u00020+J\u000e\u0010d\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0014J6\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0%0$2\u0006\u0010f\u001a\u00020\'2\u0006\u0010g\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201J6\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0%0$2\u0006\u0010,\u001a\u00020+2\u0006\u0010i\u001a\u00020j2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201JV\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0%0$2\u0006\u0010Z\u001a\u00020\'2\u0006\u00104\u001a\u00020+2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\'2\u0006\u0010-\u001a\u00020\'2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006p"}, d2 = {"Lcom/emglab/qlsv/repositories/activity/ActivityRepository;", "", "activityDAO", "Lcom/emglab/qlsv/dao/ActivityDAO;", "criteriaDAO", "Lcom/emglab/qlsv/dao/CriteriaDAO;", "userCheckInActivityDAO", "Lcom/emglab/qlsv/dao/UserCheckInActivityDAO;", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "countStepsDAO", "Lcom/emglab/qlsv/dao/CountStepsDAO;", "(Lcom/emglab/qlsv/dao/ActivityDAO;Lcom/emglab/qlsv/dao/CriteriaDAO;Lcom/emglab/qlsv/dao/UserCheckInActivityDAO;Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;Lcom/emglab/qlsv/dao/CountStepsDAO;)V", "activitiesByCIdLiveData", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/emglab/qlsv/models/entity/Activity;", "activitiesByGIdLiveData", "activitiesByUserLiveData", "activitiesByUserUnitLiveData", "activityByIdLiveData", "activityGroupByIdListLiveData", "Lcom/emglab/qlsv/models/entity/ActivityGroup;", "ctsvCapLiveData", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getPublicActivities", "userActivityLstLiveData", "Lcom/emglab/qlsv/models/entity/UserActivity;", "userActivityPendingByAIdLiveData", "userCheckInActivityLiveData", "Lcom/emglab/qlsv/models/entity/UserCheckInActivity;", "approveUserActivity", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "userName", "", "token", "usercode", "userRole", "", "aId", "Signature", "shouldFetch", "", "callDelay", "", "assignUserActivity", "Reason", "AId", "UserRole", "CheckInPlace", "UAStatus", "assignUserActivityByEmail", "email", "deleteAndInsertNewActivity", "", "activities", "deleteAndInsertNewUserCheckInActivity", "userCheckInActivities", "deleteFromRoom", "activity", "getActivityByCId", "CId", "Search", "NumberRow", "PageNumber", "getActivityByGId", "GId", "getActivityById", "getActivityByUser", "signature", "search", "numberRow", "pageNumber", "getActivityByUserUnit", "getActivityGroupByGId", "getActiviyByCIdFromRoom", "getAllCountSteps", "Lcom/emglab/qlsv/models/entity/CountSteps;", "getCountSteps", "id", "page", "row", "getUserActivityApprovedByAId", "getUserActivityPendingByAId", "getUserCheckInActivity", "userCode", "insertAllToRoom", "insertCountSteps", "countSteps", "insertCriteriaByActivityToRoom", "criterias", "Lcom/emglab/qlsv/models/entity/Criteria;", "insertToRoom", "updateStatusToRoom", "status", "updateToRoom", "updateTokenDevice", "tokenDevice", "deviceType", "uploadFile", "multipartBody", "Lokhttp3/MultipartBody$Part;", "userCheckinActivity", "longitude", "", "latitude", "address", "app_debug"})
@javax.inject.Singleton()
public final class ActivityRepository {
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> activitiesByUserUnitLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> activitiesByUserLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> activitiesByGIdLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> activitiesByCIdLiveData;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.entity.Activity> activityByIdLiveData;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> ctsvCapLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserActivity>> userActivityLstLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserActivity>> userActivityPendingByAIdLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserCheckInActivity>> userCheckInActivityLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> getPublicActivities;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.ActivityGroup>> activityGroupByIdListLiveData;
    private final com.emglab.qlsv.dao.ActivityDAO activityDAO = null;
    private final com.emglab.qlsv.dao.CriteriaDAO criteriaDAO = null;
    private final com.emglab.qlsv.dao.UserCheckInActivityDAO userCheckInActivityDAO = null;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    private final com.emglab.qlsv.dao.CountStepsDAO countStepsDAO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.CountSteps> getCountSteps(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.CountSteps>> getAllCountSteps() {
        return null;
    }
    
    public final void insertCountSteps(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.CountSteps countSteps) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivityByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String signature, @org.jetbrains.annotations.NotNull()
    java.lang.String search, int numberRow, int pageNumber, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivityByUserUnit(boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivityByGId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int GId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Search, int NumberRow, int PageNumber, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.ActivityGroup>>> getActivityGroupByGId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int GId, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivityByCId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int CId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Search, int NumberRow, int PageNumber, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserActivity>>> getUserActivityApprovedByAId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int aId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Search, int NumberRow, int PageNumber, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Activity>> getActivityById(int AId, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> assignUserActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String Reason, int AId, int UserRole, @org.jetbrains.annotations.NotNull()
    java.lang.String CheckInPlace, int UAStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> assignUserActivityByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String Reason, int AId, int UserRole, @org.jetbrains.annotations.NotNull()
    java.lang.String CheckInPlace, int UAStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserActivity>>> getUserActivityPendingByAId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int aId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Search, int NumberRow, int PageNumber, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> approveUserActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String usercode, int userRole, int aId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserCheckInActivity>>> getUserCheckInActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String userCode, int aId, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> userCheckinActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String userCode, int AId, double longitude, double latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> updateTokenDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String tokenDevice, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceType, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> uploadFile(int aId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part multipartBody, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getPublicActivities(int page, int row, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> getActiviyByCIdFromRoom(int CId) {
        return null;
    }
    
    private final void insertAllToRoom(java.util.List<com.emglab.qlsv.models.entity.Activity> activities) {
    }
    
    public final void updateStatusToRoom(int status, int id) {
    }
    
    public final void insertToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity) {
    }
    
    public final void insertCriteriaByActivityToRoom(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Criteria> criterias) {
    }
    
    public final void updateToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity) {
    }
    
    public final void deleteFromRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity) {
    }
    
    public final void deleteAndInsertNewUserCheckInActivity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCheckInActivity> userCheckInActivities) {
    }
    
    public final void deleteAndInsertNewActivity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Activity> activities) {
    }
    
    @javax.inject.Inject()
    public ActivityRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.ActivityDAO activityDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.CriteriaDAO criteriaDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.UserCheckInActivityDAO userCheckInActivityDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.CountStepsDAO countStepsDAO) {
        super();
    }
}