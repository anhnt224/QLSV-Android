package com.emglab.qlsv.ui.viewmodels.scholarShip;

import com.emglab.qlsv.repositories.ScholarShipRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListScholarShipAppliedViewModel_Factory
    implements Factory<ListScholarShipAppliedViewModel> {
  private final Provider<ScholarShipRepository> scholarShipRepositoryProvider;

  public ListScholarShipAppliedViewModel_Factory(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    this.scholarShipRepositoryProvider = scholarShipRepositoryProvider;
  }

  @Override
  public ListScholarShipAppliedViewModel get() {
    return provideInstance(scholarShipRepositoryProvider);
  }

  public static ListScholarShipAppliedViewModel provideInstance(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new ListScholarShipAppliedViewModel(scholarShipRepositoryProvider.get());
  }

  public static ListScholarShipAppliedViewModel_Factory create(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new ListScholarShipAppliedViewModel_Factory(scholarShipRepositoryProvider);
  }

  public static ListScholarShipAppliedViewModel newListScholarShipAppliedViewModel(
      ScholarShipRepository scholarShipRepository) {
    return new ListScholarShipAppliedViewModel(scholarShipRepository);
  }
}
