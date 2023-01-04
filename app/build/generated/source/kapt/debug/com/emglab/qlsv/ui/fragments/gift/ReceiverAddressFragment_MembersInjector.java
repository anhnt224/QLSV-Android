package com.emglab.qlsv.ui.fragments.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiverAddressFragment_MembersInjector
    implements MembersInjector<ReceiverAddressFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ReceiverAddressFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ReceiverAddressFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ReceiverAddressFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ReceiverAddressFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ReceiverAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
