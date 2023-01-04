package com.emglab.qlsv.ui.fragments.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020DH\u0002J\b\u0010F\u001a\u00020DH\u0002J\u0018\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\'2\u0006\u0010I\u001a\u00020\'H\u0002J\b\u0010J\u001a\u00020DH\u0002J\b\u0010K\u001a\u00020DH\u0002J\b\u0010L\u001a\u00020DH\u0002J\b\u0010M\u001a\u00020DH\u0002J\u0010\u0010N\u001a\u00020\u00062\u0006\u0010O\u001a\u00020/H\u0002J$\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010X\u001a\u00020DH\u0016J\u0010\u0010Y\u001a\u00020D2\u0006\u0010Z\u001a\u00020\u0019H\u0016J\b\u0010[\u001a\u00020DH\u0016J\b\u0010\\\u001a\u00020DH\u0016J\b\u0010]\u001a\u00020DH\u0002J\u0010\u0010^\u001a\u00020D2\u0006\u0010_\u001a\u00020\u0016H\u0002J\b\u0010`\u001a\u00020DH\u0002J\b\u0010a\u001a\u00020DH\u0002J\u0018\u0010b\u001a\u00020D2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u0006H\u0002J\b\u0010e\u001a\u00020DH\u0002J\b\u0010f\u001a\u00020DH\u0002J\u0010\u0010g\u001a\u00020D2\u0006\u0010H\u001a\u00020\'H\u0003J\b\u0010h\u001a\u00020DH\u0002J\b\u0010i\u001a\u00020DH\u0002J\b\u0010j\u001a\u00020DH\u0002J\b\u0010k\u001a\u00020DH\u0002J\b\u0010l\u001a\u00020DH\u0002J\b\u0010m\u001a\u00020DH\u0002J\b\u0010n\u001a\u00020DH\u0002J\b\u0010o\u001a\u00020DH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00150\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020%0\u0015j\b\u0012\u0004\u0012\u00020%`\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006q"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/running/RunFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "TAG", "", "binding", "Lcom/emglab/qlsv/databinding/RunFragmentBinding;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "comIdInRoom", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "isRunning", "", "lastLocationList", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/run/LocationWithTime;", "Lkotlin/collections/ArrayList;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "minPace", "", "pointMap", "Lcom/google/android/gms/maps/model/LatLng;", "runDataDao", "Lcom/emglab/qlsv/dao/RunDataDao;", "getRunDataDao", "()Lcom/emglab/qlsv/dao/RunDataDao;", "setRunDataDao", "(Lcom/emglab/qlsv/dao/RunDataDao;)V", "runDataList", "Lcom/emglab/qlsv/models/entity/run/RunData;", "runningDistance", "", "runningLocationDao", "Lcom/emglab/qlsv/dao/RunningLocationDao;", "getRunningLocationDao", "()Lcom/emglab/qlsv/dao/RunningLocationDao;", "setRunningLocationDao", "(Lcom/emglab/qlsv/dao/RunningLocationDao;)V", "runningTime", "", "runningWay", "Lcom/emglab/qlsv/models/entity/run/RunningWay;", "runningWayDao", "Lcom/emglab/qlsv/dao/RunningWayDao;", "getRunningWayDao", "()Lcom/emglab/qlsv/dao/RunningWayDao;", "setRunningWayDao", "(Lcom/emglab/qlsv/dao/RunningWayDao;)V", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "timer", "Ljava/util/Timer;", "viewModel", "Lcom/emglab/qlsv/ui/fragments/running/RunViewModel;", "wayID", "clearRunData", "", "createNewRunningWay", "fetchCompleteRunningWay", "getPace", "distance", "seconds", "handleCancel", "handleFinish", "handlePause", "handleStart", "milliSecondsToTime", "milliSeconds", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMapReady", "googleMap", "onPause", "onResume", "removeRunDataUploadSuccess", "saveLocation", "location", "saveRunDataUploadFail", "saveTimeUpdated", "sendNotification", "content", "title", "setUpViewModel", "showAlertUploadFail", "showDistance", "showLocationOnMap", "showPauseUI", "showRunningUI", "showStartUI", "startService", "startTimer", "stopTimer", "subScribeUI", "Companion", "app_debug"})
public final class RunFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.google.android.gms.maps.OnMapReadyCallback {
    private com.emglab.qlsv.ui.fragments.running.RunViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.dao.RunningLocationDao runningLocationDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.dao.RunningWayDao runningWayDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.dao.RunDataDao runDataDao;
    private com.emglab.qlsv.databinding.RunFragmentBinding binding;
    private boolean isRunning;
    private final java.lang.String TAG = "RUN_SERVICE";
    private java.lang.String wayID;
    private com.emglab.qlsv.models.entity.run.RunningWay runningWay;
    private long runningTime;
    private double runningDistance;
    private java.util.Timer timer;
    private java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> pointMap;
    private com.google.android.gms.maps.GoogleMap mMap;
    private java.util.ArrayList<com.emglab.qlsv.models.entity.run.LocationWithTime> lastLocationList;
    private final int minPace = 120000;
    private java.util.ArrayList<com.emglab.qlsv.models.entity.run.RunData> runDataList;
    private java.lang.String comIdInRoom;
    private final android.content.BroadcastReceiver broadcastReceiver = null;
    public static final com.emglab.qlsv.ui.fragments.running.RunFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
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
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setUpViewModel() {
    }
    
    private final void subScribeUI() {
    }
    
    private final void showAlertUploadFail() {
    }
    
    private final void startService() {
    }
    
    private final void handleStart() {
    }
    
    private final void handlePause() {
    }
    
    private final void handleFinish() {
    }
    
    private final void saveLocation(com.emglab.qlsv.models.entity.run.LocationWithTime location) {
    }
    
    private final void createNewRunningWay() {
    }
    
    private final void saveRunDataUploadFail() {
    }
    
    private final void removeRunDataUploadSuccess() {
    }
    
    private final void saveTimeUpdated() {
    }
    
    private final void fetchCompleteRunningWay() {
    }
    
    private final void startTimer() {
    }
    
    private final void stopTimer() {
    }
    
    private final java.lang.String milliSecondsToTime(long milliSeconds) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showDistance(double distance) {
    }
    
    private final void showStartUI() {
    }
    
    private final void showRunningUI() {
    }
    
    private final void showPauseUI() {
    }
    
    private final void clearRunData() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void showLocationOnMap() {
    }
    
    private final void handleCancel() {
    }
    
    private final void sendNotification(java.lang.String content, java.lang.String title) {
    }
    
    private final java.lang.String getPace(double distance, double seconds) {
        return null;
    }
    
    public RunFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/running/RunFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/running/RunFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.running.RunFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}