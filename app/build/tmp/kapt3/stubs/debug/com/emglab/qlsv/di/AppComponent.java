package com.emglab.qlsv.di;

import java.lang.System;

/**
 * * Singleton component interface for the app. It ties all the modules together.
 * * The component is used to connect objects to their dependencies.
 * * Dagger will auto-generate DaggerAppComponent which is used for initialization at Application.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/di/AppComponent;", "", "inject", "", "app", "Lcom/emglab/qlsv/App;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.emglab.qlsv.di.AppModule.class, com.emglab.qlsv.di.ActivityBuildersModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.App app);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/di/AppComponent$Builder;", "", "application", "Lcom/emglab/qlsv/App;", "build", "Lcom/emglab/qlsv/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.emglab.qlsv.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.App application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.emglab.qlsv.di.AppComponent build();
    }
}