package com.emglab.qlsv.teacher.viewmodel.motel;

import com.emglab.qlsv.repositories.MotelRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TSearchMotelViewModel_Factory implements Factory<TSearchMotelViewModel> {
  private final Provider<MotelRepository> motelRepositoryProvider;

  public TSearchMotelViewModel_Factory(Provider<MotelRepository> motelRepositoryProvider) {
    this.motelRepositoryProvider = motelRepositoryProvider;
  }

  @Override
  public TSearchMotelViewModel get() {
    return provideInstance(motelRepositoryProvider);
  }

  public static TSearchMotelViewModel provideInstance(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new TSearchMotelViewModel(motelRepositoryProvider.get());
  }

  public static TSearchMotelViewModel_Factory create(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new TSearchMotelViewModel_Factory(motelRepositoryProvider);
  }

  public static TSearchMotelViewModel newTSearchMotelViewModel(MotelRepository motelRepository) {
    return new TSearchMotelViewModel(motelRepository);
  }
}
