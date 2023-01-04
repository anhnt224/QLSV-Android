package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.TimetableDAO;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideTimetableFactory implements Factory<TimetableDAO> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideTimetableFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public TimetableDAO get() {
    return provideInstance(module, dbProvider);
  }

  public static TimetableDAO provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideTimetable(module, dbProvider.get());
  }

  public static AppModule_ProvideTimetableFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideTimetableFactory(module, dbProvider);
  }

  public static TimetableDAO proxyProvideTimetable(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideTimetable(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
