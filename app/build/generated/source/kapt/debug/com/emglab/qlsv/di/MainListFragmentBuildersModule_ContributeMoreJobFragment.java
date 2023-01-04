package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.job.MoreJobFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMoreJobFragment.MoreJobFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMoreJobFragment {
  private MainListFragmentBuildersModule_ContributeMoreJobFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(MoreJobFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MoreJobFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MoreJobFragmentSubcomponent extends AndroidInjector<MoreJobFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MoreJobFragment> {}
  }
}
