package com.emglab.qlsv.teacher.viewmodel.student;

import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherMarkViewModel_Factory implements Factory<TeacherMarkViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  public TeacherMarkViewModel_Factory(Provider<TeacherRepository> teacherRepositoryProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
  }

  @Override
  public TeacherMarkViewModel get() {
    return provideInstance(teacherRepositoryProvider);
  }

  public static TeacherMarkViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new TeacherMarkViewModel(teacherRepositoryProvider.get());
  }

  public static TeacherMarkViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new TeacherMarkViewModel_Factory(teacherRepositoryProvider);
  }

  public static TeacherMarkViewModel newTeacherMarkViewModel(TeacherRepository teacherRepository) {
    return new TeacherMarkViewModel(teacherRepository);
  }
}
