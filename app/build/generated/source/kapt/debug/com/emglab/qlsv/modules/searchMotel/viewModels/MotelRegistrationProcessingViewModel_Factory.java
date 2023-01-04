package com.emglab.qlsv.modules.searchMotel.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationProcessingViewModel_Factory
    implements Factory<MotelRegistrationProcessingViewModel> {
  private static final MotelRegistrationProcessingViewModel_Factory INSTANCE =
      new MotelRegistrationProcessingViewModel_Factory();

  @Override
  public MotelRegistrationProcessingViewModel get() {
    return provideInstance();
  }

  public static MotelRegistrationProcessingViewModel provideInstance() {
    return new MotelRegistrationProcessingViewModel();
  }

  public static MotelRegistrationProcessingViewModel_Factory create() {
    return INSTANCE;
  }

  public static MotelRegistrationProcessingViewModel newMotelRegistrationProcessingViewModel() {
    return new MotelRegistrationProcessingViewModel();
  }
}
