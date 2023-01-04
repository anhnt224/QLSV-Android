package com.emglab.qlsv.ui.viewmodels.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GiftReceiveViewModel_Factory implements Factory<GiftReceiveViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public GiftReceiveViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public GiftReceiveViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static GiftReceiveViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftReceiveViewModel(giftRepositoryProvider.get());
  }

  public static GiftReceiveViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new GiftReceiveViewModel_Factory(giftRepositoryProvider);
  }

  public static GiftReceiveViewModel newGiftReceiveViewModel(GiftRepository giftRepository) {
    return new GiftReceiveViewModel(giftRepository);
  }
}
