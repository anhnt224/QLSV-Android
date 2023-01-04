package com.emglab.qlsv.repositories;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.RunWebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunRepository_Factory implements Factory<RunRepository> {
  private final Provider<RunWebService> runWebServiceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public RunRepository_Factory(
      Provider<RunWebService> runWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.runWebServiceProvider = runWebServiceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public RunRepository get() {
    return provideInstance(runWebServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static RunRepository provideInstance(
      Provider<RunWebService> runWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new RunRepository(
        runWebServiceProvider.get(), appExecutorsProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static RunRepository_Factory create(
      Provider<RunWebService> runWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new RunRepository_Factory(
        runWebServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static RunRepository newRunRepository(
      RunWebService runWebService, AppExecutors appExecutors, SharedPrefsHelper sharedPrefsHelper) {
    return new RunRepository(runWebService, appExecutors, sharedPrefsHelper);
  }
}
