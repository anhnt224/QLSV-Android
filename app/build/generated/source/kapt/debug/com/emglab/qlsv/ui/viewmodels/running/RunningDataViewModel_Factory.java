package com.emglab.qlsv.ui.viewmodels.running;

import com.emglab.qlsv.repositories.RunRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunningDataViewModel_Factory implements Factory<RunningDataViewModel> {
  private final Provider<RunRepository> runRepositoryProvider;

  public RunningDataViewModel_Factory(Provider<RunRepository> runRepositoryProvider) {
    this.runRepositoryProvider = runRepositoryProvider;
  }

  @Override
  public RunningDataViewModel get() {
    return provideInstance(runRepositoryProvider);
  }

  public static RunningDataViewModel provideInstance(
      Provider<RunRepository> runRepositoryProvider) {
    return new RunningDataViewModel(runRepositoryProvider.get());
  }

  public static RunningDataViewModel_Factory create(Provider<RunRepository> runRepositoryProvider) {
    return new RunningDataViewModel_Factory(runRepositoryProvider);
  }

  public static RunningDataViewModel newRunningDataViewModel(RunRepository runRepository) {
    return new RunningDataViewModel(runRepository);
  }
}
