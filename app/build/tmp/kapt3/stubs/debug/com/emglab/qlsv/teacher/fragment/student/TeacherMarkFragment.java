package com.emglab.qlsv.teacher.fragment.student;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0003J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/student/TeacherMarkFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaAdapter$OnItemClickListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/TeacherMarkFragmentBinding;", "criteriaTypes", "", "Lcom/emglab/qlsv/models/entity/CriteriaType;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "index", "", "studentCriteriaGroupAdapter", "Lcom/emglab/qlsv/teacher/adapters/StudentCriteriaGroupAdapter;", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/student/TeacherMarkViewModel;", "getSumSPoint", "handlePasteScore", "", "onButtonCriteriaSelected", "userCriteriaDetail", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onScoreChanged", "setUpViewModel", "subscribeUI", "updateData", "criteriaType", "app_debug"})
public final class TeacherMarkFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter.OnItemClickListener {
    private com.emglab.qlsv.teacher.viewmodel.student.TeacherMarkViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.TeacherMarkFragmentBinding binding;
    private java.util.List<com.emglab.qlsv.models.entity.CriteriaType> criteriaTypes;
    private int index;
    private com.emglab.qlsv.teacher.adapters.StudentCriteriaGroupAdapter studentCriteriaGroupAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpViewModel() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void handlePasteScore() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void subscribeUI() {
    }
    
    private final void updateData(com.emglab.qlsv.models.entity.CriteriaType criteriaType) {
    }
    
    @java.lang.Override()
    public void onScoreChanged() {
    }
    
    private final int getSumSPoint() {
        return 0;
    }
    
    @java.lang.Override()
    public void onButtonCriteriaSelected(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail) {
    }
    
    public TeacherMarkFragment() {
        super();
    }
}