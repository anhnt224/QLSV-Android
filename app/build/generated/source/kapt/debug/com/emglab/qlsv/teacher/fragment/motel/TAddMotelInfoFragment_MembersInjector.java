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
public final class TAddMotelInfoFragment_MembersInjector
    implements MembersInjector<TAddMotelInfoFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ViewModelFactory> factoryProvider;

  public TAddMotelInfoFragment_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TAddMotelInfoFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider) {
    return new TAddMotelInfoFragment_MembersInjector(sharedPrefsHelperProvider, factoryProvider);
  }

  @Override
  public void injectMembers(TAddMotelInfoFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectSharedPrefsHelper(
      TAddMotelInfoFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectFactory(TAddMotelInfoFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
