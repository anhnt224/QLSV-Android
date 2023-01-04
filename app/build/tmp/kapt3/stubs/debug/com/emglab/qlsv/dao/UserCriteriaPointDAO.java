package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/dao/UserCriteriaPointDAO;", "", "delete", "", "userCriteriaPoint", "Lcom/emglab/qlsv/models/entity/UserCriteriaPoint;", "getUserCriteriaPointByCIdFromRoom", "Landroidx/lifecycle/LiveData;", "", "CId", "", "insert", "", "insertAll", "userCriteriaPoints", "update", "app_debug"})
public abstract interface UserCriteriaPointDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM UserCriteriaPoint  where CId =:CId ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.UserCriteriaPoint>> getUserCriteriaPointByCIdFromRoom(int CId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaPoint userCriteriaPoint);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaPoint> userCriteriaPoints);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaPoint userCriteriaPoint);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaPoint userCriteriaPoint);
}