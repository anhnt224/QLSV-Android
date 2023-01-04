package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.WeekNumberDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideWeekNumberDAOFactory implements Factory<WeekNumberDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideWeekNumberDAOFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public WeekNumberDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static WeekNumberDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideWeekNumberDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideWeekNumberDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideWeekNumberDAOFactory(module, dbProvider);
  }

  public static WeekNumberDAO proxyProvideWeekNumberDAO(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideWeekNumberDAO(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
