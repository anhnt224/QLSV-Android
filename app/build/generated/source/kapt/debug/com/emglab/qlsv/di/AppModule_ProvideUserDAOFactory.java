package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.UserDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideUserDAOFactory implements Factory<UserDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideUserDAOFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public UserDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static UserDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideUserDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideUserDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideUserDAOFactory(module, dbProvider);
  }

  public static UserDAO proxyProvideUserDAO(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideUserDAO(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
