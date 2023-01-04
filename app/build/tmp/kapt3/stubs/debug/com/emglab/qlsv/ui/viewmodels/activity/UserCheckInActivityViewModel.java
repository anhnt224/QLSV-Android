package com.emglab.qlsv.ui.viewmodels.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\'\u001a\u00020(J.\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020%R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015\u00a8\u00061"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/activity/UserCheckInActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "activityRepository", "Lcom/emglab/qlsv/repositories/activity/ActivityRepository;", "(Lcom/emglab/qlsv/repositories/activity/ActivityRepository;)V", "_uploadImageCallResource", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "_userCheckInActivityId", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/ui/viewmodels/activity/UserCheckInActivityViewModel$UserCheckInActivityId;", "_userCheckInActivityResource", "isCheckIn", "", "()Z", "setCheckIn", "(Z)V", "uploadImageCallResource", "Landroidx/lifecycle/MediatorLiveData;", "getUploadImageCallResource", "()Landroidx/lifecycle/MediatorLiveData;", "userCheckInActivities", "", "Lcom/emglab/qlsv/models/entity/UserCheckInActivity;", "getUserCheckInActivities", "()Landroidx/lifecycle/LiveData;", "userCheckInActivityId", "getUserCheckInActivityId", "userCheckInActivityResource", "getUserCheckInActivityResource", "retry", "", "setId", "aId", "", "userCode", "", "uploadFile", "multipartBody", "Lokhttp3/MultipartBody$Part;", "userCheckinActivity", "AId", "longitude", "", "latitude", "address", "Signature", "UserCheckInActivityId", "app_debug"})
public final class UserCheckInActivityViewModel extends androidx.lifecycle.ViewModel {
    private boolean isCheckIn;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.ui.viewmodels.activity.UserCheckInActivityViewModel.UserCheckInActivityId> _userCheckInActivityId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserCheckInActivity>>> userCheckInActivities = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> userCheckInActivityResource = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> _userCheckInActivityResource;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> uploadImageCallResource = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> _uploadImageCallResource;
    private final com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository = null;
    
    public final boolean isCheckIn() {
        return false;
    }
    
    public final void setCheckIn(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.ui.viewmodels.activity.UserCheckInActivityViewModel.UserCheckInActivityId> getUserCheckInActivityId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserCheckInActivity>>> getUserCheckInActivities() {
        return null;
    }
    
    public final void retry() {
    }
    
    public final void setId(int aId, @org.jetbrains.annotations.NotNull()
    java.lang.String userCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getUserCheckInActivityResource() {
        return null;
    }
    
    public final void userCheckinActivity(int AId, double longitude, double latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getUploadImageCallResource() {
        return null;
    }
    
    public final void uploadFile(int aId, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part multipartBody) {
    }
    
    @javax.inject.Inject()
    public UserCheckInActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00130\u0016J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/activity/UserCheckInActivityViewModel$UserCheckInActivityId;", "", "aId", "", "userCode", "", "(ILjava/lang/String;)V", "getAId", "()I", "getUserCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "ifExists", "Landroidx/lifecycle/LiveData;", "T", "f", "Lkotlin/Function2;", "toString", "app_debug"})
    public static final class UserCheckInActivityId {
        private final int aId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userCode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> ifExists(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, ? extends androidx.lifecycle.LiveData<T>> f) {
            return null;
        }
        
        public final int getAId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserCode() {
            return null;
        }
        
        public UserCheckInActivityId(int aId, @org.jetbrains.annotations.NotNull()
        java.lang.String userCode) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.viewmodels.activity.UserCheckInActivityViewModel.UserCheckInActivityId copy(int aId, @org.jetbrains.annotations.NotNull()
        java.lang.String userCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}