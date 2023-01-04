package com.emglab.qlsv.ui.viewmodels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private static final HomeViewModel_Factory INSTANCE = new HomeViewModel_Factory();

  @Override
  public HomeViewModel get() {
    return provideInstance();
  }

  public static HomeViewModel provideInstance() {
    return new HomeViewModel();
  }

  public static HomeViewModel_Factory create() {
    return INSTANCE;
  }

  public static HomeViewModel newHomeViewModel() {
    return new HomeViewModel();
  }
}
