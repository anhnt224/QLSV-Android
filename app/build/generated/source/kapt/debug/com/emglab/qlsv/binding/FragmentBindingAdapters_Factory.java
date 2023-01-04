package com.emglab.qlsv.binding;

import androidx.fragment.app.Fragment;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FragmentBindingAdapters_Factory implements Factory<FragmentBindingAdapters> {
  private final Provider<Fragment> fragmentProvider;

  public FragmentBindingAdapters_Factory(Provider<Fragment> fragmentProvider) {
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public FragmentBindingAdapters get() {
    return provideInstance(fragmentProvider);
  }

  public static FragmentBindingAdapters provideInstance(Provider<Fragment> fragmentProvider) {
    return new FragmentBindingAdapters(fragmentProvider.get());
  }

  public static FragmentBindingAdapters_Factory create(Provider<Fragment> fragmentProvider) {
    return new FragmentBindingAdapters_Factory(fragmentProvider);
  }

  public static FragmentBindingAdapters newFragmentBindingAdapters(Fragment fragment) {
    return new FragmentBindingAdapters(fragment);
  }
}
