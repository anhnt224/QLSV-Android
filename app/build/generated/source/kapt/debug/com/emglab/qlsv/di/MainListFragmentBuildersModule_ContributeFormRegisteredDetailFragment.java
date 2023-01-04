package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.FormRegisteredDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
          .FormRegisteredDetailFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment {
  private MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(FormRegisteredDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      FormRegisteredDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface FormRegisteredDetailFragmentSubcomponent
      extends AndroidInjector<FormRegisteredDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FormRegisteredDetailFragment> {}
  }
}
