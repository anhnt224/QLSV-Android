package com.emglab.qlsv.ui.fragments.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/form/ListFormsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/models/entity/Form;", "()V", "binding", "Lcom/emglab/qlsv/databinding/ListFormsFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "formAdapter", "Lcom/emglab/qlsv/ui/adapter/FormAdapter;", "forms", "", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/form/ListFormsViewModel;", "onClick", "", "value", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "openListFormsRegistered", "setUpViewModel", "subscribeUI", "Companion", "app_debug"})
public final class ListFormsFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Form> {
    private com.emglab.qlsv.ui.viewmodels.form.ListFormsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.ListFormsFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.FormAdapter formAdapter;
    private java.util.List<com.emglab.qlsv.models.entity.Form> forms;
    public static final com.emglab.qlsv.ui.fragments.form.ListFormsFragment.Companion Companion = null;
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
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Form value) {
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
    
    private final void openListFormsRegistered() {
    }
    
    public ListFormsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/form/ListFormsFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/form/ListFormsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.form.ListFormsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}