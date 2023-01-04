package com.emglab.qlsv.teacher.fragment.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TGiftGivenFragment_MembersInjector
    implements MembersInjector<TGiftGivenFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public TGiftGivenFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<TGiftGivenFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TGiftGivenFragment_MembersInjector(factoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(TGiftGivenFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectFactory(TGiftGivenFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      TGiftGivenFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
