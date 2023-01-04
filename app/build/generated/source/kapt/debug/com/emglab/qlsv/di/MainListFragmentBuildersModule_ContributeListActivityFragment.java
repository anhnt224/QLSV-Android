package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.activity.ListActivityFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListActivityFragment.ListActivityFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListActivityFragment {
  private MainListFragmentBuildersModule_ContributeListActivityFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListActivityFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListActivityFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListActivityFragmentSubcomponent extends AndroidInjector<ListActivityFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListActivityFragment> {}
  }
}
