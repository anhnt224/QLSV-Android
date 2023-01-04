package com.emglab.qlsv.ui.viewmodels.scholarShip;

import com.emglab.qlsv.repositories.ScholarShipRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScholarShipDetailViewModel_Factory
    implements Factory<ScholarShipDetailViewModel> {
  private final Provider<ScholarShipRepository> scholarShipRepositoryProvider;

  public ScholarShipDetailViewModel_Factory(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    this.scholarShipRepositoryProvider = scholarShipRepositoryProvider;
  }

  @Override
  public ScholarShipDetailViewModel get() {
    return provideInstance(scholarShipRepositoryProvider);
  }

  public static ScholarShipDetailViewModel provideInstance(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new ScholarShipDetailViewModel(scholarShipRepositoryProvider.get());
  }

  public static ScholarShipDetailViewModel_Factory create(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new ScholarShipDetailViewModel_Factory(scholarShipRepositoryProvider);
  }

  public static ScholarShipDetailViewModel newScholarShipDetailViewModel(
      ScholarShipRepository scholarShipRepository) {
    return new ScholarShipDetailViewModel(scholarShipRepository);
  }
}
