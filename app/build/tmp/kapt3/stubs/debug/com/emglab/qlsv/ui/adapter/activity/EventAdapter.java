package com.emglab.qlsv.ui.adapter.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$ViewHolder;", "activities", "", "Lcom/emglab/qlsv/models/entity/Activity;", "activity", "Landroid/app/Activity;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;", "(Ljava/util/List;Landroid/app/Activity;Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;)V", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "getActivity", "()Landroid/app/Activity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "ViewHolder", "app_debug"})
public final class EventAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.activity.EventAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.Activity> activities;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    private final com.emglab.qlsv.ui.adapter.activity.EventAdapter.OnItemClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.activity.EventAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.activity.EventAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Activity> getActivities() {
        return null;
    }
    
    public final void setActivities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public EventAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Activity> activities, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.activity.EventAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemEventBinding;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;", "(Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter;Lcom/emglab/qlsv/databinding/ListItemEventBinding;Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;)V", "bindView", "", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "loadImage", "imageURL", "", "imageView", "Landroid/widget/ImageView;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.emglab.qlsv.databinding.ListItemEventBinding binding = null;
        private final com.emglab.qlsv.ui.adapter.activity.EventAdapter.OnItemClickListener onItemClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Activity activity) {
        }
        
        private final void loadImage(java.lang.String imageURL, android.widget.ImageView imageView) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemEventBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.activity.EventAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;", "", "onItemClick", "", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Activity activity);
    }
}