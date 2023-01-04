package com.emglab.qlsv.teacher.fragment.student;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentInfoFragment_MembersInjector
    implements MembersInjector<StudentInfoFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public StudentInfoFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<StudentInfoFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new StudentInfoFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(StudentInfoFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(StudentInfoFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
