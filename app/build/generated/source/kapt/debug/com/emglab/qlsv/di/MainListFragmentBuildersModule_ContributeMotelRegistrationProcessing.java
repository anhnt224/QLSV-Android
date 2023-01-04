package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationProcessingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
          .MotelRegistrationProcessingFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing {
  private MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing() {}

  @Binds
  @IntoMap
  @FragmentKey(MotelRegistrationProcessingFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MotelRegistrationProcessingFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MotelRegistrationProcessingFragmentSubcomponent
      extends AndroidInjector<MotelRegistrationProcessingFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MotelRegistrationProcessingFragment> {}
  }
}
