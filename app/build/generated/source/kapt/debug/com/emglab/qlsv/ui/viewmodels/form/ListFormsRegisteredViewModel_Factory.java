package com.emglab.qlsv.ui.viewmodels.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListFormsRegisteredViewModel_Factory
    implements Factory<ListFormsRegisteredViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public ListFormsRegisteredViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public ListFormsRegisteredViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static ListFormsRegisteredViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new ListFormsRegisteredViewModel(formRepositoryProvider.get());
  }

  public static ListFormsRegisteredViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new ListFormsRegisteredViewModel_Factory(formRepositoryProvider);
  }

  public static ListFormsRegisteredViewModel newListFormsRegisteredViewModel(
      FormRepository formRepository) {
    return new ListFormsRegisteredViewModel(formRepository);
  }
}
