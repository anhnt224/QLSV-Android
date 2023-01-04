package com.emglab.qlsv.ui.viewmodels.user;

import com.emglab.qlsv.repositories.user.UserRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MessageListViewModel_Factory implements Factory<MessageListViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public MessageListViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public MessageListViewModel get() {
    return provideInstance(userRepositoryProvider);
  }

  public static MessageListViewModel provideInstance(
      Provider<UserRepository> userRepositoryProvider) {
    return new MessageListViewModel(userRepositoryProvider.get());
  }

  public static MessageListViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new MessageListViewModel_Factory(userRepositoryProvider);
  }

  public static MessageListViewModel newMessageListViewModel(UserRepository userRepository) {
    return new MessageListViewModel(userRepository);
  }
}
