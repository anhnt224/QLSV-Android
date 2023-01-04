package com.emglab.qlsv.teacher.viewmodel.activity;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListActivitiesViewModel_Factory implements Factory<TListActivitiesViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  public TListActivitiesViewModel_Factory(Provider<ActivityRepository> activityRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
  }

  @Override
  public TListActivitiesViewModel get() {
    return provideInstance(activityRepositoryProvider);
  }

  public static TListActivitiesViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider) {
    return new TListActivitiesViewModel(activityRepositoryProvider.get());
  }

  public static TListActivitiesViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider) {
    return new TListActivitiesViewModel_Factory(activityRepositoryProvider);
  }

  public static TListActivitiesViewModel newTListActivitiesViewModel(
      ActivityRepository activityRepository) {
    return new TListActivitiesViewModel(activityRepository);
  }
}
