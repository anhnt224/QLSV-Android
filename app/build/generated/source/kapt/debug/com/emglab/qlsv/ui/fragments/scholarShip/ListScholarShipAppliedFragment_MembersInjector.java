package com.emglab.qlsv.ui.fragments.scholarShip;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListScholarShipAppliedFragment_MembersInjector
    implements MembersInjector<ListScholarShipAppliedFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListScholarShipAppliedFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListScholarShipAppliedFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListScholarShipAppliedFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListScholarShipAppliedFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(
      ListScholarShipAppliedFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
