package com.emglab.qlsv.ui.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TutorFragment_MembersInjector implements MembersInjector<TutorFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TutorFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TutorFragment> create(Provider<ViewModelFactory> factoryProvider) {
    return new TutorFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TutorFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TutorFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
