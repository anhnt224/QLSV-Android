package com.emglab.qlsv.di;

import com.emglab.qlsv.webservices.FormWebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideFormServiceFactory implements Factory<FormWebService> {
  private final AppModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  public AppModule_ProvideFormServiceFactory(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public FormWebService get() {
    return provideInstance(module, httpClientProvider);
  }

  public static FormWebService provideInstance(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return proxyProvideFormService(module, httpClientProvider.get());
  }

  public static AppModule_ProvideFormServiceFactory create(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return new AppModule_ProvideFormServiceFactory(module, httpClientProvider);
  }

  public static FormWebService proxyProvideFormService(
      AppModule instance, OkHttpClient httpClient) {
    return Preconditions.checkNotNull(
        instance.provideFormService(httpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
