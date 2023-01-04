package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/emglab/qlsv/dao/SVGroupDAO;", "", "delete", "", "svGroup", "Lcom/emglab/qlsv/models/entity/SVGroup;", "getAll", "Landroidx/lifecycle/LiveData;", "", "insert", "", "insertAll", "svGroups", "update", "app_debug"})
public abstract interface SVGroupDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM SVGroup ORDER BY GName ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.SVGroup>> getAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.SVGroup svGroup);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.SVGroup> svGroups);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.SVGroup svGroup);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.SVGroup svGroup);
}