package com.emglab.qlsv.ui.viewmodels.running;

import com.emglab.qlsv.dao.RunDataDao;
import com.emglab.qlsv.repositories.RunRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunDashboardViewModel_Factory implements Factory<RunDashboardViewModel> {
  private final Provider<RunRepository> runRepositoryProvider;

  private final Provider<RunDataDao> runDataDaoProvider;

  public RunDashboardViewModel_Factory(
      Provider<RunRepository> runRepositoryProvider, Provider<RunDataDao> runDataDaoProvider) {
    this.runRepositoryProvider = runRepositoryProvider;
    this.runDataDaoProvider = runDataDaoProvider;
  }

  @Override
  public RunDashboardViewModel get() {
    return provideInstance(runRepositoryProvider, runDataDaoProvider);
  }

  public static RunDashboardViewModel provideInstance(
      Provider<RunRepository> runRepositoryProvider, Provider<RunDataDao> runDataDaoProvider) {
    return new RunDashboardViewModel(runRepositoryProvider.get(), runDataDaoProvider.get());
  }

  public static RunDashboardViewModel_Factory create(
      Provider<RunRepository> runRepositoryProvider, Provider<RunDataDao> runDataDaoProvider) {
    return new RunDashboardViewModel_Factory(runRepositoryProvider, runDataDaoProvider);
  }

  public static RunDashboardViewModel newRunDashboardViewModel(
      RunRepository runRepository, RunDataDao runDataDao) {
    return new RunDashboardViewModel(runRepository, runDataDao);
  }
}
