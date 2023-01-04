package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddNewAddressViewModel_Factory implements Factory<AddNewAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public AddNewAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public AddNewAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static AddNewAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new AddNewAddressViewModel(userRepositoryProvider.get());
  }

  public static AddNewAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new AddNewAddressViewModel_Factory(userRepositoryProvider);
  }

  public static AddNewAddressViewModel newAddNewAddressViewModel(UserRepository userRepository) {
    return new AddNewAddressViewModel(userRepository);
  }
}
