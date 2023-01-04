package com.emglab.qlsv.teacher.viewmodel.motel;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListAddressViewModel_Factory implements Factory<TListAddressViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TListAddressViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TListAddressViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TListAddressViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TListAddressViewModel(userRepositoryProvider.get());
  }

  public static TListAddressViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TListAddressViewModel_Factory(userRepositoryProvider);
  }

  public static TListAddressViewModel newTListAddressViewModel(UserRepository userRepository) {
    return new TListAddressViewModel(userRepository);
  }
}
