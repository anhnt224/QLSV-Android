package com.emglab.qlsv.ui.viewmodels.activity;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListActivityViewModel_Factory implements Factory<ListActivityViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  public ListActivityViewModel_Factory(Provider<ActivityRepository> activityRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
  }

  @Override
  public ListActivityViewModel get() {
    return provideInstance(activityRepositoryProvider);
  }

  public static ListActivityViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider) {
    return new ListActivityViewModel(activityRepositoryProvider.get());
  }

  public static ListActivityViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider) {
    return new ListActivityViewModel_Factory(activityRepositoryProvider);
  }

  public static ListActivityViewModel newListActivityViewModel(
      ActivityRepository activityRepository) {
    return new ListActivityViewModel(activityRepository);
  }
}
