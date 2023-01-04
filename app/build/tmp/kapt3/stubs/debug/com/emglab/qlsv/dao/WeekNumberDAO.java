package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/dao/WeekNumberDAO;", "", "delete", "", "weekNumber", "Lcom/emglab/qlsv/models/entity/WeekNumber;", "getWeek", "Landroidx/lifecycle/LiveData;", "id", "", "insert", "", "app_debug"})
public abstract interface WeekNumberDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM WeekNumber where id = :id")
    public abstract androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.WeekNumber> getWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.WeekNumber weekNumber);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.WeekNumber weekNumber);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}