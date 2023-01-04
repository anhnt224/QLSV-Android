package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.scholarShip.TListScholarShipsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListScholarShipFragment
          .TListScholarShipsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListScholarShipFragment {
  private TListFragmentBuilderModule_ContributeTListScholarShipFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TListScholarShipsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListScholarShipsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListScholarShipsFragmentSubcomponent
      extends AndroidInjector<TListScholarShipsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListScholarShipsFragment> {}
  }
}
