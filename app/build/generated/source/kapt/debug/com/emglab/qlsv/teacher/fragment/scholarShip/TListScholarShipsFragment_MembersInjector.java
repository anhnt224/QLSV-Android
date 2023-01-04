package com.emglab.qlsv.teacher.fragment.scholarShip;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListScholarShipsFragment_MembersInjector
    implements MembersInjector<TListScholarShipsFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TListScholarShipsFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TListScholarShipsFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TListScholarShipsFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TListScholarShipsFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TListScholarShipsFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
