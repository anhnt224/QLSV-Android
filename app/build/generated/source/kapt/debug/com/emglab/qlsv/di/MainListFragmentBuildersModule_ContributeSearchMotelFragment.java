package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.motel.SearchMotelFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeSearchMotelFragment.SearchMotelFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeSearchMotelFragment {
  private MainListFragmentBuildersModule_ContributeSearchMotelFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SearchMotelFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SearchMotelFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SearchMotelFragmentSubcomponent extends AndroidInjector<SearchMotelFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchMotelFragment> {}
  }
}
