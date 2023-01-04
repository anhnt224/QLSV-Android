package com.emglab.qlsv.ui.fragments.criteria;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrainingPointFragment_MembersInjector
    implements MembersInjector<TrainingPointFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TrainingPointFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TrainingPointFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TrainingPointFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TrainingPointFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TrainingPointFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
