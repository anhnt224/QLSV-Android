package com.emglab.qlsv.teacher.fragment.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListRegisterFragment_MembersInjector
    implements MembersInjector<TListRegisterFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TListRegisterFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TListRegisterFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TListRegisterFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TListRegisterFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TListRegisterFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
