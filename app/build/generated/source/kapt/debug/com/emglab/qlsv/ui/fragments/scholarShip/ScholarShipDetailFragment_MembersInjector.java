package com.emglab.qlsv.ui.fragments.scholarShip;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScholarShipDetailFragment_MembersInjector
    implements MembersInjector<ScholarShipDetailFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ScholarShipDetailFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ScholarShipDetailFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ScholarShipDetailFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ScholarShipDetailFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ScholarShipDetailFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
