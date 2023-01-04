package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateGiftViewModel_Factory implements Factory<CreateGiftViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public CreateGiftViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public CreateGiftViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static CreateGiftViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new CreateGiftViewModel(giftRepositoryProvider.get());
  }

  public static CreateGiftViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new CreateGiftViewModel_Factory(giftRepositoryProvider);
  }

  public static CreateGiftViewModel newCreateGiftViewModel(GiftRepository giftRepository) {
    return new CreateGiftViewModel(giftRepository);
  }
}
