package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.ScheduleStudnetDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideScheduleStudnetDAOFactory
    implements Factory<ScheduleStudnetDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideScheduleStudnetDAOFactory(
      AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public ScheduleStudnetDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static ScheduleStudnetDAO provideInstance(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideScheduleStudnetDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideScheduleStudnetDAOFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideScheduleStudnetDAOFactory(module, dbProvider);
  }

  public static ScheduleStudnetDAO proxyProvideScheduleStudnetDAO(
      AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideScheduleStudnetDAO(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
