package com.emglab.qlsv.ui.fragments.running;

import com.emglab.qlsv.dao.RunDataDao;
import com.emglab.qlsv.dao.RunningLocationDao;
import com.emglab.qlsv.dao.RunningWayDao;
import com.emglab.qlsv.di.ViewModelFactory;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RunFragment_MembersInjector implements MembersInjector<RunFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<RunningLocationDao> runningLocationDaoProvider;

  private final Provider<RunningWayDao> runningWayDaoProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<RunDataDao> runDataDaoProvider;

  public RunFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<RunningLocationDao> runningLocationDaoProvider,
      Provider<RunningWayDao> runningWayDaoProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<RunDataDao> runDataDaoProvider) {
    this.factoryProvider = factoryProvider;
    this.runningLocationDaoProvider = runningLocationDaoProvider;
    this.runningWayDaoProvider = runningWayDaoProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.runDataDaoProvider = runDataDaoProvider;
  }

  public static MembersInjector<RunFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<RunningLocationDao> runningLocationDaoProvider,
      Provider<RunningWayDao> runningWayDaoProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<RunDataDao> runDataDaoProvider) {
    return new RunFragment_MembersInjector(
        factoryProvider,
        runningLocationDaoProvider,
        runningWayDaoProvider,
        sharedPrefsHelperProvider,
        runDataDaoProvider);
  }

  @Override
  public void injectMembers(RunFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectRunningLocationDao(instance, runningLocationDaoProvider.get());
    injectRunningWayDao(instance, runningWayDaoProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectRunDataDao(instance, runDataDaoProvider.get());
  }

  public static void injectFactory(RunFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectRunningLocationDao(
      RunFragment instance, RunningLocationDao runningLocationDao) {
    instance.runningLocationDao = runningLocationDao;
  }

  public static void injectRunningWayDao(RunFragment instance, RunningWayDao runningWayDao) {
    instance.runningWayDao = runningWayDao;
  }

  public static void injectSharedPrefsHelper(
      RunFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectRunDataDao(RunFragment instance, RunDataDao runDataDao) {
    instance.runDataDao = runDataDao;
  }
}
