package com.emglab.qlsv.teacher.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020(2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00103\u001a\u00020(2\u0006\u00100\u001a\u000201H\u0016J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0017J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020(2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010C\u001a\u00020(H\u0002J\b\u0010D\u001a\u00020(H\u0002J\b\u0010E\u001a\u00020(H\u0002J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002J\b\u0010H\u001a\u00020(H\u0002J\b\u0010I\u001a\u00020(H\u0002J\b\u0010J\u001a\u00020(H\u0003R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/THome2Fragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter$OnItemClickListener;", "Lcom/emglab/qlsv/ui/adapter/HomeItemAdapter$OnItemClickListener;", "Lcom/emglab/qlsv/ui/adapter/HomeItem2Adapter$OnItemClickListener;", "Lcom/emglab/qlsv/ui/adapter/HomeItem3Adapter$OnItemClickListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/THome2FragmentBinding;", "eventAdapter", "Lcom/emglab/qlsv/ui/adapter/activity/EventAdapter;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "homeAdapter1", "Lcom/emglab/qlsv/ui/adapter/HomeItemAdapter;", "homeAdapter2", "Lcom/emglab/qlsv/ui/adapter/HomeItem2Adapter;", "homeAdapter3", "Lcom/emglab/qlsv/ui/adapter/HomeItem3Adapter;", "homeItems1", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/HomeItem;", "homeItems2", "homeItems3", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/THome2ViewModel;", "navigateMoreJob", "", "navigateSearchMotel", "navigateToContactParent", "navigateToGiftFragment", "navigateToGiftGiven", "navigateToListAddress", "navigateToTutorFragment", "onClick1", "position", "", "onClick2", "onClick3", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "openLink", "link", "", "setUpRecyclerView", "setUpViewModel", "showListActivities", "showListForm", "showListJobs", "showListScholarShips", "showListStudent", "showRunDashboard", "subscribeUi", "app_debug"})
public final class THome2Fragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.activity.EventAdapter.OnItemClickListener, com.emglab.qlsv.ui.adapter.HomeItemAdapter.OnItemClickListener, com.emglab.qlsv.ui.adapter.HomeItem2Adapter.OnItemClickListener, com.emglab.qlsv.ui.adapter.HomeItem3Adapter.OnItemClickListener {
    private com.emglab.qlsv.teacher.viewmodel.THome2ViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private com.emglab.qlsv.databinding.THome2FragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.activity.EventAdapter eventAdapter;
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig = null;
    private com.emglab.qlsv.ui.adapter.HomeItemAdapter homeAdapter1;
    private com.emglab.qlsv.ui.adapter.HomeItem2Adapter homeAdapter2;
    private com.emglab.qlsv.ui.adapter.HomeItem3Adapter homeAdapter3;
    private java.util.ArrayList<com.emglab.qlsv.models.entity.HomeItem> homeItems1;
    private java.util.ArrayList<com.emglab.qlsv.models.entity.HomeItem> homeItems2;
    private java.util.ArrayList<com.emglab.qlsv.models.entity.HomeItem> homeItems3;
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
    
    private final void showListJobs() {
    }
    
    private final void showListStudent() {
    }
    
    private final void showRunDashboard() {
    }
    
    private final void navigateToGiftGiven() {
    }
    
    private final void openLink(java.lang.String link) {
    }
    
    private final void navigateMoreJob() {
    }
    
    private final void navigateSearchMotel() {
    }
    
    private final void navigateToGiftFragment() {
    }
    
    private final void navigateToListAddress() {
    }
    
    private final void navigateToContactParent() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity) {
    }
    
    @java.lang.Override()
    public void onClick1(int position) {
    }
    
    @java.lang.Override()
    public void onClick2(int position) {
    }
    
    @java.lang.Override()
    public void onClick3(int position) {
    }
    
    private final void navigateToTutorFragment() {
    }
    
    public THome2Fragment() {
        super();
    }
}