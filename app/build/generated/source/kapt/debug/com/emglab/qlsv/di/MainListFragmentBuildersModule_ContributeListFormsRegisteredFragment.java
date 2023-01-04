package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.ListFormsRegisteredFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
          .ListFormsRegisteredFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment {
  private MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListFormsRegisteredFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListFormsRegisteredFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListFormsRegisteredFragmentSubcomponent
      extends AndroidInjector<ListFormsRegisteredFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListFormsRegisteredFragment> {}
  }
}
