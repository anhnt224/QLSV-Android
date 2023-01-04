package com.emglab.qlsv.teacher.viewmodel.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListFormViewModel_Factory implements Factory<TListFormViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public TListFormViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public TListFormViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static TListFormViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new TListFormViewModel(formRepositoryProvider.get());
  }

  public static TListFormViewModel_Factory create(Provider<FormRepository> formRepositoryProvider) {
    return new TListFormViewModel_Factory(formRepositoryProvider);
  }

  public static TListFormViewModel newTListFormViewModel(FormRepository formRepository) {
    return new TListFormViewModel(formRepository);
  }
}
