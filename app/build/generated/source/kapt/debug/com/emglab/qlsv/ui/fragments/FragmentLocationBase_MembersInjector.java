package com.emglab.qlsv.ui.fragments;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FragmentLocationBase_MembersInjector
    implements MembersInjector<FragmentLocationBase> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public FragmentLocationBase_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<FragmentLocationBase> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new FragmentLocationBase_MembersInjector(sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(FragmentLocationBase instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectSharedPrefsHelper(
      FragmentLocationBase instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
