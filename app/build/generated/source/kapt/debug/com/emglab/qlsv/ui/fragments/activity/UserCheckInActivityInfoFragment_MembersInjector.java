package com.emglab.qlsv.ui.fragments.activity;

import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.ui.fragments.FragmentLocationBase_MembersInjector;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserCheckInActivityInfoFragment_MembersInjector
    implements MembersInjector<UserCheckInActivityInfoFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public UserCheckInActivityInfoFragment_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  public static MembersInjector<UserCheckInActivityInfoFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new UserCheckInActivityInfoFragment_MembersInjector(
        sharedPrefsHelperProvider, viewModelFactoryProvider, appExecutorsProvider);
  }

  @Override
  public void injectMembers(UserCheckInActivityInfoFragment instance) {
    FragmentLocationBase_MembersInjector.injectSharedPrefsHelper(
        instance, sharedPrefsHelperProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAppExecutors(instance, appExecutorsProvider.get());
  }

  public static void injectViewModelFactory(
      UserCheckInActivityInfoFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectAppExecutors(
      UserCheckInActivityInfoFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }
}
