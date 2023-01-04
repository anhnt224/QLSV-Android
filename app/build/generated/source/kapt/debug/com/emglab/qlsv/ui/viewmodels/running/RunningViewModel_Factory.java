package com.emglab.qlsv.ui.viewmodels.running;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunningViewModel_Factory implements Factory<RunningViewModel> {
  private static final RunningViewModel_Factory INSTANCE = new RunningViewModel_Factory();

  @Override
  public RunningViewModel get() {
    return provideInstance();
  }

  public static RunningViewModel provideInstance() {
    return new RunningViewModel();
  }

  public static RunningViewModel_Factory create() {
    return INSTANCE;
  }

  public static RunningViewModel newRunningViewModel() {
    return new RunningViewModel();
  }
}
