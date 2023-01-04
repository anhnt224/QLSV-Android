package com.emglab.qlsv.teacher.fragment.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0007J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000eH\u0003J\b\u0010#\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/form/TRegisterFormFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/TRegisterFormFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "formQuestions", "", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "index", "", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/form/TRegisterFormViewModel;", "checkProgress", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setUpViewModel", "showAnswerCheckBox", "formQuestion", "showAnswerParagraph", "showAnswerSingleChoice", "showQuestion", "subscribeUI", "Companion", "app_debug"})
public final class TRegisterFormFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    private com.emglab.qlsv.teacher.viewmodel.form.TRegisterFormViewModel viewModel;
    private com.emglab.qlsv.databinding.TRegisterFormFragmentBinding binding;
    private int index;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private java.util.List<com.emglab.qlsv.models.entity.FormQuestion> formQuestions;
    public static final com.emglab.qlsv.teacher.fragment.form.TRegisterFormFragment.Companion Companion = null;
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showQuestion(com.emglab.qlsv.models.entity.FormQuestion formQuestion) {
    }
    
    private final void showAnswerSingleChoice(com.emglab.qlsv.models.entity.FormQuestion formQuestion) {
    }
    
    private final void showAnswerCheckBox(com.emglab.qlsv.models.entity.FormQuestion formQuestion) {
    }
    
    private final void showAnswerParagraph(com.emglab.qlsv.models.entity.FormQuestion formQuestion) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void checkProgress() {
    }
    
    public TRegisterFormFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/form/TRegisterFormFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/teacher/fragment/form/TRegisterFormFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.teacher.fragment.form.TRegisterFormFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}