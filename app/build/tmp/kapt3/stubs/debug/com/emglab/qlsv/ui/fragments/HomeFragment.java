package com.emglab.qlsv.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/HomeFragmentBinding;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/HomeViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "openListActivity", "openListForms", "openListJobs", "openListScholarShip", "openTimeTable", "openTrainingPoint", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private com.emglab.qlsv.ui.viewmodels.HomeViewModel viewModel;
    private com.emglab.qlsv.databinding.HomeFragmentBinding binding;
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig = null;
    public static final com.emglab.qlsv.ui.fragments.HomeFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.helper.SharedPrefsHelper getSharedPrefsHelper() {
        return null;
    }
    
    public final void setSharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void openListActivity() {
    }
    
    private final void openListScholarShip() {
    }
    
    private final void openListJobs() {
    }
    
    private final void openListForms() {
    }
    
    private final void openTrainingPoint() {
    }
    
    private final void openTimeTable() {
    }
    
    public HomeFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/HomeFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/HomeFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.HomeFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}