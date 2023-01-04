package com.emglab.qlsv.repositories.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ6\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140%0$2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+JF\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140%0$2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+J\u0014\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0011J\u000e\u00105\u001a\u0002022\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u000202J$\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140%0$2\u0006\u0010:\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020)J\"\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110%0$2\b\b\u0002\u0010(\u001a\u00020)J*\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110%0$2\u0006\u0010=\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)J\"\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110%0$2\b\b\u0002\u0010(\u001a\u00020)J2\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110%0$2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)J,\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00110%0$2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+Jd\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110%0$2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020D2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+J&\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070%0$2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+J\"\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110%0$2\b\b\u0002\u0010(\u001a\u00020)Jd\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110%0$2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010L\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020D2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+J\f\u0010M\u001a\b\u0012\u0004\u0012\u00020N0$J\u0016\u0010O\u001a\u0002022\f\u0010P\u001a\b\u0012\u0004\u0012\u0002070\u0011H\u0002J\u000e\u0010Q\u001a\u0002022\u0006\u00106\u001a\u000207J\u000e\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020NJ6\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160%0$2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+J0\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160%0$2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120W2\b\b\u0002\u0010(\u001a\u00020)J>\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140%0$2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+J\u000e\u0010Y\u001a\u0002022\u0006\u00106\u001a\u000207J.\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0%0$2\u0006\u0010[\u001a\u00020\u001a2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\b\u0002\u0010(\u001a\u00020)J>\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140%0$2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"}, d2 = {"Lcom/emglab/qlsv/repositories/user/UserRepository;", "", "userDAO", "Lcom/emglab/qlsv/dao/UserDAO;", "scheduleStudnetDAO", "Lcom/emglab/qlsv/dao/ScheduleStudnetDAO;", "weekNumberDAO", "Lcom/emglab/qlsv/dao/WeekNumberDAO;", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "(Lcom/emglab/qlsv/dao/UserDAO;Lcom/emglab/qlsv/dao/ScheduleStudnetDAO;Lcom/emglab/qlsv/dao/WeekNumberDAO;Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "citiesLiveData", "Landroidx/lifecycle/MediatorLiveData;", "", "", "ctsvCapLiveData", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "ctsvUserLoginResLiveData", "Lcom/emglab/qlsv/models/res/user/CTSVUserLoginRes;", "deleteAddress", "districtsLiveData", "getListUserAddress", "Lcom/emglab/qlsv/models/entity/UserAddress;", "messages", "Lcom/emglab/qlsv/models/entity/Message;", "updateUserAddressLiveData", "Lcom/emglab/qlsv/models/res/UpdateStudentContactResp;", "userByGroups", "Lcom/emglab/qlsv/models/entity/UserGroup;", "userPendingByGroups", "wardsLiveData", "changePassword", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "password", "newPassword", "shouldFetch", "", "callDelay", "", "checkOTPLostPassword", "userName", "deviceInfo", "otp", "signature", "deleteAndInsertNewSchedule", "", "scheduleStudents", "Lcom/emglab/qlsv/models/entity/ScheduleStudent;", "deleteFromRoom", "user", "Lcom/emglab/qlsv/models/entity/User;", "deleteRoom", "deleteUserAddress", "address", "getListCities", "getListDistricts", "city", "getListWards", "district", "getScheduleStudent", "getUserApprovedByGId", "token", "gId", "", "Signature", "Search", "NumberRow", "PageNumber", "getUserInfo", "getUserMessage", "getUserPendingByGId", "aId", "getWeekNumber", "Lcom/emglab/qlsv/models/entity/WeekNumber;", "insertAllToRoom", "users", "insertToRoom", "insertWeekNumberToRoom", "weekNumber", "login", "loginWithMSAccount", "headers", "", "lostPassword", "updateToRoom", "updateUserAddress", "userAddress", "motelInfo", "Lcom/emglab/qlsv/models/entity/Motel;", "userRegister", "email", "mobile", "app_debug"})
@javax.inject.Singleton()
public final class UserRepository {
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserGroup>> userByGroups;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Message>> messages;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserGroup>> userPendingByGroups;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> ctsvCapLiveData;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.user.CTSVUserLoginRes> ctsvUserLoginResLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<java.lang.String>> citiesLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<java.lang.String>> districtsLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<java.lang.String>> wardsLiveData;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.UpdateStudentContactResp> updateUserAddressLiveData;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.UserAddress>> getListUserAddress;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> deleteAddress;
    private final com.emglab.qlsv.dao.UserDAO userDAO = null;
    private final com.emglab.qlsv.dao.ScheduleStudnetDAO scheduleStudnetDAO = null;
    private final com.emglab.qlsv.dao.WeekNumberDAO weekNumberDAO = null;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserGroup>>> getUserApprovedByGId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int gId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Search, int NumberRow, int PageNumber, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserGroup>>> getUserPendingByGId(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int aId, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Search, int NumberRow, int PageNumber, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Message>>> getUserMessage(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.User>> getUserInfo(boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.user.CTSVUserLoginRes>> login(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.user.CTSVUserLoginRes>> loginWithMSAccount(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> headers, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> changePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> lostPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> checkOTPLostPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String otp, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> userRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.ScheduleStudent>>> getScheduleStudent(boolean shouldFetch, long callDelay) {
        return null;
    }
    
    public final void deleteAndInsertNewSchedule(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.ScheduleStudent> scheduleStudents) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.WeekNumber> getWeekNumber() {
        return null;
    }
    
    private final void insertAllToRoom(java.util.List<com.emglab.qlsv.models.entity.User> users) {
    }
    
    public final void insertToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.User user) {
    }
    
    public final void insertWeekNumberToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.WeekNumber weekNumber) {
    }
    
    public final void updateToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.User user) {
    }
    
    public final void deleteFromRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.User user) {
    }
    
    public final void deleteRoom() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getListCities(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getListDistricts(@org.jetbrains.annotations.NotNull()
    java.lang.String city, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getListWards(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String district, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> updateUserAddress(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress userAddress, @org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.Motel motelInfo, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserAddress>>> getListUserAddress(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteUserAddress(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress address, boolean shouldFetch) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.UserDAO userDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.ScheduleStudnetDAO scheduleStudnetDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.WeekNumberDAO weekNumberDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
        super();
    }
}