package com.emglab.qlsv.teacher.fragment;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TTutorFragment_MembersInjector implements MembersInjector<TTutorFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TTutorFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TTutorFragment> create(Provider<ViewModelFactory> factoryProvider) {
    return new TTutorFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TTutorFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TTutorFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
