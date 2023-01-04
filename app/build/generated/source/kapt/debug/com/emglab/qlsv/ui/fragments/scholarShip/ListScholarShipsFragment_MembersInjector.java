package com.emglab.qlsv.ui.fragments.scholarShip;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListScholarShipsFragment_MembersInjector
    implements MembersInjector<ListScholarShipsFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListScholarShipsFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListScholarShipsFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListScholarShipsFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListScholarShipsFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListScholarShipsFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
