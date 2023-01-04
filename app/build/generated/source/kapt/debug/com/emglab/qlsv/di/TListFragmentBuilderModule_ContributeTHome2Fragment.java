package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.THome2Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTHome2Fragment {
  private TListFragmentBuilderModule_ContributeTHome2Fragment() {}

  @Binds
  @IntoMap
  @FragmentKey(THome2Fragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      THome2FragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface THome2FragmentSubcomponent extends AndroidInjector<THome2Fragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<THome2Fragment> {}
  }
}
