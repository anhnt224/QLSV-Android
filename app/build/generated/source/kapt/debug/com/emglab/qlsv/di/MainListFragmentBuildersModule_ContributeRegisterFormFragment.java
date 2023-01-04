package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.RegisterFormFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeRegisterFormFragment.RegisterFormFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeRegisterFormFragment {
  private MainListFragmentBuildersModule_ContributeRegisterFormFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RegisterFormFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RegisterFormFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RegisterFormFragmentSubcomponent extends AndroidInjector<RegisterFormFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RegisterFormFragment> {}
  }
}
