package com.emglab.qlsv.ui.fragments.user;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListAddressFragment_MembersInjector
    implements MembersInjector<ListAddressFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListAddressFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListAddressFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListAddressFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListAddressFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
