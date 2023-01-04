package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/emglab/qlsv/dao/TimetableDAO;", "", "deleteAll", "", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/emglab/qlsv/models/entity/Subject;", "insertAll", "subjects", "app_debug"})
public abstract interface TimetableDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Timetable")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Subject>> getAll();
    
    @androidx.room.Query(value = "DELETE from Timetable")
    public abstract void deleteAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Subject> subjects);
}