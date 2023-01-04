package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.motel.TAddMotelInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTAddMotelInfoMotel.TAddMotelInfoFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTAddMotelInfoMotel {
  private TListFragmentBuilderModule_ContributeTAddMotelInfoMotel() {}

  @Binds
  @IntoMap
  @FragmentKey(TAddMotelInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TAddMotelInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TAddMotelInfoFragmentSubcomponent
      extends AndroidInjector<TAddMotelInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TAddMotelInfoFragment> {}
  }
}
