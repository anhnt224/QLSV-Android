package com.emglab.qlsv.teacher.fragment.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TMotelInfoFragment_MembersInjector
    implements MembersInjector<TMotelInfoFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TMotelInfoFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TMotelInfoFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TMotelInfoFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TMotelInfoFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TMotelInfoFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
