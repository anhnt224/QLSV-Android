package com.emglab.qlsv.teacher.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaGroupAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaGroupAdapter$ViewHolder;", "criteriaGroups", "", "Lcom/emglab/qlsv/models/entity/CriteriaGroup;", "onItemClickListener", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;)V", "getCriteriaGroups", "()Ljava/util/List;", "setCriteriaGroups", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class StudentCriteriaGroupAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.teacher.adapters.StudentCriteriaGroupAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> criteriaGroups;
    private final com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.teacher.adapters.StudentCriteriaGroupAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.StudentCriteriaGroupAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> getCriteriaGroups() {
        return null;
    }
    
    public final void setCriteriaGroups(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> p0) {
    }
    
    public StudentCriteriaGroupAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> criteriaGroups, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaGroupAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemCriteriaGroupsBinding;", "onItemClickListener", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "(Lcom/emglab/qlsv/databinding/ListItemCriteriaGroupsBinding;Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemCriteriaGroupsBinding;", "bindView", "", "criteriaGroup", "Lcom/emglab/qlsv/models/entity/CriteriaGroup;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemCriteriaGroupsBinding binding = null;
        private final com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.CriteriaGroup criteriaGroup) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemCriteriaGroupsBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemCriteriaGroupsBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
    }
}