package com.emglab.qlsv.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/dao/UserCriteriaActivityDAO;", "", "delete", "", "userCriteriaActivity", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "insert", "", "insertAll", "userCriteriaActivitys", "", "update", "app_debug"})
public abstract interface UserCriteriaActivityDAO {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaActivity userCriteriaActivity);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity> userCriteriaActivitys);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaActivity userCriteriaActivity);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaActivity userCriteriaActivity);
}