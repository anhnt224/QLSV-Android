package com.emglab.qlsv.modules.searchMotel.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationCompleteFragment_MembersInjector
    implements MembersInjector<MotelRegistrationCompleteFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public MotelRegistrationCompleteFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<MotelRegistrationCompleteFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new MotelRegistrationCompleteFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(MotelRegistrationCompleteFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(
      MotelRegistrationCompleteFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
