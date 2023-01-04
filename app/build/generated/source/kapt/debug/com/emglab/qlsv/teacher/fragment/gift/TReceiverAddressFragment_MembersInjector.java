package com.emglab.qlsv.teacher.fragment.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TReceiverAddressFragment_MembersInjector
    implements MembersInjector<TReceiverAddressFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TReceiverAddressFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TReceiverAddressFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TReceiverAddressFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TReceiverAddressFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TReceiverAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
