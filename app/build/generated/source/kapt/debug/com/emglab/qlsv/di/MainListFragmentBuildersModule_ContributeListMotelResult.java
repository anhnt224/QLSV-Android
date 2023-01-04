package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.ListMotelResultsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListMotelResult.ListMotelResultsFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListMotelResult {
  private MainListFragmentBuildersModule_ContributeListMotelResult() {}

  @Binds
  @IntoMap
  @FragmentKey(ListMotelResultsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListMotelResultsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListMotelResultsFragmentSubcomponent
      extends AndroidInjector<ListMotelResultsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListMotelResultsFragment> {}
  }
}
