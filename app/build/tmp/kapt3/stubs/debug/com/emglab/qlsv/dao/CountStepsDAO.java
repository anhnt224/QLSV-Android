package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/emglab/qlsv/dao/CountStepsDAO;", "", "delete", "", "countSteps", "Lcom/emglab/qlsv/models/entity/CountSteps;", "deleteAll", "getAllCountSteps", "Landroidx/lifecycle/LiveData;", "", "getCountSteps", "mId", "", "insert", "", "insertAll", "activitys", "app_debug"})
public abstract interface CountStepsDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM countSteps ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.CountSteps>> getAllCountSteps();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM countSteps WHERE id = :mId")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.CountSteps> getCountSteps(@org.jetbrains.annotations.NotNull()
    java.lang.String mId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.CountSteps countSteps);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CountSteps> activitys);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.CountSteps countSteps);
    
    @androidx.room.Query(value = "DELETE FROM countSteps")
    public abstract void deleteAll();
}