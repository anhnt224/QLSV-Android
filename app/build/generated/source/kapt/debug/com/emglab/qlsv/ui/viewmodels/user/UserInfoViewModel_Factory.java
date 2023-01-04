package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserInfoViewModel_Factory implements Factory<UserInfoViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public UserInfoViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserInfoViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static UserInfoViewModel provideInstance(Provider<UserRepository> userRepositoryProvider) {
    return new UserInfoViewModel(userRepositoryProvider.get());
  }

  public static UserInfoViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new UserInfoViewModel_Factory(userRepositoryProvider);
  }

  public static UserInfoViewModel newUserInfoViewModel(UserRepository userRepository) {
    return new UserInfoViewModel(userRepository);
  }
}
