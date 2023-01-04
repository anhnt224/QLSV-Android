package com.emglab.qlsv.ui.adapter.timetable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/timetable/DayOfWeekAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/timetable/DayOfWeekAdapter$ViewHolder;", "daysOfWeek", "", "Lcom/emglab/qlsv/models/entity/DayOfWeek;", "(Ljava/util/List;)V", "getDaysOfWeek", "()Ljava/util/List;", "setDaysOfWeek", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class DayOfWeekAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.timetable.DayOfWeekAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.DayOfWeek> daysOfWeek;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.timetable.DayOfWeekAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.timetable.DayOfWeekAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.DayOfWeek> getDaysOfWeek() {
        return null;
    }
    
    public final void setDaysOfWeek(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.DayOfWeek> p0) {
    }
    
    public DayOfWeekAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.DayOfWeek> daysOfWeek) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/timetable/DayOfWeekAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemDayOfWeekBinding;", "(Lcom/emglab/qlsv/databinding/ListItemDayOfWeekBinding;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemDayOfWeekBinding;", "bindView", "", "dayOfWeek", "Lcom/emglab/qlsv/models/entity/DayOfWeek;", "position", "", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemDayOfWeekBinding binding = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.DayOfWeek dayOfWeek, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemDayOfWeekBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemDayOfWeekBinding binding) {
            super(null);
        }
    }
}