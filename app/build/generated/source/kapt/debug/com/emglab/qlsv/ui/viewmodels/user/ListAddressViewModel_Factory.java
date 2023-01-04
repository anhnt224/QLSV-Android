package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListAddressViewModel_Factory implements Factory<ListAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public ListAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ListAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static ListAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new ListAddressViewModel(userRepositoryProvider.get());
  }

  public static ListAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ListAddressViewModel_Factory(userRepositoryProvider);
  }

  public static ListAddressViewModel newListAddressViewModel(UserRepository userRepository) {
    return new ListAddressViewModel(userRepository);
  }
}
