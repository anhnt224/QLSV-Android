package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.account.TAccountFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTAccountFragment.TAccountFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTAccountFragment {
  private TListFragmentBuilderModule_ContributeTAccountFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TAccountFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TAccountFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TAccountFragmentSubcomponent extends AndroidInjector<TAccountFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TAccountFragment> {}
  }
}
