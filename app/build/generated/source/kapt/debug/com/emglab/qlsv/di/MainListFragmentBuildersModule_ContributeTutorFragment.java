package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.TutorFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeTutorFragment.TutorFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeTutorFragment {
  private MainListFragmentBuildersModule_ContributeTutorFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TutorFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TutorFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TutorFragmentSubcomponent extends AndroidInjector<TutorFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TutorFragment> {}
  }
}
