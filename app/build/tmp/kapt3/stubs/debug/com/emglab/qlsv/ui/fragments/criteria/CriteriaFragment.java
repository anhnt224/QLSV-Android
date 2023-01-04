package com.emglab.qlsv.ui.fragments.criteria;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020\u0017H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0005H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u00101\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020&H\u0003J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0003J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\u000fH\u0002J\b\u00107\u001a\u00020&H\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/criteria/CriteriaFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/criteria/OnCriteriaItemClick;", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/ui/adapter/criteria/CriteriaActivityItem;", "()V", "binding", "Lcom/emglab/qlsv/databinding/CriteriaFragmentBinding;", "criteriaActivityAdapter", "Lcom/emglab/qlsv/ui/adapter/criteria/CriteriaActivityAdapter;", "criteriaGroupAdapter", "Lcom/emglab/qlsv/ui/adapter/criteria/CriteriaGroupAdapter;", "criteriaTypes", "", "Lcom/emglab/qlsv/models/entity/CriteriaType;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "index", "", "semesters", "", "Lcom/emglab/qlsv/models/entity/Semester;", "[Lcom/emglab/qlsv/models/entity/Semester;", "userCriteriaDetail", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/criteria/CriteriaViewModel;", "getSumSPoint", "isActivityInvalid", "", "activity", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "onClick", "", "value", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProofClick", "onTextProofClick", "pickSemester", "setUpViewModel", "subscribeUI", "updateData", "criteriaType", "updateStudentPoint", "app_debug"})
public final class CriteriaFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick, com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityItem> {
    private com.emglab.qlsv.ui.viewmodels.criteria.CriteriaViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.ui.adapter.criteria.CriteriaGroupAdapter criteriaGroupAdapter;
    private com.emglab.qlsv.databinding.CriteriaFragmentBinding binding;
    private java.util.List<com.emglab.qlsv.models.entity.CriteriaType> criteriaTypes;
    private int index;
    private com.emglab.qlsv.models.entity.Semester[] semesters;
    private com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityAdapter criteriaActivityAdapter;
    private com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail;
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void subscribeUI() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void pickSemester() {
    }
    
    private final void updateData(com.emglab.qlsv.models.entity.CriteriaType criteriaType) {
    }
    
    @java.lang.Override()
    public void onProofClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail) {
    }
    
    @java.lang.Override()
    public void onTextProofClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityItem value) {
    }
    
    private final int getSumSPoint() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void updateStudentPoint() {
    }
    
    private final boolean isActivityInvalid(com.emglab.qlsv.models.entity.UserCriteriaActivity activity) {
        return false;
    }
    
    public CriteriaFragment() {
        super();
    }
}