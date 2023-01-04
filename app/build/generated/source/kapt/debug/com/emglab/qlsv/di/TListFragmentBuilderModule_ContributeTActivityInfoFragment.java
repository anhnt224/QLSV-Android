package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.activity.TActivityInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTActivityInfoFragment.TActivityInfoFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTActivityInfoFragment {
  private TListFragmentBuilderModule_ContributeTActivityInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TActivityInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TActivityInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TActivityInfoFragmentSubcomponent
      extends AndroidInjector<TActivityInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TActivityInfoFragment> {}
  }
}
