package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.job.ApplyJobFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeApplyJob {
  private MainListFragmentBuildersModule_ContributeApplyJob() {}

  @Binds
  @IntoMap
  @FragmentKey(ApplyJobFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ApplyJobFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ApplyJobFragmentSubcomponent extends AndroidInjector<ApplyJobFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ApplyJobFragment> {}
  }
}
