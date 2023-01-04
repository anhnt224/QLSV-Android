package com.emglab.qlsv.modules.searchMotel.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationListFragment_MembersInjector
    implements MembersInjector<MotelRegistrationListFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public MotelRegistrationListFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<MotelRegistrationListFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new MotelRegistrationListFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(MotelRegistrationListFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(
      MotelRegistrationListFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
