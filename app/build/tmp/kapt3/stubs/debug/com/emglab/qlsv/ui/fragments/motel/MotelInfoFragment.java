package com.emglab.qlsv.ui.fragments.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0013H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010\'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0007J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/motel/MotelInfoFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/user/MotelImageAdapter$OnItemClickListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/MotelInfoFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "motel", "Lcom/emglab/qlsv/models/entity/Motel;", "motelImageAdapter", "Lcom/emglab/qlsv/ui/adapter/user/MotelImageAdapter;", "motelImageList", "", "Lcom/emglab/qlsv/models/entity/ImageMotel2;", "snapHelper", "Landroidx/recyclerview/widget/SnapHelper;", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/motel/MotelInfoViewModel;", "copy", "", "onClickImage", "imageMotel2", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "seePictureZoom", "image", "setUpRecyclerView", "setupViewModel", "subscribeUI", "telHotline", "phone", "", "Companion", "app_debug"})
public final class MotelInfoFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.user.MotelImageAdapter.OnItemClickListener {
    private com.emglab.qlsv.ui.viewmodels.motel.MotelInfoViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.MotelInfoFragmentBinding binding;
    private com.emglab.qlsv.models.entity.Motel motel;
    private com.emglab.qlsv.ui.adapter.user.MotelImageAdapter motelImageAdapter;
    private java.util.List<com.emglab.qlsv.models.entity.ImageMotel2> motelImageList;
    private final androidx.recyclerview.widget.SnapHelper snapHelper = null;
    public static final com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void telHotline(java.lang.String phone) {
    }
    
    private final void copy() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void setupViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void subscribeUI() {
    }
    
    private final void seePictureZoom(com.emglab.qlsv.models.entity.ImageMotel2 image) {
    }
    
    @java.lang.Override()
    public void onClickImage(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.ImageMotel2 imageMotel2) {
    }
    
    public MotelInfoFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/motel/MotelInfoFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/motel/MotelInfoFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}