package com.emglab.qlsv.di;

import com.emglab.qlsv.webservices.GiftWebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideGiftServiceFactory implements Factory<GiftWebService> {
  private final AppModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  public AppModule_ProvideGiftServiceFactory(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public GiftWebService get() {
    return provideInstance(module, httpClientProvider);
  }

  public static GiftWebService provideInstance(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return proxyProvideGiftService(module, httpClientProvider.get());
  }

  public static AppModule_ProvideGiftServiceFactory create(
      AppModule module, Provider<OkHttpClient> httpClientProvider) {
    return new AppModule_ProvideGiftServiceFactory(module, httpClientProvider);
  }

  public static GiftWebService proxyProvideGiftService(
      AppModule instance, OkHttpClient httpClient) {
    return Preconditions.checkNotNull(
        instance.provideGiftService(httpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
