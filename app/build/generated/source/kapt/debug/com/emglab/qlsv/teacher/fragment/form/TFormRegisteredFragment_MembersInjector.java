package com.emglab.qlsv.teacher.fragment.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TFormRegisteredFragment_MembersInjector
    implements MembersInjector<TFormRegisteredFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TFormRegisteredFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TFormRegisteredFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TFormRegisteredFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TFormRegisteredFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TFormRegisteredFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
