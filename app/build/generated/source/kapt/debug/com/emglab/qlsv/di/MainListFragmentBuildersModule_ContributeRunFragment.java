package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.running.RunFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeRunFragment {
  private MainListFragmentBuildersModule_ContributeRunFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RunFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RunFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RunFragmentSubcomponent extends AndroidInjector<RunFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RunFragment> {}
  }
}
