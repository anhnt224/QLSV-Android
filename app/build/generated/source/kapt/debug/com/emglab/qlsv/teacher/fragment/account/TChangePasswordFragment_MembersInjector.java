package com.emglab.qlsv.teacher.fragment.account;

import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TChangePasswordFragment_MembersInjector
    implements MembersInjector<TChangePasswordFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public TChangePasswordFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<TChangePasswordFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TChangePasswordFragment_MembersInjector(
        viewModelFactoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(TChangePasswordFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectViewModelFactory(
      TChangePasswordFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectSharedPrefsHelper(
      TChangePasswordFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
