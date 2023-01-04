package com.emglab.qlsv.ui.viewmodels.scholarShip;

import com.emglab.qlsv.repositories.ScholarShipRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListScholarShipsViewModel_Factory implements Factory<ListScholarShipsViewModel> {
  private final Provider<ScholarShipRepository> scholarShipRepositoryProvider;

  public ListScholarShipsViewModel_Factory(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    this.scholarShipRepositoryProvider = scholarShipRepositoryProvider;
  }

  @Override
  public ListScholarShipsViewModel get() {
    return provideInstance(scholarShipRepositoryProvider);
  }

  public static ListScholarShipsViewModel provideInstance(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new ListScholarShipsViewModel(scholarShipRepositoryProvider.get());
  }

  public static ListScholarShipsViewModel_Factory create(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new ListScholarShipsViewModel_Factory(scholarShipRepositoryProvider);
  }

  public static ListScholarShipsViewModel newListScholarShipsViewModel(
      ScholarShipRepository scholarShipRepository) {
    return new ListScholarShipsViewModel(scholarShipRepository);
  }
}
