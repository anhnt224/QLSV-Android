package com.emglab.qlsv.modules_teacher.contactParent;

import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentList2ViewModel_Factory implements Factory<StudentList2ViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  public StudentList2ViewModel_Factory(Provider<TeacherRepository> teacherRepositoryProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
  }

  @Override
  public StudentList2ViewModel get() {
    return provideInstance(teacherRepositoryProvider);
  }

  public static StudentList2ViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new StudentList2ViewModel(teacherRepositoryProvider.get());
  }

  public static StudentList2ViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new StudentList2ViewModel_Factory(teacherRepositoryProvider);
  }

  public static StudentList2ViewModel newStudentList2ViewModel(
      TeacherRepository teacherRepository) {
    return new StudentList2ViewModel(teacherRepository);
  }
}
