package com.emglab.qlsv.ui.fragments.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChooseReceiverAddressFragment_MembersInjector
    implements MembersInjector<ChooseReceiverAddressFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ChooseReceiverAddressFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ChooseReceiverAddressFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ChooseReceiverAddressFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ChooseReceiverAddressFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(
      ChooseReceiverAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
