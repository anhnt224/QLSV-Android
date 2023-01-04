package com.emglab.qlsv.ui.viewmodels.job;

import com.emglab.qlsv.repositories.JobRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListJobsViewModel_Factory implements Factory<ListJobsViewModel> {
  private final Provider<JobRepository> jobRepositoryProvider;

  public ListJobsViewModel_Factory(Provider<JobRepository> jobRepositoryProvider) {
    this.jobRepositoryProvider = jobRepositoryProvider;
  }

  @Override
  public ListJobsViewModel get() {
    return provideInstance(jobRepositoryProvider);
  }

  public static ListJobsViewModel provideInstance(Provider<JobRepository> jobRepositoryProvider) {
    return new ListJobsViewModel(jobRepositoryProvider.get());
  }

  public static ListJobsViewModel_Factory create(Provider<JobRepository> jobRepositoryProvider) {
    return new ListJobsViewModel_Factory(jobRepositoryProvider);
  }

  public static ListJobsViewModel newListJobsViewModel(JobRepository jobRepository) {
    return new ListJobsViewModel(jobRepository);
  }
}
