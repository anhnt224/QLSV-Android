package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TCreateGiftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTCreateGift.TCreateGiftFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTCreateGift {
  private TListFragmentBuilderModule_ContributeTCreateGift() {}

  @Binds
  @IntoMap
  @FragmentKey(TCreateGiftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TCreateGiftFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TCreateGiftFragmentSubcomponent extends AndroidInjector<TCreateGiftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TCreateGiftFragment> {}
  }
}
