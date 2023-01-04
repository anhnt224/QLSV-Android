package com.emglab.qlsv.teacher.fragment.student;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0003J$\u0010\'\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020!H\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020%2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\u0012\u00100\u001a\u00020%2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u00020%2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0017J$\u00108\u001a\u0002092\u0006\u00106\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020%H\u0002J\b\u0010A\u001a\u00020%H\u0002J\b\u0010B\u001a\u00020%H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/student/ListStudentFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;", "()V", "allClass", "", "binding", "Lcom/emglab/qlsv/databinding/ListStudentFragmentBinding;", "classSelected", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "filterTypes", "", "Lcom/emglab/qlsv/models/entity/FilterType;", "[Lcom/emglab/qlsv/models/entity/FilterType;", "isGetStudentsFirst", "", "listClasses", "[Ljava/lang/String;", "searchView", "Landroidx/appcompat/widget/SearchView;", "selectedFilterType", "semesterSelected", "semesters", "studentAdapter", "Lcom/emglab/qlsv/teacher/adapters/StudentAdapter;", "students", "", "Lcom/emglab/qlsv/models/entity/Student;", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/student/ListStudentViewModel;", "chooseClass", "", "chooseSemester", "filterListStudent", "list", "typeFilter", "onButtonActivityClick", "student", "onButtonInfoClick", "studentID", "onButtonMarkClick", "studentName", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setUpViewModel", "showFilterTypeDialog", "subscribeUI", "app_debug"})
public final class ListStudentFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.teacher.viewmodel.student.ListStudentViewModel viewModel;
    private com.emglab.qlsv.databinding.ListStudentFragmentBinding binding;
    private com.emglab.qlsv.teacher.adapters.StudentAdapter studentAdapter;
    private java.lang.String[] semesters;
    private java.lang.String semesterSelected;
    private java.lang.String classSelected;
    private java.lang.String allClass;
    private java.lang.String[] listClasses;
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.List<com.emglab.qlsv.models.entity.Student> students;
    private com.emglab.qlsv.models.entity.FilterType[] filterTypes;
    private com.emglab.qlsv.models.entity.FilterType selectedFilterType;
    private boolean isGetStudentsFirst;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void subscribeUI() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void chooseSemester() {
    }
    
    private final void chooseClass() {
    }
    
    /**
     * *
     */
    @java.lang.Override()
    public void onButtonActivityClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Student student) {
    }
    
    @java.lang.Override()
    public void onButtonInfoClick(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID) {
    }
    
    @java.lang.Override()
    public void onButtonMarkClick(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID, @org.jetbrains.annotations.NotNull()
    java.lang.String studentName) {
    }
    
    /**
     * *
     */
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
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
    
    private final void showFilterTypeDialog() {
    }
    
    private final java.util.List<com.emglab.qlsv.models.entity.Student> filterListStudent(java.util.List<com.emglab.qlsv.models.entity.Student> list, com.emglab.qlsv.models.entity.FilterType typeFilter) {
        return null;
    }
    
    public ListStudentFragment() {
        super();
    }
}