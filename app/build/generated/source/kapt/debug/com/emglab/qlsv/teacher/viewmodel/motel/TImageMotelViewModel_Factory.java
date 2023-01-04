package com.emglab.qlsv.teacher.viewmodel.motel;

import com.emglab.qlsv.repositories.MotelRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TImageMotelViewModel_Factory implements Factory<TImageMotelViewModel> {
  private final Provider<MotelRepository> imageMotelRepositoryProvider;

  public TImageMotelViewModel_Factory(Provider<MotelRepository> imageMotelRepositoryProvider) {
    this.imageMotelRepositoryProvider = imageMotelRepositoryProvider;
  }

  @Override
  public TImageMotelViewModel get() {
    return provideInstance(imageMotelRepositoryProvider);
  }

  public static TImageMotelViewModel provideInstance(
      Provider<MotelRepository> imageMotelRepositoryProvider) {
    return new TImageMotelViewModel(imageMotelRepositoryProvider.get());
  }

  public static TImageMotelViewModel_Factory create(
      Provider<MotelRepository> imageMotelRepositoryProvider) {
    return new TImageMotelViewModel_Factory(imageMotelRepositoryProvider);
  }

  public static TImageMotelViewModel newTImageMotelViewModel(MotelRepository imageMotelRepository) {
    return new TImageMotelViewModel(imageMotelRepository);
  }
}
