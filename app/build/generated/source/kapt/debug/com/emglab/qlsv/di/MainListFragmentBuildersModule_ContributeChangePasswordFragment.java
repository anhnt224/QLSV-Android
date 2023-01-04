package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.ChangePasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeChangePasswordFragment
          .ChangePasswordFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeChangePasswordFragment {
  private MainListFragmentBuildersModule_ContributeChangePasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ChangePasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ChangePasswordFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ChangePasswordFragmentSubcomponent
      extends AndroidInjector<ChangePasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChangePasswordFragment> {}
  }
}
