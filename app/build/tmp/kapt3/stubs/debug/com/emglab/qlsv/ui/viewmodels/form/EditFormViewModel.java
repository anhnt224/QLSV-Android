package com.emglab.qlsv.ui.viewmodels.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/form/EditFormViewModel;", "Landroidx/lifecycle/ViewModel;", "formRepository", "Lcom/emglab/qlsv/repositories/FormRepository;", "(Lcom/emglab/qlsv/repositories/FormRepository;)V", "getFormRepository", "()Lcom/emglab/qlsv/repositories/FormRepository;", "liveDataGetListQuestions", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "liveDataUpdateForm", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "questions", "Landroidx/lifecycle/MediatorLiveData;", "getQuestions", "()Landroidx/lifecycle/MediatorLiveData;", "updateForm", "getUpdateForm", "getListQuestions", "", "formType", "", "rowID", "", "app_debug"})
public final class EditFormViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.FormQuestion>>> questions = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.FormQuestion>>> liveDataGetListQuestions;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> updateForm = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataUpdateForm;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.repositories.FormRepository formRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.FormQuestion>>> getQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getUpdateForm() {
        return null;
    }
    
    public final void getListQuestions(@org.jetbrains.annotations.NotNull()
    java.lang.String formType) {
    }
    
    public final void updateForm(int rowID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.repositories.FormRepository getFormRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public EditFormViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.FormRepository formRepository) {
        super();
    }
}