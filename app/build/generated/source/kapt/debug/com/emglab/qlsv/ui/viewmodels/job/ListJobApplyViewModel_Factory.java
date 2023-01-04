package com.emglab.qlsv.ui.viewmodels.job;

import com.emglab.qlsv.repositories.JobRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListJobApplyViewModel_Factory implements Factory<ListJobApplyViewModel> {
  private final Provider<JobRepository> jobRepositoryProvider;

  public ListJobApplyViewModel_Factory(Provider<JobRepository> jobRepositoryProvider) {
    this.jobRepositoryProvider = jobRepositoryProvider;
  }

  @Override
  public ListJobApplyViewModel get() {
    return provideInstance(jobRepositoryProvider);
  }

  public static ListJobApplyViewModel provideInstance(
      Provider<JobRepository> jobRepositoryProvider) {
    return new ListJobApplyViewModel(jobRepositoryProvider.get());
  }

  public static ListJobApplyViewModel_Factory create(
      Provider<JobRepository> jobRepositoryProvider) {
    return new ListJobApplyViewModel_Factory(jobRepositoryProvider);
  }

  public static ListJobApplyViewModel newListJobApplyViewModel(JobRepository jobRepository) {
    return new ListJobApplyViewModel(jobRepository);
  }
}
