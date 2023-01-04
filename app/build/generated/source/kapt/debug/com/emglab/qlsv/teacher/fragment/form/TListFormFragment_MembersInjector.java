package com.emglab.qlsv.teacher.fragment.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListFormFragment_MembersInjector implements MembersInjector<TListFormFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TListFormFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TListFormFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TListFormFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TListFormFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TListFormFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
