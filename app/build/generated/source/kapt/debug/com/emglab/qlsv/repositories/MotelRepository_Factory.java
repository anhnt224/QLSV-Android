package com.emglab.qlsv.repositories;

import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.dao.ImageMotelDao;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.GiftWebService;
import com.emglab.qlsv.webservices.WebService;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotelRepository_Factory implements Factory<MotelRepository> {
  private final Provider<WebService> webserviceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<GiftWebService> giftWebServiceProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ImageMotelDao> imageMotelDaoProvider;

  public MotelRepository_Factory(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<GiftWebService> giftWebServiceProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ImageMotelDao> imageMotelDaoProvider) {
    this.webserviceProvider = webserviceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
    this.giftWebServiceProvider = giftWebServiceProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.imageMotelDaoProvider = imageMotelDaoProvider;
  }

  @Override
  public MotelRepository get() {
    return provideInstance(
        webserviceProvider,
        appExecutorsProvider,
        giftWebServiceProvider,
        sharedPrefsHelperProvider,
        imageMotelDaoProvider);
  }

  public static MotelRepository provideInstance(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<GiftWebService> giftWebServiceProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ImageMotelDao> imageMotelDaoProvider) {
    return new MotelRepository(
        webserviceProvider.get(),
        appExecutorsProvider.get(),
        giftWebServiceProvider.get(),
        sharedPrefsHelperProvider.get(),
        imageMotelDaoProvider.get());
  }

  public static MotelRepository_Factory create(
      Provider<WebService> webserviceProvider,
      Provider<AppExecutors> appExecutorsProvider,
      Provider<GiftWebService> giftWebServiceProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ImageMotelDao> imageMotelDaoProvider) {
    return new MotelRepository_Factory(
        webserviceProvider,
        appExecutorsProvider,
        giftWebServiceProvider,
        sharedPrefsHelperProvider,
        imageMotelDaoProvider);
  }

  public static MotelRepository newMotelRepository(
      WebService webservice,
      AppExecutors appExecutors,
      GiftWebService giftWebService,
      SharedPrefsHelper sharedPrefsHelper,
      ImageMotelDao imageMotelDao) {
    return new MotelRepository(
        webservice, appExecutors, giftWebService, sharedPrefsHelper, imageMotelDao);
  }
}
