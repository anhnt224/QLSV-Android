package com.emglab.qlsv.teacher.viewmodel.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListFormRegisteredViewModel_Factory
    implements Factory<TListFormRegisteredViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public TListFormRegisteredViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public TListFormRegisteredViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static TListFormRegisteredViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new TListFormRegisteredViewModel(formRepositoryProvider.get());
  }

  public static TListFormRegisteredViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new TListFormRegisteredViewModel_Factory(formRepositoryProvider);
  }

  public static TListFormRegisteredViewModel newTListFormRegisteredViewModel(
      FormRepository formRepository) {
    return new TListFormRegisteredViewModel(formRepository);
  }
}
