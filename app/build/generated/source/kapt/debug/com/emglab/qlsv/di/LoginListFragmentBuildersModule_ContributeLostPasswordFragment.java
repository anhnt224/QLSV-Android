package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.LostPasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      LoginListFragmentBuildersModule_ContributeLostPasswordFragment
          .LostPasswordFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class LoginListFragmentBuildersModule_ContributeLostPasswordFragment {
  private LoginListFragmentBuildersModule_ContributeLostPasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(LostPasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      LostPasswordFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface LostPasswordFragmentSubcomponent extends AndroidInjector<LostPasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LostPasswordFragment> {}
  }
}
