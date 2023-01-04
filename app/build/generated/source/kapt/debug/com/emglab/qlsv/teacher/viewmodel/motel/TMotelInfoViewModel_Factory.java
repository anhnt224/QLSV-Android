package com.emglab.qlsv.teacher.viewmodel.motel;

import com.emglab.qlsv.repositories.MotelRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TMotelInfoViewModel_Factory implements Factory<TMotelInfoViewModel> {
  private final Provider<MotelRepository> motelRepositoryProvider;

  public TMotelInfoViewModel_Factory(Provider<MotelRepository> motelRepositoryProvider) {
    this.motelRepositoryProvider = motelRepositoryProvider;
  }

  @Override
  public TMotelInfoViewModel get() {
    return provideInstance(motelRepositoryProvider);
  }

  public static TMotelInfoViewModel provideInstance(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new TMotelInfoViewModel(motelRepositoryProvider.get());
  }

  public static TMotelInfoViewModel_Factory create(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new TMotelInfoViewModel_Factory(motelRepositoryProvider);
  }

  public static TMotelInfoViewModel newTMotelInfoViewModel(MotelRepository motelRepository) {
    return new TMotelInfoViewModel(motelRepository);
  }
}
