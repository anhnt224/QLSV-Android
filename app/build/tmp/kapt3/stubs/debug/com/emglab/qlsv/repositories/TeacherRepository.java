package com.emglab.qlsv.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 0\u001f2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$J$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 0\u001f2\u0006\u0010&\u001a\u00020\'2\b\b\u0002\u0010#\u001a\u00020$J4\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0 0\u001f2\u0006\u0010)\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020+J\"\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0 0\u001f2\b\b\u0002\u0010#\u001a\u00020$J2\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0 0\u001f2\u0006\u0010.\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$J2\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0 0\u001f2\u0006\u0010.\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$J$\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0 0\u001f2\u0006\u0010!\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$J&\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140 0\u001f2\u0006\u0010&\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$J*\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0 0\u001f2\u0006\u0010!\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$J:\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 0\u001f2\u0006\u0010.\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010#\u001a\u00020$J*\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0 0\u001f2\u0006\u00105\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/emglab/qlsv/repositories/TeacherRepository;", "", "webService", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "(Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "criteriaTypes", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/emglab/qlsv/models/entity/CriteriaType;", "liveDataAddStudentNote", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "liveDataDelStudentNote", "liveDataGetActivityByStudent", "Lcom/emglab/qlsv/models/entity/Activity;", "liveDataGetListClass", "", "liveDataGetListStudents", "Lcom/emglab/qlsv/models/entity/Student;", "liveDataSearchStudent", "markCriteriaUser", "notes", "Lcom/emglab/qlsv/models/entity/Note;", "studentInfo", "Lcom/emglab/qlsv/models/entity/StudentInfo;", "studentInfoUrlToken", "addStudentNote", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "studentID", "note", "shouldFetch", "", "delStudentNote", "id", "", "getActivityByStudent", "studentId", "callDelay", "", "getListClass", "getListCriteriaTypes", "semester", "getListStudent", "className", "getStudentInfo", "getStudentInfoUrlToken", "getStudentNotes", "searchStudent", "search", "app_debug"})
public final class TeacherRepository {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.Student>> liveDataGetListStudents;
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> liveDataGetListClass;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.Activity>> liveDataGetActivityByStudent;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.StudentInfo> studentInfo;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>> criteriaTypes;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> markCriteriaUser;
    private androidx.lifecycle.MediatorLiveData<java.util.List<com.emglab.qlsv.models.entity.Note>> notes;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.Student>> liveDataSearchStudent;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> liveDataAddStudentNote;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> liveDataDelStudentNote;
    private androidx.lifecycle.MutableLiveData<java.lang.String> studentInfoUrlToken;
    private final com.emglab.qlsv.webservices.WebService webService = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Student>>> getListStudent(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String className, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Student>>> searchStudent(@org.jetbrains.annotations.NotNull()
    java.lang.String search, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getListClass(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivityByStudent(@org.jetbrains.annotations.NotNull()
    java.lang.String studentId, boolean shouldFetch, long callDelay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.StudentInfo>> getStudentInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> getListCriteriaTypes(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String studentId, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> markCriteriaUser(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String studentId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaType> criteriaTypes, boolean shouldFetch) {
        return null;
    }
    
    /**
     * * Get student notes by StudentID
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Note>>> getStudentNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID, boolean shouldFetch) {
        return null;
    }
    
    /**
     * *
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> addStudentNote(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID, @org.jetbrains.annotations.NotNull()
    java.lang.String note, boolean shouldFetch) {
        return null;
    }
    
    /**
     * *
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> delStudentNote(int id, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> getStudentInfoUrlToken(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean shouldFetch) {
        return null;
    }
    
    @javax.inject.Inject()
    public TeacherRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webService, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
        super();
    }
}