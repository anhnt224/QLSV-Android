package com.emglab.qlsv.teacher.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$ViewHolder;", "userCriteriaDetails", "", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "onItemClickListener", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "ViewHolder", "app_debug"})
public final class StudentCriteriaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.ViewHolder> {
    private final java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> userCriteriaDetails = null;
    private final com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.ViewHolder holder, int position) {
    }
    
    public StudentCriteriaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> userCriteriaDetails, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemStudentCriteriaBinding;", "onItemClickListener", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "(Lcom/emglab/qlsv/databinding/ListItemStudentCriteriaBinding;Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemStudentCriteriaBinding;", "getOnItemClickListener", "()Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "bindView", "", "userCriteriaDetail", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemStudentCriteriaBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemStudentCriteriaBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener getOnItemClickListener() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemStudentCriteriaBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "", "onButtonCriteriaSelected", "", "userCriteriaDetail", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "onScoreChanged", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onScoreChanged();
        
        public abstract void onButtonCriteriaSelected(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail);
    }
}