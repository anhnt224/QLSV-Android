package com.emglab.qlsv.teacher.viewmodel.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TFormRegisteredViewModel_Factory implements Factory<TFormRegisteredViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public TFormRegisteredViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public TFormRegisteredViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static TFormRegisteredViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new TFormRegisteredViewModel(formRepositoryProvider.get());
  }

  public static TFormRegisteredViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new TFormRegisteredViewModel_Factory(formRepositoryProvider);
  }

  public static TFormRegisteredViewModel newTFormRegisteredViewModel(
      FormRepository formRepository) {
    return new TFormRegisteredViewModel(formRepository);
  }
}
