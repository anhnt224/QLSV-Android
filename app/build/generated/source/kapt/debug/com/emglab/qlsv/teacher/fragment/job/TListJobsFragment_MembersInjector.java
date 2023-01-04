package com.emglab.qlsv.teacher.fragment.job;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListJobsFragment_MembersInjector implements MembersInjector<TListJobsFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TListJobsFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TListJobsFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TListJobsFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TListJobsFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TListJobsFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
