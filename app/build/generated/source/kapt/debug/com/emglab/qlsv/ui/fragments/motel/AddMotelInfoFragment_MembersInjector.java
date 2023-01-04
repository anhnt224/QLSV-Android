package com.emglab.qlsv.ui.fragments.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddMotelInfoFragment_MembersInjector
    implements MembersInjector<AddMotelInfoFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ViewModelFactory> factoryProvider;

  public AddMotelInfoFragment_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<AddMotelInfoFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    return new AddMotelInfoFragment_MembersInjector(sharedPrefsHelperProvider, factoryProvider);
  }

  @Override
  public void injectMembers(AddMotelInfoFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectSharedPrefsHelper(
      AddMotelInfoFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectFactory(AddMotelInfoFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
