package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserDetail;", "", "trainingPoints", "", "Lcom/emglab/qlsv/models/entity/TrainingPoint;", "(Ljava/util/List;)V", "getTrainingPoints", "()Ljava/util/List;", "setTrainingPoints", "app_debug"})
public final class UserDetail {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CriteriaPointSemsterLst")
    private java.util.List<com.emglab.qlsv.models.entity.TrainingPoint> trainingPoints;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.TrainingPoint> getTrainingPoints() {
        return null;
    }
    
    public final void setTrainingPoints(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.TrainingPoint> p0) {
    }
    
    public UserDetail(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.TrainingPoint> trainingPoints) {
        super();
    }
}