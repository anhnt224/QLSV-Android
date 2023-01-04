package com.emglab.qlsv.ui.viewmodels.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EditFormViewModel_Factory implements Factory<EditFormViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public EditFormViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public EditFormViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static EditFormViewModel provideInstance(Provider<FormRepository> formRepositoryProvider) {
    return new EditFormViewModel(formRepositoryProvider.get());
  }

  public static EditFormViewModel_Factory create(Provider<FormRepository> formRepositoryProvider) {
    return new EditFormViewModel_Factory(formRepositoryProvider);
  }

  public static EditFormViewModel newEditFormViewModel(FormRepository formRepository) {
    return new EditFormViewModel(formRepository);
  }
}
