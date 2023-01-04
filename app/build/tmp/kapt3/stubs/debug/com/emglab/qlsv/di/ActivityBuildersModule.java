package com.emglab.qlsv.di;

import java.lang.System;

/**
 * * All user intended to use Dagger @Inject should be listed here.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/emglab/qlsv/di/ActivityBuildersModule;", "", "()V", "contributeLoginActivity", "Lcom/emglab/qlsv/LoginActivity;", "contributeMainActivity", "Lcom/emglab/qlsv/MainActivity;", "contributeTeacherActivity", "Lcom/emglab/qlsv/TeacherActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.emglab.qlsv.di.MainListFragmentBuildersModule.class})
    public abstract com.emglab.qlsv.MainActivity contributeMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.emglab.qlsv.di.LoginListFragmentBuildersModule.class})
    public abstract com.emglab.qlsv.LoginActivity contributeLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.emglab.qlsv.di.TListFragmentBuilderModule.class})
    public abstract com.emglab.qlsv.TeacherActivity contributeTeacherActivity();
    
    public ActivityBuildersModule() {
        super();
    }
}