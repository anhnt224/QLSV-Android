package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.CountStepsDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideCountStepsDAOFactory implements Factory<CountStepsDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideCountStepsDAOFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public CountStepsDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static CountStepsDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideCountStepsDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideCountStepsDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideCountStepsDAOFactory(module, dbProvider);
  }

  public static CountStepsDAO proxyProvideCountStepsDAO(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideCountStepsDAO(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
