package com.emglab.qlsv.ui.fragments;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Home2ViewModel_Factory implements Factory<Home2ViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  private final Provider<CriteriaRepository> criteriaRepositoryProvider;

  public Home2ViewModel_Factory(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
    this.criteriaRepositoryProvider = criteriaRepositoryProvider;
  }

  @Override
  public Home2ViewModel get() {
    return provideInstance(activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static Home2ViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new Home2ViewModel(activityRepositoryProvider.get(), criteriaRepositoryProvider.get());
  }

  public static Home2ViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new Home2ViewModel_Factory(activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static Home2ViewModel newHome2ViewModel(
      ActivityRepository activityRepository, CriteriaRepository criteriaRepository) {
    return new Home2ViewModel(activityRepository, criteriaRepository);
  }
}
