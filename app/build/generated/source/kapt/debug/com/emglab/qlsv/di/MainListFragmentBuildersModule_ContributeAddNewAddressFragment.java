package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.AddNewAddressFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeAddNewAddressFragment
          .AddNewAddressFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeAddNewAddressFragment {
  private MainListFragmentBuildersModule_ContributeAddNewAddressFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(AddNewAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AddNewAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AddNewAddressFragmentSubcomponent
      extends AndroidInjector<AddNewAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AddNewAddressFragment> {}
  }
}
