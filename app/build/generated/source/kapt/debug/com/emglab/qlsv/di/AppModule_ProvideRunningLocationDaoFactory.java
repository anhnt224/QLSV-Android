package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.RunningLocationDao;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRunningLocationDaoFactory
    implements Factory<RunningLocationDao> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideRunningLocationDaoFactory(
      AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public RunningLocationDao get() {
    return provideInstance(module, dbProvider);
  }

  public static RunningLocationDao provideInstance(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideRunningLocationDao(module, dbProvider.get());
  }

  public static AppModule_ProvideRunningLocationDaoFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideRunningLocationDaoFactory(module, dbProvider);
  }

  public static RunningLocationDao proxyProvideRunningLocationDao(
      AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideRunningLocationDao(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
