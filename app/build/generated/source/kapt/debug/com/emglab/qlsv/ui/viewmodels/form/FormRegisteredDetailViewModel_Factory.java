package com.emglab.qlsv.ui.viewmodels.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FormRegisteredDetailViewModel_Factory
    implements Factory<FormRegisteredDetailViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public FormRegisteredDetailViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public FormRegisteredDetailViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static FormRegisteredDetailViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new FormRegisteredDetailViewModel(formRepositoryProvider.get());
  }

  public static FormRegisteredDetailViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new FormRegisteredDetailViewModel_Factory(formRepositoryProvider);
  }

  public static FormRegisteredDetailViewModel newFormRegisteredDetailViewModel(
      FormRepository formRepository) {
    return new FormRegisteredDetailViewModel(formRepository);
  }
}
