package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.job.TListJobsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListJobsFragment.TListJobsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListJobsFragment {
  private TListFragmentBuilderModule_ContributeTListJobsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TListJobsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListJobsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListJobsFragmentSubcomponent extends AndroidInjector<TListJobsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListJobsFragment> {}
  }
}
