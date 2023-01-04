package com.emglab.qlsv.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      viewModelsMapProvider;

  public ViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsMapProvider) {
    this.viewModelsMapProvider = viewModelsMapProvider;
  }

  @Override
  public ViewModelFactory get() {
    return provideInstance(viewModelsMapProvider);
  }

  public static ViewModelFactory provideInstance(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsMapProvider) {
    return new ViewModelFactory(viewModelsMapProvider.get());
  }

  public static ViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsMapProvider) {
    return new ViewModelFactory_Factory(viewModelsMapProvider);
  }

  public static ViewModelFactory newViewModelFactory(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModelsMap) {
    return new ViewModelFactory(viewModelsMap);
  }
}
