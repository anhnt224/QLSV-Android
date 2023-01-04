package com.emglab.qlsv.ui.fragments.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListFormsFragment_MembersInjector implements MembersInjector<ListFormsFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListFormsFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListFormsFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListFormsFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListFormsFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListFormsFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
