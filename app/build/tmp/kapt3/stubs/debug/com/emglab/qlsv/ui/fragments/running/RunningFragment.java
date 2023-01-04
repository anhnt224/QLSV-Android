package com.emglab.qlsv.ui.fragments.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u000202H\u0002J\b\u00105\u001a\u000202H\u0002J\b\u00106\u001a\u000202H\u0002J\b\u00107\u001a\u000202H\u0002J\b\u00108\u001a\u000202H\u0002J\u0012\u00109\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0018\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J$\u0010A\u001a\u00020B2\u0006\u0010?\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020\u0015H\u0016J\u0010\u0010H\u001a\u00020\u00122\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u000202H\u0016J\b\u0010L\u001a\u000202H\u0016J\b\u0010M\u001a\u000202H\u0002J\u0010\u0010N\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010O\u001a\u0002022\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020QH\u0002J\b\u0010S\u001a\u000202H\u0002J\u0010\u0010T\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0002J\b\u0010X\u001a\u000202H\u0002J\b\u0010Y\u001a\u000202H\u0002J\b\u0010Z\u001a\u000202H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lcom/emglab/qlsv/ui/fragments/running/RunningFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "TAG", "", "binding", "Lcom/emglab/qlsv/databinding/RunningFragmentBinding;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "isActiveFragment", "", "isServiceRunning", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "moveCameraToCurrentLocation", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "runningData", "Lcom/emglab/qlsv/models/entity/RunningData;", "runningLocationDao", "Lcom/emglab/qlsv/dao/RunningLocationDao;", "getRunningLocationDao", "()Lcom/emglab/qlsv/dao/RunningLocationDao;", "setRunningLocationDao", "(Lcom/emglab/qlsv/dao/RunningLocationDao;)V", "runningTarget", "runningTitle", "runningWayDao", "Lcom/emglab/qlsv/dao/RunningWayDao;", "getRunningWayDao", "()Lcom/emglab/qlsv/dao/RunningWayDao;", "setRunningWayDao", "(Lcom/emglab/qlsv/dao/RunningWayDao;)V", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/running/RunningViewModel;", "getDataFromRemoteConfig", "", "handleCancel", "handleContinue", "handleFinish", "handlePause", "handleStart", "initUI", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMapReady", "googleMap", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "openHistoryFragment", "saveData", "saveLocationData", "lat", "", "lng", "saveRunningDataToCloud", "showActivityDataInfo", "showLocationOnMap", "showPauseUI", "showRunningUI", "showStartUI", "startService", "stopService", "app_debug"})
public final class RunningFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.google.android.gms.maps.OnMapReadyCallback {
    private com.emglab.qlsv.ui.viewmodels.running.RunningViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.dao.RunningLocationDao runningLocationDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.dao.RunningWayDao runningWayDao;
    private com.emglab.qlsv.databinding.RunningFragmentBinding binding;
    private com.emglab.qlsv.models.entity.RunningData runningData;
    private final java.lang.String TAG = "RUN_SERVICE";
    private boolean isActiveFragment;
    private com.google.android.gms.maps.GoogleMap mMap;
    private boolean isServiceRunning;
    private boolean moveCameraToCurrentLocation;
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig;
    private java.lang.String runningTitle;
    private java.lang.String runningTarget;
    private android.content.BroadcastReceiver broadcastReceiver;
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
    public final com.emglab.qlsv.dao.RunningLocationDao getRunningLocationDao() {
        return null;
    }
    
    public final void setRunningLocationDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.RunningLocationDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.dao.RunningWayDao getRunningWayDao() {
        return null;
    }
    
    public final void setRunningWayDao(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.RunningWayDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showActivityDataInfo(com.emglab.qlsv.models.entity.RunningData runningData) {
    }
    
    private final void saveData(com.emglab.qlsv.models.entity.RunningData runningData) {
    }
    
    private final void saveLocationData(double lat, double lng) {
    }
    
    /**
     * * Service
     */
    private final void startService() {
    }
    
    private final void stopService() {
    }
    
    private final void showLocationOnMap() {
    }
    
    private final void handleStart() {
    }
    
    private final void handlePause() {
    }
    
    private final void handleContinue() {
    }
    
    private final void handleFinish() {
    }
    
    private final void showStartUI() {
    }
    
    private final void showRunningUI() {
    }
    
    private final void showPauseUI() {
    }
    
    private final void initUI() {
    }
    
    private final void saveRunningDataToCloud() {
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
    
    private final void openHistoryFragment() {
    }
    
    private final void handleCancel() {
    }
    
    private final void getDataFromRemoteConfig() {
    }
    
    public RunningFragment() {
        super();
    }
}