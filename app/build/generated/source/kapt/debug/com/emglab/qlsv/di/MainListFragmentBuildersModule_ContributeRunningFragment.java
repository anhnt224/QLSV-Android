package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.running.RunningFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeRunningFragment.RunningFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeRunningFragment {
  private MainListFragmentBuildersModule_ContributeRunningFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RunningFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RunningFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RunningFragmentSubcomponent extends AndroidInjector<RunningFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RunningFragment> {}
  }
}
