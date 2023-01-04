package com.emglab.qlsv.teacher.fragment.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0018\u0010\'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u001fH\u0016J\u0016\u0010)\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100+H\u0003J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\"\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001f2\b\b\u0001\u00100\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\u001aH\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/gift/TGiftGivenFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/gift/GiftCreatedAdapter$OnItemClickListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/TGiftGivenFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "giftCreatedAdapter", "Lcom/emglab/qlsv/ui/adapter/gift/GiftCreatedAdapter;", "giftSelected", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/gift/TGiftGivenViewModel;", "deleteGift", "", "gift", "navigateToCreateGift", "navigateToListRegister", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "onMoreButtonClick", "view", "reloadData", "gifts", "", "setUpRecyclerView", "setUpViewModel", "showMenu", "v", "menu", "", "subscribeUi", "app_debug"})
public final class TGiftGivenFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.gift.GiftCreatedAdapter.OnItemClickListener {
    private com.emglab.qlsv.teacher.viewmodel.gift.TGiftGivenViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private com.emglab.qlsv.databinding.TGiftGivenFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.gift.GiftCreatedAdapter giftCreatedAdapter;
    private com.emglab.qlsv.models.entity.gift.Gift giftSelected;
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
    
    private final void navigateToCreateGift() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void reloadData(java.util.List<com.emglab.qlsv.models.entity.gift.Gift> gifts) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.Gift gift) {
    }
    
    @java.lang.Override()
    public void onMoreButtonClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.Gift gift, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void showMenu(android.view.View v, @androidx.annotation.MenuRes()
    int menu, com.emglab.qlsv.models.entity.gift.Gift gift) {
    }
    
    private final void navigateToListRegister(com.emglab.qlsv.models.entity.gift.Gift gift) {
    }
    
    private final void deleteGift(com.emglab.qlsv.models.entity.gift.Gift gift) {
    }
    
    public TGiftGivenFragment() {
        super();
    }
}