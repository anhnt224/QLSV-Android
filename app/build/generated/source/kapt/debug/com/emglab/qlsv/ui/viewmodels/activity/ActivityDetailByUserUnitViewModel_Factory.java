package com.emglab.qlsv.ui.viewmodels.activity;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityDetailByUserUnitViewModel_Factory
    implements Factory<ActivityDetailByUserUnitViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  private final Provider<CriteriaRepository> criteriaRepositoryProvider;

  public ActivityDetailByUserUnitViewModel_Factory(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
    this.criteriaRepositoryProvider = criteriaRepositoryProvider;
  }

  @Override
  public ActivityDetailByUserUnitViewModel get() {
    return provideInstance(activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static ActivityDetailByUserUnitViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new ActivityDetailByUserUnitViewModel(
        activityRepositoryProvider.get(), criteriaRepositoryProvider.get());
  }

  public static ActivityDetailByUserUnitViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new ActivityDetailByUserUnitViewModel_Factory(
        activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static ActivityDetailByUserUnitViewModel newActivityDetailByUserUnitViewModel(
      ActivityRepository activityRepository, CriteriaRepository criteriaRepository) {
    return new ActivityDetailByUserUnitViewModel(activityRepository, criteriaRepository);
  }
}
