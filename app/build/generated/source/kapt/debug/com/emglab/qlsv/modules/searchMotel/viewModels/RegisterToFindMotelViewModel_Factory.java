package com.emglab.qlsv.modules.searchMotel.viewModels;

import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterToFindMotelViewModel_Factory
    implements Factory<RegisterToFindMotelViewModel> {
  private final Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider;

  public RegisterToFindMotelViewModel_Factory(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    this.motelRegistrationRepositoryProvider = motelRegistrationRepositoryProvider;
  }

  @Override
  public RegisterToFindMotelViewModel get() {
    return provideInstance(motelRegistrationRepositoryProvider);
  }

  public static RegisterToFindMotelViewModel provideInstance(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new RegisterToFindMotelViewModel(motelRegistrationRepositoryProvider.get());
  }

  public static RegisterToFindMotelViewModel_Factory create(
      Provider<MotelRegistrationRepository> motelRegistrationRepositoryProvider) {
    return new RegisterToFindMotelViewModel_Factory(motelRegistrationRepositoryProvider);
  }

  public static RegisterToFindMotelViewModel newRegisterToFindMotelViewModel(
      MotelRegistrationRepository motelRegistrationRepository) {
    return new RegisterToFindMotelViewModel(motelRegistrationRepository);
  }
}
