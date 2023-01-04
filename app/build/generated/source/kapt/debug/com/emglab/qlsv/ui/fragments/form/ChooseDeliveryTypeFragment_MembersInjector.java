package com.emglab.qlsv.ui.fragments.form;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChooseDeliveryTypeFragment_MembersInjector
    implements MembersInjector<ChooseDeliveryTypeFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public ChooseDeliveryTypeFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<ChooseDeliveryTypeFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new ChooseDeliveryTypeFragment_MembersInjector(
        factoryProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(ChooseDeliveryTypeFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectFactory(ChooseDeliveryTypeFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      ChooseDeliveryTypeFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
