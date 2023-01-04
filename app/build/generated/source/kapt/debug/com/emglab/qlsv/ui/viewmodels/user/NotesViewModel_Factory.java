package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.repositories.TeacherRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotesViewModel_Factory implements Factory<NotesViewModel> {
  private final Provider<TeacherRepository> teacherRepositoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public NotesViewModel_Factory(
      Provider<TeacherRepository> teacherRepositoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.teacherRepositoryProvider = teacherRepositoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public NotesViewModel get() {
    return provideInstance(teacherRepositoryProvider, sharedPrefsHelperProvider);
  }

  public static NotesViewModel provideInstance(
      Provider<TeacherRepository> teacherRepositoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new NotesViewModel(teacherRepositoryProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static NotesViewModel_Factory create(
      Provider<TeacherRepository> teacherRepositoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new NotesViewModel_Factory(teacherRepositoryProvider, sharedPrefsHelperProvider);
  }

  public static NotesViewModel newNotesViewModel(
      TeacherRepository teacherRepository, SharedPrefsHelper sharedPrefsHelper) {
    return new NotesViewModel(teacherRepository, sharedPrefsHelper);
  }
}
