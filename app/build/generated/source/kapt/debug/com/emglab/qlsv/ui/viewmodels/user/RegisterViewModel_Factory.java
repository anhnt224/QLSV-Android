package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public RegisterViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static RegisterViewModel provideInstance(Provider<UserRepository> userRepositoryProvider) {
    return new RegisterViewModel(userRepositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new RegisterViewModel_Factory(userRepositoryProvider);
  }

  public static RegisterViewModel newRegisterViewModel(UserRepository userRepository) {
    return new RegisterViewModel(userRepository);
  }
}
