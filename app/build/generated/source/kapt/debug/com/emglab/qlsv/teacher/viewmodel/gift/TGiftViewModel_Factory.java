package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TGiftViewModel_Factory implements Factory<TGiftViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TGiftViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TGiftViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TGiftViewModel provideInstance(Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftViewModel(giftRepositoryProvider.get());
  }

  public static TGiftViewModel_Factory create(Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftViewModel_Factory(giftRepositoryProvider);
  }

  public static TGiftViewModel newTGiftViewModel(GiftRepository giftRepository) {
    return new TGiftViewModel(giftRepository);
  }
}
