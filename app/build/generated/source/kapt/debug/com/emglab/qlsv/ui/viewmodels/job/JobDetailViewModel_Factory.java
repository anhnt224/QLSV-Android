package com.emglab.qlsv.ui.viewmodels.job;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JobDetailViewModel_Factory implements Factory<JobDetailViewModel> {
  private static final JobDetailViewModel_Factory INSTANCE = new JobDetailViewModel_Factory();

  @Override
  public JobDetailViewModel get() {
    return provideInstance();
  }

  public static JobDetailViewModel provideInstance() {
    return new JobDetailViewModel();
  }

  public static JobDetailViewModel_Factory create() {
    return INSTANCE;
  }

  public static JobDetailViewModel newJobDetailViewModel() {
    return new JobDetailViewModel();
  }
}
