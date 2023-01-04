package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TApplyGiftViewModel_Factory implements Factory<TApplyGiftViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TApplyGiftViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TApplyGiftViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TApplyGiftViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TApplyGiftViewModel(giftRepositoryProvider.get());
  }

  public static TApplyGiftViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TApplyGiftViewModel_Factory(giftRepositoryProvider);
  }

  public static TApplyGiftViewModel newTApplyGiftViewModel(GiftRepository giftRepository) {
    return new TApplyGiftViewModel(giftRepository);
  }
}
