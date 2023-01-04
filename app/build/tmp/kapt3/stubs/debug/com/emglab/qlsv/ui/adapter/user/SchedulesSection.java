package com.emglab.qlsv.ui.adapter.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/SchedulesSection;", "Lio/github/luizgrp/sectionedrecyclerviewadapter/Section;", "title", "", "list", "", "Lcom/emglab/qlsv/models/entity/ScheduleStudent;", "itemClick", "Lkotlin/Function1;", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContentItemsTotal", "", "getHeaderViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "getItemViewHolder", "onBindHeaderViewHolder", "holder", "onBindItemViewHolder", "position", "ClickListener", "app_debug"})
public final class SchedulesSection extends io.github.luizgrp.sectionedrecyclerviewadapter.Section {
    private final java.lang.String title = null;
    private final java.util.List<com.emglab.qlsv.models.entity.ScheduleStudent> list = null;
    private final kotlin.jvm.functions.Function1<com.emglab.qlsv.models.entity.ScheduleStudent, kotlin.Unit> itemClick = null;
    
    @java.lang.Override()
    public int getContentItemsTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getItemViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindItemViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getHeaderViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindHeaderViewHolder(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    public SchedulesSection(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.ScheduleStudent> list, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.emglab.qlsv.models.entity.ScheduleStudent, kotlin.Unit> itemClick) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/SchedulesSection$ClickListener;", "", "onItemRootViewClicked", "", "sectionTitle", "", "itemAdapterPosition", "", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onItemRootViewClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String sectionTitle, int itemAdapterPosition);
    }
}