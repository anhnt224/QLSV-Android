package com.emglab.qlsv.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.emglab.qlsv.Converters.class})
@androidx.room.Database(entities = {com.emglab.qlsv.models.entity.Activity.class, com.emglab.qlsv.models.entity.Criteria.class, com.emglab.qlsv.models.entity.SVGroup.class, com.emglab.qlsv.models.entity.User.class, com.emglab.qlsv.models.entity.UserCriteriaActivity.class, com.emglab.qlsv.models.entity.UserCriteriaPoint.class, com.emglab.qlsv.models.entity.UserGroup.class, com.emglab.qlsv.models.entity.UserRole.class, com.emglab.qlsv.models.entity.UserCheckInActivity.class, com.emglab.qlsv.models.entity.ScheduleStudent.class, com.emglab.qlsv.models.entity.WeekNumber.class, com.emglab.qlsv.models.entity.CountSteps.class, com.emglab.qlsv.models.entity.Subject.class, com.emglab.qlsv.models.entity.run.RunningLocation.class, com.emglab.qlsv.models.entity.run.RunningWay.class, com.emglab.qlsv.models.entity.ImageMotel.class, com.emglab.qlsv.models.entity.run.RunData.class}, version = 29, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020$H&\u00a8\u0006&"}, d2 = {"Lcom/emglab/qlsv/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "activityDAO", "Lcom/emglab/qlsv/dao/ActivityDAO;", "countStepsDAO", "Lcom/emglab/qlsv/dao/CountStepsDAO;", "criteriaDAO", "Lcom/emglab/qlsv/dao/CriteriaDAO;", "imageMotelDao", "Lcom/emglab/qlsv/dao/ImageMotelDao;", "runDataDao", "Lcom/emglab/qlsv/dao/RunDataDao;", "runningLocationDao", "Lcom/emglab/qlsv/dao/RunningLocationDao;", "runningWayDao", "Lcom/emglab/qlsv/dao/RunningWayDao;", "scheduleStudnetDAO", "Lcom/emglab/qlsv/dao/ScheduleStudnetDAO;", "svGroupDAO", "Lcom/emglab/qlsv/dao/SVGroupDAO;", "timetableDAO", "Lcom/emglab/qlsv/dao/TimetableDAO;", "userCheckInActivityDAO", "Lcom/emglab/qlsv/dao/UserCheckInActivityDAO;", "userCriteriaActivityDAO", "Lcom/emglab/qlsv/dao/UserCriteriaActivityDAO;", "userCriteriaPointDAO", "Lcom/emglab/qlsv/dao/UserCriteriaPointDAO;", "userDAO", "Lcom/emglab/qlsv/dao/UserDAO;", "userGroupDAO", "Lcom/emglab/qlsv/dao/UserGroupDAO;", "userRoleDAO", "Lcom/emglab/qlsv/dao/UserRoleDAO;", "weekNumberDAO", "Lcom/emglab/qlsv/dao/WeekNumberDAO;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile com.emglab.qlsv.data.AppDatabase instance;
    public static final com.emglab.qlsv.data.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.ActivityDAO activityDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.CriteriaDAO criteriaDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.SVGroupDAO svGroupDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.UserCriteriaActivityDAO userCriteriaActivityDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.UserCriteriaPointDAO userCriteriaPointDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.UserDAO userDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.UserGroupDAO userGroupDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.UserRoleDAO userRoleDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.UserCheckInActivityDAO userCheckInActivityDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.ScheduleStudnetDAO scheduleStudnetDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.WeekNumberDAO weekNumberDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.CountStepsDAO countStepsDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.TimetableDAO timetableDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.RunningWayDao runningWayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.RunningLocationDao runningLocationDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.ImageMotelDao imageMotelDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.emglab.qlsv.dao.RunDataDao runDataDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/emglab/qlsv/data/AppDatabase$Companion;", "", "()V", "instance", "Lcom/emglab/qlsv/data/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.data.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.emglab.qlsv.data.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}