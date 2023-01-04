package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.RunDataDao;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRunResultFactory implements Factory<RunDataDao> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideRunResultFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public RunDataDao get() {
    return provideInstance(module, dbProvider);
  }

  public static RunDataDao provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideRunResult(module, dbProvider.get());
  }

  public static AppModule_ProvideRunResultFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideRunResultFactory(module, dbProvider);
  }

  public static RunDataDao proxyProvideRunResult(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideRunResult(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
