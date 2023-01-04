package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public LoginViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static LoginViewModel provideInstance(Provider<UserRepository> userRepositoryProvider) {
    return new LoginViewModel(userRepositoryProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new LoginViewModel_Factory(userRepositoryProvider);
  }

  public static LoginViewModel newLoginViewModel(UserRepository userRepository) {
    return new LoginViewModel(userRepository);
  }
}
