package com.emglab.qlsv.ui.fragments.user;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccountFragment_MembersInjector implements MembersInjector<AccountFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public AccountFragment_MembersInjector(Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<AccountFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new AccountFragment_MembersInjector(sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(AccountFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectSharedPrefsHelper(
      AccountFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
