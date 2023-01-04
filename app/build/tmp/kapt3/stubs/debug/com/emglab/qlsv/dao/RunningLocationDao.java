package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/emglab/qlsv/dao/RunningLocationDao;", "", "deleteAll", "", "getRunningLocations", "", "Lcom/emglab/qlsv/models/entity/run/RunningLocation;", "wayID", "", "insert", "runningLocation", "app_debug"})
public abstract interface RunningLocationDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.run.RunningLocation runningLocation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RunningLocation WHERE wayID == :wayID")
    public abstract java.util.List<com.emglab.qlsv.models.entity.run.RunningLocation> getRunningLocations(@org.jetbrains.annotations.NotNull()
    java.lang.String wayID);
    
    @androidx.room.Query(value = "DELETE FROM RunningLocation")
    public abstract void deleteAll();
}