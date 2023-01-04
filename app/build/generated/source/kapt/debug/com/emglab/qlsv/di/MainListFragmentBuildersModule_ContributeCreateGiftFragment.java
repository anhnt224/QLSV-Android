package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.CreateGiftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeCreateGiftFragment.CreateGiftFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeCreateGiftFragment {
  private MainListFragmentBuildersModule_ContributeCreateGiftFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CreateGiftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CreateGiftFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CreateGiftFragmentSubcomponent extends AndroidInjector<CreateGiftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CreateGiftFragment> {}
  }
}
