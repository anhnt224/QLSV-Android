package com.emglab.qlsv.ui.fragments.criteria;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CriteriaFragment_MembersInjector implements MembersInjector<CriteriaFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public CriteriaFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<CriteriaFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new CriteriaFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(CriteriaFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(CriteriaFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
