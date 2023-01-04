package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.ChooseDeliveryTypeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
          .ChooseDeliveryTypeFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment {
  private MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ChooseDeliveryTypeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ChooseDeliveryTypeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ChooseDeliveryTypeFragmentSubcomponent
      extends AndroidInjector<ChooseDeliveryTypeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChooseDeliveryTypeFragment> {}
  }
}
