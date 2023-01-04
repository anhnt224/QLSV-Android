package com.emglab.qlsv.ui.fragments.job;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListJobApplyFragment_MembersInjector
    implements MembersInjector<ListJobApplyFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListJobApplyFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListJobApplyFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListJobApplyFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListJobApplyFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListJobApplyFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
