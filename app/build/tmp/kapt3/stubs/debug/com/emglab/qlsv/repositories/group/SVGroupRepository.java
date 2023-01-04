package com.emglab.qlsv.repositories.group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJf\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#Jf\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#JV\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fJD\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#J<\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#J>\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#J<\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#JD\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#J\u0016\u00101\u001a\u00020)2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020\fJ\u000e\u00104\u001a\u00020)2\u0006\u0010*\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/emglab/qlsv/repositories/group/SVGroupRepository;", "", "svGroupDAO", "Lcom/emglab/qlsv/dao/SVGroupDAO;", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "(Lcom/emglab/qlsv/dao/SVGroupDAO;Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;)V", "childSvGroupsLiveData", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/emglab/qlsv/models/entity/SVGroup;", "ctsvCapLiveData", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "svGroupByIdLiveData", "svGroupByUserAdminLiveData", "svGroupByUserLiveData", "svGroupsLiveData", "addUserGroup", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "userName", "", "usercode", "token", "reason", "gId", "", "userRole", "ugStatus", "signature", "shouldFetch", "", "callDelay", "", "addUserGroupByEmail", "email", "approveUserGroup", "Signature", "deleteFromRoom", "", "svGroup", "getChildGroupByGId", "getSVGroup", "getSVGroupById", "getSVGroupByUser", "getSVGroupByUserAdmin", "userCode", "insertAllToRoom", "svGroups", "insertToRoom", "updateToRoom", "app_debug"})
@javax.inject.Singleton()
public final class SVGroupRepository {
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.SVGroup>> svGroupsLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.SVGroup>> childSvGroupsLiveData;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.entity.SVGroup> svGroupByIdLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.SVGroup>> svGroupByUserLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.SVGroup>> svGroupByUserAdminLiveData;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> ctsvCapLiveData;
    private final com.emglab.qlsv.dao.SVGroupDAO svGroupDAO = null;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.SVGroup>>> getSVGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.SVGroup>> getSVGroupById(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int gId, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.SVGroup>>> getChildGroupByGId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int gId, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.SVGroup>>> getSVGroupByUserAdmin(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String userCode, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.SVGroup>>> getSVGroupByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> addUserGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String usercode, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, int gId, int userRole, int ugStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> addUserGroupByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, int gId, int userRole, int ugStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> approveUserGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String usercode, int gId, int userRole, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    private final void insertAllToRoom(java.util.List<com.emglab.qlsv.models.entity.SVGroup> svGroups) {
    }
    
    public final void insertToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.SVGroup svGroup) {
    }
    
    public final void updateToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.SVGroup svGroup) {
    }
    
    public final void deleteFromRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.SVGroup svGroup) {
    }
    
    @javax.inject.Inject()
    public SVGroupRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.SVGroupDAO svGroupDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors) {
        super();
    }
}