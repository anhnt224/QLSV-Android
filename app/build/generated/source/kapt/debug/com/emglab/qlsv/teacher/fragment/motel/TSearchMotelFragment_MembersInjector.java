package com.emglab.qlsv.teacher.fragment.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TSearchMotelFragment_MembersInjector
    implements MembersInjector<TSearchMotelFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TSearchMotelFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TSearchMotelFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TSearchMotelFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TSearchMotelFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TSearchMotelFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
