package com.emglab.qlsv.ui.fragments.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020%H\u0002J\b\u00102\u001a\u00020%H\u0002J\b\u00103\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00064"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/user/LoginFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "TAG", "", "<set-?>", "Lcom/emglab/qlsv/databinding/FragmentLoginBinding;", "binding", "getBinding", "()Lcom/emglab/qlsv/databinding/FragmentLoginBinding;", "setBinding", "(Lcom/emglab/qlsv/databinding/FragmentLoginBinding;)V", "binding$delegate", "Lcom/emglab/qlsv/utilities/AutoClearedValue;", "email", "mAccount", "Lcom/microsoft/identity/client/IAccount;", "mSingleAccountApp", "Lcom/microsoft/identity/client/ISingleAccountPublicClientApplication;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/user/LoginViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getAuthInteractiveCallback", "Lcom/microsoft/identity/client/AuthenticationCallback;", "loadAccount", "", "login", "nextToMainActivity", "nextToTeacherActivity", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupViewModel", "subscribeUi", "updateUI", "app_debug"})
public final class LoginFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.emglab.qlsv.ui.viewmodels.user.LoginViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private final com.emglab.qlsv.utilities.AutoClearedValue binding$delegate = null;
    private com.microsoft.identity.client.IAccount mAccount;
    private com.microsoft.identity.client.ISingleAccountPublicClientApplication mSingleAccountApp;
    private final java.lang.String TAG = "_LOGIN_WITH_MS";
    private java.lang.String email;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.helper.SharedPrefsHelper getSharedPrefsHelper() {
        return null;
    }
    
    public final void setSharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper p0) {
    }
    
    private final com.emglab.qlsv.databinding.FragmentLoginBinding getBinding() {
        return null;
    }
    
    private final void setBinding(com.emglab.qlsv.databinding.FragmentLoginBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupViewModel() {
    }
    
    private final void subscribeUi() {
    }
    
    private final void login() {
    }
    
    private final void nextToMainActivity() {
    }
    
    private final void nextToTeacherActivity() {
    }
    
    /**
     * * Load current account in caches
     */
    private final void loadAccount() {
    }
    
    /**
     * * Updates UI base on the current account
     */
    private final void updateUI() {
    }
    
    /**
     * *
     */
    private final com.microsoft.identity.client.AuthenticationCallback getAuthInteractiveCallback() {
        return null;
    }
    
    public LoginFragment() {
        super();
    }
}