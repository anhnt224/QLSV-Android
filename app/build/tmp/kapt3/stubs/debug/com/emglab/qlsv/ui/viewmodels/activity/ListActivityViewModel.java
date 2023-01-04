package com.emglab.qlsv.ui.viewmodels.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/activity/ListActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "activityRepository", "Lcom/emglab/qlsv/repositories/activity/ActivityRepository;", "(Lcom/emglab/qlsv/repositories/activity/ActivityRepository;)V", "_type", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/ui/viewmodels/activity/ListActivityViewModel$Type;", "activities", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Activity;", "getActivities", "()Landroidx/lifecycle/LiveData;", "setActivities", "(Landroidx/lifecycle/LiveData;)V", "getType", "setType", "", "type", "Type", "app_debug"})
public final class ListActivityViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel.Type> _type;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> activities;
    private final com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivities() {
        return null;
    }
    
    public final void setActivities(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> p0) {
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel.Type type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel.Type> getType() {
        return null;
    }
    
    @javax.inject.Inject()
    public ListActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/activity/ListActivityViewModel$Type;", "", "(Ljava/lang/String;I)V", "ALL", "JOINED", "app_debug"})
    public static enum Type {
        /*public static final*/ ALL /* = new ALL() */ /*enum*/ ,
        /*public static final*/ JOINED /* = new JOINED() */ /*enum*/ ;
        
        Type() {
        }
    }
}