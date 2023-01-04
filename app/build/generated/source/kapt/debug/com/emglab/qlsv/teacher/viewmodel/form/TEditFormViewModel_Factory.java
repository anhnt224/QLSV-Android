package com.emglab.qlsv.teacher.viewmodel.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TEditFormViewModel_Factory implements Factory<TEditFormViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public TEditFormViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public TEditFormViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static TEditFormViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new TEditFormViewModel(formRepositoryProvider.get());
  }

  public static TEditFormViewModel_Factory create(Provider<FormRepository> formRepositoryProvider) {
    return new TEditFormViewModel_Factory(formRepositoryProvider);
  }

  public static TEditFormViewModel newTEditFormViewModel(FormRepository formRepository) {
    return new TEditFormViewModel(formRepository);
  }
}
