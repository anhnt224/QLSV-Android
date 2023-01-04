package com.emglab.qlsv.ui.fragments.job;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplyJobFragment_MembersInjector implements MembersInjector<ApplyJobFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ApplyJobFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ApplyJobFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ApplyJobFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ApplyJobFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ApplyJobFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
