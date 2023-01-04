package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.motel.TListAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListAddressMotel.TListAddressFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListAddressMotel {
  private TListFragmentBuilderModule_ContributeTListAddressMotel() {}

  @Binds
  @IntoMap
  @FragmentKey(TListAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListAddressFragmentSubcomponent extends AndroidInjector<TListAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListAddressFragment> {}
  }
}
