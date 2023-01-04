package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.RunningWayDao;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRunningWayDaoFactory implements Factory<RunningWayDao> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideRunningWayDaoFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public RunningWayDao get() {
    return provideInstance(module, dbProvider);
  }

  public static RunningWayDao provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideRunningWayDao(module, dbProvider.get());
  }

  public static AppModule_ProvideRunningWayDaoFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideRunningWayDaoFactory(module, dbProvider);
  }

  public static RunningWayDao proxyProvideRunningWayDao(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideRunningWayDao(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
