package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.job.ListJobApplyFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListJobApply.ListJobApplyFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListJobApply {
  private MainListFragmentBuildersModule_ContributeListJobApply() {}

  @Binds
  @IntoMap
  @FragmentKey(ListJobApplyFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListJobApplyFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListJobApplyFragmentSubcomponent extends AndroidInjector<ListJobApplyFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListJobApplyFragment> {}
  }
}
