package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.CriteriaDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCriteriaDAOFactory implements Factory<CriteriaDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideCriteriaDAOFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public CriteriaDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static CriteriaDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideCriteriaDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideCriteriaDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideCriteriaDAOFactory(module, dbProvider);
  }

  public static CriteriaDAO proxyProvideCriteriaDAO(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideCriteriaDAO(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
