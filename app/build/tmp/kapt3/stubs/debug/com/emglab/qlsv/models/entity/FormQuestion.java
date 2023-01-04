package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B[\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0011J\b\u0010(\u001a\u00020\u0006H\u0016J\u0006\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0006H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001e\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b\'\u0010\u001f\u00a8\u0006/"}, d2 = {"Lcom/emglab/qlsv/models/entity/FormQuestion;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "idQuestion", "", "typeQuestion", "answer", "", "question", "answers", "", "Lcom/emglab/qlsv/models/entity/Answer;", "formID", "filePath", "typePaper", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "setAnswer", "(Ljava/lang/String;)V", "getAnswers", "()Ljava/util/List;", "setAnswers", "(Ljava/util/List;)V", "getFilePath", "setFilePath", "getFormID", "()I", "setFormID", "(I)V", "getIdQuestion", "setIdQuestion", "getQuestion", "setQuestion", "getTypePaper", "setTypePaper", "getTypeQuestion", "setTypeQuestion", "describeContents", "getType", "Lcom/emglab/qlsv/models/entity/QuestionType;", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class FormQuestion implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "IDQuestion")
    private int idQuestion;
    @com.google.gson.annotations.SerializedName(value = "TypeQuestion")
    private int typeQuestion;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Answer")
    private java.lang.String answer;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Question")
    private java.lang.String question;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ContentSelectLst")
    private java.util.List<com.emglab.qlsv.models.entity.Answer> answers;
    @com.google.gson.annotations.SerializedName(value = "IDPaper")
    private int formID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FilePath")
    private java.lang.String filePath;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TypePaper")
    private java.lang.String typePaper;
    public static final com.emglab.qlsv.models.entity.FormQuestion.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.QuestionType getType() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final int getIdQuestion() {
        return 0;
    }
    
    public final void setIdQuestion(int p0) {
    }
    
    public final int getTypeQuestion() {
        return 0;
    }
    
    public final void setTypeQuestion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAnswer() {
        return null;
    }
    
    public final void setAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Answer> getAnswers() {
        return null;
    }
    
    public final void setAnswers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Answer> p0) {
    }
    
    public final int getFormID() {
        return 0;
    }
    
    public final void setFormID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilePath() {
        return null;
    }
    
    public final void setFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypePaper() {
        return null;
    }
    
    public final void setTypePaper(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public FormQuestion(int idQuestion, int typeQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String answer, @org.jetbrains.annotations.NotNull()
    java.lang.String question, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Answer> answers, int formID, @org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String typePaper) {
        super();
    }
    
    public FormQuestion() {
        super();
    }
    
    public FormQuestion(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/models/entity/FormQuestion$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/emglab/qlsv/models/entity/FormQuestion;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.emglab.qlsv.models.entity.FormQuestion> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.FormQuestion createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.FormQuestion[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}