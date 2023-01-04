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
public final class TeacherActivity_MembersInjector implements MembersInjector<TeacherActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public TeacherActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<TeacherActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider,
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new TeacherActivity_MembersInjector(
        dispatchingAndroidInjectorProvider, sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(TeacherActivity instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      TeacherActivity instance, DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }

  public static void injectSharedPrefsHelper(
      TeacherActivity instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
