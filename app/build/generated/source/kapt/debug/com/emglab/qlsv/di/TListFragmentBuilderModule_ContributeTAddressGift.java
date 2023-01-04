package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TReceiverAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTAddressGift.TReceiverAddressFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTAddressGift {
  private TListFragmentBuilderModule_ContributeTAddressGift() {}

  @Binds
  @IntoMap
  @FragmentKey(TReceiverAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TReceiverAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TReceiverAddressFragmentSubcomponent
      extends AndroidInjector<TReceiverAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TReceiverAddressFragment> {}
  }
}
