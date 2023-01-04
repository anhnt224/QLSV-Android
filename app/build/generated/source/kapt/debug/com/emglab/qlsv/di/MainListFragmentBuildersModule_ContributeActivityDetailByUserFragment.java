package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.activity.ActivityDetailByUserUnitFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
          .ActivityDetailByUserUnitFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment {
  private MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ActivityDetailByUserUnitFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ActivityDetailByUserUnitFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ActivityDetailByUserUnitFragmentSubcomponent
      extends AndroidInjector<ActivityDetailByUserUnitFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ActivityDetailByUserUnitFragment> {}
  }
}
