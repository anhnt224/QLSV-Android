package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationCompleteFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
          .MotelRegistrationCompleteFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMotelRegistrationComplete {
  private MainListFragmentBuildersModule_ContributeMotelRegistrationComplete() {}

  @Binds
  @IntoMap
  @FragmentKey(MotelRegistrationCompleteFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MotelRegistrationCompleteFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MotelRegistrationCompleteFragmentSubcomponent
      extends AndroidInjector<MotelRegistrationCompleteFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MotelRegistrationCompleteFragment> {}
  }
}
