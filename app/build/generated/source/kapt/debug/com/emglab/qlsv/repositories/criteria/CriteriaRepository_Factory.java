package com.emglab.qlsv.repositories.criteria;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.dao.CriteriaDAO;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CriteriaRepository_Factory implements Factory<CriteriaRepository> {
  private final Provider<CriteriaDAO> criteriaDAOProvider;

  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public CriteriaRepository_Factory(
      Provider<CriteriaDAO> criteriaDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.criteriaDAOProvider = criteriaDAOProvider;
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  @Override
  public CriteriaRepository get() {
    return provideInstance(
        criteriaDAOProvider, webserviceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static CriteriaRepository provideInstance(
      Provider<CriteriaDAO> criteriaDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new CriteriaRepository(
        criteriaDAOProvider.get(),
        webserviceProvider.get(),
        appExecutorsProvider.get(),
        sharedPrefsHelperProvider.get());
  }

  public static CriteriaRepository_Factory create(
      Provider<CriteriaDAO> criteriaDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new CriteriaRepository_Factory(
        criteriaDAOProvider, webserviceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
  }

  public static CriteriaRepository newCriteriaRepository(
      CriteriaDAO criteriaDAO,
      WebService webservice,
      AppExecutors appExecutors,
      SharedPrefsHelper sharedPrefsHelper) {
    return new CriteriaRepository(criteriaDAO, webservice, appExecutors, sharedPrefsHelper);
  }
}
