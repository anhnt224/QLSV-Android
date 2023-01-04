package com.emglab.qlsv.repositories.user;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.dao.ScheduleStudnetDAO;
import com.emglab.qlsv.dao.UserDAO;
import com.emglab.qlsv.dao.WeekNumberDAO;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserDAO> userDAOProvider;

  private final Provider<ScheduleStudnetDAO> scheduleStudnetDAOProvider;

  private final Provider<WeekNumberDAO> weekNumberDAOProvider;

  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public UserRepository_Factory(
      Provider<UserDAO> userDAOProvider,
      Provider<ScheduleStudnetDAO> scheduleStudnetDAOProvider,
      Provider<WeekNumberDAO> weekNumberDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.userDAOProvider = userDAOProvider;
    this.scheduleStudnetDAOProvider = scheduleStudnetDAOProvider;
    this.weekNumberDAOProvider = weekNumberDAOProvider;
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public UserRepository get() {
    return provideInstance(
        userDAOProvider,
        scheduleStudnetDAOProvider,
        weekNumberDAOProvider,
        webserviceProvider,
        appExecutorsProvider,
        sharedPrefsHelperProvider);
  }

  public static UserRepository provideInstance(
      Provider<UserDAO> userDAOProvider,
      Provider<ScheduleStudnetDAO> scheduleStudnetDAOProvider,
      Provider<WeekNumberDAO> weekNumberDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new UserRepository(
        userDAOProvider.get(),
        scheduleStudnetDAOProvider.get(),
        weekNumberDAOProvider.get(),
        webserviceProvider.get(),
        appExecutorsProvider.get(),
        sharedPrefsHelperProvider.get());
  }

  public static UserRepository_Factory create(
      Provider<UserDAO> userDAOProvider,
      Provider<ScheduleStudnetDAO> scheduleStudnetDAOProvider,
      Provider<WeekNumberDAO> weekNumberDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new UserRepository_Factory(
        userDAOProvider,
        scheduleStudnetDAOProvider,
        weekNumberDAOProvider,
        webserviceProvider,
        appExecutorsProvider,
        sharedPrefsHelperProvider);
  }

  public static UserRepository newUserRepository(
      UserDAO userDAO,
      ScheduleStudnetDAO scheduleStudnetDAO,
      WeekNumberDAO weekNumberDAO,
      WebService webservice,
      AppExecutors appExecutors,
      SharedPrefsHelper sharedPrefsHelper) {
    return new UserRepository(
        userDAO, scheduleStudnetDAO, weekNumberDAO, webservice, appExecutors, sharedPrefsHelper);
  }
}
