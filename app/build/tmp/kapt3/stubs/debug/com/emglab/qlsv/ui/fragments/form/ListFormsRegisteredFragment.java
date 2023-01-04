package com.emglab.qlsv.ui.fragments.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u00052\u00020\u0006:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u001aH\u0002J\b\u0010\'\u001a\u00020\u001aH\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u001aH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/form/ListFormsRegisteredFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/models/entity/Form;", "Lcom/emglab/qlsv/ui/adapter/OnItemLongClickListener;", "Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$OnButtonItemClick;", "()V", "binding", "Lcom/emglab/qlsv/databinding/ListFormsRegisteredFragmentBinding;", "comment", "", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "formRegisteredAdapter", "Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter;", "formSelected", "rating", "", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/form/ListFormsRegisteredViewModel;", "onButtonRatingClick", "", "form", "onClick", "value", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLongClick", "setUpViewModel", "showRatingView", "subscribeUI", "Companion", "app_debug"})
public final class ListFormsRegisteredFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Form>, com.emglab.qlsv.ui.adapter.OnItemLongClickListener<com.emglab.qlsv.models.entity.Form>, com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.OnButtonItemClick {
    private com.emglab.qlsv.ui.viewmodels.form.ListFormsRegisteredViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.ListFormsRegisteredFragmentBinding binding;
    private com.emglab.qlsv.ui.adapter.FormRegisteredAdapter formRegisteredAdapter;
    private com.emglab.qlsv.models.entity.Form formSelected;
    private int rating;
    private java.lang.String comment;
    public static final com.emglab.qlsv.ui.fragments.form.ListFormsRegisteredFragment.Companion Companion = null;
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
    public void onLongClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Form value) {
    }
    
    private final void showRatingView(com.emglab.qlsv.models.entity.Form form) {
    }
    
    @java.lang.Override()
    public void onButtonRatingClick(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Form form) {
    }
    
    private final void rating() {
    }
    
    public ListFormsRegisteredFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/form/ListFormsRegisteredFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/form/ListFormsRegisteredFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.form.ListFormsRegisteredFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}