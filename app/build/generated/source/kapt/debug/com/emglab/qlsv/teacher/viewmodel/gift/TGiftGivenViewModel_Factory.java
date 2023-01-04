package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TGiftGivenViewModel_Factory implements Factory<TGiftGivenViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TGiftGivenViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TGiftGivenViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TGiftGivenViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftGivenViewModel(giftRepositoryProvider.get());
  }

  public static TGiftGivenViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TGiftGivenViewModel_Factory(giftRepositoryProvider);
  }

  public static TGiftGivenViewModel newTGiftGivenViewModel(GiftRepository giftRepository) {
    return new TGiftGivenViewModel(giftRepository);
  }
}
