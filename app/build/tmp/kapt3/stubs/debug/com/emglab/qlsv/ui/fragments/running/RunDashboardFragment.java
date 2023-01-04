package com.emglab.qlsv.ui.fragments.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0003J\b\u0010,\u001a\u00020)H\u0003J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000f2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0003J\b\u00103\u001a\u00020)H\u0003J\b\u00104\u001a\u00020)H\u0003J\b\u00105\u001a\u00020)H\u0003J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0010H\u0002J$\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J-\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020C2\u000e\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100E2\u0006\u0010F\u001a\u00020GH\u0016\u00a2\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020)H\u0002J\b\u0010J\u001a\u00020)H\u0002J\b\u0010K\u001a\u00020)H\u0002J\b\u0010L\u001a\u00020)H\u0002J\u0016\u0010M\u001a\u00020)2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0002J\u0016\u0010O\u001a\u00020)2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0002J\b\u0010P\u001a\u00020)H\u0002J\b\u0010Q\u001a\u00020)H\u0002J\u0016\u0010R\u001a\u00020)2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0003J\b\u0010S\u001a\u00020)H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000f0\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/running/RunDashboardFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/RunDashboardFragmentBinding;", "chartType", "Lcom/emglab/qlsv/ui/viewmodels/running/ChartType;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "labelsMonth", "", "", "labelsWeek", "Ljava/util/ArrayList;", "runDataDao", "Lcom/emglab/qlsv/dao/RunDataDao;", "getRunDataDao", "()Lcom/emglab/qlsv/dao/RunDataDao;", "setRunDataDao", "(Lcom/emglab/qlsv/dao/RunDataDao;)V", "runDataGroup", "", "Lcom/emglab/qlsv/models/entity/run/RunResult;", "runDataList", "Lcom/emglab/qlsv/models/entity/run/RunData;", "runResultAdapter", "Lcom/emglab/qlsv/ui/adapter/running/ListRunResultAdapter;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/running/RunDashboardViewModel;", "checkPermission", "", "clearRunData", "decreaseMonth", "decreaseWeek", "getDates", "Ljava/util/Date;", "date1", "date2", "handleRun", "increaseMonth", "increaseWeek", "initMonth", "initWeek", "isPermissionDenied", "", "permission", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocationBackgroundPermission", "requestLocationPermission", "setUpRecyclerView", "setUpViewModel", "showBarChartByMonth", "runResults", "showBarChartByWeek", "showDialogRequestBackgroundLocation", "showDialogRequestLocationPermission", "statisticRunResult", "subscribeUI", "Companion", "app_debug"})
public final class RunDashboardFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    private com.emglab.qlsv.ui.viewmodels.running.RunDashboardViewModel viewModel;
    private com.emglab.qlsv.databinding.RunDashboardFragmentBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.dao.RunDataDao runDataDao;
    private com.emglab.qlsv.ui.adapter.running.ListRunResultAdapter runResultAdapter;
    private com.emglab.qlsv.ui.viewmodels.running.ChartType chartType;
    private java.util.List<com.emglab.qlsv.models.entity.run.RunData> runDataList;
    private java.util.ArrayList<java.lang.String> labelsWeek;
    private java.util.List<java.lang.String> labelsMonth;
    private java.util.Map<java.lang.String, ? extends java.util.List<com.emglab.qlsv.models.entity.run.RunResult>> runDataGroup;
    public static final int REQUEST_LOCATION_PERMISSION = 1001;
    public static final int REQUEST_BACKGROUND_LOCATION_PERMISSION = 1002;
    public static final com.emglab.qlsv.ui.fragments.running.RunDashboardFragment.Companion Companion = null;
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
    public final com.emglab.qlsv.dao.RunDataDao getRunDataDao() {
        return null;
    }
    
    public final void setRunDataDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.RunDataDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "SetTextI18n"})
    private final void subscribeUI() {
    }
    
    private final void setUpViewModel() {
    }
    
    private final void clearRunData() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "SetTextI18n"})
    private final void statisticRunResult(java.util.List<com.emglab.qlsv.models.entity.run.RunResult> runResults) {
    }
    
    private final java.util.List<java.util.Date> getDates(java.util.Date date1, java.util.Date date2) {
        return null;
    }
    
    private final void showBarChartByWeek(java.util.List<com.emglab.qlsv.models.entity.run.RunResult> runResults) {
    }
    
    private final void showBarChartByMonth(java.util.List<com.emglab.qlsv.models.entity.run.RunResult> runResults) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initWeek() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void decreaseWeek() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void increaseWeek() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initMonth() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void decreaseMonth() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void increaseMonth() {
    }
    
    /**
     * * Check permission
     */
    private final void checkPermission() {
    }
    
    private final boolean isPermissionDenied(java.lang.String permission) {
        return false;
    }
    
    private final void showDialogRequestLocationPermission() {
    }
    
    private final void requestLocationPermission() {
    }
    
    private final void showDialogRequestBackgroundLocation() {
    }
    
    private final void requestLocationBackgroundPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void handleRun() {
    }
    
    public RunDashboardFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/running/RunDashboardFragment$Companion;", "", "()V", "REQUEST_BACKGROUND_LOCATION_PERMISSION", "", "REQUEST_LOCATION_PERMISSION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}