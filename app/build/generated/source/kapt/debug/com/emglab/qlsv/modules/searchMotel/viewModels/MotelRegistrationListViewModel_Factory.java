package com.emglab.qlsv.modules.searchMotel.viewModels;

import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationListViewModel_Factory
    implements Factory<MotelRegistrationListViewModel> {
  private final Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider;

  public MotelRegistrationListViewModel_Factory(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    this.motelRegistrationRepositoryProvider = motelRegistrationRepositoryProvider;
  }

  @Override
  public MotelRegistrationListViewModel get() {
    return provideInstance(motelRegistrationRepositoryProvider);
  }

  public static MotelRegistrationListViewModel provideInstance(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new MotelRegistrationListViewModel(motelRegistrationRepositoryProvider.get());
  }

  public static MotelRegistrationListViewModel_Factory create(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new MotelRegistrationListViewModel_Factory(motelRegistrationRepositoryProvider);
  }

  public static MotelRegistrationListViewModel newMotelRegistrationListViewModel(
      MotelRegistrationRepository motelRegistrationRepository) {
    return new MotelRegistrationListViewModel(motelRegistrationRepository);
  }
}
