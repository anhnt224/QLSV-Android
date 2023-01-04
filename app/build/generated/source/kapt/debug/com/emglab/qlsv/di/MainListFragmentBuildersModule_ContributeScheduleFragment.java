package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.ScheduleFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeScheduleFragment.ScheduleFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeScheduleFragment {
  private MainListFragmentBuildersModule_ContributeScheduleFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ScheduleFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScheduleFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleFragmentSubcomponent extends AndroidInjector<ScheduleFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleFragment> {}
  }
}
