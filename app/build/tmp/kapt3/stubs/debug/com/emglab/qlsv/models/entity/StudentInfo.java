package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\u0018\u00002\u00020\u0001B\u00e3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017\u00a2\u0006\u0002\u0010\u001bJ\u0006\u0010J\u001a\u00020\u0003R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010\'R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001fR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010\u001f\u00a8\u0006K"}, d2 = {"Lcom/emglab/qlsv/models/entity/StudentInfo;", "", "id", "", "name", "birthDay", "email", "programType", "sex", "status", "faculty", "className", "yearEntry", "sumTC", "tcDue", "levelStudent", "levelWarning", "address", "fatherName", "fatherPhone", "motherName", "motherPhone", "criteriaScore", "", "Lcom/emglab/qlsv/models/entity/CriteriaScore;", "studentTranscripts", "Lcom/emglab/qlsv/models/entity/StudentTranscript;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getBirthDay", "setBirthDay", "getClassName", "setClassName", "getCriteriaScore", "()Ljava/util/List;", "setCriteriaScore", "(Ljava/util/List;)V", "getEmail", "setEmail", "getFaculty", "setFaculty", "getFatherName", "setFatherName", "getFatherPhone", "setFatherPhone", "getId", "setId", "getLevelStudent", "setLevelStudent", "getLevelWarning", "setLevelWarning", "getMotherName", "setMotherName", "getMotherPhone", "setMotherPhone", "getName", "setName", "getProgramType", "setProgramType", "getSex", "setSex", "getStatus", "setStatus", "getStudentTranscripts", "setStudentTranscripts", "getSumTC", "setSumTC", "getTcDue", "setTcDue", "getYearEntry", "setYearEntry", "getCurrentCPA", "app_debug"})
public final class StudentInfo {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentId")
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentName")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Birthday")
    private java.lang.String birthDay;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Email")
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "LevelProgram")
    private java.lang.String programType;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Sex")
    private java.lang.String sex;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudyInfo")
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Faculty")
    private java.lang.String faculty;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ClassName")
    private java.lang.String className;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "YearEntry")
    private java.lang.String yearEntry;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TC_All")
    private java.lang.String sumTC;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TC_Due")
    private java.lang.String tcDue;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "LevelStudent")
    private java.lang.String levelStudent;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "LevelWarning")
    private java.lang.String levelWarning;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Address")
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FatherName")
    private java.lang.String fatherName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FatherPhone")
    private java.lang.String fatherPhone;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "MotherName")
    private java.lang.String motherName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "MotherPhone")
    private java.lang.String motherPhone;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CriteriaPointSemsterLst")
    private java.util.List<com.emglab.qlsv.models.entity.CriteriaScore> criteriaScore;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentTranscriptLst")
    private java.util.List<com.emglab.qlsv.models.entity.StudentTranscript> studentTranscripts;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentCPA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthDay() {
        return null;
    }
    
    public final void setBirthDay(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProgramType() {
        return null;
    }
    
    public final void setProgramType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSex() {
        return null;
    }
    
    public final void setSex(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFaculty() {
        return null;
    }
    
    public final void setFaculty(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClassName() {
        return null;
    }
    
    public final void setClassName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearEntry() {
        return null;
    }
    
    public final void setYearEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSumTC() {
        return null;
    }
    
    public final void setSumTC(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTcDue() {
        return null;
    }
    
    public final void setTcDue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLevelStudent() {
        return null;
    }
    
    public final void setLevelStudent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLevelWarning() {
        return null;
    }
    
    public final void setLevelWarning(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFatherName() {
        return null;
    }
    
    public final void setFatherName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFatherPhone() {
        return null;
    }
    
    public final void setFatherPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMotherName() {
        return null;
    }
    
    public final void setMotherName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMotherPhone() {
        return null;
    }
    
    public final void setMotherPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.CriteriaScore> getCriteriaScore() {
        return null;
    }
    
    public final void setCriteriaScore(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaScore> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.StudentTranscript> getStudentTranscripts() {
        return null;
    }
    
    public final void setStudentTranscripts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.StudentTranscript> p0) {
    }
    
    public StudentInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String birthDay, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String programType, @org.jetbrains.annotations.NotNull()
    java.lang.String sex, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String faculty, @org.jetbrains.annotations.NotNull()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    java.lang.String yearEntry, @org.jetbrains.annotations.NotNull()
    java.lang.String sumTC, @org.jetbrains.annotations.NotNull()
    java.lang.String tcDue, @org.jetbrains.annotations.NotNull()
    java.lang.String levelStudent, @org.jetbrains.annotations.NotNull()
    java.lang.String levelWarning, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String fatherName, @org.jetbrains.annotations.NotNull()
    java.lang.String fatherPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String motherName, @org.jetbrains.annotations.NotNull()
    java.lang.String motherPhone, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaScore> criteriaScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.StudentTranscript> studentTranscripts) {
        super();
    }
    
    public StudentInfo() {
        super();
    }
}