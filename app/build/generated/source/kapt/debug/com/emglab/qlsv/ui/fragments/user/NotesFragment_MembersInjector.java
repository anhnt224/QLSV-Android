package com.emglab.qlsv.ui.fragments.user;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotesFragment_MembersInjector implements MembersInjector<NotesFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public NotesFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<NotesFragment> create(Provider<ViewModelFactory> factoryProvider) {
    return new NotesFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(NotesFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(NotesFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
