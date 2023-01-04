package com.emglab.qlsv.di;

import com.emglab.qlsv.dao.ImageMotelDao;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideImageMotelDaoFactory implements Factory<ImageMotelDao> {
  private final AppModule module;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideImageMotelDaoFactory(AppModule module, Provider<AppDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public ImageMotelDao get() {
    return provideInstance(module, dbProvider);
  }

  public static ImageMotelDao provideInstance(AppModule module, Provider<AppDatabase> dbProvider) {
    return proxyProvideImageMotelDao(module, dbProvider.get());
  }

  public static AppModule_ProvideImageMotelDaoFactory create(
      AppModule module, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideImageMotelDaoFactory(module, dbProvider);
  }

  public static ImageMotelDao proxyProvideImageMotelDao(AppModule instance, AppDatabase db) {
    return Preconditions.checkNotNull(
        instance.provideImageMotelDao(db),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
