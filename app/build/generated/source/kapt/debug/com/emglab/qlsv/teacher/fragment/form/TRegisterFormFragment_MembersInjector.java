package com.emglab.qlsv.teacher.fragment.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TRegisterFormFragment_MembersInjector
    implements MembersInjector<TRegisterFormFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TRegisterFormFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TRegisterFormFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TRegisterFormFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TRegisterFormFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TRegisterFormFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
