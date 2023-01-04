package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GiftViewModel_Factory implements Factory<GiftViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public GiftViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public GiftViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static GiftViewModel provideInstance(Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftViewModel(giftRepositoryProvider.get());
  }

  public static GiftViewModel_Factory create(Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftViewModel_Factory(giftRepositoryProvider);
  }

  public static GiftViewModel newGiftViewModel(GiftRepository giftRepository) {
    return new GiftViewModel(giftRepository);
  }
}
