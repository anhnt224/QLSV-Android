package com.emglab.qlsv.ui.fragments.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListRegisterFragment_MembersInjector
    implements MembersInjector<ListRegisterFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListRegisterFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListRegisterFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListRegisterFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListRegisterFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListRegisterFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
