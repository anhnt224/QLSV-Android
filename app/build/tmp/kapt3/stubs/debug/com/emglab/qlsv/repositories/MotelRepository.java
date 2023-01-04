package com.emglab.qlsv.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J<\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020#J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120\u001a2\u0006\u0010%\u001a\u00020 J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u001a2\u0006\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020 J:\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u001b0\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020#J*\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001b0\u001a2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020#J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/emglab/qlsv/repositories/MotelRepository;", "", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "giftWebService", "Lcom/emglab/qlsv/webservices/GiftWebService;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "imageMotelDao", "Lcom/emglab/qlsv/dao/ImageMotelDao;", "(Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/webservices/GiftWebService;Lcom/emglab/qlsv/helper/SharedPrefsHelper;Lcom/emglab/qlsv/dao/ImageMotelDao;)V", "ctsvCapLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "motelImageList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/emglab/qlsv/models/entity/ImageMotel2;", "motelList", "Lcom/emglab/qlsv/models/entity/Motel;", "deleteImageMotel", "", "image", "Lcom/emglab/qlsv/models/entity/ImageMotel;", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "userName", "", "token", "motelID", "", "type", "shouldFetch", "", "getAllImageMotel", "idMotel", "getImageMotelByID", "getListMotel", "latitude", "", "longitude", "distance", "getMotelListImage", "insertImage", "app_debug"})
public final class MotelRepository {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.Motel>> motelList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.ImageMotel2>> motelImageList = null;
    private androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.models.res.MyCTSVCap> ctsvCapLiveData;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.webservices.GiftWebService giftWebService = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    private final com.emglab.qlsv.dao.ImageMotelDao imageMotelDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> getListMotel(double latitude, double longitude, int distance, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.ImageMotel2>>> getMotelListImage(int motelID, boolean shouldFetch) {
        return null;
    }
    
    public final void insertImage(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.ImageMotel image) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.ImageMotel>> getAllImageMotel(int idMotel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.ImageMotel> getImageMotelByID(int idMotel, int type) {
        return null;
    }
    
    public final void deleteImageMotel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.ImageMotel image) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteImageMotel(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int motelID, int type, boolean shouldFetch) {
        return null;
    }
    
    @javax.inject.Inject()
    public MotelRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.GiftWebService giftWebService, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.ImageMotelDao imageMotelDao) {
        super();
    }
}