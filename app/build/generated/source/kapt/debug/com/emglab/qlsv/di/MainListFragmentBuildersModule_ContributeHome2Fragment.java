package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.Home2Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeHome2Fragment.Home2FragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeHome2Fragment {
  private MainListFragmentBuildersModule_ContributeHome2Fragment() {}

  @Binds
  @IntoMap
  @FragmentKey(Home2Fragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      Home2FragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface Home2FragmentSubcomponent extends AndroidInjector<Home2Fragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Home2Fragment> {}
  }
}
