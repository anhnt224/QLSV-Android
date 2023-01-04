package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.motel.TMotelInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTMotelInfo {
  private TListFragmentBuilderModule_ContributeTMotelInfo() {}

  @Binds
  @IntoMap
  @FragmentKey(TMotelInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TMotelInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TMotelInfoFragmentSubcomponent extends AndroidInjector<TMotelInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TMotelInfoFragment> {}
  }
}
