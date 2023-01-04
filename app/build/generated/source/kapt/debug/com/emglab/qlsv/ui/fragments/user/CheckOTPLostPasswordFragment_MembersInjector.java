package com.emglab.qlsv.ui.fragments.user;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CheckOTPLostPasswordFragment_MembersInjector
    implements MembersInjector<CheckOTPLostPasswordFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public CheckOTPLostPasswordFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CheckOTPLostPasswordFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new CheckOTPLostPasswordFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CheckOTPLostPasswordFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CheckOTPLostPasswordFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
