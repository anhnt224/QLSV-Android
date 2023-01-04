package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LostPasswordViewModel_Factory implements Factory<LostPasswordViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public LostPasswordViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public LostPasswordViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static LostPasswordViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new LostPasswordViewModel(userRepositoryProvider.get());
  }

  public static LostPasswordViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new LostPasswordViewModel_Factory(userRepositoryProvider);
  }

  public static LostPasswordViewModel newLostPasswordViewModel(UserRepository userRepository) {
    return new LostPasswordViewModel(userRepository);
  }
}
