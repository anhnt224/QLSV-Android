package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.activity.UserCheckInActivityInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
          .UserCheckInActivityInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment {
  private MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(UserCheckInActivityInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      UserCheckInActivityInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface UserCheckInActivityInfoFragmentSubcomponent
      extends AndroidInjector<UserCheckInActivityInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserCheckInActivityInfoFragment> {}
  }
}
