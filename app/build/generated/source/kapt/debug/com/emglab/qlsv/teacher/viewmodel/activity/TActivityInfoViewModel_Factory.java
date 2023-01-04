package com.emglab.qlsv.teacher.viewmodel.activity;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TActivityInfoViewModel_Factory implements Factory<TActivityInfoViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  private final Provider<CriteriaRepository> criteriaRepositoryProvider;

  public TActivityInfoViewModel_Factory(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
    this.criteriaRepositoryProvider = criteriaRepositoryProvider;
  }

  @Override
  public TActivityInfoViewModel get() {
    return provideInstance(activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static TActivityInfoViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new TActivityInfoViewModel(
        activityRepositoryProvider.get(), criteriaRepositoryProvider.get());
  }

  public static TActivityInfoViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new TActivityInfoViewModel_Factory(
        activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static TActivityInfoViewModel newTActivityInfoViewModel(
      ActivityRepository activityRepository, CriteriaRepository criteriaRepository) {
    return new TActivityInfoViewModel(activityRepository, criteriaRepository);
  }
}
