package com.emglab.qlsv.teacher.viewmodel.account;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TAccountViewModel_Factory implements Factory<TAccountViewModel> {
  private static final TAccountViewModel_Factory INSTANCE = new TAccountViewModel_Factory();

  @Override
  public TAccountViewModel get() {
    return provideInstance();
  }

  public static TAccountViewModel provideInstance() {
    return new TAccountViewModel();
  }

  public static TAccountViewModel_Factory create() {
    return INSTANCE;
  }

  public static TAccountViewModel newTAccountViewModel() {
    return new TAccountViewModel();
  }
}
