package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeTimeTableFragment.TimeTableFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeTimeTableFragment {
  private MainListFragmentBuildersModule_ContributeTimeTableFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TimeTableFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TimeTableFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TimeTableFragmentSubcomponent extends AndroidInjector<TimeTableFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TimeTableFragment> {}
  }
}
