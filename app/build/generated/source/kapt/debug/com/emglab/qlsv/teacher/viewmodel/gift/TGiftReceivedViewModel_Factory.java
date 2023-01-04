package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TGiftReceivedViewModel_Factory implements Factory<TGiftReceivedViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TGiftReceivedViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TGiftReceivedViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TGiftReceivedViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftReceivedViewModel(giftRepositoryProvider.get());
  }

  public static TGiftReceivedViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftReceivedViewModel_Factory(giftRepositoryProvider);
  }

  public static TGiftReceivedViewModel newTGiftReceivedViewModel(GiftRepository giftRepository) {
    return new TGiftReceivedViewModel(giftRepository);
  }
}
