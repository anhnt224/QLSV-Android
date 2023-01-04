package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.ListFormsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListFormsFragment.ListFormsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListFormsFragment {
  private MainListFragmentBuildersModule_ContributeListFormsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListFormsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListFormsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListFormsFragmentSubcomponent extends AndroidInjector<ListFormsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListFormsFragment> {}
  }
}
