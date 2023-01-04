package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiverAddressViewModel_Factory implements Factory<ReceiverAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public ReceiverAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ReceiverAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static ReceiverAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new ReceiverAddressViewModel(userRepositoryProvider.get());
  }

  public static ReceiverAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ReceiverAddressViewModel_Factory(userRepositoryProvider);
  }

  public static ReceiverAddressViewModel newReceiverAddressViewModel(
      UserRepository userRepository) {
    return new ReceiverAddressViewModel(userRepository);
  }
}
