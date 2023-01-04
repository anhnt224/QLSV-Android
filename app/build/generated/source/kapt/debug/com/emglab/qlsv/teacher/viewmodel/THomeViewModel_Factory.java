package com.emglab.qlsv.teacher.viewmodel;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class THomeViewModel_Factory implements Factory<THomeViewModel> {
  private static final THomeViewModel_Factory INSTANCE = new THomeViewModel_Factory();

  @Override
  public THomeViewModel get() {
    return provideInstance();
  }

  public static THomeViewModel provideInstance() {
    return new THomeViewModel();
  }

  public static THomeViewModel_Factory create() {
    return INSTANCE;
  }

  public static THomeViewModel newTHomeViewModel() {
    return new THomeViewModel();
  }
}
