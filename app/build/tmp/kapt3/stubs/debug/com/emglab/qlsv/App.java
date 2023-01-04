package com.emglab.qlsv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/emglab/qlsv/App;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "activityInjector", "Ldagger/android/AndroidInjector;", "attachBaseContext", "", "context", "Landroid/content/Context;", "createNotificationChanel", "initRxTrueTime", "onCreate", "app_debug"})
public final class App extends android.app.Application implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> dispatchingAndroidInjector;
    private final java.lang.String TAG = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    private final void initRxTrueTime() {
    }
    
    private final void createNotificationChanel() {
    }
    
    public App() {
        super();
    }
}