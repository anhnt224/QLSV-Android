package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.GiftInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeGiftInfoFragment.GiftInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeGiftInfoFragment {
  private MainListFragmentBuildersModule_ContributeGiftInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(GiftInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      GiftInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface GiftInfoFragmentSubcomponent extends AndroidInjector<GiftInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GiftInfoFragment> {}
  }
}
