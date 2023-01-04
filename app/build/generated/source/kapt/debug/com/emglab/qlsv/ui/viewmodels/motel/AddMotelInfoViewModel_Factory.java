package com.emglab.qlsv.ui.viewmodels.motel;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddMotelInfoViewModel_Factory implements Factory<AddMotelInfoViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public AddMotelInfoViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public AddMotelInfoViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static AddMotelInfoViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new AddMotelInfoViewModel(userRepositoryProvider.get());
  }

  public static AddMotelInfoViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new AddMotelInfoViewModel_Factory(userRepositoryProvider);
  }

  public static AddMotelInfoViewModel newAddMotelInfoViewModel(UserRepository userRepository) {
    return new AddMotelInfoViewModel(userRepository);
  }
}
