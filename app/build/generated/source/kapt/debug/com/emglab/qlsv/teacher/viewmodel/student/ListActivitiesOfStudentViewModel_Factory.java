package com.emglab.qlsv.teacher.viewmodel.student;

import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListActivitiesOfStudentViewModel_Factory
    implements Factory<ListActivitiesOfStudentViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  public ListActivitiesOfStudentViewModel_Factory(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
  }

  @Override
  public ListActivitiesOfStudentViewModel get() {
    return provideInstance(teacherRepositoryProvider);
  }

  public static ListActivitiesOfStudentViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new ListActivitiesOfStudentViewModel(teacherRepositoryProvider.get());
  }

  public static ListActivitiesOfStudentViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider) {
    return new ListActivitiesOfStudentViewModel_Factory(teacherRepositoryProvider);
  }

  public static ListActivitiesOfStudentViewModel newListActivitiesOfStudentViewModel(
      TeacherRepository teacherRepository) {
    return new ListActivitiesOfStudentViewModel(teacherRepository);
  }
}
