package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTGift {
  private TListFragmentBuilderModule_ContributeTGift() {}

  @Binds
  @IntoMap
  @FragmentKey(TGiftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TGiftFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TGiftFragmentSubcomponent extends AndroidInjector<TGiftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TGiftFragment> {}
  }
}
