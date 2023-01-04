package com.emglab.qlsv;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new MainActivity_MembersInjector(
        dispatchingAndroidInjectorProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      MainActivity instance, DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }

  public static void injectSharedPrefsHelper(
      MainActivity instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
