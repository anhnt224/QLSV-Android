package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.running.RunDashboardFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeRunDashboardFragment.RunDashboardFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeRunDashboardFragment {
  private TListFragmentBuilderModule_ContributeRunDashboardFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RunDashboardFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RunDashboardFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RunDashboardFragmentSubcomponent extends AndroidInjector<RunDashboardFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RunDashboardFragment> {}
  }
}
