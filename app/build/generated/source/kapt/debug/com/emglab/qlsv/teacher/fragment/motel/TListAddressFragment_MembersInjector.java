package com.emglab.qlsv.teacher.fragment.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListAddressFragment_MembersInjector
    implements MembersInjector<TListAddressFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TListAddressFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TListAddressFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TListAddressFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TListAddressFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TListAddressFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
