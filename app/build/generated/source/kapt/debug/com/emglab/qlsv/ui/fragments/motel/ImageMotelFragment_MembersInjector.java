package com.emglab.qlsv.ui.fragments.motel;

import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.webservices.WebService;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ImageMotelFragment_MembersInjector
    implements MembersInjector<ImageMotelFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<WebService> webServiceProvider;

  public ImageMotelFragment_MembersInjector(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider,
      Provider<WebService> webServiceProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.factoryProvider = factoryProvider;
    this.webServiceProvider = webServiceProvider;
  }

  public static MembersInjector<ImageMotelFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<ViewModelFactory> factoryProvider,
      Provider<WebService> webServiceProvider) {
    return new ImageMotelFragment_MembersInjector(
        sharedPrefsHelperProvider, factoryProvider, webServiceProvider);
  }

  @Override
  public void injectMembers(ImageMotelFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectFactory(instance, factoryProvider.get());
    injectWebService(instance, webServiceProvider.get());
  }

  public static void injectSharedPrefsHelper(
      ImageMotelFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectFactory(ImageMotelFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectWebService(ImageMotelFragment instance, WebService webService) {
    instance.webService = webService;
  }
}
