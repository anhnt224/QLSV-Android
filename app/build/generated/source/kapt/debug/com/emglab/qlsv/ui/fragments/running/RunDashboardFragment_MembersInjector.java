package com.emglab.qlsv.ui.fragments.running;

import com.emglab.qlsv.dao.RunDataDao;
import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunDashboardFragment_MembersInjector
    implements MembersInjector<RunDashboardFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<RunDataDao> runDataDaoProvider;

  public RunDashboardFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<RunDataDao> runDataDaoProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.runDataDaoProvider = runDataDaoProvider;
  }

  public static MembersInjector<RunDashboardFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<RunDataDao> runDataDaoProvider) {
    return new RunDashboardFragment_MembersInjector(
        factoryProvider, sharedPrefsHelperProvider, runDataDaoProvider);
  }

  @Override
  public void injectMembers(RunDashboardFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectRunDataDao(instance, runDataDaoProvider.get());
  }

  public static void injectFactory(RunDashboardFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      RunDashboardFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectRunDataDao(RunDashboardFragment instance, RunDataDao runDataDao) {
    instance.runDataDao = runDataDao;
  }
}
