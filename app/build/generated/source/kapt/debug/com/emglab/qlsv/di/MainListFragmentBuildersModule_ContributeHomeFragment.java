package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.HomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeHomeFragment {
  private MainListFragmentBuildersModule_ContributeHomeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HomeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeFragment> {}
  }
}
