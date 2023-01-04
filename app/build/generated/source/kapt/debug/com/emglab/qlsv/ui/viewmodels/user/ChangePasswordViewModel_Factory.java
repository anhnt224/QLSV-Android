package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChangePasswordViewModel_Factory implements Factory<ChangePasswordViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public ChangePasswordViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ChangePasswordViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static ChangePasswordViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new ChangePasswordViewModel(userRepositoryProvider.get());
  }

  public static ChangePasswordViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ChangePasswordViewModel_Factory(userRepositoryProvider);
  }

  public static ChangePasswordViewModel newChangePasswordViewModel(UserRepository userRepository) {
    return new ChangePasswordViewModel(userRepository);
  }
}
