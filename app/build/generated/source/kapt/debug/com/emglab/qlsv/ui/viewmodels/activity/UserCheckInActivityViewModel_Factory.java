package com.emglab.qlsv.ui.viewmodels.activity;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserCheckInActivityViewModel_Factory
    implements Factory<UserCheckInActivityViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  public UserCheckInActivityViewModel_Factory(
      Provider<ActivityRepository> activityRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
  }

  @Override
  public UserCheckInActivityViewModel get() {
    return provideInstance(activityRepositoryProvider);
  }

  public static UserCheckInActivityViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider) {
    return new UserCheckInActivityViewModel(activityRepositoryProvider.get());
  }

  public static UserCheckInActivityViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider) {
    return new UserCheckInActivityViewModel_Factory(activityRepositoryProvider);
  }

  public static UserCheckInActivityViewModel newUserCheckInActivityViewModel(
      ActivityRepository activityRepository) {
    return new UserCheckInActivityViewModel(activityRepository);
  }
}
