package com.emglab.qlsv.di;

import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideApiServiceFactory implements Factory<WebService> {
  private final AppModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  public AppModule_ProvideApiServiceFactory(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public WebService get() {
    return provideInstance(module, httpClientProvider);
  }

  public static WebService provideInstance(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return proxyProvideApiService(module, httpClientProvider.get());
  }

  public static AppModule_ProvideApiServiceFactory create(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return new AppModule_ProvideApiServiceFactory(module, httpClientProvider);
  }

  public static WebService proxyProvideApiService(AppModule instance, OkHttpClient httpClient) {
    return Preconditions.checkNotNull(
        instance.provideApiService(httpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
