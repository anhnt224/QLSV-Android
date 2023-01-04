package com.emglab.qlsv.teacher.viewmodel.gift;

import com.emglab.qlsv.repositories.GiftRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TListRegisterViewModel_Factory implements Factory<TListRegisterViewModel> {
  private final Provider<GiftRepository> giftRepositoryProvider;

  public TListRegisterViewModel_Factory(Provider<GiftRepository> giftRepositoryProvider) {
    this.giftRepositoryProvider = giftRepositoryProvider;
  }

  @Override
  public TListRegisterViewModel get() {
    return provideInstance(giftRepositoryProvider);
  }

  public static TListRegisterViewModel provideInstance(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TListRegisterViewModel(giftRepositoryProvider.get());
  }

  public static TListRegisterViewModel_Factory create(
      Provider<GiftRepository> giftRepositoryProvider) {
    return new TListRegisterViewModel_Factory(giftRepositoryProvider);
  }

  public static TListRegisterViewModel newTListRegisterViewModel(GiftRepository giftRepository) {
    return new TListRegisterViewModel(giftRepository);
  }
}
