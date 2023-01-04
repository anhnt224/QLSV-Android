package com.emglab.qlsv.teacher.fragment.account;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TAccountFragment_MembersInjector implements MembersInjector<TAccountFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public TAccountFragment_MembersInjector(Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<TAccountFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TAccountFragment_MembersInjector(sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(TAccountFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectSharedPrefsHelper(
      TAccountFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
