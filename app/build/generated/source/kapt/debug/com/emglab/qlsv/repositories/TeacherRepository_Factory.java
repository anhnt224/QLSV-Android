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
public final class TeacherRepository_Factory implements Factory<TeacherRepository> {
  private final Provider<WebService> webServiceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public TeacherRepository_Factory(
      Provider<WebService> webServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.webServiceProvider = webServiceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public TeacherRepository get() {
    return provideInstance(webServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static TeacherRepository provideInstance(
      Provider<WebService> webServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TeacherRepository(
        webServiceProvider.get(), appExecutorsProvider.get(), sharedPrefsHelperProvider.get());
  }

  public static TeacherRepository_Factory create(
      Provider<WebService> webServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TeacherRepository_Factory(
        webServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static TeacherRepository newTeacherRepository(
      WebService webService, AppExecutors appExecutors, SharedPrefsHelper sharedPrefsHelper) {
    return new TeacherRepository(webService, appExecutors, sharedPrefsHelper);
  }
}
