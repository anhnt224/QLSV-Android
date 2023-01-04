package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftGivenFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTGiftGivenFragment.TGiftGivenFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTGiftGivenFragment {
  private TListFragmentBuilderModule_ContributeTGiftGivenFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TGiftGivenFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TGiftGivenFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TGiftGivenFragmentSubcomponent extends AndroidInjector<TGiftGivenFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TGiftGivenFragment> {}
  }
}
