package com.emglab.qlsv.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u000fJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u000fJ\u0006\u0010\"\u001a\u00020\u000fJ\u0016\u0010#\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0014J\u0016\u0010#\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000bJ\u0016\u0010#\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fJ\u0016\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'J\u000e\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006,"}, d2 = {"Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "", "mSharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getMSharedPreferences", "()Landroid/content/SharedPreferences;", "setMSharedPreferences", "clearAndPutLogout", "", "typeLogout", "", "clearRunningData", "deleteSavedData", "key", "", "get", "", "defaultValue", "(Ljava/lang/String;Z)Ljava/lang/Boolean;", "", "(Ljava/lang/String;F)Ljava/lang/Float;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "getEmail", "getFullName", "getLatList", "getLngList", "getLocationList", "", "Lcom/google/android/gms/maps/model/LatLng;", "getRunningData", "Lcom/emglab/qlsv/models/entity/RunningData;", "getToken", "getUserName", "getWeekNumber", "put", "value", "saveLocationData", "lat", "", "lng", "saveRunningData", "runningData", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class SharedPrefsHelper {
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences mSharedPreferences;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String token;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String userCode;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER_CODE = "USER_CODE";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TOKEN = "TOKEN";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EMAIL = "EMAIL";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WEEK_NUMBER = "WEEK_NUMBER";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LOGOUT = "LOGOUT";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FULLNAME = "FULLNAME";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PEOPLEID = "PEOPLEID";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EMPLOYEETYPE = "EMPLOYEETYPE";
    public static final int LOGOUT_ERROR_TOKEN = 1;
    private static final int LOGOUT_CLICK = 2;
    private static final int LOGOUT_DEFAULT = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataTimeKey = "runningDataTimeKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataLatKey = "runningDataLatKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataLngKey = "runningDataLngKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataDistanceKey = "runningDataDistanceKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataTimeStartKey = "runningDataTimeStartKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataTimeLatArrKey = "runningDataTimeLatArrKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String runningDataTimeLngArrKey = "runningDataTimeLngArrKey";
    public static final com.emglab.qlsv.helper.SharedPrefsHelper.Companion Companion = null;
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return null;
    }
    
    public final void deleteSavedData(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void clearAndPutLogout(int typeLogout) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeekNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void saveRunningData(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.RunningData runningData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.RunningData getRunningData() {
        return null;
    }
    
    public final void saveLocationData(double lat, double lng) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLngList() {
        return null;
    }
    
    public final void clearRunningData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.gms.maps.model.LatLng> getLocationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getMSharedPreferences() {
        return null;
    }
    
    public final void setMSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @javax.inject.Inject()
    public SharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences mSharedPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010&\u00a8\u0006/"}, d2 = {"Lcom/emglab/qlsv/helper/SharedPrefsHelper$Companion;", "", "()V", "EMAIL", "", "getEMAIL", "()Ljava/lang/String;", "EMPLOYEETYPE", "getEMPLOYEETYPE", "FULLNAME", "getFULLNAME", "LOGOUT", "getLOGOUT", "LOGOUT_CLICK", "", "getLOGOUT_CLICK", "()I", "LOGOUT_DEFAULT", "getLOGOUT_DEFAULT", "LOGOUT_ERROR_TOKEN", "PEOPLEID", "getPEOPLEID", "TOKEN", "getTOKEN", "USER_CODE", "getUSER_CODE", "WEEK_NUMBER", "getWEEK_NUMBER", "runningDataDistanceKey", "runningDataLatKey", "runningDataLngKey", "runningDataTimeKey", "runningDataTimeLatArrKey", "runningDataTimeLngArrKey", "runningDataTimeStartKey", "token", "getToken", "setToken", "(Ljava/lang/String;)V", "userCode", "getUserCode", "setUserCode", "logout", "", "context", "Landroid/content/Context;", "typeLogout", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToken() {
            return null;
        }
        
        public final void setToken(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserCode() {
            return null;
        }
        
        public final void setUserCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_CODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTOKEN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEMAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWEEK_NUMBER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOGOUT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFULLNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPEOPLEID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEMPLOYEETYPE() {
            return null;
        }
        
        public final int getLOGOUT_CLICK() {
            return 0;
        }
        
        public final int getLOGOUT_DEFAULT() {
            return 0;
        }
        
        public final void logout(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int typeLogout) {
        }
        
        private Companion() {
            super();
        }
    }
}