package com.emglab.qlsv.ui.viewmodels.user;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QrStudentViewModel_Factory implements Factory<QrStudentViewModel> {
  private static final QrStudentViewModel_Factory INSTANCE = new QrStudentViewModel_Factory();

  @Override
  public QrStudentViewModel get() {
    return provideInstance();
  }

  public static QrStudentViewModel provideInstance() {
    return new QrStudentViewModel();
  }

  public static QrStudentViewModel_Factory create() {
    return INSTANCE;
  }

  public static QrStudentViewModel newQrStudentViewModel() {
    return new QrStudentViewModel();
  }
}
