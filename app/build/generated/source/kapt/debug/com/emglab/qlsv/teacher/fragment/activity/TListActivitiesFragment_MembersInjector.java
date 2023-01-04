package com.emglab.qlsv.teacher.fragment.activity;

import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.common.AppExecutors;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListActivitiesFragment_MembersInjector
    implements MembersInjector<TListActivitiesFragment> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public TListActivitiesFragment_MembersInjector(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TListActivitiesFragment> create(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new TListActivitiesFragment_MembersInjector(
        appExecutorsProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TListActivitiesFragment instance) {
    injectAppExecutors(instance, appExecutorsProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectAppExecutors(
      TListActivitiesFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }

  public static void injectViewModelFactory(
      TListActivitiesFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
