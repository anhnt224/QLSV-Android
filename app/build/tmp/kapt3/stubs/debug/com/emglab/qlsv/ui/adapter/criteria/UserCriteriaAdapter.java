package com.emglab.qlsv.ui.adapter.criteria;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/criteria/UserCriteriaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/criteria/UserCriteriaAdapter$ViewHolder;", "userCriteriaDetails", "", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "onCriteriaItemClick", "Lcom/emglab/qlsv/ui/adapter/criteria/OnCriteriaItemClick;", "(Ljava/util/List;Lcom/emglab/qlsv/ui/adapter/criteria/OnCriteriaItemClick;)V", "getOnCriteriaItemClick", "()Lcom/emglab/qlsv/ui/adapter/criteria/OnCriteriaItemClick;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class UserCriteriaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.criteria.UserCriteriaAdapter.ViewHolder> {
    private final java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> userCriteriaDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick onCriteriaItemClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.criteria.UserCriteriaAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.criteria.UserCriteriaAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick getOnCriteriaItemClick() {
        return null;
    }
    
    public UserCriteriaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> userCriteriaDetails, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick onCriteriaItemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/criteria/UserCriteriaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemUserCriteriaBinding;", "onCriteriaItemClick", "Lcom/emglab/qlsv/ui/adapter/criteria/OnCriteriaItemClick;", "(Lcom/emglab/qlsv/databinding/ListItemUserCriteriaBinding;Lcom/emglab/qlsv/ui/adapter/criteria/OnCriteriaItemClick;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemUserCriteriaBinding;", "bindView", "", "userCriteriaDetail", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemUserCriteriaBinding binding = null;
        private final com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick onCriteriaItemClick = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemUserCriteriaBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemUserCriteriaBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick onCriteriaItemClick) {
            super(null);
        }
    }
}