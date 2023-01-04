package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules.searchMotel.fragments.RegisterToFindMotelFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeRegisterToFindMotel
          .RegisterToFindMotelFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeRegisterToFindMotel {
  private MainListFragmentBuildersModule_ContributeRegisterToFindMotel() {}

  @Binds
  @IntoMap
  @FragmentKey(RegisterToFindMotelFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RegisterToFindMotelFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RegisterToFindMotelFragmentSubcomponent
      extends AndroidInjector<RegisterToFindMotelFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RegisterToFindMotelFragment> {}
  }
}
