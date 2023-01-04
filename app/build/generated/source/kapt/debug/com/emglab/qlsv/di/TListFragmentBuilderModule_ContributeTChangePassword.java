package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.account.TChangePasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTChangePassword.TChangePasswordFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTChangePassword {
  private TListFragmentBuilderModule_ContributeTChangePassword() {}

  @Binds
  @IntoMap
  @FragmentKey(TChangePasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TChangePasswordFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TChangePasswordFragmentSubcomponent
      extends AndroidInjector<TChangePasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TChangePasswordFragment> {}
  }
}
