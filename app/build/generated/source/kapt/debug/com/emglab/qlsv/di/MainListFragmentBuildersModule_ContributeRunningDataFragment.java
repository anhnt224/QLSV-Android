package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.running.RunningDataFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeRunningDataFragment.RunningDataFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeRunningDataFragment {
  private MainListFragmentBuildersModule_ContributeRunningDataFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RunningDataFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RunningDataFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RunningDataFragmentSubcomponent extends AndroidInjector<RunningDataFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RunningDataFragment> {}
  }
}
