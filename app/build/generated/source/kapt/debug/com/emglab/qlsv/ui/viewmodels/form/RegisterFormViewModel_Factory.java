package com.emglab.qlsv.ui.viewmodels.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterFormViewModel_Factory implements Factory<RegisterFormViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public RegisterFormViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public RegisterFormViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static RegisterFormViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new RegisterFormViewModel(formRepositoryProvider.get());
  }

  public static RegisterFormViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new RegisterFormViewModel_Factory(formRepositoryProvider);
  }

  public static RegisterFormViewModel newRegisterFormViewModel(FormRepository formRepository) {
    return new RegisterFormViewModel(formRepository);
  }
}
