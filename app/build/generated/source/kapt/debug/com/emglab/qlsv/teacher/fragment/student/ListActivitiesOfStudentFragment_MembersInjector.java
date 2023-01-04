package com.emglab.qlsv.teacher.fragment.student;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListActivitiesOfStudentFragment_MembersInjector
    implements MembersInjector<ListActivitiesOfStudentFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public ListActivitiesOfStudentFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider, Provider<AppExecutors> appExecutorsProvider) {
    this.factoryProvider = factoryProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  public static MembersInjector<ListActivitiesOfStudentFragment> create(
      Provider<ViewModelFactory> factoryProvider, Provider<AppExecutors> appExecutorsProvider) {
    return new ListActivitiesOfStudentFragment_MembersInjector(
        factoryProvider, appExecutorsProvider);
  }

  @Override
  public void injectMembers(ListActivitiesOfStudentFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectAppExecutors(instance, appExecutorsProvider.get());
  }

  public static void injectFactory(
      ListActivitiesOfStudentFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectAppExecutors(
      ListActivitiesOfStudentFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }
}
