package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMotelRegistrationList
          .MotelRegistrationListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMotelRegistrationList {
  private MainListFragmentBuildersModule_ContributeMotelRegistrationList() {}

  @Binds
  @IntoMap
  @FragmentKey(MotelRegistrationListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MotelRegistrationListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MotelRegistrationListFragmentSubcomponent
      extends AndroidInjector<MotelRegistrationListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MotelRegistrationListFragment> {}
  }
}
