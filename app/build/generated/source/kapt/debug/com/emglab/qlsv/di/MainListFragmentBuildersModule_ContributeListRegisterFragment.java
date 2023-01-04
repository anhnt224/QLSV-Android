package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.ListRegisterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeListRegisterFragment.ListRegisterFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeListRegisterFragment {
  private MainListFragmentBuildersModule_ContributeListRegisterFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListRegisterFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListRegisterFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListRegisterFragmentSubcomponent extends AndroidInjector<ListRegisterFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListRegisterFragment> {}
  }
}
