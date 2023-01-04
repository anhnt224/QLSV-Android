package com.emglab.qlsv.ui.fragments.user;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddNewAddressFragment_MembersInjector
    implements MembersInjector<AddNewAddressFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ViewModelFactory> factoryProvider;

  public AddNewAddressFragment_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<AddNewAddressFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    return new AddNewAddressFragment_MembersInjector(sharedPrefsHelperProvider, factoryProvider);
  }

  @Override
  public void injectMembers(AddNewAddressFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectSharedPrefsHelper(
      AddNewAddressFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectFactory(AddNewAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
