package com.emglab.qlsv.teacher.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/teacher/adapters/StudentAdapter$ViewHolder;", "students", "", "Lcom/emglab/qlsv/models/entity/Student;", "onItemStudentButtonClickLister", "Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;", "(Ljava/util/List;Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;)V", "getOnItemStudentButtonClickLister", "()Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;", "setOnItemStudentButtonClickLister", "(Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;)V", "getStudents", "()Ljava/util/List;", "setStudents", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class StudentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.teacher.adapters.StudentAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.Student> students;
    @org.jetbrains.annotations.NotNull()
    private com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister onItemStudentButtonClickLister;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.teacher.adapters.StudentAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.StudentAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Student> getStudents() {
        return null;
    }
    
    public final void setStudents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Student> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister getOnItemStudentButtonClickLister() {
        return null;
    }
    
    public final void setOnItemStudentButtonClickLister(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister p0) {
    }
    
    public StudentAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Student> students, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister onItemStudentButtonClickLister) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/StudentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemStudentBinding;", "onItemStudentButtonClickLister", "Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;", "(Lcom/emglab/qlsv/databinding/ListItemStudentBinding;Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemStudentBinding;", "getOnItemStudentButtonClickLister", "()Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;", "setOnItemStudentButtonClickLister", "(Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;)V", "bindView", "", "student", "Lcom/emglab/qlsv/models/entity/Student;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemStudentBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister onItemStudentButtonClickLister;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Student student) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemStudentBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister getOnItemStudentButtonClickLister() {
            return null;
        }
        
        public final void setOnItemStudentButtonClickLister(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemStudentBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister onItemStudentButtonClickLister) {
            super(null);
        }
    }
}