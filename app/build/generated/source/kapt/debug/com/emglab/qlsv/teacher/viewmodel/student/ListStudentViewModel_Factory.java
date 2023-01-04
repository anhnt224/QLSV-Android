package com.emglab.qlsv.teacher.viewmodel.student;

import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListStudentViewModel_Factory implements Factory<ListStudentViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  public ListStudentViewModel_Factory(Provider<TeacherRepository> teacherRepositoryProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
  }

  @Override
  public ListStudentViewModel get() {
    return provideInstance(teacherRepositoryProvider);
  }

  public static ListStudentViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new ListStudentViewModel(teacherRepositoryProvider.get());
  }

  public static ListStudentViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new ListStudentViewModel_Factory(teacherRepositoryProvider);
  }

  public static ListStudentViewModel newListStudentViewModel(TeacherRepository teacherRepository) {
    return new ListStudentViewModel(teacherRepository);
  }
}
