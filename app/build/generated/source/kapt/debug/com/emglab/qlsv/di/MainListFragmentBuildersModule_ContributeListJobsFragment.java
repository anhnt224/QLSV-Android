package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.job.ListJobsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListJobsFragment.ListJobsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListJobsFragment {
  private MainListFragmentBuildersModule_ContributeListJobsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListJobsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListJobsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListJobsFragmentSubcomponent extends AndroidInjector<ListJobsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListJobsFragment> {}
  }
}
