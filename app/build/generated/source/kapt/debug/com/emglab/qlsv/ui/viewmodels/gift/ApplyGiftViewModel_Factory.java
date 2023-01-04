package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplyGiftViewModel_Factory implements Factory<ApplyGiftViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public ApplyGiftViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public ApplyGiftViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static ApplyGiftViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new ApplyGiftViewModel(giftRepositoryProvider.get());
  }

  public static ApplyGiftViewModel_Factory create(Provider<GiftRepository> giftRepositoryProvider) {
    return new ApplyGiftViewModel_Factory(giftRepositoryProvider);
  }

  public static ApplyGiftViewModel newApplyGiftViewModel(GiftRepository giftRepository) {
    return new ApplyGiftViewModel(giftRepository);
  }
}
