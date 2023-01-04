package com.emglab.qlsv.ui.fragments.gift;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.GiftWebService;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateGiftFragment_MembersInjector
    implements MembersInjector<CreateGiftFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<GiftWebService> giftWebServiceProvider;

  public CreateGiftFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<GiftWebService> giftWebServiceProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.giftWebServiceProvider = giftWebServiceProvider;
  }

  public static MembersInjector<CreateGiftFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<GiftWebService> giftWebServiceProvider) {
    return new CreateGiftFragment_MembersInjector(
        factoryProvider, sharedPrefsHelperProvider, giftWebServiceProvider);
  }

  @Override
  public void injectMembers(CreateGiftFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectGiftWebService(instance, giftWebServiceProvider.get());
  }

  public static void injectFactory(CreateGiftFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      CreateGiftFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectGiftWebService(
      CreateGiftFragment instance, GiftWebService giftWebService) {
    instance.giftWebService = giftWebService;
  }
}
