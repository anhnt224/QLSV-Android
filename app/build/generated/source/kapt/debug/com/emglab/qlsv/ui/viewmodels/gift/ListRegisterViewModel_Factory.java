package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListRegisterViewModel_Factory implements Factory<ListRegisterViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public ListRegisterViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public ListRegisterViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static ListRegisterViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new ListRegisterViewModel(giftRepositoryProvider.get());
  }

  public static ListRegisterViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new ListRegisterViewModel_Factory(giftRepositoryProvider);
  }

  public static ListRegisterViewModel newListRegisterViewModel(GiftRepository giftRepository) {
    return new ListRegisterViewModel(giftRepository);
  }
}
