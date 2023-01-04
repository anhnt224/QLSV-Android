package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.THomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTHomeFragment {
  private TListFragmentBuilderModule_ContributeTHomeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(THomeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      THomeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface THomeFragmentSubcomponent extends AndroidInjector<THomeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<THomeFragment> {}
  }
}
