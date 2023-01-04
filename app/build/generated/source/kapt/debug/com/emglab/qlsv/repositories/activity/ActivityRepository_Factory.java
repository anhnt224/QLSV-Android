package com.emglab.qlsv.repositories.activity;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.dao.ActivityDAO;
import com.emglab.qlsv.dao.CountStepsDAO;
import com.emglab.qlsv.dao.CriteriaDAO;
import com.emglab.qlsv.dao.UserCheckInActivityDAO;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityRepository_Factory implements Factory<ActivityRepository> {
  private final Provider<ActivityDAO> activityDAOProvider;

  private final Provider<CriteriaDAO> criteriaDAOProvider;

  private final Provider<UserCheckInActivityDAO> userCheckInActivityDAOProvider;

  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<CountStepsDAO> countStepsDAOProvider;

  public ActivityRepository_Factory(
      Provider<ActivityDAO> activityDAOProvider,
      Provider<CriteriaDAO> criteriaDAOProvider,
      Provider<UserCheckInActivityDAO> userCheckInActivityDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<CountStepsDAO> countStepsDAOProvider) {
    this.activityDAOProvider = activityDAOProvider;
    this.criteriaDAOProvider = criteriaDAOProvider;
    this.userCheckInActivityDAOProvider = userCheckInActivityDAOProvider;
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.countStepsDAOProvider = countStepsDAOProvider;
  }

  @Override
  public ActivityRepository get() {
    return provideInstance(
        activityDAOProvider,
        criteriaDAOProvider,
        userCheckInActivityDAOProvider,
        webserviceProvider,
        appExecutorsProvider,
        sharedPrefsHelperProvider,
        countStepsDAOProvider);
  }

  public static ActivityRepository provideInstance(
      Provider<ActivityDAO> activityDAOProvider,
      Provider<CriteriaDAO> criteriaDAOProvider,
      Provider<UserCheckInActivityDAO> userCheckInActivityDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<CountStepsDAO> countStepsDAOProvider) {
    return new ActivityRepository(
        activityDAOProvider.get(),
        criteriaDAOProvider.get(),
        userCheckInActivityDAOProvider.get(),
        webserviceProvider.get(),
        appExecutorsProvider.get(),
        sharedPrefsHelperProvider.get(),
        countStepsDAOProvider.get());
  }

  public static ActivityRepository_Factory create(
      Provider<ActivityDAO> activityDAOProvider,
      Provider<CriteriaDAO> criteriaDAOProvider,
      Provider<UserCheckInActivityDAO> userCheckInActivityDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<CountStepsDAO> countStepsDAOProvider) {
    return new ActivityRepository_Factory(
        activityDAOProvider,
        criteriaDAOProvider,
        userCheckInActivityDAOProvider,
        webserviceProvider,
        appExecutorsProvider,
        sharedPrefsHelperProvider,
        countStepsDAOProvider);
  }

  public static ActivityRepository newActivityRepository(
      ActivityDAO activityDAO,
      CriteriaDAO criteriaDAO,
      UserCheckInActivityDAO userCheckInActivityDAO,
      WebService webservice,
      AppExecutors appExecutors,
      SharedPrefsHelper sharedPrefsHelper,
      CountStepsDAO countStepsDAO) {
    return new ActivityRepository(
        activityDAO,
        criteriaDAO,
        userCheckInActivityDAO,
        webservice,
        appExecutors,
        sharedPrefsHelper,
        countStepsDAO);
  }
}
