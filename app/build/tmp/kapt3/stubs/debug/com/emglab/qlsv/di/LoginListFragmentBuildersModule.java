package com.emglab.qlsv.di;

import java.lang.System;

/**
 * * All fragments related to LoginActivity intended to use Dagger @Inject should be listed here.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/emglab/qlsv/di/LoginListFragmentBuildersModule;", "", "()V", "contributeCheckOTPLostPasswordFragment", "Lcom/emglab/qlsv/ui/fragments/user/CheckOTPLostPasswordFragment;", "contributeLoginFragment", "Lcom/emglab/qlsv/ui/fragments/user/LoginFragment;", "contributeLostPasswordFragment", "Lcom/emglab/qlsv/ui/fragments/user/LostPasswordFragment;", "contributeRegisterFragment", "Lcom/emglab/qlsv/ui/fragments/user/RegisterFragment;", "app_debug"})
@dagger.Module()
public abstract class LoginListFragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.LostPasswordFragment contributeLostPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.CheckOTPLostPasswordFragment contributeCheckOTPLostPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.LoginFragment contributeLoginFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.RegisterFragment contributeRegisterFragment();
    
    public LoginListFragmentBuildersModule() {
        super();
    }
}