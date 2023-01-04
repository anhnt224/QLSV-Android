package com.emglab.qlsv.ui.fragments.job;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MoreJobFragment_MembersInjector implements MembersInjector<MoreJobFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public MoreJobFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<MoreJobFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new MoreJobFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(MoreJobFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(MoreJobFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
