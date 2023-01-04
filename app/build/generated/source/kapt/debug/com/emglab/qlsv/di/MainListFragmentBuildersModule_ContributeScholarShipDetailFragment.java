package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.scholarShip.ScholarShipDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
          .ScholarShipDetailFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeScholarShipDetailFragment {
  private MainListFragmentBuildersModule_ContributeScholarShipDetailFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ScholarShipDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScholarShipDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScholarShipDetailFragmentSubcomponent
      extends AndroidInjector<ScholarShipDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScholarShipDetailFragment> {}
  }
}
