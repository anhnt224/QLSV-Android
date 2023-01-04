package com.emglab.qlsv.teacher.viewmodel;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListNotificationsViewModel_Factory
    implements Factory<TListNotificationsViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TListNotificationsViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TListNotificationsViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TListNotificationsViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TListNotificationsViewModel(userRepositoryProvider.get());
  }

  public static TListNotificationsViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TListNotificationsViewModel_Factory(userRepositoryProvider);
  }

  public static TListNotificationsViewModel newTListNotificationsViewModel(
      UserRepository userRepository) {
    return new TListNotificationsViewModel(userRepository);
  }
}
