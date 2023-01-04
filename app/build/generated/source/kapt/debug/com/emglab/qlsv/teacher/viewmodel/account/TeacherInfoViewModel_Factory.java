package com.emglab.qlsv.teacher.viewmodel.account;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherInfoViewModel_Factory implements Factory<TeacherInfoViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TeacherInfoViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TeacherInfoViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TeacherInfoViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TeacherInfoViewModel(userRepositoryProvider.get());
  }

  public static TeacherInfoViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TeacherInfoViewModel_Factory(userRepositoryProvider);
  }

  public static TeacherInfoViewModel newTeacherInfoViewModel(UserRepository userRepository) {
    return new TeacherInfoViewModel(userRepository);
  }
}
