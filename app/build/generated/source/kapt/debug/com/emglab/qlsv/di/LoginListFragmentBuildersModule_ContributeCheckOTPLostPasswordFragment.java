package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.CheckOTPLostPasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
          .CheckOTPLostPasswordFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment {
  private LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CheckOTPLostPasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CheckOTPLostPasswordFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CheckOTPLostPasswordFragmentSubcomponent
      extends AndroidInjector<CheckOTPLostPasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CheckOTPLostPasswordFragment> {}
  }
}
