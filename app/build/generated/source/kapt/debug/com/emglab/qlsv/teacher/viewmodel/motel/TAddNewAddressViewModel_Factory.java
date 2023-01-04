package com.emglab.qlsv.teacher.viewmodel.motel;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TAddNewAddressViewModel_Factory implements Factory<TAddNewAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TAddNewAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TAddNewAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TAddNewAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TAddNewAddressViewModel(userRepositoryProvider.get());
  }

  public static TAddNewAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TAddNewAddressViewModel_Factory(userRepositoryProvider);
  }

  public static TAddNewAddressViewModel newTAddNewAddressViewModel(UserRepository userRepository) {
    return new TAddNewAddressViewModel(userRepository);
  }
}
