package com.emglab.qlsv.ui.fragments.user;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LostPasswordFragment_MembersInjector
    implements MembersInjector<LostPasswordFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public LostPasswordFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<LostPasswordFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new LostPasswordFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(LostPasswordFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      LostPasswordFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
