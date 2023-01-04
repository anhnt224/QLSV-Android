package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.GiftGivenFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeGiftGivenFragment.GiftGivenFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeGiftGivenFragment {
  private MainListFragmentBuildersModule_ContributeGiftGivenFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(GiftGivenFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      GiftGivenFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface GiftGivenFragmentSubcomponent extends AndroidInjector<GiftGivenFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GiftGivenFragment> {}
  }
}
