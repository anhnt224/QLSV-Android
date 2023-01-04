package com.emglab.qlsv.ui.viewmodels.criteria;

import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrainingPointViewModel_Factory implements Factory<TrainingPointViewModel> {
  private final Provider<CriteriaRepository> criteriaRepositoryProvider;

  public TrainingPointViewModel_Factory(Provider<CriteriaRepository> criteriaRepositoryProvider) {
    this.criteriaRepositoryProvider = criteriaRepositoryProvider;
  }

  @Override
  public TrainingPointViewModel get() {
    return provideInstance(criteriaRepositoryProvider);
  }

  public static TrainingPointViewModel provideInstance(
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new TrainingPointViewModel(criteriaRepositoryProvider.get());
  }

  public static TrainingPointViewModel_Factory create(
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new TrainingPointViewModel_Factory(criteriaRepositoryProvider);
  }

  public static TrainingPointViewModel newTrainingPointViewModel(
      CriteriaRepository criteriaRepository) {
    return new TrainingPointViewModel(criteriaRepository);
  }
}
