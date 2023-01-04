package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.UserInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeUserInfoFragment.UserInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeUserInfoFragment {
  private MainListFragmentBuildersModule_ContributeUserInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(UserInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      UserInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface UserInfoFragmentSubcomponent extends AndroidInjector<UserInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserInfoFragment> {}
  }
}
