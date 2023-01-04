package com.emglab.qlsv.ui.fragments.running;

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
public final class RunningFragment_MembersInjector implements MembersInjector<RunningFragment> {
  private final Provider<ViewModelFactory> factoryProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private final Provider<RunningLocationDao> runningLocationDaoProvider;

  private final Provider<RunningWayDao> runningWayDaoProvider;

  public RunningFragment_MembersInjector(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<RunningLocationDao> runningLocationDaoProvider,
      Provider<RunningWayDao> runningWayDaoProvider) {
    this.factoryProvider = factoryProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
    this.runningLocationDaoProvider = runningLocationDaoProvider;
    this.runningWayDaoProvider = runningWayDaoProvider;
  }

  public static MembersInjector<RunningFragment> create(
      Provider<ViewModelFactory> factoryProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider,
      Provider<RunningLocationDao> runningLocationDaoProvider,
      Provider<RunningWayDao> runningWayDaoProvider) {
    return new RunningFragment_MembersInjector(
        factoryProvider,
        sharedPrefsHelperProvider,
        runningLocationDaoProvider,
        runningWayDaoProvider);
  }

  @Override
  public void injectMembers(RunningFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
    injectRunningLocationDao(instance, runningLocationDaoProvider.get());
    injectRunningWayDao(instance, runningWayDaoProvider.get());
  }

  public static void injectFactory(RunningFragment instance, ViewModelFactory factory) {
    instance.factory = factory;
  }

  public static void injectSharedPrefsHelper(
      RunningFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }

  public static void injectRunningLocationDao(
      RunningFragment instance, RunningLocationDao runningLocationDao) {
    instance.runningLocationDao = runningLocationDao;
  }

  public static void injectRunningWayDao(RunningFragment instance, RunningWayDao runningWayDao) {
    instance.runningWayDao = runningWayDao;
  }
}
