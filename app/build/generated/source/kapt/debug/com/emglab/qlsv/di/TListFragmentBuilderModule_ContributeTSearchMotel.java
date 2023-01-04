package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.motel.TSearchMotelFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTSearchMotel.TSearchMotelFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTSearchMotel {
  private TListFragmentBuilderModule_ContributeTSearchMotel() {}

  @Binds
  @IntoMap
  @FragmentKey(TSearchMotelFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TSearchMotelFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TSearchMotelFragmentSubcomponent extends AndroidInjector<TSearchMotelFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TSearchMotelFragment> {}
  }
}
