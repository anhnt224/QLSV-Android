package com.emglab.qlsv.di;

import android.content.Context;
import com.emglab.qlsv.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<App> appProvider;

  public AppModule_ProvideContextFactory(AppModule module, Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideInstance(module, appProvider);
  }

  public static Context provideInstance(AppModule module, Provider<App> appProvider) {
    return proxyProvideContext(module, appProvider.get());
  }

  public static AppModule_ProvideContextFactory create(
      AppModule module, Provider<App> appProvider) {
    return new AppModule_ProvideContextFactory(module, appProvider);
  }

  public static Context proxyProvideContext(AppModule instance, App app) {
    return Preconditions.checkNotNull(
        instance.provideContext(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
