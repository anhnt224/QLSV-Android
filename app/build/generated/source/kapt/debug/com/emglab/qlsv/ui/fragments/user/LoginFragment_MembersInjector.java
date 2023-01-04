package com.emglab.qlsv.ui.fragments.user;

import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public LoginFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<LoginFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new LoginFragment_MembersInjector(viewModelFactoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(LoginFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectViewModelFactory(
      LoginFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectSharedPrefsHelper(
      LoginFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
