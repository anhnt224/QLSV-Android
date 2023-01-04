package com.emglab.qlsv.ui.adapter.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/activity/ActivityAdapter;", "Lcom/emglab/qlsv/common/DataBoundListAdapter;", "Lcom/emglab/qlsv/models/entity/Activity;", "Lcom/emglab/qlsv/databinding/ListItemActivityBinding;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "itemClick", "Lcom/emglab/qlsv/ui/adapter/activity/ActivityAdapter$OnItemClickListener;", "(Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/ui/adapter/activity/ActivityAdapter$OnItemClickListener;)V", "getAppExecutors", "()Lcom/emglab/qlsv/common/AppExecutors;", "setAppExecutors", "(Lcom/emglab/qlsv/common/AppExecutors;)V", "bind", "", "binding", "item", "createBinding", "parent", "Landroid/view/ViewGroup;", "OnItemClickListener", "app_debug"})
public final class ActivityAdapter extends com.emglab.qlsv.common.DataBoundListAdapter<com.emglab.qlsv.models.entity.Activity, com.emglab.qlsv.databinding.ListItemActivityBinding> {
    @org.jetbrains.annotations.NotNull()
    private com.emglab.qlsv.common.AppExecutors appExecutors;
    private final com.emglab.qlsv.ui.adapter.activity.ActivityAdapter.OnItemClickListener itemClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.emglab.qlsv.databinding.ListItemActivityBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected void bind(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.databinding.ListItemActivityBinding binding, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.AppExecutors getAppExecutors() {
        return null;
    }
    
    public final void setAppExecutors(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors p0) {
    }
    
    public ActivityAdapter(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.activity.ActivityAdapter.OnItemClickListener itemClick) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/activity/ActivityAdapter$OnItemClickListener;", "", "onItemClick", "", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Activity activity);
    }
}