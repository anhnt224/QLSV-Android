package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.criteria.CriteriaFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeCriteriaFragment.CriteriaFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeCriteriaFragment {
  private MainListFragmentBuildersModule_ContributeCriteriaFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CriteriaFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CriteriaFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CriteriaFragmentSubcomponent extends AndroidInjector<CriteriaFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CriteriaFragment> {}
  }
}
