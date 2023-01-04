package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMotelInfoFragment.MotelInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMotelInfoFragment {
  private MainListFragmentBuildersModule_ContributeMotelInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(MotelInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MotelInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MotelInfoFragmentSubcomponent extends AndroidInjector<MotelInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MotelInfoFragment> {}
  }
}
