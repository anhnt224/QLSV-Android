package com.emglab.qlsv.ui.fragments;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public HomeFragment_MembersInjector(Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new HomeFragment_MembersInjector(sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectSharedPrefsHelper(
      HomeFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
