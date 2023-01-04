package com.emglab.qlsv.common;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppExecutors_Factory implements Factory<AppExecutors> {
  private static final AppExecutors_Factory INSTANCE = new AppExecutors_Factory();

  @Override
  public AppExecutors get() {
    return provideInstance();
  }

  public static AppExecutors provideInstance() {
    return new AppExecutors();
  }

  public static AppExecutors_Factory create() {
    return INSTANCE;
  }

  public static AppExecutors newAppExecutors() {
    return new AppExecutors();
  }
}
