package com.emglab.qlsv.modules.searchMotel.fragments;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListMotelResultsFragment_MembersInjector
    implements MembersInjector<ListMotelResultsFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListMotelResultsFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListMotelResultsFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListMotelResultsFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListMotelResultsFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListMotelResultsFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
