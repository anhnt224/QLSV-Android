package com.emglab.qlsv.teacher.viewmodel;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TTutorViewModel_Factory implements Factory<TTutorViewModel> {
  private static final TTutorViewModel_Factory INSTANCE = new TTutorViewModel_Factory();

  @Override
  public TTutorViewModel get() {
    return provideInstance();
  }

  public static TTutorViewModel provideInstance() {
    return new TTutorViewModel();
  }

  public static TTutorViewModel_Factory create() {
    return INSTANCE;
  }

  public static TTutorViewModel newTTutorViewModel() {
    return new TTutorViewModel();
  }
}
