package com.emglab.qlsv.modules_teacher.contactParent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0003J$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010+\u001a\u00020\u0012H\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0006H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\u0010\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\u0006H\u0002J\u0012\u00101\u001a\u00020\'2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001cH\u0016J\u0010\u00105\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001cH\u0016J\u0012\u00106\u001a\u00020\'2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00107\u001a\u00020\'2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0017J$\u0010<\u001a\u00020=2\u0006\u0010:\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\u0010\u0010A\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001cH\u0016J\u0010\u0010B\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001cH\u0016J\u0010\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020EH\u0016J-\u0010F\u001a\u00020\'2\u0006\u0010G\u001a\u00020H2\u000e\u0010I\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00112\u0006\u0010J\u001a\u00020KH\u0016\u00a2\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020\'H\u0002J \u0010N\u001a\u00020\'2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u001cH\u0002J\b\u0010P\u001a\u00020\'H\u0002J\b\u0010Q\u001a\u00020\'H\u0002J\u0010\u0010R\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001cH\u0002J\u0018\u0010S\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0006H\u0002J\b\u0010T\u001a\u00020\'H\u0002J\u0018\u0010U\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0006H\u0002J\b\u0010V\u001a\u00020\'H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"}, d2 = {"Lcom/emglab/qlsv/modules_teacher/contactParent/StudentList2Fragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/modules_teacher/contactParent/Student2AdapterListener;", "()V", "allClass", "", "binding", "Lcom/emglab/qlsv/databinding/FragmentStudentList2Binding;", "classSelected", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "filterTypes", "", "Lcom/emglab/qlsv/models/entity/FilterType;", "[Lcom/emglab/qlsv/models/entity/FilterType;", "isGetStudentsFirst", "", "listClasses", "[Ljava/lang/String;", "searchView", "Landroidx/appcompat/widget/SearchView;", "selectedFilterType", "selectedStudent", "Lcom/emglab/qlsv/models/entity/Student;", "semesterSelected", "semesters", "studentAdapter", "Lcom/emglab/qlsv/modules_teacher/contactParent/Student2Adapter;", "students", "", "urlToken", "viewModel", "Lcom/emglab/qlsv/modules_teacher/contactParent/StudentList2ViewModel;", "chooseClass", "", "chooseSemester", "filterListStudent", "list", "typeFilter", "getStudentInfoUrl", "student", "hasSendSMSPermission", "makePhoneCall", "number", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCallButtonClick", "onContactButtonClick", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onInfoButtonClick", "onItemClick", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestSMSPermission", "sendSMS", "phoneNumber", "setupRecyclerView", "setupViewModel", "showCallDialog", "showContactDialog", "showFilterTypeDialog", "showStudentInfo", "subscribeUI", "app_debug"})
public final class StudentList2Fragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.modules_teacher.contactParent.Student2AdapterListener {
    private com.emglab.qlsv.modules_teacher.contactParent.StudentList2ViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.FragmentStudentList2Binding binding;
    private com.emglab.qlsv.modules_teacher.contactParent.Student2Adapter studentAdapter;
    private java.lang.String[] semesters;
    private java.lang.String semesterSelected;
    private java.lang.String classSelected;
    private java.lang.String allClass;
    private java.lang.String[] listClasses;
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.List<com.emglab.qlsv.models.entity.Student> students;
    private com.emglab.qlsv.models.entity.FilterType[] filterTypes;
    private com.emglab.qlsv.models.entity.FilterType selectedFilterType;
    private com.emglab.qlsv.models.entity.Student selectedStudent;
    private java.lang.String urlToken;
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
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
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
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void subscribeUI() {
    }
    
    private final void setupRecyclerView() {
    }
    
    /**
     * * Student2Adapter Listener implements
     *     * onCallButtonClick
     *     * onContactButtonClick
     *     * onInfoButtonClick
     *     * onItemClick
     */
    @java.lang.Override()
    public void onCallButtonClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Student student) {
    }
    
    @java.lang.Override()
    public void onContactButtonClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Student student) {
    }
    
    @java.lang.Override()
    public void onInfoButtonClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Student student) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Student student) {
    }
    
    private final void showStudentInfo(com.emglab.qlsv.models.entity.Student student, java.lang.String urlToken) {
    }
    
    private final void showContactDialog(com.emglab.qlsv.models.entity.Student student, java.lang.String urlToken) {
    }
    
    private final void sendSMS(java.lang.String phoneNumber, java.lang.String urlToken, com.emglab.qlsv.models.entity.Student student) {
    }
    
    private final java.lang.String getStudentInfoUrl(com.emglab.qlsv.models.entity.Student student, java.lang.String urlToken) {
        return null;
    }
    
    private final boolean hasSendSMSPermission() {
        return false;
    }
    
    private final void requestSMSPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void chooseSemester() {
    }
    
    private final void chooseClass() {
    }
    
    private final void showCallDialog(com.emglab.qlsv.models.entity.Student student) {
    }
    
    private final void makePhoneCall(java.lang.String number) {
    }
    
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
    
    public StudentList2Fragment() {
        super();
    }
}