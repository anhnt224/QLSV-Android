package com.emglab.qlsv.teacher.viewmodel.student;

import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentInfoViewModel_Factory implements Factory<StudentInfoViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  public StudentInfoViewModel_Factory(Provider<TeacherRepository> teacherRepositoryProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
  }

  @Override
  public StudentInfoViewModel get() {
    return provideInstance(teacherRepositoryProvider);
  }

  public static StudentInfoViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new StudentInfoViewModel(teacherRepositoryProvider.get());
  }

  public static StudentInfoViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new StudentInfoViewModel_Factory(teacherRepositoryProvider);
  }

  public static StudentInfoViewModel newStudentInfoViewModel(TeacherRepository teacherRepository) {
    return new StudentInfoViewModel(teacherRepository);
  }
}
