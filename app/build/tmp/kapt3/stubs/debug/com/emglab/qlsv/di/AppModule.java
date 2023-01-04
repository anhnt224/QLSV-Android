package com.emglab.qlsv.di;

import java.lang.System;

/**
 * * AppModule will provide app-wide dependencies for a part of the application.
 * * It should initialize objects used across our application, such as Room database, Retrofit, Shared Preference, etc.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0018\u001a\u00020\nH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u00100\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u00102\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u00064"}, d2 = {"Lcom/emglab/qlsv/di/AppModule;", "", "()V", "provideActivityDao", "Lcom/emglab/qlsv/dao/ActivityDAO;", "db", "Lcom/emglab/qlsv/data/AppDatabase;", "provideApiService", "Lcom/emglab/qlsv/webservices/WebService;", "httpClient", "Lokhttp3/OkHttpClient;", "provideContext", "Landroid/content/Context;", "app", "Lcom/emglab/qlsv/App;", "provideCountStepsDAO", "Lcom/emglab/qlsv/dao/CountStepsDAO;", "provideCriteriaDAO", "Lcom/emglab/qlsv/dao/CriteriaDAO;", "provideDb", "provideFormService", "Lcom/emglab/qlsv/webservices/FormWebService;", "provideGiftService", "Lcom/emglab/qlsv/webservices/GiftWebService;", "provideHttpClient", "provideImageMotelDao", "Lcom/emglab/qlsv/dao/ImageMotelDao;", "provideRunResult", "Lcom/emglab/qlsv/dao/RunDataDao;", "provideRunWebService", "Lcom/emglab/qlsv/webservices/RunWebService;", "provideRunningLocationDao", "Lcom/emglab/qlsv/dao/RunningLocationDao;", "provideRunningWayDao", "Lcom/emglab/qlsv/dao/RunningWayDao;", "provideSVGroupDAO", "Lcom/emglab/qlsv/dao/SVGroupDAO;", "provideScheduleStudnetDAO", "Lcom/emglab/qlsv/dao/ScheduleStudnetDAO;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "context", "provideTimeTableService", "Lcom/emglab/qlsv/webservices/TimeTableWebService;", "provideTimetable", "Lcom/emglab/qlsv/dao/TimetableDAO;", "provideUserCheckInActivityDAO", "Lcom/emglab/qlsv/dao/UserCheckInActivityDAO;", "provideUserDAO", "Lcom/emglab/qlsv/dao/UserDAO;", "provideWeekNumberDAO", "Lcom/emglab/qlsv/dao/WeekNumberDAO;", "app_debug"})
@dagger.Module(includes = {com.emglab.qlsv.di.ViewModelsModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.App app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.webservices.WebService provideApiService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.webservices.FormWebService provideFormService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.webservices.RunWebService provideRunWebService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.webservices.TimeTableWebService provideTimeTableService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.webservices.GiftWebService provideGiftService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.data.AppDatabase provideDb(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.App app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.ActivityDAO provideActivityDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.SVGroupDAO provideSVGroupDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.UserDAO provideUserDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.CriteriaDAO provideCriteriaDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.UserCheckInActivityDAO provideUserCheckInActivityDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.ScheduleStudnetDAO provideScheduleStudnetDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.WeekNumberDAO provideWeekNumberDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.CountStepsDAO provideCountStepsDAO(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.TimetableDAO provideTimetable(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.RunningLocationDao provideRunningLocationDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.RunningWayDao provideRunningWayDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.ImageMotelDao provideImageMotelDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.emglab.qlsv.dao.RunDataDao provideRunResult(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.data.AppDatabase db) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}