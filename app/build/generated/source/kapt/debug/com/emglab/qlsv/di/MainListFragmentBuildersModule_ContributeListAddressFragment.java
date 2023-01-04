package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.ListAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListAddressFragment.ListAddressFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListAddressFragment {
  private MainListFragmentBuildersModule_ContributeListAddressFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListAddressFragmentSubcomponent extends AndroidInjector<ListAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListAddressFragment> {}
  }
}
