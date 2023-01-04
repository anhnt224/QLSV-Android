package com.emglab.qlsv.teacher.viewmodel.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TRegisterFormViewModel_Factory implements Factory<TRegisterFormViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public TRegisterFormViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public TRegisterFormViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static TRegisterFormViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new TRegisterFormViewModel(formRepositoryProvider.get());
  }

  public static TRegisterFormViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new TRegisterFormViewModel_Factory(formRepositoryProvider);
  }

  public static TRegisterFormViewModel newTRegisterFormViewModel(FormRepository formRepository) {
    return new TRegisterFormViewModel(formRepository);
  }
}
