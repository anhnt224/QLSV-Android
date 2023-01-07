package com.emglab.qlsv.ui.fragments.help;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/emglab/qlsv/ui/fragments/help/HelpFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/models/entity/Tutorial;", "()V", "binding", "Lcom/emglab/qlsv/databinding/HelpFragmentBinding;", "helps", "", "Lcom/emglab/qlsv/models/entity/Help;", "getHelps", "()Ljava/util/List;", "setHelps", "(Ljava/util/List;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/help/HelpViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onClick", "value", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "openLink", "link", "", "Companion", "app_debug"})
public final class HelpFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Tutorial> {
    private com.emglab.qlsv.ui.viewmodels.help.HelpViewModel viewModel;
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig;
    private com.emglab.qlsv.databinding.HelpFragmentBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.Help> helps;
    public static final com.emglab.qlsv.ui.fragments.help.HelpFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Help> getHelps() {
        return null;
    }
    
    public final void setHelps(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Help> p0) {
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Tutorial value) {
    }
    
    private final void openLink(java.lang.String link) {
    }
    
    public HelpFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/help/HelpFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/help/HelpFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.help.HelpFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}