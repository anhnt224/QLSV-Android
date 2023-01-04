package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.motel.TAddNewAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTAddNewAddressMotel.TAddNewAddressFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTAddNewAddressMotel {
  private TListFragmentBuilderModule_ContributeTAddNewAddressMotel() {}

  @Binds
  @IntoMap
  @FragmentKey(TAddNewAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TAddNewAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TAddNewAddressFragmentSubcomponent
      extends AndroidInjector<TAddNewAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TAddNewAddressFragment> {}
  }
}
