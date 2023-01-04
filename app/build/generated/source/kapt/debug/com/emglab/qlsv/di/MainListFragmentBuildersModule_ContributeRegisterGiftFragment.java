package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.gift.ApplyGiftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeRegisterGiftFragment.ApplyGiftFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeRegisterGiftFragment {
  private MainListFragmentBuildersModule_ContributeRegisterGiftFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ApplyGiftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ApplyGiftFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ApplyGiftFragmentSubcomponent extends AndroidInjector<ApplyGiftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ApplyGiftFragment> {}
  }
}
