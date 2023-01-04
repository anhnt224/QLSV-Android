package com.emglab.qlsv.ui.viewmodels.motel;

import com.emglab.qlsv.repositories.MotelRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ImageMotelViewModel_Factory implements Factory<ImageMotelViewModel> {
  private final Provider<MotelRepository> imageMotelRepositoryProvider;

  public ImageMotelViewModel_Factory(Provider<MotelRepository> imageMotelRepositoryProvider) {
    this.imageMotelRepositoryProvider = imageMotelRepositoryProvider;
  }

  @Override
  public ImageMotelViewModel get() {
    return provideInstance(imageMotelRepositoryProvider);
  }

  public static ImageMotelViewModel provideInstance(
      Provider<MotelRepository> imageMotelRepositoryProvider) {
    return new ImageMotelViewModel(imageMotelRepositoryProvider.get());
  }

  public static ImageMotelViewModel_Factory create(
      Provider<MotelRepository> imageMotelRepositoryProvider) {
    return new ImageMotelViewModel_Factory(imageMotelRepositoryProvider);
  }

  public static ImageMotelViewModel newImageMotelViewModel(MotelRepository imageMotelRepository) {
    return new ImageMotelViewModel(imageMotelRepository);
  }
}
