package com.emglab.qlsv.teacher.viewmodel.motel;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TAddMotelInfoViewModel_Factory implements Factory<TAddMotelInfoViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public TAddMotelInfoViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TAddMotelInfoViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static TAddMotelInfoViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new TAddMotelInfoViewModel(userRepositoryProvider.get());
  }

  public static TAddMotelInfoViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new TAddMotelInfoViewModel_Factory(userRepositoryProvider);
  }

  public static TAddMotelInfoViewModel newTAddMotelInfoViewModel(UserRepository userRepository) {
    return new TAddMotelInfoViewModel(userRepository);
  }
}
