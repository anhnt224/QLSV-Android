package com.emglab.qlsv.teacher.fragment.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TEditFormFragment_MembersInjector implements MembersInjector<TEditFormFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TEditFormFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TEditFormFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TEditFormFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TEditFormFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TEditFormFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
