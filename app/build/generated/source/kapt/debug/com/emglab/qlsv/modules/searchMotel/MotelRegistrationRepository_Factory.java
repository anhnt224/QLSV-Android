package com.emglab.qlsv.modules.searchMotel;

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
public final class MotelRegistrationRepository_Factory
    implements Factory<MotelRegistrationRepository> {
  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public MotelRegistrationRepository_Factory(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public MotelRegistrationRepository get() {
    return provideInstance(webserviceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static MotelRegistrationRepository provideInstance(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new MotelRegistrationRepository(
        webserviceProvider.get(), appExecutorsProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static MotelRegistrationRepository_Factory create(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new MotelRegistrationRepository_Factory(
        webserviceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static MotelRegistrationRepository newMotelRegistrationRepository(
      WebService webservice, AppExecutors appExecutors, SharedPrefsHelper sharedPrefsHelper) {
    return new MotelRegistrationRepository(webservice, appExecutors, sharedPrefsHelper);
  }
}
