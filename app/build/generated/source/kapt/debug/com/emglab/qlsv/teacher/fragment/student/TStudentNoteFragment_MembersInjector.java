package com.emglab.qlsv.teacher.fragment.student;

import com.emglab.qlsv.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TStudentNoteFragment_MembersInjector
    implements MembersInjector<TStudentNoteFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  public TStudentNoteFragment_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<TStudentNoteFragment> create(
      Provider<ViewModelFactory> factoryProvider) {
    return new TStudentNoteFragment_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(TStudentNoteFragment instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static void injectFactory(TStudentNoteFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
