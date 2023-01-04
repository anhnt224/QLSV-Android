package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.form.TRegisterFormFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTRegisterFormFragment.TRegisterFormFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTRegisterFormFragment {
  private TListFragmentBuilderModule_ContributeTRegisterFormFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TRegisterFormFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TRegisterFormFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TRegisterFormFragmentSubcomponent
      extends AndroidInjector<TRegisterFormFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TRegisterFormFragment> {}
  }
}
