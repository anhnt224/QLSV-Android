package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.gift.TListRegisterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListRegister.TListRegisterFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListRegister {
  private TListFragmentBuilderModule_ContributeTListRegister() {}

  @Binds
  @IntoMap
  @FragmentKey(TListRegisterFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListRegisterFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListRegisterFragmentSubcomponent
      extends AndroidInjector<TListRegisterFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListRegisterFragment> {}
  }
}
