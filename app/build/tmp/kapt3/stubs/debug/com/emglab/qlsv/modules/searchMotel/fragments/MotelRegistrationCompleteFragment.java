package com.emglab.qlsv.modules.searchMotel.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationCompleteFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/FragmentMotelRegistrationCompleteBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "motelList", "", "Lcom/emglab/qlsv/models/entity/Motel;", "numberOfMotel", "", "viewModel", "Lcom/emglab/qlsv/modules/searchMotel/viewModels/MotelRegistrationCompleteViewModel;", "getSpanTitle", "Landroid/text/SpannableStringBuilder;", "navigateToListMotelResults", "", "navigateToMotelRegistrationInfo", "motelRegistration", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupViewModel", "subscribeUI", "app_debug"})
public final class MotelRegistrationCompleteFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.FragmentMotelRegistrationCompleteBinding binding;
    private com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationCompleteViewModel viewModel;
    private int numberOfMotel;
    private java.util.List<com.emglab.qlsv.models.entity.Motel> motelList;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupViewModel() {
    }
    
    private final void subscribeUI() {
    }
    
    private final void navigateToMotelRegistrationInfo(com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
    }
    
    private final void navigateToListMotelResults(java.util.List<com.emglab.qlsv.models.entity.Motel> motelList) {
    }
    
    private final android.text.SpannableStringBuilder getSpanTitle(int numberOfMotel) {
        return null;
    }
    
    public MotelRegistrationCompleteFragment() {
        super();
    }
}