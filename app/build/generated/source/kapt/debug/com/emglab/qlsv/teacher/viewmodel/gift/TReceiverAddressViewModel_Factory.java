package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TReceiverAddressViewModel_Factory implements Factory<TReceiverAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TReceiverAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TReceiverAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TReceiverAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TReceiverAddressViewModel(userRepositoryProvider.get());
  }

  public static TReceiverAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TReceiverAddressViewModel_Factory(userRepositoryProvider);
  }

  public static TReceiverAddressViewModel newTReceiverAddressViewModel(
      UserRepository userRepository) {
    return new TReceiverAddressViewModel(userRepository);
  }
}
