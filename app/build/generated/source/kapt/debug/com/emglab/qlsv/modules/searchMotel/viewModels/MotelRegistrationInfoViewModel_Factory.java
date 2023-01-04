package com.emglab.qlsv.modules.searchMotel.viewModels;

import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationInfoViewModel_Factory
    implements Factory<MotelRegistrationInfoViewModel> {
  private final Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider;

  public MotelRegistrationInfoViewModel_Factory(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    this.motelRegistrationRepositoryProvider = motelRegistrationRepositoryProvider;
  }

  @Override
  public MotelRegistrationInfoViewModel get() {
    return provideInstance(motelRegistrationRepositoryProvider);
  }

  public static MotelRegistrationInfoViewModel provideInstance(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new MotelRegistrationInfoViewModel(motelRegistrationRepositoryProvider.get());
  }

  public static MotelRegistrationInfoViewModel_Factory create(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new MotelRegistrationInfoViewModel_Factory(motelRegistrationRepositoryProvider);
  }

  public static MotelRegistrationInfoViewModel newMotelRegistrationInfoViewModel(
      MotelRegistrationRepository motelRegistrationRepository) {
    return new MotelRegistrationInfoViewModel(motelRegistrationRepository);
  }
}
