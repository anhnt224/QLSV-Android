package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.ChooseReceiverAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
          .ChooseReceiverAddressFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment {
  private MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ChooseReceiverAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ChooseReceiverAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ChooseReceiverAddressFragmentSubcomponent
      extends AndroidInjector<ChooseReceiverAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChooseReceiverAddressFragment> {}
  }
}
