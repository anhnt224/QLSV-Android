package com.emglab.qlsv.ui.viewmodels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TutorViewModel_Factory implements Factory<TutorViewModel> {
  private static final TutorViewModel_Factory INSTANCE = new TutorViewModel_Factory();

  @Override
  public TutorViewModel get() {
    return provideInstance();
  }

  public static TutorViewModel provideInstance() {
    return new TutorViewModel();
  }

  public static TutorViewModel_Factory create() {
    return INSTANCE;
  }

  public static TutorViewModel newTutorViewModel() {
    return new TutorViewModel();
  }
}
