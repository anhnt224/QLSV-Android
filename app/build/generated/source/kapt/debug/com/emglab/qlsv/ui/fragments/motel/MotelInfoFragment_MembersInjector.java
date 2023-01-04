package com.emglab.qlsv.ui.fragments.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelInfoFragment_MembersInjector implements MembersInjector<MotelInfoFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public MotelInfoFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<MotelInfoFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new MotelInfoFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(MotelInfoFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(MotelInfoFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
