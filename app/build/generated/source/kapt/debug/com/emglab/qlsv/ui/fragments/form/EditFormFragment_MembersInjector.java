package com.emglab.qlsv.ui.fragments.form;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EditFormFragment_MembersInjector implements MembersInjector<EditFormFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public EditFormFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<EditFormFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new EditFormFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(EditFormFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(EditFormFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
