package com.emglab.qlsv.ui.fragments.job;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListJobsFragment_MembersInjector implements MembersInjector<ListJobsFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListJobsFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListJobsFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListJobsFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListJobsFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListJobsFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
