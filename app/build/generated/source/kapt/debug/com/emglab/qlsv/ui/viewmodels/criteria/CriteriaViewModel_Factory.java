package com.emglab.qlsv.ui.viewmodels.criteria;

import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CriteriaViewModel_Factory implements Factory<CriteriaViewModel> {
  private final Provider<CriteriaRepository> criteriaRepositoryProvider;

  public CriteriaViewModel_Factory(Provider<CriteriaRepository> criteriaRepositoryProvider) {
    this.criteriaRepositoryProvider = criteriaRepositoryProvider;
  }

  @Override
  public CriteriaViewModel get() {
    return provideInstance(criteriaRepositoryProvider);
  }

  public static CriteriaViewModel provideInstance(
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new CriteriaViewModel(criteriaRepositoryProvider.get());
  }

  public static CriteriaViewModel_Factory create(
      Provider<CriteriaRepository> criteriaRepositoryProvider) {
    return new CriteriaViewModel_Factory(criteriaRepositoryProvider);
  }

  public static CriteriaViewModel newCriteriaViewModel(CriteriaRepository criteriaRepository) {
    return new CriteriaViewModel(criteriaRepository);
  }
}
