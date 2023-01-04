package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.motel.AddMotelInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeAddMotelFragment.AddMotelInfoFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeAddMotelFragment {
  private MainListFragmentBuildersModule_ContributeAddMotelFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(AddMotelInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AddMotelInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AddMotelInfoFragmentSubcomponent extends AndroidInjector<AddMotelInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AddMotelInfoFragment> {}
  }
}
