package com.emglab.qlsv.modules.searchMotel.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterToFindMotelFragment_MembersInjector
    implements MembersInjector<RegisterToFindMotelFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public RegisterToFindMotelFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<RegisterToFindMotelFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new RegisterToFindMotelFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(RegisterToFindMotelFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(RegisterToFindMotelFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
