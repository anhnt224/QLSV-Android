package com.emglab.qlsv.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  public AppModule_ProvideHttpClientFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideInstance(module);
  }

  public static OkHttpClient provideInstance(AppModule module) {
    return proxyProvideHttpClient(module);
  }

  public static AppModule_ProvideHttpClientFactory create(AppModule module) {
    return new AppModule_ProvideHttpClientFactory(module);
  }

  public static OkHttpClient proxyProvideHttpClient(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
