package com.emglab.qlsv.teacher.viewmodel.account;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TChangePasswordViewModel_Factory implements Factory<TChangePasswordViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TChangePasswordViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TChangePasswordViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TChangePasswordViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TChangePasswordViewModel(userRepositoryProvider.get());
  }

  public static TChangePasswordViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TChangePasswordViewModel_Factory(userRepositoryProvider);
  }

  public static TChangePasswordViewModel newTChangePasswordViewModel(
      UserRepository userRepository) {
    return new TChangePasswordViewModel(userRepository);
  }
}
