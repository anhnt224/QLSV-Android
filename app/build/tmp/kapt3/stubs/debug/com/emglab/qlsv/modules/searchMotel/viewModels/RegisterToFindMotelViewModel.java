package com.emglab.qlsv.modules.searchMotel.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010-\u001a\u00020.2\b\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\tJ\u000e\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u0019J\u000e\u00104\u001a\u00020.2\u0006\u00103\u001a\u00020\u0019J\u001e\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J\u0016\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u0019J\u001e\u0010<\u001a\u00020.2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\'J\u001e\u0010>\u001a\u00020.2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\'J\u001e\u0010?\u001a\u00020.2\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\'\u0010&\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\'0\u00128F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0014R\'\u0010)\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\'0\u00128F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0019\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00128F\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0014\u00a8\u0006@"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/viewModels/RegisterToFindMotelViewModel;", "Landroidx/lifecycle/ViewModel;", "motelRegistrationRepository", "Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;", "(Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;)V", "_endDate", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/Date;", "_motelRegistration", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "_price", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelPrice;", "_requests", "Ljava/util/ArrayList;", "", "_selectedTypes", "_startDate", "endDate", "Landroidx/lifecycle/LiveData;", "getEndDate", "()Landroidx/lifecycle/LiveData;", "liveWithOther", "getLiveWithOther", "()Landroidx/lifecycle/MutableLiveData;", "numberOfPeople", "", "getNumberOfPeople", "otherRequest", "", "getOtherRequest", "price", "getPrice", "radius", "getRadius", "saveMotelRegistrationResp", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getSaveMotelRegistrationResp", "selectedRequests", "Lkotlin/collections/ArrayList;", "getSelectedRequests", "selectedTypes", "getSelectedTypes", "startDate", "getStartDate", "saveInfo", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "saveMotelRegistration", "motelRegistration", "selectRequest", "index", "selectType", "setEndDate", "day", "month", "year", "setPrice", "min", "max", "setRequests", "values", "setSelectedTypes", "setStartDate", "app_debug"})
public final class RegisterToFindMotelViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.modules.searchMotel.model.MotelPrice> _price;
    private androidx.lifecycle.MutableLiveData<java.util.Date> _startDate;
    private androidx.lifecycle.MutableLiveData<java.util.Date> _endDate;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Boolean>> _selectedTypes;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Boolean>> _requests;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> radius = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> numberOfPeople = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> otherRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> liveWithOther = null;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration> _motelRegistration = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> saveMotelRegistrationResp = null;
    private final com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.modules.searchMotel.model.MotelPrice> getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Date> getStartDate() {
        return null;
    }
    
    public final void setStartDate(int day, int month, int year) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Date> getEndDate() {
        return null;
    }
    
    public final void setEndDate(int day, int month, int year) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.Boolean>> getSelectedTypes() {
        return null;
    }
    
    public final void selectType(int index) {
    }
    
    public final void setSelectedTypes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Boolean> values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.Boolean>> getSelectedRequests() {
        return null;
    }
    
    public final void selectRequest(int index) {
    }
    
    public final void setRequests(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Boolean> values) {
    }
    
    public final void setPrice(int min, int max) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRadius() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNumberOfPeople() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOtherRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLiveWithOther() {
        return null;
    }
    
    public final void saveInfo(@org.jetbrains.annotations.Nullable()
    java.lang.Integer radius, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOfPeople, @org.jetbrains.annotations.NotNull()
    java.lang.String otherRequest, boolean liveWithOther) {
    }
    
    public final void saveMotelRegistration(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getSaveMotelRegistrationResp() {
        return null;
    }
    
    @javax.inject.Inject()
    public RegisterToFindMotelViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository) {
        super();
    }
}