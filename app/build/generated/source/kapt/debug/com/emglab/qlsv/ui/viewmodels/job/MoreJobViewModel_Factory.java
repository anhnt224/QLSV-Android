package com.emglab.qlsv.ui.viewmodels.job;

import com.emglab.qlsv.repositories.JobRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MoreJobViewModel_Factory implements Factory<MoreJobViewModel> {
  private final Provider<JobRepository> jobRepositoryProvider;

  public MoreJobViewModel_Factory(Provider<JobRepository> jobRepositoryProvider) {
    this.jobRepositoryProvider = jobRepositoryProvider;
  }

  @Override
  public MoreJobViewModel get() {
    return provideInstance(jobRepositoryProvider);
  }

  public static MoreJobViewModel provideInstance(Provider<JobRepository> jobRepositoryProvider) {
    return new MoreJobViewModel(jobRepositoryProvider.get());
  }

  public static MoreJobViewModel_Factory create(Provider<JobRepository> jobRepositoryProvider) {
    return new MoreJobViewModel_Factory(jobRepositoryProvider);
  }

  public static MoreJobViewModel newMoreJobViewModel(JobRepository jobRepository) {
    return new MoreJobViewModel(jobRepository);
  }
}
