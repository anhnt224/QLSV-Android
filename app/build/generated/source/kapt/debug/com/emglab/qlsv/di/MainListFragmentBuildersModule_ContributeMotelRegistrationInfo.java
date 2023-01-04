package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
          .MotelRegistrationInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMotelRegistrationInfo {
  private MainListFragmentBuildersModule_ContributeMotelRegistrationInfo() {}

  @Binds
  @IntoMap
  @FragmentKey(MotelRegistrationInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MotelRegistrationInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MotelRegistrationInfoFragmentSubcomponent
      extends AndroidInjector<MotelRegistrationInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MotelRegistrationInfoFragment> {}
  }
}
