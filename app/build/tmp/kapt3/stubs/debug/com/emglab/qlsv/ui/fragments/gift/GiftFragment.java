package com.emglab.qlsv.ui.fragments.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u00020\u0018H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/gift/GiftFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/gift/GiftAdapter$OnItemClickListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/GiftFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "giftAdapter", "Lcom/emglab/qlsv/ui/adapter/gift/GiftAdapter;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/gift/GiftViewModel;", "navigateToGiftInfo", "", "gift", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "navigateToGiftReceived", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setUpRecyclerView", "setUpViewModel", "subscribeUi", "app_debug"})
public final class GiftFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.gift.GiftAdapter.OnItemClickListener {
    private com.emglab.qlsv.ui.viewmodels.gift.GiftViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private com.emglab.qlsv.databinding.GiftFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.gift.GiftAdapter giftAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.helper.SharedPrefsHelper getSharedPrefsHelper() {
        return null;
    }
    
    public final void setSharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void subscribeUi() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void navigateToGiftReceived() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.Gift gift) {
    }
    
    private final void navigateToGiftInfo(com.emglab.qlsv.models.entity.gift.Gift gift) {
    }
    
    public GiftFragment() {
        super();
    }
}