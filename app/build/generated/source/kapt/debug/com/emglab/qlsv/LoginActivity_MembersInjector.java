package com.emglab.qlsv;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public LoginActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new LoginActivity_MembersInjector(
        dispatchingAndroidInjectorProvider, viewModelFactoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      LoginActivity instance, DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }

  public static void injectViewModelFactory(
      LoginActivity instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectSharedPrefsHelper(
      LoginActivity instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
