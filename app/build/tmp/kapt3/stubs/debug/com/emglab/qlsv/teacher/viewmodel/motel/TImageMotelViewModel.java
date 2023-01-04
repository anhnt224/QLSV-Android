package com.emglab.qlsv.teacher.viewmodel.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00180\f2\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/motel/TImageMotelViewModel;", "Landroidx/lifecycle/ViewModel;", "imageMotelRepository", "Lcom/emglab/qlsv/repositories/MotelRepository;", "(Lcom/emglab/qlsv/repositories/MotelRepository;)V", "deleteImageMotel", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getDeleteImageMotel", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataDeleteImage", "Landroidx/lifecycle/LiveData;", "deleteImage", "", "imageMotel", "Lcom/emglab/qlsv/models/entity/ImageMotel;", "username", "", "token", "motelID", "", "type", "getAllImage", "", "idMotel", "insertImage", "app_debug"})
public final class TImageMotelViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteImageMotel = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataDeleteImage;
    private final com.emglab.qlsv.repositories.MotelRepository imageMotelRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getDeleteImageMotel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.ImageMotel>> getAllImage(int idMotel) {
        return null;
    }
    
    public final void deleteImage(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.ImageMotel imageMotel) {
    }
    
    public final void insertImage(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.ImageMotel imageMotel) {
    }
    
    public final void deleteImage(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int motelID, int type) {
    }
    
    @javax.inject.Inject()
    public TImageMotelViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.MotelRepository imageMotelRepository) {
        super();
    }
}