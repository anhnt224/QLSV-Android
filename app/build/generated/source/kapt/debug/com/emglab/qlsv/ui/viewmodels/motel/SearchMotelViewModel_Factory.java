package com.emglab.qlsv.ui.viewmodels.motel;

import com.emglab.qlsv.repositories.MotelRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchMotelViewModel_Factory implements Factory<SearchMotelViewModel> {
  private final Provider<MotelRepository> motelRepositoryProvider;

  public SearchMotelViewModel_Factory(Provider<MotelRepository> motelRepositoryProvider) {
    this.motelRepositoryProvider = motelRepositoryProvider;
  }

  @Override
  public SearchMotelViewModel get() {
    return provideInstance(motelRepositoryProvider);
  }

  public static SearchMotelViewModel provideInstance(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new SearchMotelViewModel(motelRepositoryProvider.get());
  }

  public static SearchMotelViewModel_Factory create(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new SearchMotelViewModel_Factory(motelRepositoryProvider);
  }

  public static SearchMotelViewModel newSearchMotelViewModel(MotelRepository motelRepository) {
    return new SearchMotelViewModel(motelRepository);
  }
}
