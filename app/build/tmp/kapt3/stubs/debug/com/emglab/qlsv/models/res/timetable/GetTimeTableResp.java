package com.emglab.qlsv.models.res.timetable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/emglab/qlsv/models/res/timetable/GetTimeTableResp;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respText", "", "respCode", "", "subjects", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/Subject;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getRespCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRespText", "()Ljava/lang/String;", "getSubjects", "()Ljava/util/ArrayList;", "setSubjects", "(Ljava/util/ArrayList;)V", "app_debug"})
public final class GetTimeTableResp extends com.emglab.qlsv.models.res.CTSVCap {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private final java.lang.String respText = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private final java.lang.Integer respCode = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ScheduleStudentLst")
    private java.util.ArrayList<com.emglab.qlsv.models.entity.Subject> subjects;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getRespText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRespCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.emglab.qlsv.models.entity.Subject> getSubjects() {
        return null;
    }
    
    public final void setSubjects(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.Subject> p0) {
    }
    
    public GetTimeTableResp(@org.jetbrains.annotations.Nullable()
    java.lang.String respText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer respCode, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.Subject> subjects) {
        super();
    }
}