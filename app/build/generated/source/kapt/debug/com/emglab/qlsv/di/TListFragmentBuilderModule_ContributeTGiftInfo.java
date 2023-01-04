package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTGiftInfo {
  private TListFragmentBuilderModule_ContributeTGiftInfo() {}

  @Binds
  @IntoMap
  @FragmentKey(TGiftInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TGiftInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TGiftInfoFragmentSubcomponent extends AndroidInjector<TGiftInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TGiftInfoFragment> {}
  }
}
