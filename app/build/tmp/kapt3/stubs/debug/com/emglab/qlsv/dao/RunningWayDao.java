package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/emglab/qlsv/dao/RunningWayDao;", "", "deleteAll", "", "getAll", "", "Lcom/emglab/qlsv/models/entity/run/RunningWay;", "insert", "runningWay", "update", "app_debug"})
public abstract interface RunningWayDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.run.RunningWay runningWay);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.run.RunningWay runningWay);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RunningWay")
    public abstract java.util.List<com.emglab.qlsv.models.entity.run.RunningWay> getAll();
    
    @androidx.room.Query(value = "DELETE FROM RunningWay")
    public abstract void deleteAll();
}