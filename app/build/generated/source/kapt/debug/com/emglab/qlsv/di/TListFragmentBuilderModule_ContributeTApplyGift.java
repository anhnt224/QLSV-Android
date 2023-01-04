package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TApplyGiftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTApplyGift {
  private TListFragmentBuilderModule_ContributeTApplyGift() {}

  @Binds
  @IntoMap
  @FragmentKey(TApplyGiftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TApplyGiftFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TApplyGiftFragmentSubcomponent extends AndroidInjector<TApplyGiftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TApplyGiftFragment> {}
  }
}
