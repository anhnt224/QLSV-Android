package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftReceivedFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTGiftReceived.TGiftReceivedFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTGiftReceived {
  private TListFragmentBuilderModule_ContributeTGiftReceived() {}

  @Binds
  @IntoMap
  @FragmentKey(TGiftReceivedFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TGiftReceivedFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TGiftReceivedFragmentSubcomponent
      extends AndroidInjector<TGiftReceivedFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TGiftReceivedFragment> {}
  }
}
