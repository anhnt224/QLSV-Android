package com.emglab.qlsv.repositories.group;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.dao.SVGroupDAO;
import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SVGroupRepository_Factory implements Factory<SVGroupRepository> {
  private final Provider<SVGroupDAO> svGroupDAOProvider;

  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public SVGroupRepository_Factory(
      Provider<SVGroupDAO> svGroupDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.svGroupDAOProvider = svGroupDAOProvider;
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  @Override
  public SVGroupRepository get() {
    return provideInstance(svGroupDAOProvider, webserviceProvider, appExecutorsProvider);
  }

  public static SVGroupRepository provideInstance(
      Provider<SVGroupDAO> svGroupDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new SVGroupRepository(
        svGroupDAOProvider.get(), webserviceProvider.get(), appExecutorsProvider.get());
  }

  public static SVGroupRepository_Factory create(
      Provider<SVGroupDAO> svGroupDAOProvider,
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new SVGroupRepository_Factory(
        svGroupDAOProvider, webserviceProvider, appExecutorsProvider);
  }

  public static SVGroupRepository newSVGroupRepository(
      SVGroupDAO svGroupDAO, WebService webservice, AppExecutors appExecutors) {
    return new SVGroupRepository(svGroupDAO, webservice, appExecutors);
  }
}
