package com.emglab.qlsv.ui.viewmodels.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/form/ListFormsViewModel;", "Landroidx/lifecycle/ViewModel;", "formRepository", "Lcom/emglab/qlsv/repositories/FormRepository;", "(Lcom/emglab/qlsv/repositories/FormRepository;)V", "filterType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/entity/FormType;", "getFormRepository", "()Lcom/emglab/qlsv/repositories/FormRepository;", "getListForms", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Form;", "getGetListForms", "()Landroidx/lifecycle/MediatorLiveData;", "liveDateGetListForm", "Landroidx/lifecycle/LiveData;", "getFilterType", "getListForm", "", "setFilterType", "formType", "app_debug"})
public final class ListFormsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Form>>> getListForms = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Form>>> liveDateGetListForm;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.FormType> filterType;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.repositories.FormRepository formRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Form>>> getGetListForms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.FormType> getFilterType() {
        return null;
    }
    
    public final void setFilterType(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.FormType formType) {
    }
    
    public final void getListForm() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.repositories.FormRepository getFormRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public ListFormsViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.FormRepository formRepository) {
        super();
    }
}