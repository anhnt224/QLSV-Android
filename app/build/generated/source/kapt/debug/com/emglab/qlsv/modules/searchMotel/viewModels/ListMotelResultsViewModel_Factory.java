package com.emglab.qlsv.modules.searchMotel.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListMotelResultsViewModel_Factory implements Factory<ListMotelResultsViewModel> {
  private static final ListMotelResultsViewModel_Factory INSTANCE =
      new ListMotelResultsViewModel_Factory();

  @Override
  public ListMotelResultsViewModel get() {
    return provideInstance();
  }

  public static ListMotelResultsViewModel provideInstance() {
    return new ListMotelResultsViewModel();
  }

  public static ListMotelResultsViewModel_Factory create() {
    return INSTANCE;
  }

  public static ListMotelResultsViewModel newListMotelResultsViewModel() {
    return new ListMotelResultsViewModel();
  }
}
