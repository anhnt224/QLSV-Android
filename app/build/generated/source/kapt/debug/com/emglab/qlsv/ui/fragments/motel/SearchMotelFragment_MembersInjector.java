package com.emglab.qlsv.ui.fragments.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchMotelFragment_MembersInjector
    implements MembersInjector<SearchMotelFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public SearchMotelFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<SearchMotelFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new SearchMotelFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(SearchMotelFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(SearchMotelFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
