package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.PickMotelLocationFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributePickMotelLocation
          .PickMotelLocationFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributePickMotelLocation {
  private MainListFragmentBuildersModule_ContributePickMotelLocation() {}

  @Binds
  @IntoMap
  @FragmentKey(PickMotelLocationFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PickMotelLocationFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PickMotelLocationFragmentSubcomponent
      extends AndroidInjector<PickMotelLocationFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PickMotelLocationFragment> {}
  }
}
