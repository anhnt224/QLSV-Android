package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GiftInfoViewModel_Factory implements Factory<GiftInfoViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public GiftInfoViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public GiftInfoViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static GiftInfoViewModel provideInstance(Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftInfoViewModel(giftRepositoryProvider.get());
  }

  public static GiftInfoViewModel_Factory create(Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftInfoViewModel_Factory(giftRepositoryProvider);
  }

  public static GiftInfoViewModel newGiftInfoViewModel(GiftRepository giftRepository) {
    return new GiftInfoViewModel(giftRepository);
  }
}
