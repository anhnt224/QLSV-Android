package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListScholarShipsFragment
          .ListScholarShipsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListScholarShipsFragment {
  private MainListFragmentBuildersModule_ContributeListScholarShipsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListScholarShipsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListScholarShipsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListScholarShipsFragmentSubcomponent
      extends AndroidInjector<ListScholarShipsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListScholarShipsFragment> {}
  }
}
