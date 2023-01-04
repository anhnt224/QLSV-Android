package com.emglab.qlsv.teacher.viewmodel.scholarShip;

import com.emglab.qlsv.repositories.ScholarShipRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListScholarShipsViewModel_Factory
    implements Factory<TListScholarShipsViewModel> {
  private final Provider<ScholarShipRepository> scholarShipRepositoryProvider;

  public TListScholarShipsViewModel_Factory(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    this.scholarShipRepositoryProvider = scholarShipRepositoryProvider;
  }

  @Override
  public TListScholarShipsViewModel get() {
    return provideInstance(scholarShipRepositoryProvider);
  }

  public static TListScholarShipsViewModel provideInstance(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new TListScholarShipsViewModel(scholarShipRepositoryProvider.get());
  }

  public static TListScholarShipsViewModel_Factory create(
      Provider<ScholarShipRepository> scholarShipRepositoryProvider) {
    return new TListScholarShipsViewModel_Factory(scholarShipRepositoryProvider);
  }

  public static TListScholarShipsViewModel newTListScholarShipsViewModel(
      ScholarShipRepository scholarShipRepository) {
    return new TListScholarShipsViewModel(scholarShipRepository);
  }
}
