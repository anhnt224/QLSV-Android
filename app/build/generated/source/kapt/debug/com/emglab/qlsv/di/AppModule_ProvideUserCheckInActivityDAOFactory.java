package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.UserCheckInActivityDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideUserCheckInActivityDAOFactory
    implements Factory<UserCheckInActivityDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideUserCheckInActivityDAOFactory(
      AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public UserCheckInActivityDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static UserCheckInActivityDAO provideInstance(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideUserCheckInActivityDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideUserCheckInActivityDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideUserCheckInActivityDAOFactory(module, dbProvider);
  }

  public static UserCheckInActivityDAO proxyProvideUserCheckInActivityDAO(
      AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideUserCheckInActivityDAO(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
