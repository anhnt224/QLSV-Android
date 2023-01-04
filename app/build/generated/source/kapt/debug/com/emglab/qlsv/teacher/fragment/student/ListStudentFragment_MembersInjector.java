package com.emglab.qlsv.teacher.fragment.student;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListStudentFragment_MembersInjector
    implements MembersInjector<ListStudentFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public ListStudentFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<ListStudentFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new ListStudentFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(ListStudentFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(ListStudentFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
