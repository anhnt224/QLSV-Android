package com.emglab.qlsv.ui.fragments.running;

import com.emglab.qlsv.repositories.RunRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunViewModel_Factory implements Factory<RunViewModel> {
  private final Provider<RunRepository> runRepositoryProvider;

  public RunViewModel_Factory(Provider<RunRepository> runRepositoryProvider) {
    this.runRepositoryProvider = runRepositoryProvider;
  }

  @Override
  public RunViewModel get() {
    return provideInstance(runRepositoryProvider);
  }

  public static RunViewModel provideInstance(Provider<RunRepository> runRepositoryProvider) {
    return new RunViewModel(runRepositoryProvider.get());
  }

  public static RunViewModel_Factory create(Provider<RunRepository> runRepositoryProvider) {
    return new RunViewModel_Factory(runRepositoryProvider);
  }

  public static RunViewModel newRunViewModel(RunRepository runRepository) {
    return new RunViewModel(runRepository);
  }
}
