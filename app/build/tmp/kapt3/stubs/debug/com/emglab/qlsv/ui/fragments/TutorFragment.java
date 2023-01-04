package com.emglab.qlsv.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/TutorFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/FragmentTutorBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "tutorJob", "Lcom/emglab/qlsv/models/entity/TutorJob;", "getTutorJob", "()Lcom/emglab/qlsv/models/entity/TutorJob;", "setTutorJob", "(Lcom/emglab/qlsv/models/entity/TutorJob;)V", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/TutorViewModel;", "fetchRemoteConfig", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupViewModel", "showSharingDialogWithURL", "text", "", "url", "app_debug"})
public final class TutorFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    private com.emglab.qlsv.ui.viewmodels.TutorViewModel viewModel;
    private com.emglab.qlsv.databinding.FragmentTutorBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig = null;
    @org.jetbrains.annotations.NotNull()
    private com.emglab.qlsv.models.entity.TutorJob tutorJob;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.remoteconfig.FirebaseRemoteConfig getRemoteConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.TutorJob getTutorJob() {
        return null;
    }
    
    public final void setTutorJob(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.TutorJob p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupViewModel() {
    }
    
    private final void fetchRemoteConfig() {
    }
    
    private final void showSharingDialogWithURL(java.lang.String text, java.lang.String url) {
    }
    
    public TutorFragment() {
        super();
    }
}