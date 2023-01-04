package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScheduleViewModel_Factory implements Factory<ScheduleViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public ScheduleViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ScheduleViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static ScheduleViewModel provideInstance(Provider<UserRepository> userRepositoryProvider) {
    return new ScheduleViewModel(userRepositoryProvider.get());
  }

  public static ScheduleViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new ScheduleViewModel_Factory(userRepositoryProvider);
  }

  public static ScheduleViewModel newScheduleViewModel(UserRepository userRepository) {
    return new ScheduleViewModel(userRepository);
  }
}
