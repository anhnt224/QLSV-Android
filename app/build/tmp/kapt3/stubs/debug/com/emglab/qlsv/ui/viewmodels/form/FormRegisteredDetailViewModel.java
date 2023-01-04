package com.emglab.qlsv.ui.viewmodels.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/form/FormRegisteredDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "formRepository", "Lcom/emglab/qlsv/repositories/FormRepository;", "(Lcom/emglab/qlsv/repositories/FormRepository;)V", "form", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/entity/Form;", "getForm", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataGetFormDetail", "Landroidx/lifecycle/LiveData;", "getFormDetail", "", "rowId", "", "app_debug"})
public final class FormRegisteredDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Form>> form = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Form>> liveDataGetFormDetail;
    private final com.emglab.qlsv.repositories.FormRepository formRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Form>> getForm() {
        return null;
    }
    
    public final void getFormDetail(int rowId) {
    }
    
    @javax.inject.Inject()
    public FormRegisteredDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.FormRepository formRepository) {
        super();
    }
}