package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TCreateGiftViewModel_Factory implements Factory<TCreateGiftViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TCreateGiftViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TCreateGiftViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TCreateGiftViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TCreateGiftViewModel(giftRepositoryProvider.get());
  }

  public static TCreateGiftViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TCreateGiftViewModel_Factory(giftRepositoryProvider);
  }

  public static TCreateGiftViewModel newTCreateGiftViewModel(GiftRepository giftRepository) {
    return new TCreateGiftViewModel(giftRepository);
  }
}
