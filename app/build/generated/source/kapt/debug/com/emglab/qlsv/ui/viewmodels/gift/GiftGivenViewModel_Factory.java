package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GiftGivenViewModel_Factory implements Factory<GiftGivenViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public GiftGivenViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public GiftGivenViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static GiftGivenViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftGivenViewModel(giftRepositoryProvider.get());
  }

  public static GiftGivenViewModel_Factory create(Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftGivenViewModel_Factory(giftRepositoryProvider);
  }

  public static GiftGivenViewModel newGiftGivenViewModel(GiftRepository giftRepository) {
    return new GiftGivenViewModel(giftRepository);
  }
}
