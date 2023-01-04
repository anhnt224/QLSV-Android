package com.emglab.qlsv.modules.searchMotel.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRegistrationInfoFragment_MembersInjector
    implements MembersInjector<MotelRegistrationInfoFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public MotelRegistrationInfoFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<MotelRegistrationInfoFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new MotelRegistrationInfoFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(MotelRegistrationInfoFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(
      MotelRegistrationInfoFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
