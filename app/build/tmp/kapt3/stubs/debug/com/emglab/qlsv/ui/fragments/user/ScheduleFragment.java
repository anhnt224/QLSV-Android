package com.emglab.qlsv.ui.fragments.user;

import java.lang.System;

/**
 * * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/user/ScheduleFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "getAppExecutors", "()Lcom/emglab/qlsv/common/AppExecutors;", "setAppExecutors", "(Lcom/emglab/qlsv/common/AppExecutors;)V", "<set-?>", "Lcom/emglab/qlsv/databinding/FragmentScheduleBinding;", "binding", "getBinding", "()Lcom/emglab/qlsv/databinding/FragmentScheduleBinding;", "setBinding", "(Lcom/emglab/qlsv/databinding/FragmentScheduleBinding;)V", "binding$delegate", "Lcom/emglab/qlsv/utilities/AutoClearedValue;", "dataBindingComponent", "error/NonExistentClass", "getDataBindingComponent", "()Lerror/NonExistentClass;", "setDataBindingComponent", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "sectionedAdapter", "Lio/github/luizgrp/sectionedrecyclerviewadapter/SectionedRecyclerViewAdapter;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewmodel", "Lcom/emglab/qlsv/ui/viewmodels/user/ScheduleViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "setupViewModel", "subscribeUi", "app_debug"})
public final class ScheduleFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.common.AppExecutors appExecutors;
    @org.jetbrains.annotations.NotNull()
    private error.NonExistentClass dataBindingComponent;
    private io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter sectionedAdapter;
    private final com.emglab.qlsv.utilities.AutoClearedValue binding$delegate = null;
    private com.emglab.qlsv.ui.viewmodels.user.ScheduleViewModel viewmodel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.helper.SharedPrefsHelper getSharedPrefsHelper() {
        return null;
    }
    
    public final void setSharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.AppExecutors getAppExecutors() {
        return null;
    }
    
    public final void setAppExecutors(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getDataBindingComponent() {
        return null;
    }
    
    public final void setDataBindingComponent(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass p0) {
    }
    
    private final com.emglab.qlsv.databinding.FragmentScheduleBinding getBinding() {
        return null;
    }
    
    private final void setBinding(com.emglab.qlsv.databinding.FragmentScheduleBinding p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupViewModel() {
    }
    
    private final void subscribeUi() {
    }
    
    public ScheduleFragment() {
        super();
    }
}