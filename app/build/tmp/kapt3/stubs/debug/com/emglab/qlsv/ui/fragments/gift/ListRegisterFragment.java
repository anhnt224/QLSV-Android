package com.emglab.qlsv.ui.fragments.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0017J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0003J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\u0016\u0010%\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0002J\b\u0010)\u001a\u00020\u0015H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/gift/ListRegisterFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/models/entity/gift/GiftRegister;", "()V", "binding", "Lcom/emglab/qlsv/databinding/ListRegisterFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "gift", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "giftRegisterAdapter", "Lcom/emglab/qlsv/ui/adapter/gift/GiftRegisterAdapter;", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/gift/ListRegisterViewModel;", "approve", "", "checkQuantity", "", "onClick", "value", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "reloadData", "setUpRecyclerView", "setUpViewModel", "showApproveDialog", "userApproves", "", "Lcom/emglab/qlsv/models/entity/gift/UserApprove;", "subscribeUi", "app_debug"})
public final class ListRegisterFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.gift.GiftRegister> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.ui.viewmodels.gift.ListRegisterViewModel viewModel;
    private com.emglab.qlsv.databinding.ListRegisterFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.gift.GiftRegisterAdapter giftRegisterAdapter;
    private com.emglab.qlsv.models.entity.gift.Gift gift;
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
    
    private final void setUpViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void subscribeUi() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.GiftRegister value) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void reloadData() {
    }
    
    private final boolean checkQuantity() {
        return false;
    }
    
    private final void approve() {
    }
    
    private final void showApproveDialog(java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproves) {
    }
    
    public ListRegisterFragment() {
        super();
    }
}