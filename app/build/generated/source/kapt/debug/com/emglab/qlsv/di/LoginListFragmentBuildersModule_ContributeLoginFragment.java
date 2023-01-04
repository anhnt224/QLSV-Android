package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.LoginFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      LoginListFragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class LoginListFragmentBuildersModule_ContributeLoginFragment {
  private LoginListFragmentBuildersModule_ContributeLoginFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(LoginFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      LoginFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface LoginFragmentSubcomponent extends AndroidInjector<LoginFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginFragment> {}
  }
}
