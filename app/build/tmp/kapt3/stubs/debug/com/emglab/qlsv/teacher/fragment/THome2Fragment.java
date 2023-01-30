package com.emglab.qlsv.teacher.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010\'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0017J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u0014H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u0012H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u00109\u001a\u00020$H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/THome2Fragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;", "Lcom/emglab/qlsv/modules/home/adapter/HomeMenuItemListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/THome2FragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "homeMenuGroupAdapter", "Lcom/emglab/qlsv/modules/home/adapter/HomeMenuGroupAdapter;", "menuGroups", "", "", "", "Lcom/emglab/qlsv/modules/home/model/HomeItem;", "publicActivityAdapter", "Lcom/emglab/qlsv/modules/home/adapter/PublicActivityAdapter;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "snapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/THome2ViewModel;", "handleInternshipViewTap", "", "handleJobViewTap", "handleNewsTap", "handlePartTimeViewTap", "handleTutorialTap", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHomeItemClick", "homeItem", "onItemClick", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "openLink", "link", "setUpRecyclerView", "setUpViewModel", "showListActivities", "showListForm", "showListScholarShips", "showListStudent", "subscribeUi", "app_debug"})
public final class THome2Fragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.activity.EventAdapter.OnItemClickListener, com.emglab.qlsv.modules.home.adapter.HomeMenuItemListener {
    private com.emglab.qlsv.teacher.viewmodel.THome2ViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private com.emglab.qlsv.databinding.THome2FragmentBinding binding;
    private com.emglab.qlsv.modules.home.adapter.PublicActivityAdapter publicActivityAdapter;
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig = null;
    private com.emglab.qlsv.modules.home.adapter.HomeMenuGroupAdapter homeMenuGroupAdapter;
    private final androidx.recyclerview.widget.PagerSnapHelper snapHelper = null;
    private java.util.Map<java.lang.String, ? extends java.util.List<com.emglab.qlsv.modules.home.model.HomeItem>> menuGroups;
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
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpViewModel() {
    }
    
    private final void setUpRecyclerView(com.emglab.qlsv.databinding.THome2FragmentBinding binding) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void subscribeUi() {
    }
    
    private final void showListForm() {
    }
    
    private final void showListActivities() {
    }
    
    private final void showListScholarShips() {
    }
    
    private final void showListStudent() {
    }
    
    private final void openLink(java.lang.String link) {
    }
    
    private final void handleNewsTap() {
    }
    
    private final void handleTutorialTap() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity) {
    }
    
    private final void handleInternshipViewTap() {
    }
    
    private final void handleJobViewTap() {
    }
    
    private final void handlePartTimeViewTap() {
    }
    
    @java.lang.Override()
    public void onHomeItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.home.model.HomeItem homeItem) {
    }
    
    public THome2Fragment() {
        super();
    }
}