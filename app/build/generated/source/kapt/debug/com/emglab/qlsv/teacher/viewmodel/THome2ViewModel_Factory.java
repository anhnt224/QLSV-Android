package com.emglab.qlsv.teacher.viewmodel;

import com.emglab.qlsv.repositories.activity.ActivityRepository;
import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class THome2ViewModel_Factory implements Factory<THome2ViewModel> {
  private final Provider<ActivityRepository> activityRepositoryProvider;

  private final Provider<CriteriaRepository> criteriaRepositoryProvider;

  public THome2ViewModel_Factory(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    this.activityRepositoryProvider = activityRepositoryProvider;
    this.criteriaRepositoryProvider = criteriaRepositoryProvider;
  }

  @Override
  public THome2ViewModel get() {
    return provideInstance(activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static THome2ViewModel provideInstance(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new THome2ViewModel(activityRepositoryProvider.get(), criteriaRepositoryProvider.get());
  }

  public static THome2ViewModel_Factory create(
      Provider<ActivityRepository> activityRepositoryProvider,
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new THome2ViewModel_Factory(activityRepositoryProvider, criteriaRepositoryProvider);
  }

  public static THome2ViewModel newTHome2ViewModel(
      ActivityRepository activityRepository, CriteriaRepository criteriaRepository) {
    return new THome2ViewModel(activityRepository, criteriaRepository);
  }
}
