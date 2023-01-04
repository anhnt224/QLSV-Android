package com.emglab.qlsv.modules_teacher.contactParent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001-B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\tJ\u0006\u0010$\u001a\u00020%J\u000e\u0010\u001a\u001a\u00020%2\u0006\u0010&\u001a\u00020\fJ\u000e\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0012J\u001e\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u001cR#\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/emglab/qlsv/modules_teacher/contactParent/StudentList2ViewModel;", "Landroidx/lifecycle/ViewModel;", "teacherRepository", "Lcom/emglab/qlsv/repositories/TeacherRepository;", "(Lcom/emglab/qlsv/repositories/TeacherRepository;)V", "_parameter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/modules_teacher/contactParent/StudentList2ViewModel$Parameter;", "classes", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "", "getClasses", "()Landroidx/lifecycle/MediatorLiveData;", "setClasses", "(Landroidx/lifecycle/MediatorLiveData;)V", "filterType", "Lcom/emglab/qlsv/models/entity/FilterType;", "liveDataGetListClass", "Landroidx/lifecycle/LiveData;", "parameter", "getParameter", "()Landroidx/lifecycle/LiveData;", "selectedStudentId", "studentInfoUrlToken", "getStudentInfoUrlToken", "setStudentInfoUrlToken", "(Landroidx/lifecycle/LiveData;)V", "studentInfoUrlToken2", "getStudentInfoUrlToken2", "setStudentInfoUrlToken2", "students", "Lcom/emglab/qlsv/models/entity/Student;", "getStudents", "getFilterType", "getListClasses", "", "studentId", "setFilterType", "type", "setParameter", "semester", "className", "search", "Parameter", "app_debug"})
public final class StudentList2ViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.entity.FilterType> filterType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> classes;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> liveDataGetListClass;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.modules_teacher.contactParent.StudentList2ViewModel.Parameter> _parameter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Student>>> students = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> selectedStudentId = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> studentInfoUrlToken;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> studentInfoUrlToken2;
    private final com.emglab.qlsv.repositories.TeacherRepository teacherRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getClasses() {
        return null;
    }
    
    public final void setClasses(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.modules_teacher.contactParent.StudentList2ViewModel.Parameter> getParameter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Student>>> getStudents() {
        return null;
    }
    
    public final void getStudentInfoUrlToken(@org.jetbrains.annotations.NotNull()
    java.lang.String studentId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> getStudentInfoUrlToken() {
        return null;
    }
    
    public final void setStudentInfoUrlToken(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> getStudentInfoUrlToken2() {
        return null;
    }
    
    public final void setStudentInfoUrlToken2(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.entity.FilterType> getFilterType() {
        return null;
    }
    
    public final void setFilterType(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.FilterType type) {
    }
    
    public final void setParameter(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    java.lang.String search) {
    }
    
    public final void getListClasses() {
    }
    
    @javax.inject.Inject()
    public StudentList2ViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.TeacherRepository teacherRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/modules_teacher/contactParent/StudentList2ViewModel$Parameter;", "", "semester", "", "className", "search", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getSearch", "getSemester", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Parameter {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String semester = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String className = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String search = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSemester() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClassName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearch() {
            return null;
        }
        
        public Parameter(@org.jetbrains.annotations.NotNull()
        java.lang.String semester, @org.jetbrains.annotations.NotNull()
        java.lang.String className, @org.jetbrains.annotations.NotNull()
        java.lang.String search) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.modules_teacher.contactParent.StudentList2ViewModel.Parameter copy(@org.jetbrains.annotations.NotNull()
        java.lang.String semester, @org.jetbrains.annotations.NotNull()
        java.lang.String className, @org.jetbrains.annotations.NotNull()
        java.lang.String search) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}