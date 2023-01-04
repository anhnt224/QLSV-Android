package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.AccountFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeAccountFragment.AccountFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeAccountFragment {
  private MainListFragmentBuildersModule_ContributeAccountFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(AccountFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AccountFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AccountFragmentSubcomponent extends AndroidInjector<AccountFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AccountFragment> {}
  }
}
