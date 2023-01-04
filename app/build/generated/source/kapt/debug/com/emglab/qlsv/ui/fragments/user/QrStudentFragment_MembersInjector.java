package com.emglab.qlsv.ui.fragments.user;

import com.emglab.qlsv.helper.SharedPrefsHelper;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QrStudentFragment_MembersInjector implements MembersInjector<QrStudentFragment> {
  private final Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  public QrStudentFragment_MembersInjector(Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    this.sharedPrefsHelperProvider = sharedPrefsHelperProvider;
  }

  public static MembersInjector<QrStudentFragment> create(
      Provider<SharedPrefsHelper> sharedPrefsHelperProvider) {
    return new QrStudentFragment_MembersInjector(sharedPrefsHelperProvider);
  }

  @Override
  public void injectMembers(QrStudentFragment instance) {
    injectSharedPrefsHelper(instance, sharedPrefsHelperProvider.get());
  }

  public static void injectSharedPrefsHelper(
      QrStudentFragment instance, SharedPrefsHelper sharedPrefsHelper) {
    instance.sharedPrefsHelper = sharedPrefsHelper;
  }
}
