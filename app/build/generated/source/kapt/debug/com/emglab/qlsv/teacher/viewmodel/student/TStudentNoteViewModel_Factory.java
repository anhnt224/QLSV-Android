package com.emglab.qlsv.teacher.viewmodel.student;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TStudentNoteViewModel_Factory implements Factory<TStudentNoteViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public TStudentNoteViewModel_Factory(
      Provider<TeacherRepository> teacherRepositoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public TStudentNoteViewModel get() {
    return provideInstance(teacherRepositoryProvider, sharedPrefsHelperProvider);
  }

  public static TStudentNoteViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TStudentNoteViewModel(
        teacherRepositoryProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static TStudentNoteViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TStudentNoteViewModel_Factory(teacherRepositoryProvider, sharedPrefsHelperProvider);
  }

  public static TStudentNoteViewModel newTStudentNoteViewModel(
      TeacherRepository teacherRepository, SharedPrefsHelper sharedPrefsHelper) {
    return new TStudentNoteViewModel(teacherRepository, sharedPrefsHelper);
  }
}
