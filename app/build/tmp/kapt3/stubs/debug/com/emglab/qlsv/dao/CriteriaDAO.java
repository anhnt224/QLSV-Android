package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\f\u001a\u00020\nH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/emglab/qlsv/dao/CriteriaDAO;", "", "delete", "", "criteria", "Lcom/emglab/qlsv/models/entity/Criteria;", "getCriteriaByAId", "Landroidx/lifecycle/LiveData;", "", "AId", "", "getCriteriaByCGId", "CGId", "insert", "", "insertAll", "criterias", "update", "app_debug"})
public abstract interface CriteriaDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Criteria where CGroupId = :CGId ORDER BY CCode ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Criteria>> getCriteriaByCGId(int CGId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Criteria where AId = :AId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Criteria>> getCriteriaByAId(int AId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Criteria criteria);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Criteria> criterias);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Criteria criteria);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Criteria criteria);
}