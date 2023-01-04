package com.emglab.qlsv.teacher.viewmodel.job;

import com.emglab.qlsv.repositories.JobRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListJobsViewModel_Factory implements Factory<TListJobsViewModel> {
  private final Provider<JobRepository> jobRepositoryProvider;

  public TListJobsViewModel_Factory(Provider<JobRepository> jobRepositoryProvider) {
    this.jobRepositoryProvider = jobRepositoryProvider;
  }

  @Override
  public TListJobsViewModel get() {
    return provideInstance(jobRepositoryProvider);
  }

  public static TListJobsViewModel provideInstance(Provider<JobRepository> jobRepositoryProvider) {
    return new TListJobsViewModel(jobRepositoryProvider.get());
  }

  public static TListJobsViewModel_Factory create(Provider<JobRepository> jobRepositoryProvider) {
    return new TListJobsViewModel_Factory(jobRepositoryProvider);
  }

  public static TListJobsViewModel newTListJobsViewModel(JobRepository jobRepository) {
    return new TListJobsViewModel(jobRepository);
  }
}
