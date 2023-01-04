package com.emglab.qlsv.modules.searchMotel.viewModels;

import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationCompleteViewModel_Factory
    implements Factory<MotelRegistrationCompleteViewModel> {
  private final Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider;

  public MotelRegistrationCompleteViewModel_Factory(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    this.motelRegistrationRepositoryProvider = motelRegistrationRepositoryProvider;
  }

  @Override
  public MotelRegistrationCompleteViewModel get() {
    return provideInstance(motelRegistrationRepositoryProvider);
  }

  public static MotelRegistrationCompleteViewModel provideInstance(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new MotelRegistrationCompleteViewModel(motelRegistrationRepositoryProvider.get());
  }

  public static MotelRegistrationCompleteViewModel_Factory create(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new MotelRegistrationCompleteViewModel_Factory(motelRegistrationRepositoryProvider);
  }

  public static MotelRegistrationCompleteViewModel newMotelRegistrationCompleteViewModel(
      MotelRegistrationRepository motelRegistrationRepository) {
    return new MotelRegistrationCompleteViewModel(motelRegistrationRepository);
  }
}
