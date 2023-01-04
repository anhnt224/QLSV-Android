package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.form.EditFormFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeEditFormFragment.EditFormFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeEditFormFragment {
  private MainListFragmentBuildersModule_ContributeEditFormFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(EditFormFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EditFormFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface EditFormFragmentSubcomponent extends AndroidInjector<EditFormFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EditFormFragment> {}
  }
}
