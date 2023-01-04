package com.emglab.qlsv.teacher.fragment.job;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TMoreJobFragment_MembersInjector implements MembersInjector<TMoreJobFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TMoreJobFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TMoreJobFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TMoreJobFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TMoreJobFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TMoreJobFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
