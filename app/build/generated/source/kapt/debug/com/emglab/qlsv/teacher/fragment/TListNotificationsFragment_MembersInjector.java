package com.emglab.qlsv.teacher.fragment;

import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListNotificationsFragment_MembersInjector
    implements MembersInjector<TListNotificationsFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public TListNotificationsFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  public static MembersInjector<TListNotificationsFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new TListNotificationsFragment_MembersInjector(
        viewModelFactoryProvider, sharedPrefsHelperProvider, appExecutorsProvider);
  }

  @Override
  public void injectMembers(TListNotificationsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectAppExecutors(instance, appExecutorsProvider.get());
  }

  public static void injectViewModelFactory(
      TListNotificationsFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectSharedPrefsHelper(
      TListNotificationsFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectAppExecutors(
      TListNotificationsFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }
}
