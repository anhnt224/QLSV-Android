package com.emglab.qlsv.modules.searchMotel.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PickMotelLocationViewModel_Factory
    implements Factory<PickMotelLocationViewModel> {
  private static final PickMotelLocationViewModel_Factory INSTANCE =
      new PickMotelLocationViewModel_Factory();

  @Override
  public PickMotelLocationViewModel get() {
    return provideInstance();
  }

  public static PickMotelLocationViewModel provideInstance() {
    return new PickMotelLocationViewModel();
  }

  public static PickMotelLocationViewModel_Factory create() {
    return INSTANCE;
  }

  public static PickMotelLocationViewModel newPickMotelLocationViewModel() {
    return new PickMotelLocationViewModel();
  }
}
