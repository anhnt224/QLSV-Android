package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.ReceiverAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeReceiverAddressFragment
          .ReceiverAddressFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeReceiverAddressFragment {
  private MainListFragmentBuildersModule_ContributeReceiverAddressFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ReceiverAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ReceiverAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ReceiverAddressFragmentSubcomponent
      extends AndroidInjector<ReceiverAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ReceiverAddressFragment> {}
  }
}
