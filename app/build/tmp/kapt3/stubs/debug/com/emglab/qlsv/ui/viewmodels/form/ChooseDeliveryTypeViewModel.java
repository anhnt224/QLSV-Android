package com.emglab.qlsv.ui.viewmodels.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/form/ChooseDeliveryTypeViewModel;", "Landroidx/lifecycle/ViewModel;", "formRepository", "Lcom/emglab/qlsv/repositories/FormRepository;", "(Lcom/emglab/qlsv/repositories/FormRepository;)V", "deliveryType", "Landroidx/lifecycle/MutableLiveData;", "", "getDeliveryType", "()Landroidx/lifecycle/MutableLiveData;", "liveDataRegisterForm", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "registerForm", "Landroidx/lifecycle/MediatorLiveData;", "getRegisterForm", "()Landroidx/lifecycle/MediatorLiveData;", "", "studentContactID", "questions", "", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "setDeliveryType", "type", "app_debug"})
public final class ChooseDeliveryTypeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> deliveryType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> registerForm = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataRegisterForm;
    private final com.emglab.qlsv.repositories.FormRepository formRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDeliveryType() {
        return null;
    }
    
    public final void setDeliveryType(int type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getRegisterForm() {
        return null;
    }
    
    public final void registerForm(int deliveryType, int studentContactID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions) {
    }
    
    @javax.inject.Inject()
    public ChooseDeliveryTypeViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.FormRepository formRepository) {
        super();
    }
}