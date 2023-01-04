package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.GiftReceiveFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeGiftReceiveFragment.GiftReceiveFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeGiftReceiveFragment {
  private MainListFragmentBuildersModule_ContributeGiftReceiveFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(GiftReceiveFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      GiftReceiveFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface GiftReceiveFragmentSubcomponent extends AndroidInjector<GiftReceiveFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GiftReceiveFragment> {}
  }
}
