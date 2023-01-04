package com.emglab.qlsv.teacher.fragment.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListFormRegisteredFragment_MembersInjector
    implements MembersInjector<TListFormRegisteredFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TListFormRegisteredFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TListFormRegisteredFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TListFormRegisteredFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TListFormRegisteredFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TListFormRegisteredFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
