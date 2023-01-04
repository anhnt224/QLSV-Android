package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.GiftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeGiftFragment {
  private MainListFragmentBuildersModule_ContributeGiftFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(GiftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      GiftFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface GiftFragmentSubcomponent extends AndroidInjector<GiftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GiftFragment> {}
  }
}
