package com.emglab.qlsv.ui.fragments.timetable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/timetable/TimeTableFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/TimeTableFragmentBinding;", "dayOfWeekAdapter", "Lcom/emglab/qlsv/ui/adapter/timetable/DayOfWeekAdapter;", "daysOfWeek", "", "Lcom/emglab/qlsv/models/entity/DayOfWeek;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "menu", "Landroid/view/Menu;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/timetable/TimeTableViewModel;", "getCurrentWeek", "", "onCreateOptionsMenu", "", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setUpViewModel", "subscribeUI", "Companion", "app_debug"})
public final class TimeTableFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    private com.emglab.qlsv.ui.viewmodels.timetable.TimeTableViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.TimeTableFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.timetable.DayOfWeekAdapter dayOfWeekAdapter;
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig;
    private android.view.Menu menu;
    private java.util.List<com.emglab.qlsv.models.entity.DayOfWeek> daysOfWeek;
    public static final com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
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
    
    private final long getCurrentWeek() {
        return 0L;
    }
    
    public TimeTableFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/timetable/TimeTableFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/timetable/TimeTableFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}