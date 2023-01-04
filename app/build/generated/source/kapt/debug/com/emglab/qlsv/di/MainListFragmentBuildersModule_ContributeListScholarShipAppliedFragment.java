package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipAppliedFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
          .ListScholarShipAppliedFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment {
  private MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListScholarShipAppliedFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListScholarShipAppliedFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListScholarShipAppliedFragmentSubcomponent
      extends AndroidInjector<ListScholarShipAppliedFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListScholarShipAppliedFragment> {}
  }
}
