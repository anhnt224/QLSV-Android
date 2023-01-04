package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.job.JobDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeJobDetailFragment.JobDetailFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeJobDetailFragment {
  private MainListFragmentBuildersModule_ContributeJobDetailFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(JobDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      JobDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface JobDetailFragmentSubcomponent extends AndroidInjector<JobDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<JobDetailFragment> {}
  }
}
