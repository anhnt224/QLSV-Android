package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CheckOTPLostPasswordViewModel_Factory
    implements Factory<CheckOTPLostPasswordViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public CheckOTPLostPasswordViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public CheckOTPLostPasswordViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static CheckOTPLostPasswordViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new CheckOTPLostPasswordViewModel(userRepositoryProvider.get());
  }

  public static CheckOTPLostPasswordViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new CheckOTPLostPasswordViewModel_Factory(userRepositoryProvider);
  }

  public static CheckOTPLostPasswordViewModel newCheckOTPLostPasswordViewModel(
      UserRepository userRepository) {
    return new CheckOTPLostPasswordViewModel(userRepository);
  }
}
