package com.emglab.qlsv.teacher.fragment.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\u0007H\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u00020 H\u0002J\b\u0010;\u001a\u00020 H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006<"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/activity/TListActivitiesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/ui/adapter/activity/ActivityAdapter$OnItemClickListener;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "activities", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/Activity;", "Lkotlin/collections/ArrayList;", "activityAdapter", "Lcom/emglab/qlsv/ui/adapter/activity/ActivityAdapter;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "getAppExecutors", "()Lcom/emglab/qlsv/common/AppExecutors;", "setAppExecutors", "(Lcom/emglab/qlsv/common/AppExecutors;)V", "binding", "Lcom/emglab/qlsv/databinding/TListActivitiesFragmentBinding;", "searchView", "Landroidx/appcompat/widget/SearchView;", "type", "Lcom/emglab/qlsv/ui/viewmodels/activity/ListActivityViewModel$Type;", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/activity/TListActivitiesViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "activity", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setUpViewModel", "showTabBar", "startQRcodeActitivity", "subscribeUI", "app_debug"})
public final class TListActivitiesFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.ui.adapter.activity.ActivityAdapter.OnItemClickListener, com.emglab.qlsv.di.Injectable {
    private com.emglab.qlsv.teacher.viewmodel.activity.TListActivitiesViewModel viewModel;
    private com.emglab.qlsv.databinding.TListActivitiesFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.activity.ActivityAdapter activityAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.common.AppExecutors appExecutors;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel.Type type;
    private java.util.ArrayList<com.emglab.qlsv.models.entity.Activity> activities;
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.AppExecutors getAppExecutors() {
        return null;
    }
    
    public final void setAppExecutors(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpViewModel() {
    }
    
    private final void subscribeUI() {
    }
    
    private final void showTabBar() {
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
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Activity activity) {
    }
    
    private final void startQRcodeActitivity() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public TListActivitiesFragment() {
        super();
    }
}