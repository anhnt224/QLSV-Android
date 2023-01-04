package com.emglab.qlsv.modules.searchMotel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J*\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00140\u00132\u0006\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J2\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u00132\u0006\u0010 \u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;", "", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "(Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "deleteMotelRegistrationResp", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "motelList", "", "Lcom/emglab/qlsv/models/entity/Motel;", "motelRegistrationList", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "registerMotelResp", "deleteMotelRegistration", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "id", "", "shouldFetch", "", "getListMotelResults", "registerID", "getMotelRegistrationList", "startTime", "", "endTime", "registerMotel", "motelRegistration", "app_debug"})
public final class MotelRegistrationRepository {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration>> motelRegistrationList = null;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> registerMotelResp = null;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> deleteMotelRegistrationResp = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.Motel>> motelList = null;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration>>> getMotelRegistrationList(@org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> registerMotel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteMotelRegistration(int id, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> getListMotelResults(int registerID, boolean shouldFetch) {
        return null;
    }
    
    @javax.inject.Inject()
    public MotelRegistrationRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
        super();
    }
}