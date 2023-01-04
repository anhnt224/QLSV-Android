package com.emglab.qlsv.di;

import com.emglab.qlsv.App;
import com.emglab.qlsv.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDbFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<App> appProvider;

  public AppModule_ProvideDbFactory(AppModule module, Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public AppDatabase get() {
    return provideInstance(module, appProvider);
  }

  public static AppDatabase provideInstance(AppModule module, Provider<App> appProvider) {
    return proxyProvideDb(module, appProvider.get());
  }

  public static AppModule_ProvideDbFactory create(AppModule module, Provider<App> appProvider) {
    return new AppModule_ProvideDbFactory(module, appProvider);
  }

  public static AppDatabase proxyProvideDb(AppModule instance, App app) {
    return Preconditions.checkNotNull(
        instance.provideDb(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
