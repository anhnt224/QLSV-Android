package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.SVGroupDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSVGroupDAOFactory implements Factory<SVGroupDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideSVGroupDAOFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public SVGroupDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static SVGroupDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideSVGroupDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideSVGroupDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideSVGroupDAOFactory(module, dbProvider);
  }

  public static SVGroupDAO proxyProvideSVGroupDAO(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideSVGroupDAO(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
