package com.emglab.qlsv.ui.fragments.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FormRegisteredDetailFragment_MembersInjector
    implements MembersInjector<FormRegisteredDetailFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public FormRegisteredDetailFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<FormRegisteredDetailFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new FormRegisteredDetailFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(FormRegisteredDetailFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(
      FormRegisteredDetailFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
