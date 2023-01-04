package com.emglab.qlsv.ui.viewmodels.form;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChooseReceiverAddressViewModel_Factory
    implements Factory<ChooseReceiverAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public ChooseReceiverAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ChooseReceiverAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static ChooseReceiverAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new ChooseReceiverAddressViewModel(userRepositoryProvider.get());
  }

  public static ChooseReceiverAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ChooseReceiverAddressViewModel_Factory(userRepositoryProvider);
  }

  public static ChooseReceiverAddressViewModel newChooseReceiverAddressViewModel(
      UserRepository userRepository) {
    return new ChooseReceiverAddressViewModel(userRepository);
  }
}
