package com.emglab.qlsv.modules_teacher.contactParent;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentList2Fragment_MembersInjector
    implements MembersInjector<StudentList2Fragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public StudentList2Fragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<StudentList2Fragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new StudentList2Fragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(StudentList2Fragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(StudentList2Fragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
