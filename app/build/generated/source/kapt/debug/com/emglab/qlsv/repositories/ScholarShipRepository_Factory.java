package com.emglab.qlsv.repositories;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScholarShipRepository_Factory implements Factory<ScholarShipRepository> {
  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public ScholarShipRepository_Factory(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public ScholarShipRepository get() {
    return provideInstance(webserviceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static ScholarShipRepository provideInstance(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new ScholarShipRepository(
        webserviceProvider.get(), appExecutorsProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static ScholarShipRepository_Factory create(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new ScholarShipRepository_Factory(
        webserviceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static ScholarShipRepository newScholarShipRepository(
      WebService webservice, AppExecutors appExecutors, SharedPrefsHelper sharedPrefsHelper) {
    return new ScholarShipRepository(webservice, appExecutors, sharedPrefsHelper);
  }
}
