package com.emglab.qlsv.ui.viewmodels.motel;

import com.emglab.qlsv.repositories.MotelRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelInfoViewModel_Factory implements Factory<MotelInfoViewModel> {
  private final Provider<MotelRepository> motelRepositoryProvider;

  public MotelInfoViewModel_Factory(Provider<MotelRepository> motelRepositoryProvider) {
    this.motelRepositoryProvider = motelRepositoryProvider;
  }

  @Override
  public MotelInfoViewModel get() {
    return provideInstance(motelRepositoryProvider);
  }

  public static MotelInfoViewModel provideInstance(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new MotelInfoViewModel(motelRepositoryProvider.get());
  }

  public static MotelInfoViewModel_Factory create(
      Provider<MotelRepository> motelRepositoryProvider) {
    return new MotelInfoViewModel_Factory(motelRepositoryProvider);
  }

  public static MotelInfoViewModel newMotelInfoViewModel(MotelRepository motelRepository) {
    return new MotelInfoViewModel(motelRepository);
  }
}
