package com.emglab.qlsv.ui.viewmodels.job;

import com.emglab.qlsv.repositories.JobRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplyJobViewModel_Factory implements Factory<ApplyJobViewModel> {
  private final Provider<JobRepository> jobRepositoryProvider;

  public ApplyJobViewModel_Factory(Provider<JobRepository> jobRepositoryProvider) {
    this.jobRepositoryProvider = jobRepositoryProvider;
  }

  @Override
  public ApplyJobViewModel get() {
    return provideInstance(jobRepositoryProvider);
  }

  public static ApplyJobViewModel provideInstance(Provider<JobRepository> jobRepositoryProvider) {
    return new ApplyJobViewModel(jobRepositoryProvider.get());
  }

  public static ApplyJobViewModel_Factory create(Provider<JobRepository> jobRepositoryProvider) {
    return new ApplyJobViewModel_Factory(jobRepositoryProvider);
  }

  public static ApplyJobViewModel newApplyJobViewModel(JobRepository jobRepository) {
    return new ApplyJobViewModel(jobRepository);
  }
}
