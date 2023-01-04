package com.emglab.qlsv.repositories;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.FormWebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FormRepository_Factory implements Factory<FormRepository> {
  private final Provider<FormWebService> formWebServiceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public FormRepository_Factory(
      Provider<FormWebService> formWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.formWebServiceProvider = formWebServiceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public FormRepository get() {
    return provideInstance(formWebServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static FormRepository provideInstance(
      Provider<FormWebService> formWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new FormRepository(
        formWebServiceProvider.get(), appExecutorsProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static FormRepository_Factory create(
      Provider<FormWebService> formWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new FormRepository_Factory(
        formWebServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static FormRepository newFormRepository(
      FormWebService formWebService,
      AppExecutors appExecutors,
      SharedPrefsHelper sharedPrefsHelper) {
    return new FormRepository(formWebService, appExecutors, sharedPrefsHelper);
  }
}
