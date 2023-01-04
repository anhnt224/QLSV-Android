package com.emglab.qlsv.ui.viewmodels.user;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccountViewModel_Factory implements Factory<AccountViewModel> {
  private static final AccountViewModel_Factory INSTANCE = new AccountViewModel_Factory();

  @Override
  public AccountViewModel get() {
    return provideInstance();
  }

  public static AccountViewModel provideInstance() {
    return new AccountViewModel();
  }

  public static AccountViewModel_Factory create() {
    return INSTANCE;
  }

  public static AccountViewModel newAccountViewModel() {
    return new AccountViewModel();
  }
}
