package com.emglab.qlsv.ui.fragments.timetable;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TimeTableFragment_MembersInjector implements MembersInjector<TimeTableFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TimeTableFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TimeTableFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TimeTableFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TimeTableFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TimeTableFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
