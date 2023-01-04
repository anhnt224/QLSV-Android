package com.emglab.qlsv.ui.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Home2Fragment_MembersInjector implements MembersInjector<Home2Fragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public Home2Fragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<Home2Fragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new Home2Fragment_MembersInjector(factoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(Home2Fragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectFactory(Home2Fragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      Home2Fragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
