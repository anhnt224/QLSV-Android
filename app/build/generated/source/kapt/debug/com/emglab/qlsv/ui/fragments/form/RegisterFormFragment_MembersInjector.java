package com.emglab.qlsv.ui.fragments.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterFormFragment_MembersInjector
    implements MembersInjector<RegisterFormFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public RegisterFormFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<RegisterFormFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new RegisterFormFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(RegisterFormFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(RegisterFormFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
