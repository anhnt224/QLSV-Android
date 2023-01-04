package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\b\u0010\b\u001a\u00020\u0003H\'J\b\u0010\t\u001a\u00020\u0003H\'J\b\u0010\n\u001a\u00020\u0003H\'J\b\u0010\u000b\u001a\u00020\u0003H\'J\b\u0010\f\u001a\u00020\u0003H\'J\b\u0010\r\u001a\u00020\u0003H\'J\b\u0010\u000e\u001a\u00020\u0003H\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/dao/UserDAO;", "", "delete", "", "user", "Lcom/emglab/qlsv/models/entity/User;", "deleteAll1", "deleteAll10", "deleteAll2", "deleteAll3", "deleteAll5", "deleteAll6", "deleteAll7", "deleteAll8", "deleteAll9", "getUserById", "Landroidx/lifecycle/LiveData;", "UserCode", "", "insert", "", "insertAll", "users", "", "update", "app_debug"})
public abstract interface UserDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User where studentId = :UserCode")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.User> getUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String UserCode);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.User user);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.User> users);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.User user);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.User user);
    
    @androidx.room.Query(value = "DELETE FROM usergroup")
    public abstract void deleteAll1();
    
    @androidx.room.Query(value = "DELETE FROM usercriteriaactivity ")
    public abstract void deleteAll2();
    
    @androidx.room.Query(value = "DELETE FROM usercriteriapoint ")
    public abstract void deleteAll3();
    
    @androidx.room.Query(value = "DELETE FROM userrole ")
    public abstract void deleteAll5();
    
    @androidx.room.Query(value = "DELETE FROM criteria ")
    public abstract void deleteAll6();
    
    @androidx.room.Query(value = "DELETE FROM activity ")
    public abstract void deleteAll7();
    
    @androidx.room.Query(value = "DELETE FROM svgroup ")
    public abstract void deleteAll8();
    
    @androidx.room.Query(value = "DELETE FROM user ")
    public abstract void deleteAll9();
    
    @androidx.room.Query(value = "DELETE FROM Timetable")
    public abstract void deleteAll10();
}