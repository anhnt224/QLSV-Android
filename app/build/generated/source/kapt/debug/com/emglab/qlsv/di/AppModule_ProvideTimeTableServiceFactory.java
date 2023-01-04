package com.emglab.qlsv.di;

import com.emglab.qlsv.webservices.TimeTableWebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideTimeTableServiceFactory
    implements Factory<TimeTableWebService> {
  private final AppModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  public AppModule_ProvideTimeTableServiceFactory(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public TimeTableWebService get() {
    return provideInstance(module, httpClientProvider);
  }

  public static TimeTableWebService provideInstance(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return proxyProvideTimeTableService(module, httpClientProvider.get());
  }

  public static AppModule_ProvideTimeTableServiceFactory create(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return new AppModule_ProvideTimeTableServiceFactory(module, httpClientProvider);
  }

  public static TimeTableWebService proxyProvideTimeTableService(
      AppModule instance, OkHttpClient httpClient) {
    return Preconditions.checkNotNull(
        instance.provideTimeTableService(httpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
