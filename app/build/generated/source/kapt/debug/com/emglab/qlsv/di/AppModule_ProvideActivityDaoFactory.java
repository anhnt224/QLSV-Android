package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.ActivityDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideActivityDaoFactory implements Factory<ActivityDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideActivityDaoFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public ActivityDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static ActivityDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideActivityDao(module, dbProvider.get());
  }

  public static AppModule_ProvideActivityDaoFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideActivityDaoFactory(module, dbProvider);
  }

  public static ActivityDAO proxyProvideActivityDao(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideActivityDao(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
