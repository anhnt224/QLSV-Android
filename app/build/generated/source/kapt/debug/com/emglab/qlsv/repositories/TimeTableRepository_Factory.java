package com.emglab.qlsv.repositories;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.dao.TimetableDAO;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.TimeTableWebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TimeTableRepository_Factory implements Factory<TimeTableRepository> {
  private final Provider<TimeTableWebService> timetableWebServiceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<TimetableDAO> timetableDAOProvider;

  public TimeTableRepository_Factory(
      Provider<TimeTableWebService> timetableWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<TimetableDAO> timetableDAOProvider) {
    this.timetableWebServiceProvider = timetableWebServiceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.timetableDAOProvider = timetableDAOProvider;
  }

  @Override
  public TimeTableRepository get() {
    return provideInstance(
        timetableWebServiceProvider,
        appExecutorsProvider,
        sharedPrefsHelperProvider,
        timetableDAOProvider);
  }

  public static TimeTableRepository provideInstance(
      Provider<TimeTableWebService> timetableWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<TimetableDAO> timetableDAOProvider) {
    return new TimeTableRepository(
        timetableWebServiceProvider.get(),
        appExecutorsProvider.get(),
        sharedPrefsHelperProvider.get(),
        timetableDAOProvider.get());
  }

  public static TimeTableRepository_Factory create(
      Provider<TimeTableWebService> timetableWebServiceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<TimetableDAO> timetableDAOProvider) {
    return new TimeTableRepository_Factory(
        timetableWebServiceProvider,
        appExecutorsProvider,
        sharedPrefsHelperProvider,
        timetableDAOProvider);
  }

  public static TimeTableRepository newTimeTableRepository(
      TimeTableWebService timetableWebService,
      AppExecutors appExecutors,
      SharedPrefsHelper sharedPrefsHelper,
      TimetableDAO timetableDAO) {
    return new TimeTableRepository(
        timetableWebService, appExecutors, sharedPrefsHelper, timetableDAO);
  }
}
