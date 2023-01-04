package com.emglab.qlsv.modules.searchMotel.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationListener;", "()V", "adapter", "Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationAdapter;", "binding", "Lcom/emglab/qlsv/databinding/FragmentMotelRegistrationListBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "viewModel", "Lcom/emglab/qlsv/modules/searchMotel/viewModels/MotelRegistrationListViewModel;", "navigateToMotelRegistrationComplete", "", "motelRegistration", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "navigateToMotelRegistrationInfo", "navigateToMotelRegistrationProcessing", "navigateToRegisterToFindMotel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "setupRecyclerView", "setupViewModel", "subscribeUI", "Companion", "app_debug"})
public final class MotelRegistrationListFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationListViewModel viewModel;
    private com.emglab.qlsv.databinding.FragmentMotelRegistrationListBinding binding;
    private com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationAdapter adapter;
    private static boolean reloadData;
    public static final com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationListFragment.Companion Companion = null;
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
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
    }
    
    private final void navigateToMotelRegistrationInfo(com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
    }
    
    private final void navigateToMotelRegistrationProcessing(com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
    }
    
    private final void navigateToMotelRegistrationComplete(com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
    }
    
    private final void navigateToRegisterToFindMotel() {
    }
    
    public MotelRegistrationListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationListFragment$Companion;", "", "()V", "reloadData", "", "getReloadData", "()Z", "setReloadData", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public final boolean getReloadData() {
            return false;
        }
        
        public final void setReloadData(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}