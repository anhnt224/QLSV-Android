package com.emglab.qlsv.teacher.fragment.student;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherMarkFragment_MembersInjector
    implements MembersInjector<TeacherMarkFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TeacherMarkFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TeacherMarkFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TeacherMarkFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TeacherMarkFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TeacherMarkFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
