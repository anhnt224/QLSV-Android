package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TGiftInfoViewModel_Factory implements Factory<TGiftInfoViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TGiftInfoViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TGiftInfoViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TGiftInfoViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftInfoViewModel(giftRepositoryProvider.get());
  }

  public static TGiftInfoViewModel_Factory create(Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftInfoViewModel_Factory(giftRepositoryProvider);
  }

  public static TGiftInfoViewModel newTGiftInfoViewModel(GiftRepository giftRepository) {
    return new TGiftInfoViewModel(giftRepository);
  }
}
