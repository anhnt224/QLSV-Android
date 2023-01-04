package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\r\u001a\u00020\nH\'J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000fH\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\b\b\u0002\u0010\u0011\u001a\u00020\nH\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\'\u00a8\u0006\u001a"}, d2 = {"Lcom/emglab/qlsv/dao/ActivityDAO;", "", "delete", "", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "deleteAll", "getActivityDetail", "Landroidx/lifecycle/LiveData;", "AId", "", "getActiviyByCIdFromRoom", "", "CId", "getAll", "Landroidx/paging/DataSource$Factory;", "getAll2", "uaStatus", "insert", "", "insertAll", "activitys", "update", "updateStatus", "status", "id", "app_debug"})
public abstract interface ActivityDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Activity ORDER BY StartTime ASC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.emglab.qlsv.models.entity.Activity> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Activity where UAStatus != :uaStatus ORDER BY StartTime ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> getAll2(int uaStatus);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM UserCriteriaActivity uca inner join Activity a on a.AId = uca.AId where uca.CId =:CId ORDER BY AName DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> getActiviyByCIdFromRoom(int CId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Activity where AId = :AId")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.Activity> getActivityDetail(int AId);
    
    @androidx.room.Query(value = "UPDATE Activity SET UAStatus = :status WHERE AId = :id")
    public abstract int updateStatus(int status, int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Activity> activitys);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity);
    
    @androidx.room.Query(value = "DELETE FROM Activity")
    public abstract void deleteAll();
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}