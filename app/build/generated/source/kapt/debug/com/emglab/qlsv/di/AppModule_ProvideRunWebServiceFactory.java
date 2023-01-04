package com.emglab.qlsv.di;

import com.emglab.qlsv.webservices.RunWebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideRunWebServiceFactory implements Factory<RunWebService> {
  private final AppModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  public AppModule_ProvideRunWebServiceFactory(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public RunWebService get() {
    return provideInstance(module, httpClientProvider);
  }

  public static RunWebService provideInstance(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return proxyProvideRunWebService(module, httpClientProvider.get());
  }

  public static AppModule_ProvideRunWebServiceFactory create(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return new AppModule_ProvideRunWebServiceFactory(module, httpClientProvider);
  }

  public static RunWebService proxyProvideRunWebService(
      AppModule instance, OkHttpClient httpClient) {
    return Preconditions.checkNotNull(
        instance.provideRunWebService(httpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
