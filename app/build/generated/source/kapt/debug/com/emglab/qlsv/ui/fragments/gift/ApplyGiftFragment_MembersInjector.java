package com.emglab.qlsv.ui.fragments.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplyGiftFragment_MembersInjector implements MembersInjector<ApplyGiftFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public ApplyGiftFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<ApplyGiftFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new ApplyGiftFragment_MembersInjector(factoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(ApplyGiftFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectFactory(ApplyGiftFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      ApplyGiftFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
