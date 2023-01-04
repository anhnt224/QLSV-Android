package com.emglab.qlsv.teacher.fragment.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TAddNewAddressFragment_MembersInjector
    implements MembersInjector<TAddNewAddressFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ViewModelFactory> factoryProvider;

  public TAddNewAddressFragment_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TAddNewAddressFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    return new TAddNewAddressFragment_MembersInjector(sharedPrefsHelperProvider, factoryProvider);
  }

  @Override
  public void injectMembers(TAddNewAddressFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectSharedPrefsHelper(
      TAddNewAddressFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectFactory(TAddNewAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
