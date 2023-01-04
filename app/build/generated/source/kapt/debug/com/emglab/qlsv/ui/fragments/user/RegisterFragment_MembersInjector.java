package com.emglab.qlsv.ui.fragments.user;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterFragment_MembersInjector implements MembersInjector<RegisterFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public RegisterFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<RegisterFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new RegisterFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(RegisterFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      RegisterFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
