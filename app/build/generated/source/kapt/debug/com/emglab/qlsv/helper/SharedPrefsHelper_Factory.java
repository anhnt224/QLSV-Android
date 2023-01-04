package com.emglab.qlsv.helper;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SharedPrefsHelper_Factory implements Factory<SharedPrefsHelper> {
  private final Provider<SharedPreferences> mSharedPreferencesProvider;

  public SharedPrefsHelper_Factory(Provider<SharedPreferences> mSharedPreferencesProvider) {
    this.mSharedPreferencesProvider = mSharedPreferencesProvider;
  }

  @Override
  public SharedPrefsHelper get() {
    return provideInstance(mSharedPreferencesProvider);
  }

  public static SharedPrefsHelper provideInstance(
      Provider<SharedPreferences> mSharedPreferencesProvider) {
    return new SharedPrefsHelper(mSharedPreferencesProvider.get());
  }

  public static SharedPrefsHelper_Factory create(
      Provider<SharedPreferences> mSharedPreferencesProvider) {
    return new SharedPrefsHelper_Factory(mSharedPreferencesProvider);
  }

  public static SharedPrefsHelper newSharedPrefsHelper(SharedPreferences mSharedPreferences) {
    return new SharedPrefsHelper(mSharedPreferences);
  }
}
