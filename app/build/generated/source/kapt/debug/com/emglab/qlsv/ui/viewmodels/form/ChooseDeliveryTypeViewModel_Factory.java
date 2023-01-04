package com.emglab.qlsv.ui.viewmodels.form;

import com.emglab.qlsv.repositories.FormRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChooseDeliveryTypeViewModel_Factory
    implements Factory<ChooseDeliveryTypeViewModel> {
  private final Provider<FormRepository> formRepositoryProvider;

  public ChooseDeliveryTypeViewModel_Factory(Provider<FormRepository> formRepositoryProvider) {
    this.formRepositoryProvider = formRepositoryProvider;
  }

  @Override
  public ChooseDeliveryTypeViewModel get() {
    return provideInstance(formRepositoryProvider);
  }

  public static ChooseDeliveryTypeViewModel provideInstance(
      Provider<FormRepository> formRepositoryProvider) {
    return new ChooseDeliveryTypeViewModel(formRepositoryProvider.get());
  }

  public static ChooseDeliveryTypeViewModel_Factory create(
      Provider<FormRepository> formRepositoryProvider) {
    return new ChooseDeliveryTypeViewModel_Factory(formRepositoryProvider);
  }

  public static ChooseDeliveryTypeViewModel newChooseDeliveryTypeViewModel(
      FormRepository formRepository) {
    return new ChooseDeliveryTypeViewModel(formRepository);
  }
}
