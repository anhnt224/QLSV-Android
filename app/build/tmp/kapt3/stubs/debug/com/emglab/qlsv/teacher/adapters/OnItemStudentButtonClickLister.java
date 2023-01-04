package com.emglab.qlsv.teacher.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/emglab/qlsv/teacher/adapters/OnItemStudentButtonClickLister;", "", "onButtonActivityClick", "", "student", "Lcom/emglab/qlsv/models/entity/Student;", "onButtonInfoClick", "studentID", "", "onButtonMarkClick", "studentName", "app_debug"})
public abstract interface OnItemStudentButtonClickLister {
    
    public abstract void onButtonActivityClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Student student);
    
    public abstract void onButtonInfoClick(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID);
    
    public abstract void onButtonMarkClick(@org.jetbrains.annotations.NotNull()
    java.lang.String studentID, @org.jetbrains.annotations.NotNull()
    java.lang.String studentName);
}