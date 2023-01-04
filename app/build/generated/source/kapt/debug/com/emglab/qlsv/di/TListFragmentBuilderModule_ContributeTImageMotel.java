package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.motel.TImageMotelFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTImageMotel.TImageMotelFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTImageMotel {
  private TListFragmentBuilderModule_ContributeTImageMotel() {}

  @Binds
  @IntoMap
  @FragmentKey(TImageMotelFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TImageMotelFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TImageMotelFragmentSubcomponent extends AndroidInjector<TImageMotelFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TImageMotelFragment> {}
  }
}
