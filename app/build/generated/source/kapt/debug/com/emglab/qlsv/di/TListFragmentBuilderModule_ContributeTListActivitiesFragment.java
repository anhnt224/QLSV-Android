package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.activity.TListActivitiesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListActivitiesFragment
          .TListActivitiesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListActivitiesFragment {
  private TListFragmentBuilderModule_ContributeTListActivitiesFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TListActivitiesFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListActivitiesFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListActivitiesFragmentSubcomponent
      extends AndroidInjector<TListActivitiesFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListActivitiesFragment> {}
  }
}
