package com.emglab.qlsv.ui.fragments.activity;

import androidx.lifecycle.ViewModelProvider;
import com.emglab.qlsv.common.AppExecutors;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListActivityFragment_MembersInjector
    implements MembersInjector<ListActivityFragment> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ListActivityFragment_MembersInjector(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ListActivityFragment> create(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ListActivityFragment_MembersInjector(appExecutorsProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ListActivityFragment instance) {
    injectAppExecutors(instance, appExecutorsProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectAppExecutors(ListActivityFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }

  public static void injectViewModelFactory(
      ListActivityFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
