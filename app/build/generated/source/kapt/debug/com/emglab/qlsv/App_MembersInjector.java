package com.emglab.qlsv;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  public App_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<App> create(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    return new App_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      App instance, DispatchingAndroidInjector<Activity> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}
