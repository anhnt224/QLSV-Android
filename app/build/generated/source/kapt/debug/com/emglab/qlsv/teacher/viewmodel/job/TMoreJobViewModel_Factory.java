package com.emglab.qlsv.teacher.viewmodel.job;

import com.emglab.qlsv.repositories.JobRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TMoreJobViewModel_Factory implements Factory<TMoreJobViewModel> {
  private final Provider<JobRepository> jobRepositoryProvider;

  public TMoreJobViewModel_Factory(Provider<JobRepository> jobRepositoryProvider) {
    this.jobRepositoryProvider = jobRepositoryProvider;
  }

  @Override
  public TMoreJobViewModel get() {
    return provideInstance(jobRepositoryProvider);
  }

  public static TMoreJobViewModel provideInstance(Provider<JobRepository> jobRepositoryProvider) {
    return new TMoreJobViewModel(jobRepositoryProvider.get());
  }

  public static TMoreJobViewModel_Factory create(Provider<JobRepository> jobRepositoryProvider) {
    return new TMoreJobViewModel_Factory(jobRepositoryProvider);
  }

  public static TMoreJobViewModel newTMoreJobViewModel(JobRepository jobRepository) {
    return new TMoreJobViewModel(jobRepository);
  }
}
